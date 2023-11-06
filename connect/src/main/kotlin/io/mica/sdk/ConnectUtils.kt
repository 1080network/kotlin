package io.mica.sdk

import io.grpc.CallOptions
import io.grpc.Channel
import io.grpc.ManagedChannelBuilder
import io.mica.connect.service.v1.ConnectServiceGrpcKt

val JWTTestConnectRoles = listOf("RoleConnectAdmin")

fun BuildConnectCoroutineStub(
    channel: Channel,
    callOptions: CallOptions = CallOptions.DEFAULT
): ConnectServiceGrpcKt.ConnectServiceCoroutineStub =
    ConnectServiceGrpcKt.ConnectServiceCoroutineStub(channel, callOptions)


