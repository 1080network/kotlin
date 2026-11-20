package io.mica.acceptor.service.v2

import io.grpc.CallOptions
import io.grpc.CallOptions.DEFAULT
import io.grpc.Channel
import io.grpc.ServerServiceDefinition
import io.grpc.ServerServiceDefinition.builder
import io.grpc.ServiceDescriptor
import io.grpc.kotlin.AbstractCoroutineServerImpl
import io.grpc.kotlin.AbstractCoroutineStub
import io.grpc.kotlin.StubFor
import io.mica.acceptor.service.v2.AcceptorFromMicaServiceGrpc.getServiceDescriptor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

/**
 * Holder for Kotlin coroutine-based client and server APIs for mica.acceptor.service.v2.AcceptorFromMicaService.
 */
public object AcceptorFromMicaServiceGrpcKt {
  public const val SERVICE_NAME: String = AcceptorFromMicaServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  /**
   * A stub for issuing RPCs to a(n) mica.acceptor.service.v2.AcceptorFromMicaService service as suspending coroutines.
   */
  @StubFor(AcceptorFromMicaServiceGrpc::class)
  public class AcceptorFromMicaServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<AcceptorFromMicaServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): AcceptorFromMicaServiceCoroutineStub = AcceptorFromMicaServiceCoroutineStub(channel, callOptions)
  }

  /**
   * Skeletal implementation of the mica.acceptor.service.v2.AcceptorFromMicaService service based on Kotlin coroutines.
   */
  public abstract class AcceptorFromMicaServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor()).build()
  }
}
