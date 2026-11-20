package io.mica.acceptor.service.v2

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
import io.mica.acceptor.acceptor.v2.GetAcceptorRequest
import io.mica.acceptor.acceptor.v2.GetAcceptorResponse
import io.mica.acceptor.service.v2.AcceptorToMicaServiceGrpc.getServiceDescriptor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

/**
 * Holder for Kotlin coroutine-based client and server APIs for mica.acceptor.service.v2.AcceptorToMicaService.
 */
public object AcceptorToMicaServiceGrpcKt {
  public const val SERVICE_NAME: String = AcceptorToMicaServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val getAcceptorMethod: MethodDescriptor<GetAcceptorRequest, GetAcceptorResponse>
    @JvmStatic
    get() = AcceptorToMicaServiceGrpc.getGetAcceptorMethod()

  public val createOrganizationMethod:
      MethodDescriptor<CreateOrganizationRequest, CreateOrganizationResponse>
    @JvmStatic
    get() = AcceptorToMicaServiceGrpc.getCreateOrganizationMethod()

  public val getOrganizationMethod:
      MethodDescriptor<GetOrganizationRequest, GetOrganizationResponse>
    @JvmStatic
    get() = AcceptorToMicaServiceGrpc.getGetOrganizationMethod()

  public val updateOrganizationMethod:
      MethodDescriptor<UpdateOrganizationRequest, UpdateOrganizationResponse>
    @JvmStatic
    get() = AcceptorToMicaServiceGrpc.getUpdateOrganizationMethod()

  public val activateOrganizationMethod:
      MethodDescriptor<ActivateOrganizationRequest, ActivateOrganizationResponse>
    @JvmStatic
    get() = AcceptorToMicaServiceGrpc.getActivateOrganizationMethod()

  public val deactivateOrganizationMethod:
      MethodDescriptor<DeactivateOrganizationRequest, DeactivateOrganizationResponse>
    @JvmStatic
    get() = AcceptorToMicaServiceGrpc.getDeactivateOrganizationMethod()

  public val searchOrganizationMethod:
      MethodDescriptor<SearchOrganizationRequest, SearchOrganizationResponse>
    @JvmStatic
    get() = AcceptorToMicaServiceGrpc.getSearchOrganizationMethod()

  /**
   * A stub for issuing RPCs to a(n) mica.acceptor.service.v2.AcceptorToMicaService service as suspending coroutines.
   */
  @StubFor(AcceptorToMicaServiceGrpc::class)
  public class AcceptorToMicaServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<AcceptorToMicaServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): AcceptorToMicaServiceCoroutineStub = AcceptorToMicaServiceCoroutineStub(channel, callOptions)

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
    public suspend fun getAcceptor(request: GetAcceptorRequest, headers: Metadata = Metadata()): GetAcceptorResponse = unaryRpc(
      channel,
      AcceptorToMicaServiceGrpc.getGetAcceptorMethod(),
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
    public suspend fun createOrganization(request: CreateOrganizationRequest, headers: Metadata = Metadata()): CreateOrganizationResponse = unaryRpc(
      channel,
      AcceptorToMicaServiceGrpc.getCreateOrganizationMethod(),
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
    public suspend fun getOrganization(request: GetOrganizationRequest, headers: Metadata = Metadata()): GetOrganizationResponse = unaryRpc(
      channel,
      AcceptorToMicaServiceGrpc.getGetOrganizationMethod(),
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
    public suspend fun updateOrganization(request: UpdateOrganizationRequest, headers: Metadata = Metadata()): UpdateOrganizationResponse = unaryRpc(
      channel,
      AcceptorToMicaServiceGrpc.getUpdateOrganizationMethod(),
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
    public suspend fun activateOrganization(request: ActivateOrganizationRequest, headers: Metadata = Metadata()): ActivateOrganizationResponse = unaryRpc(
      channel,
      AcceptorToMicaServiceGrpc.getActivateOrganizationMethod(),
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
    public suspend fun deactivateOrganization(request: DeactivateOrganizationRequest, headers: Metadata = Metadata()): DeactivateOrganizationResponse = unaryRpc(
      channel,
      AcceptorToMicaServiceGrpc.getDeactivateOrganizationMethod(),
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
    public suspend fun searchOrganization(request: SearchOrganizationRequest, headers: Metadata = Metadata()): SearchOrganizationResponse = unaryRpc(
      channel,
      AcceptorToMicaServiceGrpc.getSearchOrganizationMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the mica.acceptor.service.v2.AcceptorToMicaService service based on Kotlin coroutines.
   */
  public abstract class AcceptorToMicaServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for mica.acceptor.service.v2.AcceptorToMicaService.GetAcceptor.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getAcceptor(request: GetAcceptorRequest): GetAcceptorResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method mica.acceptor.service.v2.AcceptorToMicaService.GetAcceptor is unimplemented"))

    /**
     * Returns the response to an RPC for mica.acceptor.service.v2.AcceptorToMicaService.CreateOrganization.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun createOrganization(request: CreateOrganizationRequest): CreateOrganizationResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method mica.acceptor.service.v2.AcceptorToMicaService.CreateOrganization is unimplemented"))

    /**
     * Returns the response to an RPC for mica.acceptor.service.v2.AcceptorToMicaService.GetOrganization.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getOrganization(request: GetOrganizationRequest): GetOrganizationResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method mica.acceptor.service.v2.AcceptorToMicaService.GetOrganization is unimplemented"))

    /**
     * Returns the response to an RPC for mica.acceptor.service.v2.AcceptorToMicaService.UpdateOrganization.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun updateOrganization(request: UpdateOrganizationRequest): UpdateOrganizationResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method mica.acceptor.service.v2.AcceptorToMicaService.UpdateOrganization is unimplemented"))

    /**
     * Returns the response to an RPC for mica.acceptor.service.v2.AcceptorToMicaService.ActivateOrganization.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun activateOrganization(request: ActivateOrganizationRequest): ActivateOrganizationResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method mica.acceptor.service.v2.AcceptorToMicaService.ActivateOrganization is unimplemented"))

    /**
     * Returns the response to an RPC for mica.acceptor.service.v2.AcceptorToMicaService.DeactivateOrganization.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun deactivateOrganization(request: DeactivateOrganizationRequest): DeactivateOrganizationResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method mica.acceptor.service.v2.AcceptorToMicaService.DeactivateOrganization is unimplemented"))

    /**
     * Returns the response to an RPC for mica.acceptor.service.v2.AcceptorToMicaService.SearchOrganization.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun searchOrganization(request: SearchOrganizationRequest): SearchOrganizationResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method mica.acceptor.service.v2.AcceptorToMicaService.SearchOrganization is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AcceptorToMicaServiceGrpc.getGetAcceptorMethod(),
      implementation = ::getAcceptor
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AcceptorToMicaServiceGrpc.getCreateOrganizationMethod(),
      implementation = ::createOrganization
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AcceptorToMicaServiceGrpc.getGetOrganizationMethod(),
      implementation = ::getOrganization
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AcceptorToMicaServiceGrpc.getUpdateOrganizationMethod(),
      implementation = ::updateOrganization
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AcceptorToMicaServiceGrpc.getActivateOrganizationMethod(),
      implementation = ::activateOrganization
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AcceptorToMicaServiceGrpc.getDeactivateOrganizationMethod(),
      implementation = ::deactivateOrganization
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AcceptorToMicaServiceGrpc.getSearchOrganizationMethod(),
      implementation = ::searchOrganization
    )).build()
  }
}
