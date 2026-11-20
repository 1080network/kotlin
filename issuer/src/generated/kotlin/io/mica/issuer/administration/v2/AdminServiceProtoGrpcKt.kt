package io.mica.issuer.administration.v2

import io.grpc.CallOptions
import io.grpc.CallOptions.DEFAULT
import io.grpc.Channel
import io.grpc.Metadata
import io.grpc.MethodDescriptor
import io.grpc.ServerServiceDefinition
import io.grpc.ServerServiceDefinition.builder
import io.grpc.ServiceDescriptor
import io.grpc.Status.UNIMPLEMENTED
import io.grpc.StatusException
import io.grpc.kotlin.AbstractCoroutineServerImpl
import io.grpc.kotlin.AbstractCoroutineStub
import io.grpc.kotlin.ClientCalls.unaryRpc
import io.grpc.kotlin.ServerCalls.unaryServerMethodDefinition
import io.grpc.kotlin.StubFor
import io.mica.issuer.administration.v2.IssuerAdministrationServiceGrpc.getServiceDescriptor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

/**
 * Holder for Kotlin coroutine-based client and server APIs for mica.issuer.administration.v2.IssuerAdministrationService.
 */
public object IssuerAdministrationServiceGrpcKt {
  public const val SERVICE_NAME: String = IssuerAdministrationServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val generateFromMicaClientCertificateMethod:
      MethodDescriptor<GenerateFromMicaClientCertificateRequest, GenerateFromMicaClientCertificateResponse>
    @JvmStatic
    get() = IssuerAdministrationServiceGrpc.getGenerateFromMicaClientCertificateMethod()

  public val updateFromMicaClientCertificateMethod:
      MethodDescriptor<UpdateFromMicaClientCertificateRequest, UpdateFromMicaClientCertificateResponse>
    @JvmStatic
    get() = IssuerAdministrationServiceGrpc.getUpdateFromMicaClientCertificateMethod()

  public val enableFromMicaClientCertificateMethod:
      MethodDescriptor<EnableFromMicaClientCertificateRequest, EnableFromMicaClientCertificateResponse>
    @JvmStatic
    get() = IssuerAdministrationServiceGrpc.getEnableFromMicaClientCertificateMethod()

  public val searchFromMicaClientCertificateMethod:
      MethodDescriptor<SearchFromMicaClientCertificateRequest, SearchFromMicaClientCertificateResponse>
    @JvmStatic
    get() = IssuerAdministrationServiceGrpc.getSearchFromMicaClientCertificateMethod()

  public val getFromMicaClientSettingsMethod:
      MethodDescriptor<GetFromMicaClientSettingsRequest, GetFromMicaClientSettingsResponse>
    @JvmStatic
    get() = IssuerAdministrationServiceGrpc.getGetFromMicaClientSettingsMethod()

  public val updateFromMicaClientCallbackAddressMethod:
      MethodDescriptor<UpdateFromMicaClientCallbackAddressRequest, UpdateFromMicaClientCallbackAddressResponse>
    @JvmStatic
    get() = IssuerAdministrationServiceGrpc.getUpdateFromMicaClientCallbackAddressMethod()

  public val searchDataExtractionStatisticsMethod:
      MethodDescriptor<SearchDataExtractionStatisticsRequest, SearchDataExtractionStatisticsResponse>
    @JvmStatic
    get() = IssuerAdministrationServiceGrpc.getSearchDataExtractionStatisticsMethod()

  public val getDataExtractionStatisticsMethod:
      MethodDescriptor<GetDataExtractionStatisticsRequest, GetDataExtractionStatisticsResponse>
    @JvmStatic
    get() = IssuerAdministrationServiceGrpc.getGetDataExtractionStatisticsMethod()

  public val pingExternalMethod: MethodDescriptor<PingExternalRequest, PingExternalResponse>
    @JvmStatic
    get() = IssuerAdministrationServiceGrpc.getPingExternalMethod()

  public val pingExternalWithCertificateMethod:
      MethodDescriptor<PingExternalWithCertificateRequest, PingExternalWithCertificateResponse>
    @JvmStatic
    get() = IssuerAdministrationServiceGrpc.getPingExternalWithCertificateMethod()

  /**
   * A stub for issuing RPCs to a(n) mica.issuer.administration.v2.IssuerAdministrationService service as suspending coroutines.
   */
  @StubFor(IssuerAdministrationServiceGrpc::class)
  public class IssuerAdministrationServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<IssuerAdministrationServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): IssuerAdministrationServiceCoroutineStub = IssuerAdministrationServiceCoroutineStub(channel, callOptions)

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun generateFromMicaClientCertificate(request: GenerateFromMicaClientCertificateRequest, headers: Metadata = Metadata()): GenerateFromMicaClientCertificateResponse = unaryRpc(
      channel,
      IssuerAdministrationServiceGrpc.getGenerateFromMicaClientCertificateMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun updateFromMicaClientCertificate(request: UpdateFromMicaClientCertificateRequest, headers: Metadata = Metadata()): UpdateFromMicaClientCertificateResponse = unaryRpc(
      channel,
      IssuerAdministrationServiceGrpc.getUpdateFromMicaClientCertificateMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun enableFromMicaClientCertificate(request: EnableFromMicaClientCertificateRequest, headers: Metadata = Metadata()): EnableFromMicaClientCertificateResponse = unaryRpc(
      channel,
      IssuerAdministrationServiceGrpc.getEnableFromMicaClientCertificateMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun searchFromMicaClientCertificate(request: SearchFromMicaClientCertificateRequest, headers: Metadata = Metadata()): SearchFromMicaClientCertificateResponse = unaryRpc(
      channel,
      IssuerAdministrationServiceGrpc.getSearchFromMicaClientCertificateMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun getFromMicaClientSettings(request: GetFromMicaClientSettingsRequest, headers: Metadata = Metadata()): GetFromMicaClientSettingsResponse = unaryRpc(
      channel,
      IssuerAdministrationServiceGrpc.getGetFromMicaClientSettingsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun updateFromMicaClientCallbackAddress(request: UpdateFromMicaClientCallbackAddressRequest, headers: Metadata = Metadata()): UpdateFromMicaClientCallbackAddressResponse = unaryRpc(
      channel,
      IssuerAdministrationServiceGrpc.getUpdateFromMicaClientCallbackAddressMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun searchDataExtractionStatistics(request: SearchDataExtractionStatisticsRequest, headers: Metadata = Metadata()): SearchDataExtractionStatisticsResponse = unaryRpc(
      channel,
      IssuerAdministrationServiceGrpc.getSearchDataExtractionStatisticsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun getDataExtractionStatistics(request: GetDataExtractionStatisticsRequest, headers: Metadata = Metadata()): GetDataExtractionStatisticsResponse = unaryRpc(
      channel,
      IssuerAdministrationServiceGrpc.getGetDataExtractionStatisticsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun pingExternal(request: PingExternalRequest, headers: Metadata = Metadata()): PingExternalResponse = unaryRpc(
      channel,
      IssuerAdministrationServiceGrpc.getPingExternalMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun pingExternalWithCertificate(request: PingExternalWithCertificateRequest, headers: Metadata = Metadata()): PingExternalWithCertificateResponse = unaryRpc(
      channel,
      IssuerAdministrationServiceGrpc.getPingExternalWithCertificateMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the mica.issuer.administration.v2.IssuerAdministrationService service based on Kotlin coroutines.
   */
  public abstract class IssuerAdministrationServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for mica.issuer.administration.v2.IssuerAdministrationService.GenerateFromMicaClientCertificate.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun generateFromMicaClientCertificate(request: GenerateFromMicaClientCertificateRequest): GenerateFromMicaClientCertificateResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method mica.issuer.administration.v2.IssuerAdministrationService.GenerateFromMicaClientCertificate is unimplemented"))

    /**
     * Returns the response to an RPC for mica.issuer.administration.v2.IssuerAdministrationService.UpdateFromMicaClientCertificate.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun updateFromMicaClientCertificate(request: UpdateFromMicaClientCertificateRequest): UpdateFromMicaClientCertificateResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method mica.issuer.administration.v2.IssuerAdministrationService.UpdateFromMicaClientCertificate is unimplemented"))

    /**
     * Returns the response to an RPC for mica.issuer.administration.v2.IssuerAdministrationService.EnableFromMicaClientCertificate.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun enableFromMicaClientCertificate(request: EnableFromMicaClientCertificateRequest): EnableFromMicaClientCertificateResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method mica.issuer.administration.v2.IssuerAdministrationService.EnableFromMicaClientCertificate is unimplemented"))

    /**
     * Returns the response to an RPC for mica.issuer.administration.v2.IssuerAdministrationService.SearchFromMicaClientCertificate.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun searchFromMicaClientCertificate(request: SearchFromMicaClientCertificateRequest): SearchFromMicaClientCertificateResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method mica.issuer.administration.v2.IssuerAdministrationService.SearchFromMicaClientCertificate is unimplemented"))

    /**
     * Returns the response to an RPC for mica.issuer.administration.v2.IssuerAdministrationService.GetFromMicaClientSettings.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getFromMicaClientSettings(request: GetFromMicaClientSettingsRequest): GetFromMicaClientSettingsResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method mica.issuer.administration.v2.IssuerAdministrationService.GetFromMicaClientSettings is unimplemented"))

    /**
     * Returns the response to an RPC for mica.issuer.administration.v2.IssuerAdministrationService.UpdateFromMicaClientCallbackAddress.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun updateFromMicaClientCallbackAddress(request: UpdateFromMicaClientCallbackAddressRequest): UpdateFromMicaClientCallbackAddressResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method mica.issuer.administration.v2.IssuerAdministrationService.UpdateFromMicaClientCallbackAddress is unimplemented"))

    /**
     * Returns the response to an RPC for mica.issuer.administration.v2.IssuerAdministrationService.SearchDataExtractionStatistics.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun searchDataExtractionStatistics(request: SearchDataExtractionStatisticsRequest): SearchDataExtractionStatisticsResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method mica.issuer.administration.v2.IssuerAdministrationService.SearchDataExtractionStatistics is unimplemented"))

    /**
     * Returns the response to an RPC for mica.issuer.administration.v2.IssuerAdministrationService.GetDataExtractionStatistics.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getDataExtractionStatistics(request: GetDataExtractionStatisticsRequest): GetDataExtractionStatisticsResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method mica.issuer.administration.v2.IssuerAdministrationService.GetDataExtractionStatistics is unimplemented"))

    /**
     * Returns the response to an RPC for mica.issuer.administration.v2.IssuerAdministrationService.PingExternal.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun pingExternal(request: PingExternalRequest): PingExternalResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method mica.issuer.administration.v2.IssuerAdministrationService.PingExternal is unimplemented"))

    /**
     * Returns the response to an RPC for mica.issuer.administration.v2.IssuerAdministrationService.PingExternalWithCertificate.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun pingExternalWithCertificate(request: PingExternalWithCertificateRequest): PingExternalWithCertificateResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method mica.issuer.administration.v2.IssuerAdministrationService.PingExternalWithCertificate is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = IssuerAdministrationServiceGrpc.getGenerateFromMicaClientCertificateMethod(),
      implementation = ::generateFromMicaClientCertificate
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = IssuerAdministrationServiceGrpc.getUpdateFromMicaClientCertificateMethod(),
      implementation = ::updateFromMicaClientCertificate
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = IssuerAdministrationServiceGrpc.getEnableFromMicaClientCertificateMethod(),
      implementation = ::enableFromMicaClientCertificate
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = IssuerAdministrationServiceGrpc.getSearchFromMicaClientCertificateMethod(),
      implementation = ::searchFromMicaClientCertificate
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = IssuerAdministrationServiceGrpc.getGetFromMicaClientSettingsMethod(),
      implementation = ::getFromMicaClientSettings
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = IssuerAdministrationServiceGrpc.getUpdateFromMicaClientCallbackAddressMethod(),
      implementation = ::updateFromMicaClientCallbackAddress
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = IssuerAdministrationServiceGrpc.getSearchDataExtractionStatisticsMethod(),
      implementation = ::searchDataExtractionStatistics
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = IssuerAdministrationServiceGrpc.getGetDataExtractionStatisticsMethod(),
      implementation = ::getDataExtractionStatistics
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = IssuerAdministrationServiceGrpc.getPingExternalMethod(),
      implementation = ::pingExternal
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = IssuerAdministrationServiceGrpc.getPingExternalWithCertificateMethod(),
      implementation = ::pingExternalWithCertificate
    )).build()
  }
}
