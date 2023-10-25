package io.mica.kotlin.examples

import io.grpc.Grpc
import io.mica.sdk.utils.buildGrpcMtlsCredentials
import io.mica.serviceprovider.instrument.v1.InstrumentProto.RegisterInstrumentResponse
import io.mica.serviceprovider.instrument.v1.registerInstrumentRequest
import io.mica.serviceprovider.service.v1.ServiceProviderToMicaServiceGrpcKt
import io.mica.serviceprovider.user.v1.UserProto.RegisterUserResponse
import io.mica.serviceprovider.user.v1.registerUserRequest
import io.mica.serviceprovider.uuek.v1.ProvisionServiceProviderUUEKProto.ProvisionServiceProviderUUEKRequest
import io.mica.serviceprovider.uuek.v1.ProvisionServiceProviderUUEKProto.ProvisionServiceProviderUUEKResponse
import io.mica.serviceprovider.uuek.v1.provisionServiceProviderUUEKRequest
import io.micashared.common.enums.v1.AgeBandEnumProto
import io.micashared.common.enums.v1.AgeBandEnumProto.AgeBand
import io.micashared.common.enums.v1.InstrumentTypeEnumProto
import io.micashared.common.ping.v1.PingProto.PingRequest
import io.micashared.common.ping.v1.PingProto.PingResponse
import io.micashared.common.ping.v1.pingRequest
import io.micashared.common.v1.userDemographic
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runTest
import org.junit.Test
import org.junit.jupiter.api.Assertions
import java.util.UUID

class ServiceProviderExampleTest {
    private val ROOT_CA_PEM = loadPem("ROOT_CA")
    private val CLIENT_CERTIFICATE = loadPem("CLIENT_CERTIFICATE")
    private val CLIENT_KEY = loadPem("CLIENT_KEY")

    private val serviceProviderClient = createClient()

    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun `call Mica Ping`() = runTest {
        val request = pingRequest { }
        val response = serviceProviderClient.ping(request)
        Assertions.assertEquals(PingResponse.Status.STATUS_SUCCESS, response.status)
    }

    @Test
    fun `call Mica register user`() = runTest {
        val request = registerUserRequest {
            serviceProviderUserRef = UUID.randomUUID().toString()
            userDemographic = userDemographic {
                firstName = "John"
                lastName  = "Doe"
                ageBand = AgeBand.AGE_BAND_OVER_21
            }
        }
        val response = serviceProviderClient.registerUser(request)
        Assertions.assertEquals(RegisterUserResponse.Status.STATUS_SUCCESS, response.status)
        val micaUserKey = response.serviceProviderUserKey
    }

    @Test
    fun `call Mica register instrument`() = runTest{
        val micaUserKey = "whatever was returned from the registration call"
        val request = registerInstrumentRequest {
            serviceProviderUserKey = micaUserKey
            instrumentType = InstrumentTypeEnumProto.InstrumentType.INSTRUMENT_TYPE_CHECKING
            serviceProviderInstrumentRef = UUID.randomUUID().toString()
        }
        val response = serviceProviderClient.registerInstrument(request)
        Assertions.assertEquals(RegisterInstrumentResponse.Status.STATUS_SUCCESS, response.status)
        val micaInstrumentKey = response.serviceProviderInstrumentKey
    }

    fun `call Mica provision UUEK`() = runTest {
        val micaUserKey = "whatever user key was retrieved"
        val micaInstrumentKey = "whatever mica returned"
        val request = provisionServiceProviderUUEKRequest {
            serviceProviderInstrumentKey = micaInstrumentKey
            numberOfUses = 1
        }
        val response = serviceProviderClient.provisionServiceProviderUUEK(request)
        Assertions.assertEquals(ProvisionServiceProviderUUEKResponse.Status.STATUS_SUCCESS, response.status)
        val micaUUEK = response.serviceProviderUuek
    }

    private fun createClient() : ServiceProviderToMicaServiceGrpcKt.ServiceProviderToMicaServiceCoroutineStub {
        val  credentials = buildGrpcMtlsCredentials(ROOT_CA_PEM, CLIENT_CERTIFICATE, CLIENT_KEY)
        return Grpc.newChannelBuilderForAddress("local", 443, credentials)
                .build().let {
                    ServiceProviderToMicaServiceGrpcKt.ServiceProviderToMicaServiceCoroutineStub(it)
                }
    }

}