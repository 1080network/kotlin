package io.mica.kotlin.examples

import io.mica.serviceprovider.service.v1.ServiceProviderFromMicaServiceGrpcKt
import io.mica.serviceprovider.value.v1.ValueProto
import io.mica.serviceprovider.value.v1.ValueProto.ObtainValueResponse
import io.mica.serviceprovider.value.v1.obtainValueResponse
import java.util.UUID

class ServiceProviderFromMicaImpl: ServiceProviderFromMicaServiceGrpcKt.ServiceProviderFromMicaServiceCoroutineImplBase() {
    override suspend fun obtainValue(request: ValueProto.ObtainValueRequest): ObtainValueResponse {
        return obtainValueResponse {
            approvedAmount = request.value.totalAmount
            transactionRef = UUID.randomUUID().toString()
            status = ObtainValueResponse.Status.STATUS_FULL_APPROVAL
        }
    }
}