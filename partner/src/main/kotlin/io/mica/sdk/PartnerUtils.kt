package io.mica.sdk

import io.grpc.CallOptions
import io.grpc.Channel
import io.grpc.ManagedChannelBuilder
import io.mica.partner.service.v1.PartnerToMicaServiceGrpcKt.PartnerToMicaServiceCoroutineStub

val JWTTestPartnerRoles = listOf("RolePartnerAdminServiceAccount")

fun BuildPartnerCoroutineStub(
    channel: Channel,
    callOptions: CallOptions = CallOptions.DEFAULT
): PartnerToMicaServiceCoroutineStub = PartnerToMicaServiceCoroutineStub(channel, callOptions)