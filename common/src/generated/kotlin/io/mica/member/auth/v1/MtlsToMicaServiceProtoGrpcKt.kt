package io.mica.member.auth.v1

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
import io.mica.member.auth.v1.MTLSToMicaServiceGrpc.getServiceDescriptor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

/**
 * Holder for Kotlin coroutine-based client and server APIs for mica.member.auth.v1.MTLSToMicaService.
 */
public object MTLSToMicaServiceGrpcKt {
  public const val SERVICE_NAME: String = MTLSToMicaServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val generateCertificateMethod:
      MethodDescriptor<GenerateCertificateRequest, GenerateCertificateResponse>
    @JvmStatic
    get() = MTLSToMicaServiceGrpc.getGenerateCertificateMethod()

  public val enableCertificateMethod:
      MethodDescriptor<EnableCertificateRequest, EnableCertificateResponse>
    @JvmStatic
    get() = MTLSToMicaServiceGrpc.getEnableCertificateMethod()

  public val disableCertificateMethod:
      MethodDescriptor<DisableCertificateRequest, DisableCertificateResponse>
    @JvmStatic
    get() = MTLSToMicaServiceGrpc.getDisableCertificateMethod()

  public val searchCertificateMethod:
      MethodDescriptor<SearchCertificateRequest, SearchCertificateResponse>
    @JvmStatic
    get() = MTLSToMicaServiceGrpc.getSearchCertificateMethod()

  public val getCertificateMethod: MethodDescriptor<GetCertificateRequest, GetCertificateResponse>
    @JvmStatic
    get() = MTLSToMicaServiceGrpc.getGetCertificateMethod()

  /**
   * A stub for issuing RPCs to a(n) mica.member.auth.v1.MTLSToMicaService service as suspending coroutines.
   */
  @StubFor(MTLSToMicaServiceGrpc::class)
  public class MTLSToMicaServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<MTLSToMicaServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): MTLSToMicaServiceCoroutineStub = MTLSToMicaServiceCoroutineStub(channel, callOptions)

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
    public suspend fun generateCertificate(request: GenerateCertificateRequest, headers: Metadata = Metadata()): GenerateCertificateResponse = unaryRpc(
      channel,
      MTLSToMicaServiceGrpc.getGenerateCertificateMethod(),
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
    public suspend fun enableCertificate(request: EnableCertificateRequest, headers: Metadata = Metadata()): EnableCertificateResponse = unaryRpc(
      channel,
      MTLSToMicaServiceGrpc.getEnableCertificateMethod(),
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
    public suspend fun disableCertificate(request: DisableCertificateRequest, headers: Metadata = Metadata()): DisableCertificateResponse = unaryRpc(
      channel,
      MTLSToMicaServiceGrpc.getDisableCertificateMethod(),
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
    public suspend fun searchCertificate(request: SearchCertificateRequest, headers: Metadata = Metadata()): SearchCertificateResponse = unaryRpc(
      channel,
      MTLSToMicaServiceGrpc.getSearchCertificateMethod(),
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
    public suspend fun getCertificate(request: GetCertificateRequest, headers: Metadata = Metadata()): GetCertificateResponse = unaryRpc(
      channel,
      MTLSToMicaServiceGrpc.getGetCertificateMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the mica.member.auth.v1.MTLSToMicaService service based on Kotlin coroutines.
   */
  public abstract class MTLSToMicaServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for mica.member.auth.v1.MTLSToMicaService.GenerateCertificate.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun generateCertificate(request: GenerateCertificateRequest): GenerateCertificateResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method mica.member.auth.v1.MTLSToMicaService.GenerateCertificate is unimplemented"))

    /**
     * Returns the response to an RPC for mica.member.auth.v1.MTLSToMicaService.EnableCertificate.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun enableCertificate(request: EnableCertificateRequest): EnableCertificateResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method mica.member.auth.v1.MTLSToMicaService.EnableCertificate is unimplemented"))

    /**
     * Returns the response to an RPC for mica.member.auth.v1.MTLSToMicaService.DisableCertificate.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun disableCertificate(request: DisableCertificateRequest): DisableCertificateResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method mica.member.auth.v1.MTLSToMicaService.DisableCertificate is unimplemented"))

    /**
     * Returns the response to an RPC for mica.member.auth.v1.MTLSToMicaService.SearchCertificate.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun searchCertificate(request: SearchCertificateRequest): SearchCertificateResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method mica.member.auth.v1.MTLSToMicaService.SearchCertificate is unimplemented"))

    /**
     * Returns the response to an RPC for mica.member.auth.v1.MTLSToMicaService.GetCertificate.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getCertificate(request: GetCertificateRequest): GetCertificateResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method mica.member.auth.v1.MTLSToMicaService.GetCertificate is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MTLSToMicaServiceGrpc.getGenerateCertificateMethod(),
      implementation = ::generateCertificate
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MTLSToMicaServiceGrpc.getEnableCertificateMethod(),
      implementation = ::enableCertificate
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MTLSToMicaServiceGrpc.getDisableCertificateMethod(),
      implementation = ::disableCertificate
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MTLSToMicaServiceGrpc.getSearchCertificateMethod(),
      implementation = ::searchCertificate
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MTLSToMicaServiceGrpc.getGetCertificateMethod(),
      implementation = ::getCertificate
    )).build()
  }
}
