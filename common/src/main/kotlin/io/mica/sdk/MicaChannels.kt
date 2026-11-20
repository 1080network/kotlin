package io.mica.sdk

import io.grpc.ManagedChannel
import io.grpc.netty.shaded.io.grpc.netty.GrpcSslContexts
import io.grpc.netty.shaded.io.grpc.netty.NettyChannelBuilder
import java.io.ByteArrayInputStream
import java.io.File

/**
 * PEM material for a mutual TLS connection to Mica.
 *
 * @property certificateAuthorities root certificate(s) used to verify Mica's server certificate
 * @property certificate the client certificate chain issued by Mica
 * @property key the private key for [certificate], PEM-encoded in PKCS#8 form (`-----BEGIN PRIVATE KEY-----`).
 *   Convert a traditional key with `openssl pkcs8 -topk8 -nocrypt -in key.pem -out key.pk8.pem`.
 */
class MtlsCredentials(
    val certificateAuthorities: ByteArray,
    val certificate: ByteArray,
    val key: ByteArray,
) {
    companion object {
        /** Reads the credentials from PEM files on disk. */
        @JvmStatic
        fun fromFiles(certificateAuthorities: File, certificate: File, key: File) =
            MtlsCredentials(certificateAuthorities.readBytes(), certificate.readBytes(), key.readBytes())
    }
}

/** Builds gRPC channels to the Mica network. Every connection to Mica uses mutual TLS. */
object MicaChannels {
    /**
     * Opens a channel to [target] (for example `api.example.mica.io:443`) that presents the client certificate
     * and verifies the server against the given certificate authorities.
     *
     * The caller owns the channel and should call `shutdown()` when done.
     */
    @JvmStatic
    fun mtls(target: String, credentials: MtlsCredentials): ManagedChannel {
        val sslContext = GrpcSslContexts.forClient()
            .trustManager(ByteArrayInputStream(credentials.certificateAuthorities))
            .keyManager(ByteArrayInputStream(credentials.certificate), ByteArrayInputStream(credentials.key))
            .build()
        return NettyChannelBuilder.forTarget(target).sslContext(sslContext).build()
    }
}
