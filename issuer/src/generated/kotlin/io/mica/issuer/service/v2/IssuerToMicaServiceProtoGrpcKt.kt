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
import io.mica.issuer.`value`.v2.GetValueRequest
import io.mica.issuer.`value`.v2.GetValueResponse
import io.mica.issuer.instrument.v2.CompleteLinkingWithCodeRequest
import io.mica.issuer.instrument.v2.CompleteLinkingWithCodeResponse
import io.mica.issuer.instrument.v2.GetInstrumentLinkRequest
import io.mica.issuer.instrument.v2.GetInstrumentLinkResponse
import io.mica.issuer.instrument.v2.GetInstrumentRequest
import io.mica.issuer.instrument.v2.GetInstrumentResponse
import io.mica.issuer.instrument.v2.ProvisionInstrumentLinkingCodeRequest
import io.mica.issuer.instrument.v2.ProvisionInstrumentLinkingCodeResponse
import io.mica.issuer.instrument.v2.RegisterInstrumentRequest
import io.mica.issuer.instrument.v2.RegisterInstrumentResponse
import io.mica.issuer.instrument.v2.RemoveInstrumentLinkRequest
import io.mica.issuer.instrument.v2.RemoveInstrumentLinkResponse
import io.mica.issuer.instrument.v2.RemoveInstrumentRequest
import io.mica.issuer.instrument.v2.RemoveInstrumentResponse
import io.mica.issuer.instrument.v2.SearchInstrumentLinksRequest
import io.mica.issuer.instrument.v2.SearchInstrumentLinksResponse
import io.mica.issuer.instrument.v2.SearchInstrumentRequest
import io.mica.issuer.instrument.v2.SearchInstrumentResponse
import io.mica.issuer.issuer.v2.GetIssuerRequest
import io.mica.issuer.issuer.v2.GetIssuerResponse
import io.mica.issuer.service.v2.IssuerToMicaServiceGrpc.getServiceDescriptor
import io.mica.issuer.user.v2.GetUserRequest
import io.mica.issuer.user.v2.GetUserResponse
import io.mica.issuer.user.v2.RegisterUserRequest
import io.mica.issuer.user.v2.RegisterUserResponse
import io.mica.issuer.user.v2.RemoveUserRequest
import io.mica.issuer.user.v2.RemoveUserResponse
import io.mica.issuer.user.v2.UpdateUserRequest
import io.mica.issuer.user.v2.UpdateUserResponse
import io.mica.issuer.uuek.v2.ProvisionIssuerUUEKRequest
import io.mica.issuer.uuek.v2.ProvisionIssuerUUEKResponse
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

/**
 * Holder for Kotlin coroutine-based client and server APIs for mica.issuer.service.v2.IssuerToMicaService.
 */
public object IssuerToMicaServiceGrpcKt {
  public const val SERVICE_NAME: String = IssuerToMicaServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val getIssuerMethod: MethodDescriptor<GetIssuerRequest, GetIssuerResponse>
    @JvmStatic
    get() = IssuerToMicaServiceGrpc.getGetIssuerMethod()

  public val registerUserMethod: MethodDescriptor<RegisterUserRequest, RegisterUserResponse>
    @JvmStatic
    get() = IssuerToMicaServiceGrpc.getRegisterUserMethod()

  public val getUserMethod: MethodDescriptor<GetUserRequest, GetUserResponse>
    @JvmStatic
    get() = IssuerToMicaServiceGrpc.getGetUserMethod()

  public val updateUserMethod: MethodDescriptor<UpdateUserRequest, UpdateUserResponse>
    @JvmStatic
    get() = IssuerToMicaServiceGrpc.getUpdateUserMethod()

  public val removeUserMethod: MethodDescriptor<RemoveUserRequest, RemoveUserResponse>
    @JvmStatic
    get() = IssuerToMicaServiceGrpc.getRemoveUserMethod()

  public val registerInstrumentMethod:
      MethodDescriptor<RegisterInstrumentRequest, RegisterInstrumentResponse>
    @JvmStatic
    get() = IssuerToMicaServiceGrpc.getRegisterInstrumentMethod()

  public val getInstrumentMethod: MethodDescriptor<GetInstrumentRequest, GetInstrumentResponse>
    @JvmStatic
    get() = IssuerToMicaServiceGrpc.getGetInstrumentMethod()

  public val removeInstrumentMethod:
      MethodDescriptor<RemoveInstrumentRequest, RemoveInstrumentResponse>
    @JvmStatic
    get() = IssuerToMicaServiceGrpc.getRemoveInstrumentMethod()

  public val searchInstrumentMethod:
      MethodDescriptor<SearchInstrumentRequest, SearchInstrumentResponse>
    @JvmStatic
    get() = IssuerToMicaServiceGrpc.getSearchInstrumentMethod()

  public val provisionIssuerUUEKMethod:
      MethodDescriptor<ProvisionIssuerUUEKRequest, ProvisionIssuerUUEKResponse>
    @JvmStatic
    get() = IssuerToMicaServiceGrpc.getProvisionIssuerUUEKMethod()

  public val provisionInstrumentLinkingCodeMethod:
      MethodDescriptor<ProvisionInstrumentLinkingCodeRequest, ProvisionInstrumentLinkingCodeResponse>
    @JvmStatic
    get() = IssuerToMicaServiceGrpc.getProvisionInstrumentLinkingCodeMethod()

  public val completeLinkingWithCodeMethod:
      MethodDescriptor<CompleteLinkingWithCodeRequest, CompleteLinkingWithCodeResponse>
    @JvmStatic
    get() = IssuerToMicaServiceGrpc.getCompleteLinkingWithCodeMethod()

  public val getInstrumentLinkMethod:
      MethodDescriptor<GetInstrumentLinkRequest, GetInstrumentLinkResponse>
    @JvmStatic
    get() = IssuerToMicaServiceGrpc.getGetInstrumentLinkMethod()

  public val searchInstrumentLinksMethod:
      MethodDescriptor<SearchInstrumentLinksRequest, SearchInstrumentLinksResponse>
    @JvmStatic
    get() = IssuerToMicaServiceGrpc.getSearchInstrumentLinksMethod()

  public val removeInstrumentLinkMethod:
      MethodDescriptor<RemoveInstrumentLinkRequest, RemoveInstrumentLinkResponse>
    @JvmStatic
    get() = IssuerToMicaServiceGrpc.getRemoveInstrumentLinkMethod()

  public val getValueMethod: MethodDescriptor<GetValueRequest, GetValueResponse>
    @JvmStatic
    get() = IssuerToMicaServiceGrpc.getGetValueMethod()

  /**
   * A stub for issuing RPCs to a(n) mica.issuer.service.v2.IssuerToMicaService service as suspending coroutines.
   */
  @StubFor(IssuerToMicaServiceGrpc::class)
  public class IssuerToMicaServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<IssuerToMicaServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): IssuerToMicaServiceCoroutineStub = IssuerToMicaServiceCoroutineStub(channel, callOptions)

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
    public suspend fun getIssuer(request: GetIssuerRequest, headers: Metadata = Metadata()): GetIssuerResponse = unaryRpc(
      channel,
      IssuerToMicaServiceGrpc.getGetIssuerMethod(),
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
    public suspend fun registerUser(request: RegisterUserRequest, headers: Metadata = Metadata()): RegisterUserResponse = unaryRpc(
      channel,
      IssuerToMicaServiceGrpc.getRegisterUserMethod(),
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
    public suspend fun getUser(request: GetUserRequest, headers: Metadata = Metadata()): GetUserResponse = unaryRpc(
      channel,
      IssuerToMicaServiceGrpc.getGetUserMethod(),
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
    public suspend fun updateUser(request: UpdateUserRequest, headers: Metadata = Metadata()): UpdateUserResponse = unaryRpc(
      channel,
      IssuerToMicaServiceGrpc.getUpdateUserMethod(),
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
    public suspend fun removeUser(request: RemoveUserRequest, headers: Metadata = Metadata()): RemoveUserResponse = unaryRpc(
      channel,
      IssuerToMicaServiceGrpc.getRemoveUserMethod(),
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
    public suspend fun registerInstrument(request: RegisterInstrumentRequest, headers: Metadata = Metadata()): RegisterInstrumentResponse = unaryRpc(
      channel,
      IssuerToMicaServiceGrpc.getRegisterInstrumentMethod(),
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
    public suspend fun getInstrument(request: GetInstrumentRequest, headers: Metadata = Metadata()): GetInstrumentResponse = unaryRpc(
      channel,
      IssuerToMicaServiceGrpc.getGetInstrumentMethod(),
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
    public suspend fun removeInstrument(request: RemoveInstrumentRequest, headers: Metadata = Metadata()): RemoveInstrumentResponse = unaryRpc(
      channel,
      IssuerToMicaServiceGrpc.getRemoveInstrumentMethod(),
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
    public suspend fun searchInstrument(request: SearchInstrumentRequest, headers: Metadata = Metadata()): SearchInstrumentResponse = unaryRpc(
      channel,
      IssuerToMicaServiceGrpc.getSearchInstrumentMethod(),
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
    public suspend fun provisionIssuerUUEK(request: ProvisionIssuerUUEKRequest, headers: Metadata = Metadata()): ProvisionIssuerUUEKResponse = unaryRpc(
      channel,
      IssuerToMicaServiceGrpc.getProvisionIssuerUUEKMethod(),
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
    public suspend fun provisionInstrumentLinkingCode(request: ProvisionInstrumentLinkingCodeRequest, headers: Metadata = Metadata()): ProvisionInstrumentLinkingCodeResponse = unaryRpc(
      channel,
      IssuerToMicaServiceGrpc.getProvisionInstrumentLinkingCodeMethod(),
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
    public suspend fun completeLinkingWithCode(request: CompleteLinkingWithCodeRequest, headers: Metadata = Metadata()): CompleteLinkingWithCodeResponse = unaryRpc(
      channel,
      IssuerToMicaServiceGrpc.getCompleteLinkingWithCodeMethod(),
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
    public suspend fun getInstrumentLink(request: GetInstrumentLinkRequest, headers: Metadata = Metadata()): GetInstrumentLinkResponse = unaryRpc(
      channel,
      IssuerToMicaServiceGrpc.getGetInstrumentLinkMethod(),
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
    public suspend fun searchInstrumentLinks(request: SearchInstrumentLinksRequest, headers: Metadata = Metadata()): SearchInstrumentLinksResponse = unaryRpc(
      channel,
      IssuerToMicaServiceGrpc.getSearchInstrumentLinksMethod(),
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
      IssuerToMicaServiceGrpc.getRemoveInstrumentLinkMethod(),
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
    public suspend fun getValue(request: GetValueRequest, headers: Metadata = Metadata()): GetValueResponse = unaryRpc(
      channel,
      IssuerToMicaServiceGrpc.getGetValueMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the mica.issuer.service.v2.IssuerToMicaService service based on Kotlin coroutines.
   */
  public abstract class IssuerToMicaServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for mica.issuer.service.v2.IssuerToMicaService.GetIssuer.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getIssuer(request: GetIssuerRequest): GetIssuerResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method mica.issuer.service.v2.IssuerToMicaService.GetIssuer is unimplemented"))

    /**
     * Returns the response to an RPC for mica.issuer.service.v2.IssuerToMicaService.RegisterUser.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun registerUser(request: RegisterUserRequest): RegisterUserResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method mica.issuer.service.v2.IssuerToMicaService.RegisterUser is unimplemented"))

    /**
     * Returns the response to an RPC for mica.issuer.service.v2.IssuerToMicaService.GetUser.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getUser(request: GetUserRequest): GetUserResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method mica.issuer.service.v2.IssuerToMicaService.GetUser is unimplemented"))

    /**
     * Returns the response to an RPC for mica.issuer.service.v2.IssuerToMicaService.UpdateUser.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun updateUser(request: UpdateUserRequest): UpdateUserResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method mica.issuer.service.v2.IssuerToMicaService.UpdateUser is unimplemented"))

    /**
     * Returns the response to an RPC for mica.issuer.service.v2.IssuerToMicaService.RemoveUser.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun removeUser(request: RemoveUserRequest): RemoveUserResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method mica.issuer.service.v2.IssuerToMicaService.RemoveUser is unimplemented"))

    /**
     * Returns the response to an RPC for mica.issuer.service.v2.IssuerToMicaService.RegisterInstrument.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun registerInstrument(request: RegisterInstrumentRequest): RegisterInstrumentResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method mica.issuer.service.v2.IssuerToMicaService.RegisterInstrument is unimplemented"))

    /**
     * Returns the response to an RPC for mica.issuer.service.v2.IssuerToMicaService.GetInstrument.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getInstrument(request: GetInstrumentRequest): GetInstrumentResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method mica.issuer.service.v2.IssuerToMicaService.GetInstrument is unimplemented"))

    /**
     * Returns the response to an RPC for mica.issuer.service.v2.IssuerToMicaService.RemoveInstrument.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun removeInstrument(request: RemoveInstrumentRequest): RemoveInstrumentResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method mica.issuer.service.v2.IssuerToMicaService.RemoveInstrument is unimplemented"))

    /**
     * Returns the response to an RPC for mica.issuer.service.v2.IssuerToMicaService.SearchInstrument.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun searchInstrument(request: SearchInstrumentRequest): SearchInstrumentResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method mica.issuer.service.v2.IssuerToMicaService.SearchInstrument is unimplemented"))

    /**
     * Returns the response to an RPC for mica.issuer.service.v2.IssuerToMicaService.ProvisionIssuerUUEK.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun provisionIssuerUUEK(request: ProvisionIssuerUUEKRequest): ProvisionIssuerUUEKResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method mica.issuer.service.v2.IssuerToMicaService.ProvisionIssuerUUEK is unimplemented"))

    /**
     * Returns the response to an RPC for mica.issuer.service.v2.IssuerToMicaService.ProvisionInstrumentLinkingCode.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun provisionInstrumentLinkingCode(request: ProvisionInstrumentLinkingCodeRequest): ProvisionInstrumentLinkingCodeResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method mica.issuer.service.v2.IssuerToMicaService.ProvisionInstrumentLinkingCode is unimplemented"))

    /**
     * Returns the response to an RPC for mica.issuer.service.v2.IssuerToMicaService.CompleteLinkingWithCode.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun completeLinkingWithCode(request: CompleteLinkingWithCodeRequest): CompleteLinkingWithCodeResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method mica.issuer.service.v2.IssuerToMicaService.CompleteLinkingWithCode is unimplemented"))

    /**
     * Returns the response to an RPC for mica.issuer.service.v2.IssuerToMicaService.GetInstrumentLink.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getInstrumentLink(request: GetInstrumentLinkRequest): GetInstrumentLinkResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method mica.issuer.service.v2.IssuerToMicaService.GetInstrumentLink is unimplemented"))

    /**
     * Returns the response to an RPC for mica.issuer.service.v2.IssuerToMicaService.SearchInstrumentLinks.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun searchInstrumentLinks(request: SearchInstrumentLinksRequest): SearchInstrumentLinksResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method mica.issuer.service.v2.IssuerToMicaService.SearchInstrumentLinks is unimplemented"))

    /**
     * Returns the response to an RPC for mica.issuer.service.v2.IssuerToMicaService.RemoveInstrumentLink.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun removeInstrumentLink(request: RemoveInstrumentLinkRequest): RemoveInstrumentLinkResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method mica.issuer.service.v2.IssuerToMicaService.RemoveInstrumentLink is unimplemented"))

    /**
     * Returns the response to an RPC for mica.issuer.service.v2.IssuerToMicaService.GetValue.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getValue(request: GetValueRequest): GetValueResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method mica.issuer.service.v2.IssuerToMicaService.GetValue is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = IssuerToMicaServiceGrpc.getGetIssuerMethod(),
      implementation = ::getIssuer
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = IssuerToMicaServiceGrpc.getRegisterUserMethod(),
      implementation = ::registerUser
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = IssuerToMicaServiceGrpc.getGetUserMethod(),
      implementation = ::getUser
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = IssuerToMicaServiceGrpc.getUpdateUserMethod(),
      implementation = ::updateUser
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = IssuerToMicaServiceGrpc.getRemoveUserMethod(),
      implementation = ::removeUser
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = IssuerToMicaServiceGrpc.getRegisterInstrumentMethod(),
      implementation = ::registerInstrument
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = IssuerToMicaServiceGrpc.getGetInstrumentMethod(),
      implementation = ::getInstrument
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = IssuerToMicaServiceGrpc.getRemoveInstrumentMethod(),
      implementation = ::removeInstrument
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = IssuerToMicaServiceGrpc.getSearchInstrumentMethod(),
      implementation = ::searchInstrument
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = IssuerToMicaServiceGrpc.getProvisionIssuerUUEKMethod(),
      implementation = ::provisionIssuerUUEK
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = IssuerToMicaServiceGrpc.getProvisionInstrumentLinkingCodeMethod(),
      implementation = ::provisionInstrumentLinkingCode
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = IssuerToMicaServiceGrpc.getCompleteLinkingWithCodeMethod(),
      implementation = ::completeLinkingWithCode
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = IssuerToMicaServiceGrpc.getGetInstrumentLinkMethod(),
      implementation = ::getInstrumentLink
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = IssuerToMicaServiceGrpc.getSearchInstrumentLinksMethod(),
      implementation = ::searchInstrumentLinks
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = IssuerToMicaServiceGrpc.getRemoveInstrumentLinkMethod(),
      implementation = ::removeInstrumentLink
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = IssuerToMicaServiceGrpc.getGetValueMethod(),
      implementation = ::getValue
    )).build()
  }
}
