package io.mica.sdk.utils

import com.auth0.jwt.JWT
import com.auth0.jwt.algorithms.Algorithm
import io.grpc.*
import java.io.InputStream
import java.time.LocalDateTime
import java.time.ZoneOffset
import java.util.*
import java.util.concurrent.Executor

fun buildGrpcMtlsCrendetials(
    caPem: InputStream,
    clientCertificatePem: InputStream,
    clientKeyPem: InputStream
): ChannelCredentials = TlsChannelCredentials.newBuilder()
    .trustManager(caPem)
    .keyManager(clientCertificatePem, clientKeyPem)
    .build()

class JWTCallCredential(
    private val roles: List<String>,
    private val extraClaims: Map<String, String> = emptyMap(),
    b64SignerKey: String = "idv7Nf/7476PxbMX6iVIXHCc/kMSqSjPQNgBNDU2kz4="
) : CallCredentials() {

    private val metaDataKey: Metadata.Key<String> =
        Metadata.Key.of("Authentication", Metadata.ASCII_STRING_MARSHALLER)

    private val signingAlgo = Algorithm.HMAC256(Base64.getDecoder().decode(b64SignerKey))
    private var currentToken: Pair<String, LocalDateTime> = issueToken()

    override fun applyRequestMetadata(requestInfo: RequestInfo?, appExecutor: Executor?, applier: MetadataApplier?) {
        appExecutor?.execute {
            try {
                val headers = Metadata()
                val token = getToken()
                headers.put(metaDataKey, token)
                applier?.apply(headers)
            } catch (e: Throwable) {
                applier?.fail(Status.UNAUTHENTICATED.withCause(e))
            }
        }
    }

    override fun thisUsesUnstableApi() {
        TODO("Not yet implemented")
    }

    private fun getToken(): String {
        if(LocalDateTime.now().isAfter(currentToken.second)){
            currentToken = issueToken()
        }
        return currentToken.first
    }

    private fun issueToken(): Pair<String, LocalDateTime> {
        val now = LocalDateTime.now()
        val expire = now.plusDays(1)
        val token = JWT.create()
            .withIssuer("mica.io")
            .withClaim("roles", roles)
            .withIssuedAt(now.toInstant(ZoneOffset.UTC))
            .withExpiresAt(expire.toInstant(ZoneOffset.UTC))
            .apply {
                extraClaims.forEach{ entry: Map.Entry<String, String> ->
                    this.withClaim(entry.key, entry.value)
                }
            }.sign(signingAlgo)
        return Pair("Bearer $token", expire)
    }
}