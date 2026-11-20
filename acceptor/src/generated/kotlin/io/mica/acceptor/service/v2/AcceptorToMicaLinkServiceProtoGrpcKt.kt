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
import io.mica.acceptor.instrument.v2.GetLinkRequest
import io.mica.acceptor.instrument.v2.GetLinkResponse
import io.mica.acceptor.instrument.v2.RemoveInstrumentLinkRequest
import io.mica.acceptor.instrument.v2.RemoveInstrumentLinkResponse
import io.mica.acceptor.service.v2.AcceptorToMicaLinkServiceGrpc.getServiceDescriptor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

/**
 * Holder for Kotlin coroutine-based client and server APIs for mica.acceptor.service.v2.AcceptorToMicaLinkService.
 */
public object AcceptorToMicaLinkServiceGrpcKt {
  public const val SERVICE_NAME: String = AcceptorToMicaLinkServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val completeLinkingWithCodeMethod:
      MethodDescriptor<CompleteLinkingWithCodeRequest, CompleteLinkingWithCodeResponse>
    @JvmStatic
    get() = AcceptorToMicaLinkServiceGrpc.getCompleteLinkingWithCodeMethod()

  public val provisionUUEKFromLinkMethod:
      MethodDescriptor<ProvisionUUEKFromLinkRequest, ProvisionUUEKFromLinkResponse>
    @JvmStatic
    get() = AcceptorToMicaLinkServiceGrpc.getProvisionUUEKFromLinkMethod()

  public val getLinkMethod: MethodDescriptor<GetLinkRequest, GetLinkResponse>
    @JvmStatic
    get() = AcceptorToMicaLinkServiceGrpc.getGetLinkMethod()

  public val removeInstrumentLinkMethod:
      MethodDescriptor<RemoveInstrumentLinkRequest, RemoveInstrumentLinkResponse>
    @JvmStatic
    get() = AcceptorToMicaLinkServiceGrpc.getRemoveInstrumentLinkMethod()

  /**
   * A stub for issuing RPCs to a(n) mica.acceptor.service.v2.AcceptorToMicaLinkService service as suspending coroutines.
   */
  @StubFor(AcceptorToMicaLinkServiceGrpc::class)
  public class AcceptorToMicaLinkServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<AcceptorToMicaLinkServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): AcceptorToMicaLinkServiceCoroutineStub = AcceptorToMicaLinkServiceCoroutineStub(channel, callOptions)

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
    public suspend fun completeLinkingWithCode(request: CompleteLinkingWithCodeRequest, headers: Metadata = Metadata()): CompleteLinkingWithCodeResponse = unaryRpc(
      channel,
      AcceptorToMicaLinkServiceGrpc.getCompleteLinkingWithCodeMethod(),
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
    public suspend fun provisionUUEKFromLink(request: ProvisionUUEKFromLinkRequest, headers: Metadata = Metadata()): ProvisionUUEKFromLinkResponse = unaryRpc(
      channel,
      AcceptorToMicaLinkServiceGrpc.getProvisionUUEKFromLinkMethod(),
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
    public suspend fun getLink(request: GetLinkRequest, headers: Metadata = Metadata()): GetLinkResponse = unaryRpc(
      channel,
      AcceptorToMicaLinkServiceGrpc.getGetLinkMethod(),
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
    public suspend fun removeInstrumentLink(request: RemoveInstrumentLinkRequest, headers: Metadata = Metadata()): RemoveInstrumentLinkResponse = unaryRpc(
      channel,
      AcceptorToMicaLinkServiceGrpc.getRemoveInstrumentLinkMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the mica.acceptor.service.v2.AcceptorToMicaLinkService service based on Kotlin coroutines.
   */
  public abstract class AcceptorToMicaLinkServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for mica.acceptor.service.v2.AcceptorToMicaLinkService.CompleteLinkingWithCode.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun completeLinkingWithCode(request: CompleteLinkingWithCodeRequest): CompleteLinkingWithCodeResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method mica.acceptor.service.v2.AcceptorToMicaLinkService.CompleteLinkingWithCode is unimplemented"))

    /**
     * Returns the response to an RPC for mica.acceptor.service.v2.AcceptorToMicaLinkService.ProvisionUUEKFromLink.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun provisionUUEKFromLink(request: ProvisionUUEKFromLinkRequest): ProvisionUUEKFromLinkResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method mica.acceptor.service.v2.AcceptorToMicaLinkService.ProvisionUUEKFromLink is unimplemented"))

    /**
     * Returns the response to an RPC for mica.acceptor.service.v2.AcceptorToMicaLinkService.GetLink.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getLink(request: GetLinkRequest): GetLinkResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method mica.acceptor.service.v2.AcceptorToMicaLinkService.GetLink is unimplemented"))

    /**
     * Returns the response to an RPC for mica.acceptor.service.v2.AcceptorToMicaLinkService.RemoveInstrumentLink.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun removeInstrumentLink(request: RemoveInstrumentLinkRequest): RemoveInstrumentLinkResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method mica.acceptor.service.v2.AcceptorToMicaLinkService.RemoveInstrumentLink is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AcceptorToMicaLinkServiceGrpc.getCompleteLinkingWithCodeMethod(),
      implementation = ::completeLinkingWithCode
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AcceptorToMicaLinkServiceGrpc.getProvisionUUEKFromLinkMethod(),
      implementation = ::provisionUUEKFromLink
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AcceptorToMicaLinkServiceGrpc.getGetLinkMethod(),
      implementation = ::getLink
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AcceptorToMicaLinkServiceGrpc.getRemoveInstrumentLinkMethod(),
      implementation = ::removeInstrumentLink
    )).build()
  }
}
