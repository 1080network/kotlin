package io.mica.issuer.service.v2

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
import io.mica.issuer.service.v2.IssuerToMicaWIPServiceGrpc.getServiceDescriptor
import kotlin.Deprecated
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

/**
 * Holder for Kotlin coroutine-based client and server APIs for mica.issuer.service.v2.IssuerToMicaWIPService.
 */
public object IssuerToMicaWIPServiceGrpcKt {
  public const val SERVICE_NAME: String = IssuerToMicaWIPServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val searchRecurringPaymentsMethod:
      MethodDescriptor<SearchRecurringPaymentsRequest, SearchRecurringPaymentsResponse>
    @JvmStatic
    get() = IssuerToMicaWIPServiceGrpc.getSearchRecurringPaymentsMethod()

  public val sendValueMethod: MethodDescriptor<SendValueRequest, SendValueResponse>
    @JvmStatic
    get() = IssuerToMicaWIPServiceGrpc.getSendValueMethod()

  public val initializeWebSessionMethod:
      MethodDescriptor<InitializeWebSessionRequest, InitializeWebSessionResponse>
    @JvmStatic
    get() = IssuerToMicaWIPServiceGrpc.getInitializeWebSessionMethod()

  /**
   * A stub for issuing RPCs to a(n) mica.issuer.service.v2.IssuerToMicaWIPService service as suspending coroutines.
   */
  @StubFor(IssuerToMicaWIPServiceGrpc::class)
  public class IssuerToMicaWIPServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<IssuerToMicaWIPServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): IssuerToMicaWIPServiceCoroutineStub = IssuerToMicaWIPServiceCoroutineStub(channel, callOptions)

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
    public suspend fun searchRecurringPayments(request: SearchRecurringPaymentsRequest, headers: Metadata = Metadata()): SearchRecurringPaymentsResponse = unaryRpc(
      channel,
      IssuerToMicaWIPServiceGrpc.getSearchRecurringPaymentsMethod(),
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
    @Deprecated("The underlying service method is marked deprecated.")
    public suspend fun sendValue(request: SendValueRequest, headers: Metadata = Metadata()): SendValueResponse = unaryRpc(
      channel,
      IssuerToMicaWIPServiceGrpc.getSendValueMethod(),
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
    public suspend fun initializeWebSession(request: InitializeWebSessionRequest, headers: Metadata = Metadata()): InitializeWebSessionResponse = unaryRpc(
      channel,
      IssuerToMicaWIPServiceGrpc.getInitializeWebSessionMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the mica.issuer.service.v2.IssuerToMicaWIPService service based on Kotlin coroutines.
   */
  public abstract class IssuerToMicaWIPServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for mica.issuer.service.v2.IssuerToMicaWIPService.SearchRecurringPayments.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun searchRecurringPayments(request: SearchRecurringPaymentsRequest): SearchRecurringPaymentsResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method mica.issuer.service.v2.IssuerToMicaWIPService.SearchRecurringPayments is unimplemented"))

    /**
     * Returns the response to an RPC for mica.issuer.service.v2.IssuerToMicaWIPService.SendValue.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    @Deprecated("The underlying service method is marked deprecated.")
    public open suspend fun sendValue(request: SendValueRequest): SendValueResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method mica.issuer.service.v2.IssuerToMicaWIPService.SendValue is unimplemented"))

    /**
     * Returns the response to an RPC for mica.issuer.service.v2.IssuerToMicaWIPService.InitializeWebSession.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun initializeWebSession(request: InitializeWebSessionRequest): InitializeWebSessionResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method mica.issuer.service.v2.IssuerToMicaWIPService.InitializeWebSession is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = IssuerToMicaWIPServiceGrpc.getSearchRecurringPaymentsMethod(),
      implementation = ::searchRecurringPayments
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = IssuerToMicaWIPServiceGrpc.getSendValueMethod(),
      implementation = ::sendValue
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = IssuerToMicaWIPServiceGrpc.getInitializeWebSessionMethod(),
      implementation = ::initializeWebSession
    )).build()
  }
}
