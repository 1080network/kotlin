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
import io.mica.issuer.`value`.v2.ReceiveValueRequest
import io.mica.issuer.`value`.v2.ReceiveValueResponse
import io.mica.issuer.service.v2.IssuerFromMicaWIPServiceGrpc.getServiceDescriptor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

/**
 * Holder for Kotlin coroutine-based client and server APIs for mica.issuer.service.v2.IssuerFromMicaWIPService.
 */
public object IssuerFromMicaWIPServiceGrpcKt {
  public const val SERVICE_NAME: String = IssuerFromMicaWIPServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val approveChargebackMethod:
      MethodDescriptor<ApproveChargebackRequest, ApproveChargebackResponse>
    @JvmStatic
    get() = IssuerFromMicaWIPServiceGrpc.getApproveChargebackMethod()

  public val receiveValueMethod: MethodDescriptor<ReceiveValueRequest, ReceiveValueResponse>
    @JvmStatic
    get() = IssuerFromMicaWIPServiceGrpc.getReceiveValueMethod()

  /**
   * A stub for issuing RPCs to a(n) mica.issuer.service.v2.IssuerFromMicaWIPService service as suspending coroutines.
   */
  @StubFor(IssuerFromMicaWIPServiceGrpc::class)
  public class IssuerFromMicaWIPServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<IssuerFromMicaWIPServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): IssuerFromMicaWIPServiceCoroutineStub = IssuerFromMicaWIPServiceCoroutineStub(channel, callOptions)

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
    public suspend fun approveChargeback(request: ApproveChargebackRequest, headers: Metadata = Metadata()): ApproveChargebackResponse = unaryRpc(
      channel,
      IssuerFromMicaWIPServiceGrpc.getApproveChargebackMethod(),
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
    public suspend fun receiveValue(request: ReceiveValueRequest, headers: Metadata = Metadata()): ReceiveValueResponse = unaryRpc(
      channel,
      IssuerFromMicaWIPServiceGrpc.getReceiveValueMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the mica.issuer.service.v2.IssuerFromMicaWIPService service based on Kotlin coroutines.
   */
  public abstract class IssuerFromMicaWIPServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for mica.issuer.service.v2.IssuerFromMicaWIPService.ApproveChargeback.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun approveChargeback(request: ApproveChargebackRequest): ApproveChargebackResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method mica.issuer.service.v2.IssuerFromMicaWIPService.ApproveChargeback is unimplemented"))

    /**
     * Returns the response to an RPC for mica.issuer.service.v2.IssuerFromMicaWIPService.ReceiveValue.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun receiveValue(request: ReceiveValueRequest): ReceiveValueResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method mica.issuer.service.v2.IssuerFromMicaWIPService.ReceiveValue is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = IssuerFromMicaWIPServiceGrpc.getApproveChargebackMethod(),
      implementation = ::approveChargeback
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = IssuerFromMicaWIPServiceGrpc.getReceiveValueMethod(),
      implementation = ::receiveValue
    )).build()
  }
}
