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
import io.mica.issuer.service.v2.IssuerFromMicaServiceGrpc.getServiceDescriptor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

/**
 * Holder for Kotlin coroutine-based client and server APIs for mica.issuer.service.v2.IssuerFromMicaService.
 */
public object IssuerFromMicaServiceGrpcKt {
  public const val SERVICE_NAME: String = IssuerFromMicaServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val obtainValueMethod: MethodDescriptor<ObtainValueRequest, ObtainValueResponse>
    @JvmStatic
    get() = IssuerFromMicaServiceGrpc.getObtainValueMethod()

  public val reverseObtainValueMethod:
      MethodDescriptor<ReverseObtainValueRequest, ReverseObtainValueResponse>
    @JvmStatic
    get() = IssuerFromMicaServiceGrpc.getReverseObtainValueMethod()

  public val refundValueMethod: MethodDescriptor<RefundValueRequest, RefundValueResponse>
    @JvmStatic
    get() = IssuerFromMicaServiceGrpc.getRefundValueMethod()

  public val payoutValueMethod: MethodDescriptor<PayoutValueRequest, PayoutValueResponse>
    @JvmStatic
    get() = IssuerFromMicaServiceGrpc.getPayoutValueMethod()

  public val holdValueMethod: MethodDescriptor<HoldValueRequest, HoldValueResponse>
    @JvmStatic
    get() = IssuerFromMicaServiceGrpc.getHoldValueMethod()

  public val releaseHoldValueMethod:
      MethodDescriptor<ReleaseHoldValueRequest, ReleaseHoldValueResponse>
    @JvmStatic
    get() = IssuerFromMicaServiceGrpc.getReleaseHoldValueMethod()

  public val obtainHoldValueMethod:
      MethodDescriptor<ObtainHoldValueRequest, ObtainHoldValueResponse>
    @JvmStatic
    get() = IssuerFromMicaServiceGrpc.getObtainHoldValueMethod()

  public val valueAdviceMethod: MethodDescriptor<ValueAdviceRequest, ValueAdviceResponse>
    @JvmStatic
    get() = IssuerFromMicaServiceGrpc.getValueAdviceMethod()

  public val pingMethod:
      MethodDescriptor<IssuerFromMicaServicePingRequest, IssuerFromMicaServicePingResponse>
    @JvmStatic
    get() = IssuerFromMicaServiceGrpc.getPingMethod()

  /**
   * A stub for issuing RPCs to a(n) mica.issuer.service.v2.IssuerFromMicaService service as suspending coroutines.
   */
  @StubFor(IssuerFromMicaServiceGrpc::class)
  public class IssuerFromMicaServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<IssuerFromMicaServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): IssuerFromMicaServiceCoroutineStub = IssuerFromMicaServiceCoroutineStub(channel, callOptions)

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
      IssuerFromMicaServiceGrpc.getObtainValueMethod(),
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
      IssuerFromMicaServiceGrpc.getReverseObtainValueMethod(),
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
      IssuerFromMicaServiceGrpc.getRefundValueMethod(),
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
      IssuerFromMicaServiceGrpc.getPayoutValueMethod(),
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
      IssuerFromMicaServiceGrpc.getHoldValueMethod(),
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
      IssuerFromMicaServiceGrpc.getReleaseHoldValueMethod(),
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
      IssuerFromMicaServiceGrpc.getObtainHoldValueMethod(),
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
    public suspend fun valueAdvice(request: ValueAdviceRequest, headers: Metadata = Metadata()): ValueAdviceResponse = unaryRpc(
      channel,
      IssuerFromMicaServiceGrpc.getValueAdviceMethod(),
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
    public suspend fun ping(request: IssuerFromMicaServicePingRequest, headers: Metadata = Metadata()): IssuerFromMicaServicePingResponse = unaryRpc(
      channel,
      IssuerFromMicaServiceGrpc.getPingMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the mica.issuer.service.v2.IssuerFromMicaService service based on Kotlin coroutines.
   */
  public abstract class IssuerFromMicaServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for mica.issuer.service.v2.IssuerFromMicaService.ObtainValue.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun obtainValue(request: ObtainValueRequest): ObtainValueResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method mica.issuer.service.v2.IssuerFromMicaService.ObtainValue is unimplemented"))

    /**
     * Returns the response to an RPC for mica.issuer.service.v2.IssuerFromMicaService.ReverseObtainValue.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun reverseObtainValue(request: ReverseObtainValueRequest): ReverseObtainValueResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method mica.issuer.service.v2.IssuerFromMicaService.ReverseObtainValue is unimplemented"))

    /**
     * Returns the response to an RPC for mica.issuer.service.v2.IssuerFromMicaService.RefundValue.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun refundValue(request: RefundValueRequest): RefundValueResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method mica.issuer.service.v2.IssuerFromMicaService.RefundValue is unimplemented"))

    /**
     * Returns the response to an RPC for mica.issuer.service.v2.IssuerFromMicaService.PayoutValue.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun payoutValue(request: PayoutValueRequest): PayoutValueResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method mica.issuer.service.v2.IssuerFromMicaService.PayoutValue is unimplemented"))

    /**
     * Returns the response to an RPC for mica.issuer.service.v2.IssuerFromMicaService.HoldValue.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun holdValue(request: HoldValueRequest): HoldValueResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method mica.issuer.service.v2.IssuerFromMicaService.HoldValue is unimplemented"))

    /**
     * Returns the response to an RPC for mica.issuer.service.v2.IssuerFromMicaService.ReleaseHoldValue.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun releaseHoldValue(request: ReleaseHoldValueRequest): ReleaseHoldValueResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method mica.issuer.service.v2.IssuerFromMicaService.ReleaseHoldValue is unimplemented"))

    /**
     * Returns the response to an RPC for mica.issuer.service.v2.IssuerFromMicaService.ObtainHoldValue.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun obtainHoldValue(request: ObtainHoldValueRequest): ObtainHoldValueResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method mica.issuer.service.v2.IssuerFromMicaService.ObtainHoldValue is unimplemented"))

    /**
     * Returns the response to an RPC for mica.issuer.service.v2.IssuerFromMicaService.ValueAdvice.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun valueAdvice(request: ValueAdviceRequest): ValueAdviceResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method mica.issuer.service.v2.IssuerFromMicaService.ValueAdvice is unimplemented"))

    /**
     * Returns the response to an RPC for mica.issuer.service.v2.IssuerFromMicaService.Ping.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun ping(request: IssuerFromMicaServicePingRequest): IssuerFromMicaServicePingResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method mica.issuer.service.v2.IssuerFromMicaService.Ping is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = IssuerFromMicaServiceGrpc.getObtainValueMethod(),
      implementation = ::obtainValue
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = IssuerFromMicaServiceGrpc.getReverseObtainValueMethod(),
      implementation = ::reverseObtainValue
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = IssuerFromMicaServiceGrpc.getRefundValueMethod(),
      implementation = ::refundValue
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = IssuerFromMicaServiceGrpc.getPayoutValueMethod(),
      implementation = ::payoutValue
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = IssuerFromMicaServiceGrpc.getHoldValueMethod(),
      implementation = ::holdValue
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = IssuerFromMicaServiceGrpc.getReleaseHoldValueMethod(),
      implementation = ::releaseHoldValue
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = IssuerFromMicaServiceGrpc.getObtainHoldValueMethod(),
      implementation = ::obtainHoldValue
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = IssuerFromMicaServiceGrpc.getValueAdviceMethod(),
      implementation = ::valueAdvice
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = IssuerFromMicaServiceGrpc.getPingMethod(),
      implementation = ::ping
    )).build()
  }
}
