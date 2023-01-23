package io.mica.sdk

import io.grpc.CallOptions
import io.grpc.Channel
import io.grpc.ManagedChannelBuilder
import io.mica.discount.service.v1.DiscountToMicaServiceGrpcKt.DiscountToMicaServiceCoroutineStub
import io.mica.sdk.utils.JWTCallCredential

val JWTTestDiscountRoles = listOf("RoleDiscountAdminServiceAccount", "RoleDiscountInternalServiceAccount")


fun BuildDiscountCoroutineStub(
    channel: Channel,
    callOptions: CallOptions = CallOptions.DEFAULT
): DiscountToMicaServiceCoroutineStub =
    DiscountToMicaServiceCoroutineStub(channel, callOptions)

fun BuildPartnerTestCoroutineStub(
    host: String, port: Int,
    tenant: String,
    partnerRoles: List<String> = JWTTestDiscountRoles
): DiscountToMicaServiceCoroutineStub =
    ManagedChannelBuilder.forAddress(host, port).build().let {
        DiscountToMicaServiceCoroutineStub(
            it, CallOptions.DEFAULT.withCallCredentials(
                JWTCallCredential(
                    partnerRoles, mapOf("tenant" to tenant)
                )
            )
        )
    }
