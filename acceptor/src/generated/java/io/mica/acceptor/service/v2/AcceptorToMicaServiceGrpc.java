package io.mica.acceptor.service.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * The service an Acceptor calls to manage its own details and its organizations. Links are in
 * AcceptorToMicaLinkService, payments in AcceptorToMicaValueService, and the connectivity check in
 * mica.member.ping.v1.PingService.
 * Most operations report their outcome in the response's status, with details in error. A request that breaks a
 * validation rule, carries a malformed key or omits a required identifier is rejected with the gRPC status
 * INVALID_ARGUMENT; a caller not permitted to use an operation gets PERMISSION_DENIED, and an unexpected server
 * failure INTERNAL.
 * </pre>
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class AcceptorToMicaServiceGrpc {

  private AcceptorToMicaServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "mica.acceptor.service.v2.AcceptorToMicaService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.mica.acceptor.acceptor.v2.GetAcceptorRequest,
      io.mica.acceptor.acceptor.v2.GetAcceptorResponse> getGetAcceptorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAcceptor",
      requestType = io.mica.acceptor.acceptor.v2.GetAcceptorRequest.class,
      responseType = io.mica.acceptor.acceptor.v2.GetAcceptorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mica.acceptor.acceptor.v2.GetAcceptorRequest,
      io.mica.acceptor.acceptor.v2.GetAcceptorResponse> getGetAcceptorMethod() {
    io.grpc.MethodDescriptor<io.mica.acceptor.acceptor.v2.GetAcceptorRequest, io.mica.acceptor.acceptor.v2.GetAcceptorResponse> getGetAcceptorMethod;
    if ((getGetAcceptorMethod = AcceptorToMicaServiceGrpc.getGetAcceptorMethod) == null) {
      synchronized (AcceptorToMicaServiceGrpc.class) {
        if ((getGetAcceptorMethod = AcceptorToMicaServiceGrpc.getGetAcceptorMethod) == null) {
          AcceptorToMicaServiceGrpc.getGetAcceptorMethod = getGetAcceptorMethod =
              io.grpc.MethodDescriptor.<io.mica.acceptor.acceptor.v2.GetAcceptorRequest, io.mica.acceptor.acceptor.v2.GetAcceptorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAcceptor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.acceptor.acceptor.v2.GetAcceptorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.acceptor.acceptor.v2.GetAcceptorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AcceptorToMicaServiceMethodDescriptorSupplier("GetAcceptor"))
              .build();
        }
      }
    }
    return getGetAcceptorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mica.acceptor.service.v2.CreateOrganizationRequest,
      io.mica.acceptor.service.v2.CreateOrganizationResponse> getCreateOrganizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateOrganization",
      requestType = io.mica.acceptor.service.v2.CreateOrganizationRequest.class,
      responseType = io.mica.acceptor.service.v2.CreateOrganizationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mica.acceptor.service.v2.CreateOrganizationRequest,
      io.mica.acceptor.service.v2.CreateOrganizationResponse> getCreateOrganizationMethod() {
    io.grpc.MethodDescriptor<io.mica.acceptor.service.v2.CreateOrganizationRequest, io.mica.acceptor.service.v2.CreateOrganizationResponse> getCreateOrganizationMethod;
    if ((getCreateOrganizationMethod = AcceptorToMicaServiceGrpc.getCreateOrganizationMethod) == null) {
      synchronized (AcceptorToMicaServiceGrpc.class) {
        if ((getCreateOrganizationMethod = AcceptorToMicaServiceGrpc.getCreateOrganizationMethod) == null) {
          AcceptorToMicaServiceGrpc.getCreateOrganizationMethod = getCreateOrganizationMethod =
              io.grpc.MethodDescriptor.<io.mica.acceptor.service.v2.CreateOrganizationRequest, io.mica.acceptor.service.v2.CreateOrganizationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateOrganization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.acceptor.service.v2.CreateOrganizationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.acceptor.service.v2.CreateOrganizationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AcceptorToMicaServiceMethodDescriptorSupplier("CreateOrganization"))
              .build();
        }
      }
    }
    return getCreateOrganizationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mica.acceptor.service.v2.GetOrganizationRequest,
      io.mica.acceptor.service.v2.GetOrganizationResponse> getGetOrganizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOrganization",
      requestType = io.mica.acceptor.service.v2.GetOrganizationRequest.class,
      responseType = io.mica.acceptor.service.v2.GetOrganizationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mica.acceptor.service.v2.GetOrganizationRequest,
      io.mica.acceptor.service.v2.GetOrganizationResponse> getGetOrganizationMethod() {
    io.grpc.MethodDescriptor<io.mica.acceptor.service.v2.GetOrganizationRequest, io.mica.acceptor.service.v2.GetOrganizationResponse> getGetOrganizationMethod;
    if ((getGetOrganizationMethod = AcceptorToMicaServiceGrpc.getGetOrganizationMethod) == null) {
      synchronized (AcceptorToMicaServiceGrpc.class) {
        if ((getGetOrganizationMethod = AcceptorToMicaServiceGrpc.getGetOrganizationMethod) == null) {
          AcceptorToMicaServiceGrpc.getGetOrganizationMethod = getGetOrganizationMethod =
              io.grpc.MethodDescriptor.<io.mica.acceptor.service.v2.GetOrganizationRequest, io.mica.acceptor.service.v2.GetOrganizationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetOrganization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.acceptor.service.v2.GetOrganizationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.acceptor.service.v2.GetOrganizationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AcceptorToMicaServiceMethodDescriptorSupplier("GetOrganization"))
              .build();
        }
      }
    }
    return getGetOrganizationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mica.acceptor.service.v2.UpdateOrganizationRequest,
      io.mica.acceptor.service.v2.UpdateOrganizationResponse> getUpdateOrganizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateOrganization",
      requestType = io.mica.acceptor.service.v2.UpdateOrganizationRequest.class,
      responseType = io.mica.acceptor.service.v2.UpdateOrganizationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mica.acceptor.service.v2.UpdateOrganizationRequest,
      io.mica.acceptor.service.v2.UpdateOrganizationResponse> getUpdateOrganizationMethod() {
    io.grpc.MethodDescriptor<io.mica.acceptor.service.v2.UpdateOrganizationRequest, io.mica.acceptor.service.v2.UpdateOrganizationResponse> getUpdateOrganizationMethod;
    if ((getUpdateOrganizationMethod = AcceptorToMicaServiceGrpc.getUpdateOrganizationMethod) == null) {
      synchronized (AcceptorToMicaServiceGrpc.class) {
        if ((getUpdateOrganizationMethod = AcceptorToMicaServiceGrpc.getUpdateOrganizationMethod) == null) {
          AcceptorToMicaServiceGrpc.getUpdateOrganizationMethod = getUpdateOrganizationMethod =
              io.grpc.MethodDescriptor.<io.mica.acceptor.service.v2.UpdateOrganizationRequest, io.mica.acceptor.service.v2.UpdateOrganizationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateOrganization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.acceptor.service.v2.UpdateOrganizationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.acceptor.service.v2.UpdateOrganizationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AcceptorToMicaServiceMethodDescriptorSupplier("UpdateOrganization"))
              .build();
        }
      }
    }
    return getUpdateOrganizationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mica.acceptor.service.v2.ActivateOrganizationRequest,
      io.mica.acceptor.service.v2.ActivateOrganizationResponse> getActivateOrganizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ActivateOrganization",
      requestType = io.mica.acceptor.service.v2.ActivateOrganizationRequest.class,
      responseType = io.mica.acceptor.service.v2.ActivateOrganizationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mica.acceptor.service.v2.ActivateOrganizationRequest,
      io.mica.acceptor.service.v2.ActivateOrganizationResponse> getActivateOrganizationMethod() {
    io.grpc.MethodDescriptor<io.mica.acceptor.service.v2.ActivateOrganizationRequest, io.mica.acceptor.service.v2.ActivateOrganizationResponse> getActivateOrganizationMethod;
    if ((getActivateOrganizationMethod = AcceptorToMicaServiceGrpc.getActivateOrganizationMethod) == null) {
      synchronized (AcceptorToMicaServiceGrpc.class) {
        if ((getActivateOrganizationMethod = AcceptorToMicaServiceGrpc.getActivateOrganizationMethod) == null) {
          AcceptorToMicaServiceGrpc.getActivateOrganizationMethod = getActivateOrganizationMethod =
              io.grpc.MethodDescriptor.<io.mica.acceptor.service.v2.ActivateOrganizationRequest, io.mica.acceptor.service.v2.ActivateOrganizationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ActivateOrganization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.acceptor.service.v2.ActivateOrganizationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.acceptor.service.v2.ActivateOrganizationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AcceptorToMicaServiceMethodDescriptorSupplier("ActivateOrganization"))
              .build();
        }
      }
    }
    return getActivateOrganizationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mica.acceptor.service.v2.DeactivateOrganizationRequest,
      io.mica.acceptor.service.v2.DeactivateOrganizationResponse> getDeactivateOrganizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeactivateOrganization",
      requestType = io.mica.acceptor.service.v2.DeactivateOrganizationRequest.class,
      responseType = io.mica.acceptor.service.v2.DeactivateOrganizationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mica.acceptor.service.v2.DeactivateOrganizationRequest,
      io.mica.acceptor.service.v2.DeactivateOrganizationResponse> getDeactivateOrganizationMethod() {
    io.grpc.MethodDescriptor<io.mica.acceptor.service.v2.DeactivateOrganizationRequest, io.mica.acceptor.service.v2.DeactivateOrganizationResponse> getDeactivateOrganizationMethod;
    if ((getDeactivateOrganizationMethod = AcceptorToMicaServiceGrpc.getDeactivateOrganizationMethod) == null) {
      synchronized (AcceptorToMicaServiceGrpc.class) {
        if ((getDeactivateOrganizationMethod = AcceptorToMicaServiceGrpc.getDeactivateOrganizationMethod) == null) {
          AcceptorToMicaServiceGrpc.getDeactivateOrganizationMethod = getDeactivateOrganizationMethod =
              io.grpc.MethodDescriptor.<io.mica.acceptor.service.v2.DeactivateOrganizationRequest, io.mica.acceptor.service.v2.DeactivateOrganizationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeactivateOrganization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.acceptor.service.v2.DeactivateOrganizationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.acceptor.service.v2.DeactivateOrganizationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AcceptorToMicaServiceMethodDescriptorSupplier("DeactivateOrganization"))
              .build();
        }
      }
    }
    return getDeactivateOrganizationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mica.acceptor.service.v2.SearchOrganizationRequest,
      io.mica.acceptor.service.v2.SearchOrganizationResponse> getSearchOrganizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchOrganization",
      requestType = io.mica.acceptor.service.v2.SearchOrganizationRequest.class,
      responseType = io.mica.acceptor.service.v2.SearchOrganizationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mica.acceptor.service.v2.SearchOrganizationRequest,
      io.mica.acceptor.service.v2.SearchOrganizationResponse> getSearchOrganizationMethod() {
    io.grpc.MethodDescriptor<io.mica.acceptor.service.v2.SearchOrganizationRequest, io.mica.acceptor.service.v2.SearchOrganizationResponse> getSearchOrganizationMethod;
    if ((getSearchOrganizationMethod = AcceptorToMicaServiceGrpc.getSearchOrganizationMethod) == null) {
      synchronized (AcceptorToMicaServiceGrpc.class) {
        if ((getSearchOrganizationMethod = AcceptorToMicaServiceGrpc.getSearchOrganizationMethod) == null) {
          AcceptorToMicaServiceGrpc.getSearchOrganizationMethod = getSearchOrganizationMethod =
              io.grpc.MethodDescriptor.<io.mica.acceptor.service.v2.SearchOrganizationRequest, io.mica.acceptor.service.v2.SearchOrganizationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchOrganization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.acceptor.service.v2.SearchOrganizationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.acceptor.service.v2.SearchOrganizationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AcceptorToMicaServiceMethodDescriptorSupplier("SearchOrganization"))
              .build();
        }
      }
    }
    return getSearchOrganizationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AcceptorToMicaServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AcceptorToMicaServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AcceptorToMicaServiceStub>() {
        @java.lang.Override
        public AcceptorToMicaServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AcceptorToMicaServiceStub(channel, callOptions);
        }
      };
    return AcceptorToMicaServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static AcceptorToMicaServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AcceptorToMicaServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AcceptorToMicaServiceBlockingV2Stub>() {
        @java.lang.Override
        public AcceptorToMicaServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AcceptorToMicaServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return AcceptorToMicaServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AcceptorToMicaServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AcceptorToMicaServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AcceptorToMicaServiceBlockingStub>() {
        @java.lang.Override
        public AcceptorToMicaServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AcceptorToMicaServiceBlockingStub(channel, callOptions);
        }
      };
    return AcceptorToMicaServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AcceptorToMicaServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AcceptorToMicaServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AcceptorToMicaServiceFutureStub>() {
        @java.lang.Override
        public AcceptorToMicaServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AcceptorToMicaServiceFutureStub(channel, callOptions);
        }
      };
    return AcceptorToMicaServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The service an Acceptor calls to manage its own details and its organizations. Links are in
   * AcceptorToMicaLinkService, payments in AcceptorToMicaValueService, and the connectivity check in
   * mica.member.ping.v1.PingService.
   * Most operations report their outcome in the response's status, with details in error. A request that breaks a
   * validation rule, carries a malformed key or omits a required identifier is rejected with the gRPC status
   * INVALID_ARGUMENT; a caller not permitted to use an operation gets PERMISSION_DENIED, and an unexpected server
   * failure INTERNAL.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Returns the details Mica holds about you, the calling Acceptor.
     * </pre>
     */
    default void getAcceptor(io.mica.acceptor.acceptor.v2.GetAcceptorRequest request,
        io.grpc.stub.StreamObserver<io.mica.acceptor.acceptor.v2.GetAcceptorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAcceptorMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates an organization: a business you accept payments for. It is created inactive; call ActivateOrganization
     * before using it. Returns Mica's organization_key and the version to pass to later changes.
     * </pre>
     */
    default void createOrganization(io.mica.acceptor.service.v2.CreateOrganizationRequest request,
        io.grpc.stub.StreamObserver<io.mica.acceptor.service.v2.CreateOrganizationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateOrganizationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves one of your organizations by its organization_key or organization_ref. Setting neither is rejected
     * with INVALID_ARGUMENT.
     * </pre>
     */
    default void getOrganization(io.mica.acceptor.service.v2.GetOrganizationRequest request,
        io.grpc.stub.StreamObserver<io.mica.acceptor.service.v2.GetOrganizationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetOrganizationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Replaces an organization's name, address, categories and phone; a field left empty is cleared. Pass the
     * organization's current version: if it has changed since you read it, the update is rejected with
     * STATUS_VERSION_MISMATCH.
     * </pre>
     */
    default void updateOrganization(io.mica.acceptor.service.v2.UpdateOrganizationRequest request,
        io.grpc.stub.StreamObserver<io.mica.acceptor.service.v2.UpdateOrganizationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateOrganizationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Activates an inactive organization. Activating an organization that is already active succeeds without changing
     * it. Pass the organization's current version.
     * </pre>
     */
    default void activateOrganization(io.mica.acceptor.service.v2.ActivateOrganizationRequest request,
        io.grpc.stub.StreamObserver<io.mica.acceptor.service.v2.ActivateOrganizationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getActivateOrganizationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deactivates an active organization. Deactivating an organization that is already inactive succeeds without
     * changing it. Pass the organization's current version.
     * </pre>
     */
    default void deactivateOrganization(io.mica.acceptor.service.v2.DeactivateOrganizationRequest request,
        io.grpc.stub.StreamObserver<io.mica.acceptor.service.v2.DeactivateOrganizationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeactivateOrganizationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists your organizations, optionally filtered by name and category. With no criteria it returns all of them.
     * </pre>
     */
    default void searchOrganization(io.mica.acceptor.service.v2.SearchOrganizationRequest request,
        io.grpc.stub.StreamObserver<io.mica.acceptor.service.v2.SearchOrganizationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchOrganizationMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AcceptorToMicaService.
   * <pre>
   * The service an Acceptor calls to manage its own details and its organizations. Links are in
   * AcceptorToMicaLinkService, payments in AcceptorToMicaValueService, and the connectivity check in
   * mica.member.ping.v1.PingService.
   * Most operations report their outcome in the response's status, with details in error. A request that breaks a
   * validation rule, carries a malformed key or omits a required identifier is rejected with the gRPC status
   * INVALID_ARGUMENT; a caller not permitted to use an operation gets PERMISSION_DENIED, and an unexpected server
   * failure INTERNAL.
   * </pre>
   */
  public static abstract class AcceptorToMicaServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AcceptorToMicaServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AcceptorToMicaService.
   * <pre>
   * The service an Acceptor calls to manage its own details and its organizations. Links are in
   * AcceptorToMicaLinkService, payments in AcceptorToMicaValueService, and the connectivity check in
   * mica.member.ping.v1.PingService.
   * Most operations report their outcome in the response's status, with details in error. A request that breaks a
   * validation rule, carries a malformed key or omits a required identifier is rejected with the gRPC status
   * INVALID_ARGUMENT; a caller not permitted to use an operation gets PERMISSION_DENIED, and an unexpected server
   * failure INTERNAL.
   * </pre>
   */
  public static final class AcceptorToMicaServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AcceptorToMicaServiceStub> {
    private AcceptorToMicaServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AcceptorToMicaServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AcceptorToMicaServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the details Mica holds about you, the calling Acceptor.
     * </pre>
     */
    public void getAcceptor(io.mica.acceptor.acceptor.v2.GetAcceptorRequest request,
        io.grpc.stub.StreamObserver<io.mica.acceptor.acceptor.v2.GetAcceptorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAcceptorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates an organization: a business you accept payments for. It is created inactive; call ActivateOrganization
     * before using it. Returns Mica's organization_key and the version to pass to later changes.
     * </pre>
     */
    public void createOrganization(io.mica.acceptor.service.v2.CreateOrganizationRequest request,
        io.grpc.stub.StreamObserver<io.mica.acceptor.service.v2.CreateOrganizationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateOrganizationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves one of your organizations by its organization_key or organization_ref. Setting neither is rejected
     * with INVALID_ARGUMENT.
     * </pre>
     */
    public void getOrganization(io.mica.acceptor.service.v2.GetOrganizationRequest request,
        io.grpc.stub.StreamObserver<io.mica.acceptor.service.v2.GetOrganizationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetOrganizationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Replaces an organization's name, address, categories and phone; a field left empty is cleared. Pass the
     * organization's current version: if it has changed since you read it, the update is rejected with
     * STATUS_VERSION_MISMATCH.
     * </pre>
     */
    public void updateOrganization(io.mica.acceptor.service.v2.UpdateOrganizationRequest request,
        io.grpc.stub.StreamObserver<io.mica.acceptor.service.v2.UpdateOrganizationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateOrganizationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Activates an inactive organization. Activating an organization that is already active succeeds without changing
     * it. Pass the organization's current version.
     * </pre>
     */
    public void activateOrganization(io.mica.acceptor.service.v2.ActivateOrganizationRequest request,
        io.grpc.stub.StreamObserver<io.mica.acceptor.service.v2.ActivateOrganizationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getActivateOrganizationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deactivates an active organization. Deactivating an organization that is already inactive succeeds without
     * changing it. Pass the organization's current version.
     * </pre>
     */
    public void deactivateOrganization(io.mica.acceptor.service.v2.DeactivateOrganizationRequest request,
        io.grpc.stub.StreamObserver<io.mica.acceptor.service.v2.DeactivateOrganizationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeactivateOrganizationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists your organizations, optionally filtered by name and category. With no criteria it returns all of them.
     * </pre>
     */
    public void searchOrganization(io.mica.acceptor.service.v2.SearchOrganizationRequest request,
        io.grpc.stub.StreamObserver<io.mica.acceptor.service.v2.SearchOrganizationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchOrganizationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AcceptorToMicaService.
   * <pre>
   * The service an Acceptor calls to manage its own details and its organizations. Links are in
   * AcceptorToMicaLinkService, payments in AcceptorToMicaValueService, and the connectivity check in
   * mica.member.ping.v1.PingService.
   * Most operations report their outcome in the response's status, with details in error. A request that breaks a
   * validation rule, carries a malformed key or omits a required identifier is rejected with the gRPC status
   * INVALID_ARGUMENT; a caller not permitted to use an operation gets PERMISSION_DENIED, and an unexpected server
   * failure INTERNAL.
   * </pre>
   */
  public static final class AcceptorToMicaServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<AcceptorToMicaServiceBlockingV2Stub> {
    private AcceptorToMicaServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AcceptorToMicaServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AcceptorToMicaServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the details Mica holds about you, the calling Acceptor.
     * </pre>
     */
    public io.mica.acceptor.acceptor.v2.GetAcceptorResponse getAcceptor(io.mica.acceptor.acceptor.v2.GetAcceptorRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetAcceptorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates an organization: a business you accept payments for. It is created inactive; call ActivateOrganization
     * before using it. Returns Mica's organization_key and the version to pass to later changes.
     * </pre>
     */
    public io.mica.acceptor.service.v2.CreateOrganizationResponse createOrganization(io.mica.acceptor.service.v2.CreateOrganizationRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getCreateOrganizationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves one of your organizations by its organization_key or organization_ref. Setting neither is rejected
     * with INVALID_ARGUMENT.
     * </pre>
     */
    public io.mica.acceptor.service.v2.GetOrganizationResponse getOrganization(io.mica.acceptor.service.v2.GetOrganizationRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetOrganizationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Replaces an organization's name, address, categories and phone; a field left empty is cleared. Pass the
     * organization's current version: if it has changed since you read it, the update is rejected with
     * STATUS_VERSION_MISMATCH.
     * </pre>
     */
    public io.mica.acceptor.service.v2.UpdateOrganizationResponse updateOrganization(io.mica.acceptor.service.v2.UpdateOrganizationRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getUpdateOrganizationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Activates an inactive organization. Activating an organization that is already active succeeds without changing
     * it. Pass the organization's current version.
     * </pre>
     */
    public io.mica.acceptor.service.v2.ActivateOrganizationResponse activateOrganization(io.mica.acceptor.service.v2.ActivateOrganizationRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getActivateOrganizationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deactivates an active organization. Deactivating an organization that is already inactive succeeds without
     * changing it. Pass the organization's current version.
     * </pre>
     */
    public io.mica.acceptor.service.v2.DeactivateOrganizationResponse deactivateOrganization(io.mica.acceptor.service.v2.DeactivateOrganizationRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getDeactivateOrganizationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists your organizations, optionally filtered by name and category. With no criteria it returns all of them.
     * </pre>
     */
    public io.mica.acceptor.service.v2.SearchOrganizationResponse searchOrganization(io.mica.acceptor.service.v2.SearchOrganizationRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getSearchOrganizationMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service AcceptorToMicaService.
   * <pre>
   * The service an Acceptor calls to manage its own details and its organizations. Links are in
   * AcceptorToMicaLinkService, payments in AcceptorToMicaValueService, and the connectivity check in
   * mica.member.ping.v1.PingService.
   * Most operations report their outcome in the response's status, with details in error. A request that breaks a
   * validation rule, carries a malformed key or omits a required identifier is rejected with the gRPC status
   * INVALID_ARGUMENT; a caller not permitted to use an operation gets PERMISSION_DENIED, and an unexpected server
   * failure INTERNAL.
   * </pre>
   */
  public static final class AcceptorToMicaServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AcceptorToMicaServiceBlockingStub> {
    private AcceptorToMicaServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AcceptorToMicaServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AcceptorToMicaServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the details Mica holds about you, the calling Acceptor.
     * </pre>
     */
    public io.mica.acceptor.acceptor.v2.GetAcceptorResponse getAcceptor(io.mica.acceptor.acceptor.v2.GetAcceptorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAcceptorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates an organization: a business you accept payments for. It is created inactive; call ActivateOrganization
     * before using it. Returns Mica's organization_key and the version to pass to later changes.
     * </pre>
     */
    public io.mica.acceptor.service.v2.CreateOrganizationResponse createOrganization(io.mica.acceptor.service.v2.CreateOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateOrganizationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves one of your organizations by its organization_key or organization_ref. Setting neither is rejected
     * with INVALID_ARGUMENT.
     * </pre>
     */
    public io.mica.acceptor.service.v2.GetOrganizationResponse getOrganization(io.mica.acceptor.service.v2.GetOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOrganizationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Replaces an organization's name, address, categories and phone; a field left empty is cleared. Pass the
     * organization's current version: if it has changed since you read it, the update is rejected with
     * STATUS_VERSION_MISMATCH.
     * </pre>
     */
    public io.mica.acceptor.service.v2.UpdateOrganizationResponse updateOrganization(io.mica.acceptor.service.v2.UpdateOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateOrganizationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Activates an inactive organization. Activating an organization that is already active succeeds without changing
     * it. Pass the organization's current version.
     * </pre>
     */
    public io.mica.acceptor.service.v2.ActivateOrganizationResponse activateOrganization(io.mica.acceptor.service.v2.ActivateOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getActivateOrganizationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deactivates an active organization. Deactivating an organization that is already inactive succeeds without
     * changing it. Pass the organization's current version.
     * </pre>
     */
    public io.mica.acceptor.service.v2.DeactivateOrganizationResponse deactivateOrganization(io.mica.acceptor.service.v2.DeactivateOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeactivateOrganizationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists your organizations, optionally filtered by name and category. With no criteria it returns all of them.
     * </pre>
     */
    public io.mica.acceptor.service.v2.SearchOrganizationResponse searchOrganization(io.mica.acceptor.service.v2.SearchOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchOrganizationMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AcceptorToMicaService.
   * <pre>
   * The service an Acceptor calls to manage its own details and its organizations. Links are in
   * AcceptorToMicaLinkService, payments in AcceptorToMicaValueService, and the connectivity check in
   * mica.member.ping.v1.PingService.
   * Most operations report their outcome in the response's status, with details in error. A request that breaks a
   * validation rule, carries a malformed key or omits a required identifier is rejected with the gRPC status
   * INVALID_ARGUMENT; a caller not permitted to use an operation gets PERMISSION_DENIED, and an unexpected server
   * failure INTERNAL.
   * </pre>
   */
  public static final class AcceptorToMicaServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AcceptorToMicaServiceFutureStub> {
    private AcceptorToMicaServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AcceptorToMicaServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AcceptorToMicaServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the details Mica holds about you, the calling Acceptor.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mica.acceptor.acceptor.v2.GetAcceptorResponse> getAcceptor(
        io.mica.acceptor.acceptor.v2.GetAcceptorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAcceptorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates an organization: a business you accept payments for. It is created inactive; call ActivateOrganization
     * before using it. Returns Mica's organization_key and the version to pass to later changes.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mica.acceptor.service.v2.CreateOrganizationResponse> createOrganization(
        io.mica.acceptor.service.v2.CreateOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateOrganizationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves one of your organizations by its organization_key or organization_ref. Setting neither is rejected
     * with INVALID_ARGUMENT.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mica.acceptor.service.v2.GetOrganizationResponse> getOrganization(
        io.mica.acceptor.service.v2.GetOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetOrganizationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Replaces an organization's name, address, categories and phone; a field left empty is cleared. Pass the
     * organization's current version: if it has changed since you read it, the update is rejected with
     * STATUS_VERSION_MISMATCH.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mica.acceptor.service.v2.UpdateOrganizationResponse> updateOrganization(
        io.mica.acceptor.service.v2.UpdateOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateOrganizationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Activates an inactive organization. Activating an organization that is already active succeeds without changing
     * it. Pass the organization's current version.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mica.acceptor.service.v2.ActivateOrganizationResponse> activateOrganization(
        io.mica.acceptor.service.v2.ActivateOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getActivateOrganizationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deactivates an active organization. Deactivating an organization that is already inactive succeeds without
     * changing it. Pass the organization's current version.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mica.acceptor.service.v2.DeactivateOrganizationResponse> deactivateOrganization(
        io.mica.acceptor.service.v2.DeactivateOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeactivateOrganizationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists your organizations, optionally filtered by name and category. With no criteria it returns all of them.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mica.acceptor.service.v2.SearchOrganizationResponse> searchOrganization(
        io.mica.acceptor.service.v2.SearchOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchOrganizationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ACCEPTOR = 0;
  private static final int METHODID_CREATE_ORGANIZATION = 1;
  private static final int METHODID_GET_ORGANIZATION = 2;
  private static final int METHODID_UPDATE_ORGANIZATION = 3;
  private static final int METHODID_ACTIVATE_ORGANIZATION = 4;
  private static final int METHODID_DEACTIVATE_ORGANIZATION = 5;
  private static final int METHODID_SEARCH_ORGANIZATION = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ACCEPTOR:
          serviceImpl.getAcceptor((io.mica.acceptor.acceptor.v2.GetAcceptorRequest) request,
              (io.grpc.stub.StreamObserver<io.mica.acceptor.acceptor.v2.GetAcceptorResponse>) responseObserver);
          break;
        case METHODID_CREATE_ORGANIZATION:
          serviceImpl.createOrganization((io.mica.acceptor.service.v2.CreateOrganizationRequest) request,
              (io.grpc.stub.StreamObserver<io.mica.acceptor.service.v2.CreateOrganizationResponse>) responseObserver);
          break;
        case METHODID_GET_ORGANIZATION:
          serviceImpl.getOrganization((io.mica.acceptor.service.v2.GetOrganizationRequest) request,
              (io.grpc.stub.StreamObserver<io.mica.acceptor.service.v2.GetOrganizationResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ORGANIZATION:
          serviceImpl.updateOrganization((io.mica.acceptor.service.v2.UpdateOrganizationRequest) request,
              (io.grpc.stub.StreamObserver<io.mica.acceptor.service.v2.UpdateOrganizationResponse>) responseObserver);
          break;
        case METHODID_ACTIVATE_ORGANIZATION:
          serviceImpl.activateOrganization((io.mica.acceptor.service.v2.ActivateOrganizationRequest) request,
              (io.grpc.stub.StreamObserver<io.mica.acceptor.service.v2.ActivateOrganizationResponse>) responseObserver);
          break;
        case METHODID_DEACTIVATE_ORGANIZATION:
          serviceImpl.deactivateOrganization((io.mica.acceptor.service.v2.DeactivateOrganizationRequest) request,
              (io.grpc.stub.StreamObserver<io.mica.acceptor.service.v2.DeactivateOrganizationResponse>) responseObserver);
          break;
        case METHODID_SEARCH_ORGANIZATION:
          serviceImpl.searchOrganization((io.mica.acceptor.service.v2.SearchOrganizationRequest) request,
              (io.grpc.stub.StreamObserver<io.mica.acceptor.service.v2.SearchOrganizationResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetAcceptorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mica.acceptor.acceptor.v2.GetAcceptorRequest,
              io.mica.acceptor.acceptor.v2.GetAcceptorResponse>(
                service, METHODID_GET_ACCEPTOR)))
        .addMethod(
          getCreateOrganizationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mica.acceptor.service.v2.CreateOrganizationRequest,
              io.mica.acceptor.service.v2.CreateOrganizationResponse>(
                service, METHODID_CREATE_ORGANIZATION)))
        .addMethod(
          getGetOrganizationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mica.acceptor.service.v2.GetOrganizationRequest,
              io.mica.acceptor.service.v2.GetOrganizationResponse>(
                service, METHODID_GET_ORGANIZATION)))
        .addMethod(
          getUpdateOrganizationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mica.acceptor.service.v2.UpdateOrganizationRequest,
              io.mica.acceptor.service.v2.UpdateOrganizationResponse>(
                service, METHODID_UPDATE_ORGANIZATION)))
        .addMethod(
          getActivateOrganizationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mica.acceptor.service.v2.ActivateOrganizationRequest,
              io.mica.acceptor.service.v2.ActivateOrganizationResponse>(
                service, METHODID_ACTIVATE_ORGANIZATION)))
        .addMethod(
          getDeactivateOrganizationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mica.acceptor.service.v2.DeactivateOrganizationRequest,
              io.mica.acceptor.service.v2.DeactivateOrganizationResponse>(
                service, METHODID_DEACTIVATE_ORGANIZATION)))
        .addMethod(
          getSearchOrganizationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mica.acceptor.service.v2.SearchOrganizationRequest,
              io.mica.acceptor.service.v2.SearchOrganizationResponse>(
                service, METHODID_SEARCH_ORGANIZATION)))
        .build();
  }

  private static abstract class AcceptorToMicaServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AcceptorToMicaServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.mica.acceptor.service.v2.AcceptorToMicaServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AcceptorToMicaService");
    }
  }

  private static final class AcceptorToMicaServiceFileDescriptorSupplier
      extends AcceptorToMicaServiceBaseDescriptorSupplier {
    AcceptorToMicaServiceFileDescriptorSupplier() {}
  }

  private static final class AcceptorToMicaServiceMethodDescriptorSupplier
      extends AcceptorToMicaServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    AcceptorToMicaServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AcceptorToMicaServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AcceptorToMicaServiceFileDescriptorSupplier())
              .addMethod(getGetAcceptorMethod())
              .addMethod(getCreateOrganizationMethod())
              .addMethod(getGetOrganizationMethod())
              .addMethod(getUpdateOrganizationMethod())
              .addMethod(getActivateOrganizationMethod())
              .addMethod(getDeactivateOrganizationMethod())
              .addMethod(getSearchOrganizationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
