package io.mica.sdk

import io.grpc.CallOptions
import io.grpc.Channel
import io.grpc.ManagedChannelBuilder
import io.mica.partner.service.v1.PartnerToMicaServiceGrpcKt.PartnerToMicaServiceCoroutineStub

import io.mica.sdk.utils.JWTCallCredential

val JWTTestPartnerRoles = listOf("RolePartnerAdminServiceAccount")

fun BuildPartnerCoroutineStub(
    channel: Channel,
    callOptions: CallOptions = CallOptions.DEFAULT
): PartnerToMicaServiceCoroutineStub = PartnerToMicaServiceCoroutineStub(channel, callOptions)

fun BuildPartnerTestCoroutineStub(host: String, port: Int,
                               partnerRoles: List<String> = JWTTestPartnerRoles) : PartnerToMicaServiceCoroutineStub =
    ManagedChannelBuilder.forAddress(host, port).build().let {
        PartnerToMicaServiceCoroutineStub(it, CallOptions.DEFAULT.withCallCredentials(JWTCallCredential(partnerRoles)))
    }