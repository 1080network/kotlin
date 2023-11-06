package io.mica.sdk

import io.grpc.CallOptions
import io.grpc.Channel
import io.grpc.ManagedChannelBuilder
import io.mica.serviceprovider.service.v1.ServiceProviderToMicaServiceGrpcKt.ServiceProviderToMicaServiceCoroutineStub

val JWTTestServiceProviderRoles = listOf("RoleServiceProviderAdminServiceAccount")

fun BuildServiceProviderCoroutineStub(
    channel: Channel,
    callOptions: CallOptions = CallOptions.DEFAULT
): ServiceProviderToMicaServiceCoroutineStub =
    ServiceProviderToMicaServiceCoroutineStub(channel, callOptions)