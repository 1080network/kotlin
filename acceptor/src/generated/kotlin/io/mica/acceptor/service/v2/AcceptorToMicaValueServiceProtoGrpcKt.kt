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
import io.mica.acceptor.service.v2.AcceptorToMicaValueServiceGrpc.getServiceDescriptor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

/**
 * Holder for Kotlin coroutine-based client and server APIs for mica.acceptor.service.v2.AcceptorToMicaValueService.
 */
public object AcceptorToMicaValueServiceGrpcKt {
  public const val SERVICE_NAME: String = AcceptorToMicaValueServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val obtainValueMethod: MethodDescriptor<ObtainValueRequest, ObtainValueResponse>
    @JvmStatic
    get() = AcceptorToMicaValueServiceGrpc.getObtainValueMethod()

  public val reverseObtainValueMethod:
      MethodDescriptor<ReverseObtainValueRequest, ReverseObtainValueResponse>
    @JvmStatic
    get() = AcceptorToMicaValueServiceGrpc.getReverseObtainValueMethod()

  public val refundValueMethod: MethodDescriptor<RefundValueRequest, RefundValueResponse>
    @JvmStatic
    get() = AcceptorToMicaValueServiceGrpc.getRefundValueMethod()

  public val payoutValueMethod: MethodDescriptor<PayoutValueRequest, PayoutValueResponse>
    @JvmStatic
    get() = AcceptorToMicaValueServiceGrpc.getPayoutValueMethod()

  public val holdValueMethod: MethodDescriptor<HoldValueRequest, HoldValueResponse>
    @JvmStatic
    get() = AcceptorToMicaValueServiceGrpc.getHoldValueMethod()

  public val releaseHoldValueMethod:
      MethodDescriptor<ReleaseHoldValueRequest, ReleaseHoldValueResponse>
    @JvmStatic
    get() = AcceptorToMicaValueServiceGrpc.getReleaseHoldValueMethod()

  public val obtainHoldValueMethod:
      MethodDescriptor<ObtainHoldValueRequest, ObtainHoldValueResponse>
    @JvmStatic
    get() = AcceptorToMicaValueServiceGrpc.getObtainHoldValueMethod()

  /**
   * A stub for issuing RPCs to a(n) mica.acceptor.service.v2.AcceptorToMicaValueService service as suspending coroutines.
   */
  @StubFor(AcceptorToMicaValueServiceGrpc::class)
  public class AcceptorToMicaValueServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<AcceptorToMicaValueServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): AcceptorToMicaValueServiceCoroutineStub = AcceptorToMicaValueServiceCoroutineStub(channel, callOptions)

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
    public suspend fun obtainValue(request: ObtainValueRequest, headers: Metadata = Metadata()): ObtainValueResponse = unaryRpc(
      channel,
      AcceptorToMicaValueServiceGrpc.getObtainValueMethod(),
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
    public suspend fun reverseObtainValue(request: ReverseObtainValueRequest, headers: Metadata = Metadata()): ReverseObtainValueResponse = unaryRpc(
      channel,
      AcceptorToMicaValueServiceGrpc.getReverseObtainValueMethod(),
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
    public suspend fun refundValue(request: RefundValueRequest, headers: Metadata = Metadata()): RefundValueResponse = unaryRpc(
      channel,
      AcceptorToMicaValueServiceGrpc.getRefundValueMethod(),
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
    public suspend fun payoutValue(request: PayoutValueRequest, headers: Metadata = Metadata()): PayoutValueResponse = unaryRpc(
      channel,
      AcceptorToMicaValueServiceGrpc.getPayoutValueMethod(),
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
    public suspend fun holdValue(request: HoldValueRequest, headers: Metadata = Metadata()): HoldValueResponse = unaryRpc(
      channel,
      AcceptorToMicaValueServiceGrpc.getHoldValueMethod(),
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
    public suspend fun releaseHoldValue(request: ReleaseHoldValueRequest, headers: Metadata = Metadata()): ReleaseHoldValueResponse = unaryRpc(
      channel,
      AcceptorToMicaValueServiceGrpc.getReleaseHoldValueMethod(),
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
    public suspend fun obtainHoldValue(request: ObtainHoldValueRequest, headers: Metadata = Metadata()): ObtainHoldValueResponse = unaryRpc(
      channel,
      AcceptorToMicaValueServiceGrpc.getObtainHoldValueMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the mica.acceptor.service.v2.AcceptorToMicaValueService service based on Kotlin coroutines.
   */
  public abstract class AcceptorToMicaValueServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for mica.acceptor.service.v2.AcceptorToMicaValueService.ObtainValue.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun obtainValue(request: ObtainValueRequest): ObtainValueResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method mica.acceptor.service.v2.AcceptorToMicaValueService.ObtainValue is unimplemented"))

    /**
     * Returns the response to an RPC for mica.acceptor.service.v2.AcceptorToMicaValueService.ReverseObtainValue.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun reverseObtainValue(request: ReverseObtainValueRequest): ReverseObtainValueResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method mica.acceptor.service.v2.AcceptorToMicaValueService.ReverseObtainValue is unimplemented"))

    /**
     * Returns the response to an RPC for mica.acceptor.service.v2.AcceptorToMicaValueService.RefundValue.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun refundValue(request: RefundValueRequest): RefundValueResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method mica.acceptor.service.v2.AcceptorToMicaValueService.RefundValue is unimplemented"))

    /**
     * Returns the response to an RPC for mica.acceptor.service.v2.AcceptorToMicaValueService.PayoutValue.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun payoutValue(request: PayoutValueRequest): PayoutValueResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method mica.acceptor.service.v2.AcceptorToMicaValueService.PayoutValue is unimplemented"))

    /**
     * Returns the response to an RPC for mica.acceptor.service.v2.AcceptorToMicaValueService.HoldValue.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun holdValue(request: HoldValueRequest): HoldValueResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method mica.acceptor.service.v2.AcceptorToMicaValueService.HoldValue is unimplemented"))

    /**
     * Returns the response to an RPC for mica.acceptor.service.v2.AcceptorToMicaValueService.ReleaseHoldValue.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun releaseHoldValue(request: ReleaseHoldValueRequest): ReleaseHoldValueResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method mica.acceptor.service.v2.AcceptorToMicaValueService.ReleaseHoldValue is unimplemented"))

    /**
     * Returns the response to an RPC for mica.acceptor.service.v2.AcceptorToMicaValueService.ObtainHoldValue.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun obtainHoldValue(request: ObtainHoldValueRequest): ObtainHoldValueResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method mica.acceptor.service.v2.AcceptorToMicaValueService.ObtainHoldValue is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AcceptorToMicaValueServiceGrpc.getObtainValueMethod(),
      implementation = ::obtainValue
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AcceptorToMicaValueServiceGrpc.getReverseObtainValueMethod(),
      implementation = ::reverseObtainValue
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AcceptorToMicaValueServiceGrpc.getRefundValueMethod(),
      implementation = ::refundValue
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AcceptorToMicaValueServiceGrpc.getPayoutValueMethod(),
      implementation = ::payoutValue
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AcceptorToMicaValueServiceGrpc.getHoldValueMethod(),
      implementation = ::holdValue
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AcceptorToMicaValueServiceGrpc.getReleaseHoldValueMethod(),
      implementation = ::releaseHoldValue
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AcceptorToMicaValueServiceGrpc.getObtainHoldValueMethod(),
      implementation = ::obtainHoldValue
    )).build()
  }
}
