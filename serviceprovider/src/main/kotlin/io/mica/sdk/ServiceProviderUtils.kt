package io.mica.sdk

import io.grpc.CallOptions
import io.grpc.Channel
import io.grpc.ManagedChannelBuilder
import io.mica.sdk.utils.JWTCallCredential
import io.mica.serviceprovider.service.v1.ServiceProviderToMicaServiceGrpcKt.ServiceProviderToMicaServiceCoroutineStub

val JWTTestServiceProviderRoles = listOf("RoleServiceProviderAdminServiceAccount")

fun BuildServiceProviderCoroutineStub(
    channel: Channel,
    callOptions: CallOptions = CallOptions.DEFAULT
): ServiceProviderToMicaServiceCoroutineStub =
    ServiceProviderToMicaServiceCoroutineStub(channel, callOptions)

fun BuildServiceProviderTestCoroutineStub(
    host: String, port: Int,
    serviceProviderRoles: List<String> = JWTTestServiceProviderRoles
): ServiceProviderToMicaServiceCoroutineStub = ManagedChannelBuilder.forAddress(host, port).build().let {
    ServiceProviderToMicaServiceCoroutineStub(
        it, CallOptions.DEFAULT.withCallCredentials(
            JWTCallCredential(serviceProviderRoles)
        )
    )
}
