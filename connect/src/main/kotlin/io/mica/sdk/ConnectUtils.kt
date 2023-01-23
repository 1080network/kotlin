package io.mica.sdk

import io.grpc.CallOptions
import io.grpc.Channel
import io.grpc.ManagedChannelBuilder
import io.mica.connect.service.v1.ConnectServiceGrpcKt
import io.mica.sdk.utils.JWTCallCredential

val JWTTestConnectRoles = listOf("RoleConnectAdmin")

fun BuildConnectCoroutineStub(
    channel: Channel,
    callOptions: CallOptions = CallOptions.DEFAULT
): ConnectServiceGrpcKt.ConnectServiceCoroutineStub =
    ConnectServiceGrpcKt.ConnectServiceCoroutineStub(channel, callOptions)

fun BuildConnectTestCoroutineStub(
    host: String, port: Int,
    connectRoles: List<String> = JWTTestConnectRoles
): ConnectServiceGrpcKt.ConnectServiceCoroutineStub =
    ManagedChannelBuilder.forAddress(host, port).build().let {
        ConnectServiceGrpcKt.ConnectServiceCoroutineStub(
            it,
            CallOptions.DEFAULT.withCallCredentials(JWTCallCredential(connectRoles))
        )
    }

