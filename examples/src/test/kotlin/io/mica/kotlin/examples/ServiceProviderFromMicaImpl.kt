package io.mica.kotlin.examples

import io.mica.serviceprovider.service.v1.ServiceProviderFromMicaServiceGrpcKt
import io.mica.serviceprovider.service.v1.ServiceProviderFromMicaServiceProto
import io.mica.serviceprovider.service.v1.serviceProviderFromMicaServicePingResponse
import io.mica.serviceprovider.value.v1.ValueProto
import io.mica.serviceprovider.value.v1.ValueProto.ObtainValueResponse
import io.mica.serviceprovider.value.v1.obtainValueResponse
import io.micashared.common.enums.v1.ApprovalTypeEnumProto
import java.time.Instant
import java.util.UUID

class MyServiceProviderFromMicaService: ServiceProviderFromMicaServiceGrpcKt.ServiceProviderFromMicaServiceCoroutineImplBase() {

    override suspend fun ping(request: ServiceProviderFromMicaServiceProto.ServiceProviderFromMicaServicePingRequest): ServiceProviderFromMicaServiceProto.ServiceProviderFromMicaServicePingResponse =
        Instant.now().let {
            serviceProviderFromMicaServicePingResponse { }
        }

    override suspend fun obtainValue(request: ValueProto.ObtainValueRequest): ObtainValueResponse {
        //real logic to check balance and debit an account goes here
        val responseStatus = when(request.approvalType){
            ApprovalTypeEnumProto.ApprovalType.APPROVAL_TYPE_FULL -> ObtainValueResponse.Status.STATUS_FULL_APPROVAL
            ApprovalTypeEnumProto.ApprovalType.APPROVAL_TYPE_PARTIAL -> ObtainValueResponse.Status.STATUS_PARTIAL_APPROVAL
            ApprovalTypeEnumProto.ApprovalType.APPROVAL_TYPE_UNSPECIFIED ->ObtainValueResponse.Status.STATUS_FULL_APPROVAL
            else -> ObtainValueResponse.Status.STATUS_ERROR
        }
        return obtainValueResponse {
            approvedAmount = request.value.totalAmount
            transactionRef = UUID.randomUUID().toString()
            status = responseStatus
        }
    }

}