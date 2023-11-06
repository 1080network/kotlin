package io.mica.sdk.utils

import com.auth0.jwt.JWT
import com.auth0.jwt.algorithms.Algorithm
import io.grpc.*
import java.io.InputStream
import java.time.LocalDateTime
import java.time.ZoneOffset
import java.util.*
import java.util.concurrent.Executor

fun buildGrpcMtlsCredentials(
    caPem: InputStream,
    clientCertificatePem: InputStream,
    clientKeyPem: InputStream
): ChannelCredentials = TlsChannelCredentials.newBuilder()
    .trustManager(caPem)
    .keyManager(clientCertificatePem, clientKeyPem)
    .build()
