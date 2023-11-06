package io.mica.sdk

import io.grpc.CallOptions
import io.grpc.Channel
import io.grpc.ManagedChannelBuilder
import io.mica.discount.service.v1.DiscountToMicaServiceGrpcKt.DiscountToMicaServiceCoroutineStub

val JWTTestDiscountRoles = listOf("RoleDiscountAdminServiceAccount", "RoleDiscountInternalServiceAccount")


fun BuildDiscountCoroutineStub(
    channel: Channel,
    callOptions: CallOptions = CallOptions.DEFAULT
): DiscountToMicaServiceCoroutineStub =
    DiscountToMicaServiceCoroutineStub(channel, callOptions)
