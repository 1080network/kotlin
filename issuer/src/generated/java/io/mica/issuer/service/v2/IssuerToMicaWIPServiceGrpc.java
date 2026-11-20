package io.mica.issuer.service.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Work-in-progress and experimental operations the Issuer calls on Mica. They may change, or become standard product
 * features, in future releases.
 * </pre>
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class IssuerToMicaWIPServiceGrpc {

  private IssuerToMicaWIPServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "mica.issuer.service.v2.IssuerToMicaWIPService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.mica.issuer.service.v2.SearchRecurringPaymentsRequest,
      io.mica.issuer.service.v2.SearchRecurringPaymentsResponse> getSearchRecurringPaymentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchRecurringPayments",
      requestType = io.mica.issuer.service.v2.SearchRecurringPaymentsRequest.class,
      responseType = io.mica.issuer.service.v2.SearchRecurringPaymentsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mica.issuer.service.v2.SearchRecurringPaymentsRequest,
      io.mica.issuer.service.v2.SearchRecurringPaymentsResponse> getSearchRecurringPaymentsMethod() {
    io.grpc.MethodDescriptor<io.mica.issuer.service.v2.SearchRecurringPaymentsRequest, io.mica.issuer.service.v2.SearchRecurringPaymentsResponse> getSearchRecurringPaymentsMethod;
    if ((getSearchRecurringPaymentsMethod = IssuerToMicaWIPServiceGrpc.getSearchRecurringPaymentsMethod) == null) {
      synchronized (IssuerToMicaWIPServiceGrpc.class) {
        if ((getSearchRecurringPaymentsMethod = IssuerToMicaWIPServiceGrpc.getSearchRecurringPaymentsMethod) == null) {
          IssuerToMicaWIPServiceGrpc.getSearchRecurringPaymentsMethod = getSearchRecurringPaymentsMethod =
              io.grpc.MethodDescriptor.<io.mica.issuer.service.v2.SearchRecurringPaymentsRequest, io.mica.issuer.service.v2.SearchRecurringPaymentsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchRecurringPayments"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.issuer.service.v2.SearchRecurringPaymentsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.issuer.service.v2.SearchRecurringPaymentsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IssuerToMicaWIPServiceMethodDescriptorSupplier("SearchRecurringPayments"))
              .build();
        }
      }
    }
    return getSearchRecurringPaymentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mica.issuer.service.v2.SendValueRequest,
      io.mica.issuer.service.v2.SendValueResponse> getSendValueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendValue",
      requestType = io.mica.issuer.service.v2.SendValueRequest.class,
      responseType = io.mica.issuer.service.v2.SendValueResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mica.issuer.service.v2.SendValueRequest,
      io.mica.issuer.service.v2.SendValueResponse> getSendValueMethod() {
    io.grpc.MethodDescriptor<io.mica.issuer.service.v2.SendValueRequest, io.mica.issuer.service.v2.SendValueResponse> getSendValueMethod;
    if ((getSendValueMethod = IssuerToMicaWIPServiceGrpc.getSendValueMethod) == null) {
      synchronized (IssuerToMicaWIPServiceGrpc.class) {
        if ((getSendValueMethod = IssuerToMicaWIPServiceGrpc.getSendValueMethod) == null) {
          IssuerToMicaWIPServiceGrpc.getSendValueMethod = getSendValueMethod =
              io.grpc.MethodDescriptor.<io.mica.issuer.service.v2.SendValueRequest, io.mica.issuer.service.v2.SendValueResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendValue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.issuer.service.v2.SendValueRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.issuer.service.v2.SendValueResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IssuerToMicaWIPServiceMethodDescriptorSupplier("SendValue"))
              .build();
        }
      }
    }
    return getSendValueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mica.issuer.service.v2.InitializeWebSessionRequest,
      io.mica.issuer.service.v2.InitializeWebSessionResponse> getInitializeWebSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InitializeWebSession",
      requestType = io.mica.issuer.service.v2.InitializeWebSessionRequest.class,
      responseType = io.mica.issuer.service.v2.InitializeWebSessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mica.issuer.service.v2.InitializeWebSessionRequest,
      io.mica.issuer.service.v2.InitializeWebSessionResponse> getInitializeWebSessionMethod() {
    io.grpc.MethodDescriptor<io.mica.issuer.service.v2.InitializeWebSessionRequest, io.mica.issuer.service.v2.InitializeWebSessionResponse> getInitializeWebSessionMethod;
    if ((getInitializeWebSessionMethod = IssuerToMicaWIPServiceGrpc.getInitializeWebSessionMethod) == null) {
      synchronized (IssuerToMicaWIPServiceGrpc.class) {
        if ((getInitializeWebSessionMethod = IssuerToMicaWIPServiceGrpc.getInitializeWebSessionMethod) == null) {
          IssuerToMicaWIPServiceGrpc.getInitializeWebSessionMethod = getInitializeWebSessionMethod =
              io.grpc.MethodDescriptor.<io.mica.issuer.service.v2.InitializeWebSessionRequest, io.mica.issuer.service.v2.InitializeWebSessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InitializeWebSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.issuer.service.v2.InitializeWebSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.issuer.service.v2.InitializeWebSessionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IssuerToMicaWIPServiceMethodDescriptorSupplier("InitializeWebSession"))
              .build();
        }
      }
    }
    return getInitializeWebSessionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static IssuerToMicaWIPServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IssuerToMicaWIPServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IssuerToMicaWIPServiceStub>() {
        @java.lang.Override
        public IssuerToMicaWIPServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IssuerToMicaWIPServiceStub(channel, callOptions);
        }
      };
    return IssuerToMicaWIPServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static IssuerToMicaWIPServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IssuerToMicaWIPServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IssuerToMicaWIPServiceBlockingV2Stub>() {
        @java.lang.Override
        public IssuerToMicaWIPServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IssuerToMicaWIPServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return IssuerToMicaWIPServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static IssuerToMicaWIPServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IssuerToMicaWIPServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IssuerToMicaWIPServiceBlockingStub>() {
        @java.lang.Override
        public IssuerToMicaWIPServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IssuerToMicaWIPServiceBlockingStub(channel, callOptions);
        }
      };
    return IssuerToMicaWIPServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static IssuerToMicaWIPServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IssuerToMicaWIPServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IssuerToMicaWIPServiceFutureStub>() {
        @java.lang.Override
        public IssuerToMicaWIPServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IssuerToMicaWIPServiceFutureStub(channel, callOptions);
        }
      };
    return IssuerToMicaWIPServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Work-in-progress and experimental operations the Issuer calls on Mica. They may change, or become standard product
   * features, in future releases.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Returns the recurring payments set up against a user's instruments.
     * </pre>
     */
    default void searchRecurringPayments(io.mica.issuer.service.v2.SearchRecurringPaymentsRequest request,
        io.grpc.stub.StreamObserver<io.mica.issuer.service.v2.SearchRecurringPaymentsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchRecurringPaymentsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sends value from one of the Issuer's users to the holder of a UUEK (person-to-person).
     * Deprecated.
     * </pre>
     */
    @java.lang.Deprecated
    default void sendValue(io.mica.issuer.service.v2.SendValueRequest request,
        io.grpc.stub.StreamObserver<io.mica.issuer.service.v2.SendValueResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendValueMethod(), responseObserver);
    }

    /**
     * <pre>
     * Starts a session in Mica's embedded web experience for one of the Issuer's users and returns a token for it. Fails
     * with gRPC UNIMPLEMENTED if the embedded experience is not enabled for the Issuer, NOT_FOUND if the user does not
     * exist, and PERMISSION_DENIED if the user is not active.
     * </pre>
     */
    default void initializeWebSession(io.mica.issuer.service.v2.InitializeWebSessionRequest request,
        io.grpc.stub.StreamObserver<io.mica.issuer.service.v2.InitializeWebSessionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInitializeWebSessionMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service IssuerToMicaWIPService.
   * <pre>
   * Work-in-progress and experimental operations the Issuer calls on Mica. They may change, or become standard product
   * features, in future releases.
   * </pre>
   */
  public static abstract class IssuerToMicaWIPServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return IssuerToMicaWIPServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service IssuerToMicaWIPService.
   * <pre>
   * Work-in-progress and experimental operations the Issuer calls on Mica. They may change, or become standard product
   * features, in future releases.
   * </pre>
   */
  public static final class IssuerToMicaWIPServiceStub
      extends io.grpc.stub.AbstractAsyncStub<IssuerToMicaWIPServiceStub> {
    private IssuerToMicaWIPServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IssuerToMicaWIPServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IssuerToMicaWIPServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the recurring payments set up against a user's instruments.
     * </pre>
     */
    public void searchRecurringPayments(io.mica.issuer.service.v2.SearchRecurringPaymentsRequest request,
        io.grpc.stub.StreamObserver<io.mica.issuer.service.v2.SearchRecurringPaymentsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchRecurringPaymentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sends value from one of the Issuer's users to the holder of a UUEK (person-to-person).
     * Deprecated.
     * </pre>
     */
    @java.lang.Deprecated
    public void sendValue(io.mica.issuer.service.v2.SendValueRequest request,
        io.grpc.stub.StreamObserver<io.mica.issuer.service.v2.SendValueResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendValueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Starts a session in Mica's embedded web experience for one of the Issuer's users and returns a token for it. Fails
     * with gRPC UNIMPLEMENTED if the embedded experience is not enabled for the Issuer, NOT_FOUND if the user does not
     * exist, and PERMISSION_DENIED if the user is not active.
     * </pre>
     */
    public void initializeWebSession(io.mica.issuer.service.v2.InitializeWebSessionRequest request,
        io.grpc.stub.StreamObserver<io.mica.issuer.service.v2.InitializeWebSessionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInitializeWebSessionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service IssuerToMicaWIPService.
   * <pre>
   * Work-in-progress and experimental operations the Issuer calls on Mica. They may change, or become standard product
   * features, in future releases.
   * </pre>
   */
  public static final class IssuerToMicaWIPServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<IssuerToMicaWIPServiceBlockingV2Stub> {
    private IssuerToMicaWIPServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IssuerToMicaWIPServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IssuerToMicaWIPServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the recurring payments set up against a user's instruments.
     * </pre>
     */
    public io.mica.issuer.service.v2.SearchRecurringPaymentsResponse searchRecurringPayments(io.mica.issuer.service.v2.SearchRecurringPaymentsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getSearchRecurringPaymentsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sends value from one of the Issuer's users to the holder of a UUEK (person-to-person).
     * Deprecated.
     * </pre>
     */
    @java.lang.Deprecated
    public io.mica.issuer.service.v2.SendValueResponse sendValue(io.mica.issuer.service.v2.SendValueRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getSendValueMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Starts a session in Mica's embedded web experience for one of the Issuer's users and returns a token for it. Fails
     * with gRPC UNIMPLEMENTED if the embedded experience is not enabled for the Issuer, NOT_FOUND if the user does not
     * exist, and PERMISSION_DENIED if the user is not active.
     * </pre>
     */
    public io.mica.issuer.service.v2.InitializeWebSessionResponse initializeWebSession(io.mica.issuer.service.v2.InitializeWebSessionRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getInitializeWebSessionMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service IssuerToMicaWIPService.
   * <pre>
   * Work-in-progress and experimental operations the Issuer calls on Mica. They may change, or become standard product
   * features, in future releases.
   * </pre>
   */
  public static final class IssuerToMicaWIPServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<IssuerToMicaWIPServiceBlockingStub> {
    private IssuerToMicaWIPServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IssuerToMicaWIPServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IssuerToMicaWIPServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the recurring payments set up against a user's instruments.
     * </pre>
     */
    public io.mica.issuer.service.v2.SearchRecurringPaymentsResponse searchRecurringPayments(io.mica.issuer.service.v2.SearchRecurringPaymentsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchRecurringPaymentsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sends value from one of the Issuer's users to the holder of a UUEK (person-to-person).
     * Deprecated.
     * </pre>
     */
    @java.lang.Deprecated
    public io.mica.issuer.service.v2.SendValueResponse sendValue(io.mica.issuer.service.v2.SendValueRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendValueMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Starts a session in Mica's embedded web experience for one of the Issuer's users and returns a token for it. Fails
     * with gRPC UNIMPLEMENTED if the embedded experience is not enabled for the Issuer, NOT_FOUND if the user does not
     * exist, and PERMISSION_DENIED if the user is not active.
     * </pre>
     */
    public io.mica.issuer.service.v2.InitializeWebSessionResponse initializeWebSession(io.mica.issuer.service.v2.InitializeWebSessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInitializeWebSessionMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service IssuerToMicaWIPService.
   * <pre>
   * Work-in-progress and experimental operations the Issuer calls on Mica. They may change, or become standard product
   * features, in future releases.
   * </pre>
   */
  public static final class IssuerToMicaWIPServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<IssuerToMicaWIPServiceFutureStub> {
    private IssuerToMicaWIPServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IssuerToMicaWIPServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IssuerToMicaWIPServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the recurring payments set up against a user's instruments.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mica.issuer.service.v2.SearchRecurringPaymentsResponse> searchRecurringPayments(
        io.mica.issuer.service.v2.SearchRecurringPaymentsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchRecurringPaymentsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sends value from one of the Issuer's users to the holder of a UUEK (person-to-person).
     * Deprecated.
     * </pre>
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<io.mica.issuer.service.v2.SendValueResponse> sendValue(
        io.mica.issuer.service.v2.SendValueRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendValueMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Starts a session in Mica's embedded web experience for one of the Issuer's users and returns a token for it. Fails
     * with gRPC UNIMPLEMENTED if the embedded experience is not enabled for the Issuer, NOT_FOUND if the user does not
     * exist, and PERMISSION_DENIED if the user is not active.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mica.issuer.service.v2.InitializeWebSessionResponse> initializeWebSession(
        io.mica.issuer.service.v2.InitializeWebSessionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInitializeWebSessionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEARCH_RECURRING_PAYMENTS = 0;
  private static final int METHODID_SEND_VALUE = 1;
  private static final int METHODID_INITIALIZE_WEB_SESSION = 2;

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
        case METHODID_SEARCH_RECURRING_PAYMENTS:
          serviceImpl.searchRecurringPayments((io.mica.issuer.service.v2.SearchRecurringPaymentsRequest) request,
              (io.grpc.stub.StreamObserver<io.mica.issuer.service.v2.SearchRecurringPaymentsResponse>) responseObserver);
          break;
        case METHODID_SEND_VALUE:
          serviceImpl.sendValue((io.mica.issuer.service.v2.SendValueRequest) request,
              (io.grpc.stub.StreamObserver<io.mica.issuer.service.v2.SendValueResponse>) responseObserver);
          break;
        case METHODID_INITIALIZE_WEB_SESSION:
          serviceImpl.initializeWebSession((io.mica.issuer.service.v2.InitializeWebSessionRequest) request,
              (io.grpc.stub.StreamObserver<io.mica.issuer.service.v2.InitializeWebSessionResponse>) responseObserver);
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
          getSearchRecurringPaymentsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mica.issuer.service.v2.SearchRecurringPaymentsRequest,
              io.mica.issuer.service.v2.SearchRecurringPaymentsResponse>(
                service, METHODID_SEARCH_RECURRING_PAYMENTS)))
        .addMethod(
          getSendValueMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mica.issuer.service.v2.SendValueRequest,
              io.mica.issuer.service.v2.SendValueResponse>(
                service, METHODID_SEND_VALUE)))
        .addMethod(
          getInitializeWebSessionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mica.issuer.service.v2.InitializeWebSessionRequest,
              io.mica.issuer.service.v2.InitializeWebSessionResponse>(
                service, METHODID_INITIALIZE_WEB_SESSION)))
        .build();
  }

  private static abstract class IssuerToMicaWIPServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    IssuerToMicaWIPServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.mica.issuer.service.v2.IssuerToMicaWipServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("IssuerToMicaWIPService");
    }
  }

  private static final class IssuerToMicaWIPServiceFileDescriptorSupplier
      extends IssuerToMicaWIPServiceBaseDescriptorSupplier {
    IssuerToMicaWIPServiceFileDescriptorSupplier() {}
  }

  private static final class IssuerToMicaWIPServiceMethodDescriptorSupplier
      extends IssuerToMicaWIPServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    IssuerToMicaWIPServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (IssuerToMicaWIPServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new IssuerToMicaWIPServiceFileDescriptorSupplier())
              .addMethod(getSearchRecurringPaymentsMethod())
              .addMethod(getSendValueMethod())
              .addMethod(getInitializeWebSessionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
