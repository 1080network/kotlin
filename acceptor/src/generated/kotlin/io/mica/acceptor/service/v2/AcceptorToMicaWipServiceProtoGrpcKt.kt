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
import io.mica.acceptor.service.v2.AcceptorToMicaWIPServiceGrpc.getServiceDescriptor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

/**
 * Holder for Kotlin coroutine-based client and server APIs for mica.acceptor.service.v2.AcceptorToMicaWIPService.
 */
public object AcceptorToMicaWIPServiceGrpcKt {
  public const val SERVICE_NAME: String = AcceptorToMicaWIPServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val createRecurringPaymentMethod:
      MethodDescriptor<CreateRecurringPaymentRequest, CreateRecurringPaymentResponse>
    @JvmStatic
    get() = AcceptorToMicaWIPServiceGrpc.getCreateRecurringPaymentMethod()

  public val getRecurringPaymentMethod:
      MethodDescriptor<GetRecurringPaymentRequest, GetRecurringPaymentResponse>
    @JvmStatic
    get() = AcceptorToMicaWIPServiceGrpc.getGetRecurringPaymentMethod()

  public val provisionRecurringPaymentUUEKMethod:
      MethodDescriptor<ProvisionRecurringPaymentUUEKRequest, ProvisionRecurringPaymentUUEKResponse>
    @JvmStatic
    get() = AcceptorToMicaWIPServiceGrpc.getProvisionRecurringPaymentUUEKMethod()

  /**
   * A stub for issuing RPCs to a(n) mica.acceptor.service.v2.AcceptorToMicaWIPService service as suspending coroutines.
   */
  @StubFor(AcceptorToMicaWIPServiceGrpc::class)
  public class AcceptorToMicaWIPServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<AcceptorToMicaWIPServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): AcceptorToMicaWIPServiceCoroutineStub = AcceptorToMicaWIPServiceCoroutineStub(channel, callOptions)

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
    public suspend fun createRecurringPayment(request: CreateRecurringPaymentRequest, headers: Metadata = Metadata()): CreateRecurringPaymentResponse = unaryRpc(
      channel,
      AcceptorToMicaWIPServiceGrpc.getCreateRecurringPaymentMethod(),
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
    public suspend fun getRecurringPayment(request: GetRecurringPaymentRequest, headers: Metadata = Metadata()): GetRecurringPaymentResponse = unaryRpc(
      channel,
      AcceptorToMicaWIPServiceGrpc.getGetRecurringPaymentMethod(),
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
    public suspend fun provisionRecurringPaymentUUEK(request: ProvisionRecurringPaymentUUEKRequest, headers: Metadata = Metadata()): ProvisionRecurringPaymentUUEKResponse = unaryRpc(
      channel,
      AcceptorToMicaWIPServiceGrpc.getProvisionRecurringPaymentUUEKMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the mica.acceptor.service.v2.AcceptorToMicaWIPService service based on Kotlin coroutines.
   */
  public abstract class AcceptorToMicaWIPServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for mica.acceptor.service.v2.AcceptorToMicaWIPService.CreateRecurringPayment.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun createRecurringPayment(request: CreateRecurringPaymentRequest): CreateRecurringPaymentResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method mica.acceptor.service.v2.AcceptorToMicaWIPService.CreateRecurringPayment is unimplemented"))

    /**
     * Returns the response to an RPC for mica.acceptor.service.v2.AcceptorToMicaWIPService.GetRecurringPayment.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getRecurringPayment(request: GetRecurringPaymentRequest): GetRecurringPaymentResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method mica.acceptor.service.v2.AcceptorToMicaWIPService.GetRecurringPayment is unimplemented"))

    /**
     * Returns the response to an RPC for mica.acceptor.service.v2.AcceptorToMicaWIPService.ProvisionRecurringPaymentUUEK.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun provisionRecurringPaymentUUEK(request: ProvisionRecurringPaymentUUEKRequest): ProvisionRecurringPaymentUUEKResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method mica.acceptor.service.v2.AcceptorToMicaWIPService.ProvisionRecurringPaymentUUEK is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AcceptorToMicaWIPServiceGrpc.getCreateRecurringPaymentMethod(),
      implementation = ::createRecurringPayment
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AcceptorToMicaWIPServiceGrpc.getGetRecurringPaymentMethod(),
      implementation = ::getRecurringPayment
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AcceptorToMicaWIPServiceGrpc.getProvisionRecurringPaymentUUEKMethod(),
      implementation = ::provisionRecurringPaymentUUEK
    )).build()
  }
}
