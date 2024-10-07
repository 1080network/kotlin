package io.mica.kotlin.examples

import io.grpc.Grpc
import io.mica.partner.organization.v1.OrganizationProto.CreateOrganizationResponse
import io.mica.partner.organization.v1.OrganizationProto.GetOrganizationResponse
import io.mica.partner.organization.v1.createOrganizationRequest
import io.mica.partner.organization.v1.getOrganizationRequest
import io.mica.partner.service.v1.PartnerToMicaServiceGrpcKt
import io.mica.partner.store.v1.StoreProto.CreateStoreResponse
import io.mica.partner.store.v1.createStoreRequest
import io.mica.sdk.utils.buildGrpcMtlsCredentials
import io.micashared.common.enums.v1.BarcodeLocationEnumProto.BarcodeLocation
import io.micashared.common.enums.v1.BarcodeTypeEnumProto.BarcodeType
import io.micashared.common.enums.v1.CountryEnumProto.Country
import io.micashared.common.enums.v1.CustodialBankEnumProto.CustodialBank
import io.micashared.common.enums.v1.OrganizationCategoryEnumProto.OrganizationCategory
import io.micashared.common.enums.v1.RegionEnumProto
import io.micashared.common.v1.address
import io.micashared.common.v1.bankAccountDetail
import kotlinx.coroutines.test.runTest
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class PartnerExampleTest {
    private val ROOT_CA_PEM = loadPem("ROOT_CA")
    private val CLIENT_CERTIFICATE = loadPem("CLIENT_CERTIFICATE")
    private val CLIENT_KEY = loadPem("CLIENT_KEY")

    private val micaClient = createClient()
    @Test
    fun testPing(){

    }

    private fun createClient(): PartnerToMicaServiceGrpcKt.PartnerToMicaServiceCoroutineStub{
        val  credentials = buildGrpcMtlsCredentials(ROOT_CA_PEM, CLIENT_CERTIFICATE, CLIENT_KEY)
        return Grpc.newChannelBuilderForAddress("local", 443, credentials)
            .build().let {
                PartnerToMicaServiceGrpcKt.PartnerToMicaServiceCoroutineStub(it)
            }
    }

    @Test
    fun `test create Organization`() = runTest{
        val bankAccountReference = "c57b2a85-9650-46c3-8267-651cbcb62aa6"
        val myOrganizationId = "2d7b57ed-c67c-4296-a7d0-90f9cfc750a8"
        val request = createOrganizationRequest {
            organizationRef = myOrganizationId
            name = "Example organization"
            address = address {
                streetLines.add("1600 Pennsylvania Avenue, N.W.")
                locality = "Washington"
                region = RegionEnumProto.Region.REGION_US_DC
                postalCode = "20500"
                country = Country.COUNTRY_US
            }
            categories.addAll(listOf( OrganizationCategory.ORGANIZATION_CATEGORY_BOOKSTORE, OrganizationCategory.ORGANIZATION_CATEGORY_APPAREL))
            operatingAccount = bankAccountDetail {
                bank = "Example Bank"
                custodialBank = CustodialBank.CUSTODIAL_BANK_TEST_BANK
                accountRef = bankAccountReference
            }
            revenueAccount = bankAccountDetail {
                bank = "Example Bank"
                custodialBank = CustodialBank.CUSTODIAL_BANK_TEST_BANK
                accountRef = bankAccountReference
            }
            barcodeLocation = BarcodeLocation.BARCODE_LOCATION_NONE
            barcodeType = BarcodeType.BARCODE_TYPE_NONE
        }
        val response = micaClient.createOrganization(request)
        Assertions.assertEquals(CreateOrganizationResponse.Status.STATUS_SUCCESS, response.status)
    }

    @Test
    fun `test create Store`() = runTest {
        val request = createStoreRequest {
            organizationRef = "2d7b57ed-c67c-4296-a7d0-90f9cfc750a8"
            address = address {
                streetLines.add("1600 Pennsylvania Avenue, N.W.")
                locality = "Washington"
                region = RegionEnumProto.Region.REGION_US_DC
                postalCode = "20500"
                country = Country.COUNTRY_US
            }
            storeNumber = "001"
            storeRef = "20e97697-5b1c-46da-bf50-894da8bcaddc"
        }
        val response = micaClient.createStore(request)
        Assertions.assertEquals(CreateStoreResponse.Status.STATUS_SUCCESS, response.status)
    }

    @Test
    fun `test get Organization`() = runTest{
        val request = getOrganizationRequest{
            organizationRef = "2d7b57ed-c67c-4296-a7d0-90f9cfc750a8"
        }
        val response = micaClient.getOrganization(request)

        Assertions.assertEquals(GetOrganizationResponse.Status.STATUS_SUCCESS, response.status)
    }
}