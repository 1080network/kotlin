package io.mica.sdk.examples

import io.mica.member.ping.v1.PingRequest
import io.mica.member.ping.v1.PingServiceGrpc
import io.mica.sdk.MicaChannels
import io.mica.sdk.MtlsCredentials
import java.io.File
import java.util.concurrent.TimeUnit

/**
 * Connects to Mica with mutual TLS and calls Ping, a good first check that your certificates and network path work.
 *
 *     ./gradlew :examples:run --args="api.example.mica.io:443 rootca.crt client.crt client.pk8.pem"
 *
 * The key must be PKCS#8 PEM (see MtlsCredentials).
 */
fun main(args: Array<String>) {
    require(args.size == 4) { "usage: <host:port> <rootca.crt> <client.crt> <client.pk8.pem>" }
    val credentials = MtlsCredentials.fromFiles(File(args[1]), File(args[2]), File(args[3]))
    val channel = MicaChannels.mtls(args[0], credentials)
    try {
        val response = PingServiceGrpc.newBlockingStub(channel)
            .withDeadlineAfter(15, TimeUnit.SECONDS)
            .ping(PingRequest.getDefaultInstance())
        println("status=${response.status} service=${response.serviceType} version=${response.buildVersion}")
    } finally {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS)
    }
}
