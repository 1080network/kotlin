package io.mica.sdk

import io.grpc.Server
import io.grpc.StatusRuntimeException
import io.grpc.netty.shaded.io.grpc.netty.GrpcSslContexts
import io.grpc.netty.shaded.io.grpc.netty.NettyServerBuilder
import io.grpc.netty.shaded.io.netty.handler.ssl.ClientAuth
import io.grpc.stub.StreamObserver
import io.mica.member.ping.v1.PingRequest
import io.mica.member.ping.v1.PingResponse
import io.mica.member.ping.v1.PingServiceGrpc
import org.bouncycastle.asn1.x500.X500Name
import org.bouncycastle.asn1.x509.BasicConstraints
import org.bouncycastle.asn1.x509.Extension
import org.bouncycastle.asn1.x509.GeneralName
import org.bouncycastle.asn1.x509.GeneralNames
import org.bouncycastle.cert.jcajce.JcaX509CertificateConverter
import org.bouncycastle.cert.jcajce.JcaX509v3CertificateBuilder
import org.bouncycastle.operator.jcajce.JcaContentSignerBuilder
import java.io.ByteArrayInputStream
import java.math.BigInteger
import java.security.KeyPair
import java.security.KeyPairGenerator
import java.security.cert.X509Certificate
import java.util.Base64
import java.util.Date
import java.util.concurrent.TimeUnit
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

/** Makes real mutual TLS Ping calls to an in-process server, using certificates generated for the test. */
class MicaChannelsTest {
    private class Identity(val keyPair: KeyPair, val cert: X509Certificate) {
        val certPem: ByteArray get() = pem("CERTIFICATE", cert.encoded)
        val keyPem: ByteArray get() = pem("PRIVATE KEY", keyPair.private.encoded) // PKCS#8
    }

    private fun newIdentity(name: String, isCa: Boolean, signer: Identity? = null): Identity {
        val keys = KeyPairGenerator.getInstance("EC").apply { initialize(256) }.generateKeyPair()
        val issuerKeys = signer?.keyPair ?: keys
        val issuerName = X500Name(signer?.cert?.subjectX500Principal?.name ?: "CN=$name")
        val now = System.currentTimeMillis()
        val builder = JcaX509v3CertificateBuilder(
            issuerName, BigInteger.valueOf(now), Date(now - 60_000), Date(now + 3_600_000),
            X500Name("CN=$name"), keys.public,
        )
        builder.addExtension(Extension.basicConstraints, true, BasicConstraints(isCa))
        builder.addExtension(
            Extension.subjectAlternativeName, false,
            GeneralNames(arrayOf(GeneralName(GeneralName.iPAddress, "127.0.0.1"), GeneralName(GeneralName.dNSName, "localhost"))),
        )
        val holder = builder.build(JcaContentSignerBuilder("SHA256withECDSA").build(issuerKeys.private))
        return Identity(keys, JcaX509CertificateConverter().getCertificate(holder))
    }

    private fun startServer(ca: Identity, server: Identity): Server {
        val ssl = GrpcSslContexts.forServer(ByteArrayInputStream(server.certPem), ByteArrayInputStream(server.keyPem))
            .trustManager(ByteArrayInputStream(ca.certPem))
            .clientAuth(ClientAuth.REQUIRE)
            .build()
        return NettyServerBuilder.forPort(0).sslContext(ssl)
            .addService(object : PingServiceGrpc.PingServiceImplBase() {
                override fun ping(request: PingRequest, responseObserver: StreamObserver<PingResponse>) {
                    responseObserver.onNext(PingResponse.newBuilder().setStatus(PingResponse.Status.STATUS_SUCCESS).setServiceType("test").build())
                    responseObserver.onCompleted()
                }
            })
            .build().start()
    }

    @Test
    fun `a ping succeeds over mutual TLS and a server from an unknown authority is rejected`() {
        val ca = newIdentity("test ca", isCa = true)
        val server = startServer(ca, newIdentity("server", isCa = false, signer = ca))
        try {
            val client = newIdentity("client", isCa = false, signer = ca)
            val target = "127.0.0.1:${server.port}"

            val channel = MicaChannels.mtls(target, MtlsCredentials(ca.certPem, client.certPem, client.keyPem))
            try {
                val response = PingServiceGrpc.newBlockingStub(channel).withDeadlineAfter(10, TimeUnit.SECONDS).ping(PingRequest.getDefaultInstance())
                assertEquals(PingResponse.Status.STATUS_SUCCESS, response.status)
            } finally {
                channel.shutdownNow()
            }

            val otherCa = newIdentity("other ca", isCa = true)
            val untrusting = MicaChannels.mtls(target, MtlsCredentials(otherCa.certPem, client.certPem, client.keyPem))
            try {
                assertFailsWith<StatusRuntimeException> {
                    PingServiceGrpc.newBlockingStub(untrusting).withDeadlineAfter(10, TimeUnit.SECONDS).ping(PingRequest.getDefaultInstance())
                }
            } finally {
                untrusting.shutdownNow()
            }
        } finally {
            server.shutdownNow()
        }
    }
}

private fun pem(type: String, der: ByteArray): ByteArray =
    "-----BEGIN $type-----\n${Base64.getMimeEncoder(64, "\n".toByteArray()).encodeToString(der)}\n-----END $type-----\n".toByteArray()
