package io.mica.acceptor.service.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Operations still in development. They may change without notice.
 * </pre>
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class AcceptorToMicaWIPServiceGrpc {

  private AcceptorToMicaWIPServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "mica.acceptor.service.v2.AcceptorToMicaWIPService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.mica.acceptor.service.v2.CreateRecurringPaymentRequest,
      io.mica.acceptor.service.v2.CreateRecurringPaymentResponse> getCreateRecurringPaymentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateRecurringPayment",
      requestType = io.mica.acceptor.service.v2.CreateRecurringPaymentRequest.class,
      responseType = io.mica.acceptor.service.v2.CreateRecurringPaymentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mica.acceptor.service.v2.CreateRecurringPaymentRequest,
      io.mica.acceptor.service.v2.CreateRecurringPaymentResponse> getCreateRecurringPaymentMethod() {
    io.grpc.MethodDescriptor<io.mica.acceptor.service.v2.CreateRecurringPaymentRequest, io.mica.acceptor.service.v2.CreateRecurringPaymentResponse> getCreateRecurringPaymentMethod;
    if ((getCreateRecurringPaymentMethod = AcceptorToMicaWIPServiceGrpc.getCreateRecurringPaymentMethod) == null) {
      synchronized (AcceptorToMicaWIPServiceGrpc.class) {
        if ((getCreateRecurringPaymentMethod = AcceptorToMicaWIPServiceGrpc.getCreateRecurringPaymentMethod) == null) {
          AcceptorToMicaWIPServiceGrpc.getCreateRecurringPaymentMethod = getCreateRecurringPaymentMethod =
              io.grpc.MethodDescriptor.<io.mica.acceptor.service.v2.CreateRecurringPaymentRequest, io.mica.acceptor.service.v2.CreateRecurringPaymentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateRecurringPayment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.acceptor.service.v2.CreateRecurringPaymentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.acceptor.service.v2.CreateRecurringPaymentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AcceptorToMicaWIPServiceMethodDescriptorSupplier("CreateRecurringPayment"))
              .build();
        }
      }
    }
    return getCreateRecurringPaymentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mica.acceptor.service.v2.GetRecurringPaymentRequest,
      io.mica.acceptor.service.v2.GetRecurringPaymentResponse> getGetRecurringPaymentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRecurringPayment",
      requestType = io.mica.acceptor.service.v2.GetRecurringPaymentRequest.class,
      responseType = io.mica.acceptor.service.v2.GetRecurringPaymentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mica.acceptor.service.v2.GetRecurringPaymentRequest,
      io.mica.acceptor.service.v2.GetRecurringPaymentResponse> getGetRecurringPaymentMethod() {
    io.grpc.MethodDescriptor<io.mica.acceptor.service.v2.GetRecurringPaymentRequest, io.mica.acceptor.service.v2.GetRecurringPaymentResponse> getGetRecurringPaymentMethod;
    if ((getGetRecurringPaymentMethod = AcceptorToMicaWIPServiceGrpc.getGetRecurringPaymentMethod) == null) {
      synchronized (AcceptorToMicaWIPServiceGrpc.class) {
        if ((getGetRecurringPaymentMethod = AcceptorToMicaWIPServiceGrpc.getGetRecurringPaymentMethod) == null) {
          AcceptorToMicaWIPServiceGrpc.getGetRecurringPaymentMethod = getGetRecurringPaymentMethod =
              io.grpc.MethodDescriptor.<io.mica.acceptor.service.v2.GetRecurringPaymentRequest, io.mica.acceptor.service.v2.GetRecurringPaymentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRecurringPayment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.acceptor.service.v2.GetRecurringPaymentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.acceptor.service.v2.GetRecurringPaymentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AcceptorToMicaWIPServiceMethodDescriptorSupplier("GetRecurringPayment"))
              .build();
        }
      }
    }
    return getGetRecurringPaymentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mica.acceptor.service.v2.ProvisionRecurringPaymentUUEKRequest,
      io.mica.acceptor.service.v2.ProvisionRecurringPaymentUUEKResponse> getProvisionRecurringPaymentUUEKMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProvisionRecurringPaymentUUEK",
      requestType = io.mica.acceptor.service.v2.ProvisionRecurringPaymentUUEKRequest.class,
      responseType = io.mica.acceptor.service.v2.ProvisionRecurringPaymentUUEKResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mica.acceptor.service.v2.ProvisionRecurringPaymentUUEKRequest,
      io.mica.acceptor.service.v2.ProvisionRecurringPaymentUUEKResponse> getProvisionRecurringPaymentUUEKMethod() {
    io.grpc.MethodDescriptor<io.mica.acceptor.service.v2.ProvisionRecurringPaymentUUEKRequest, io.mica.acceptor.service.v2.ProvisionRecurringPaymentUUEKResponse> getProvisionRecurringPaymentUUEKMethod;
    if ((getProvisionRecurringPaymentUUEKMethod = AcceptorToMicaWIPServiceGrpc.getProvisionRecurringPaymentUUEKMethod) == null) {
      synchronized (AcceptorToMicaWIPServiceGrpc.class) {
        if ((getProvisionRecurringPaymentUUEKMethod = AcceptorToMicaWIPServiceGrpc.getProvisionRecurringPaymentUUEKMethod) == null) {
          AcceptorToMicaWIPServiceGrpc.getProvisionRecurringPaymentUUEKMethod = getProvisionRecurringPaymentUUEKMethod =
              io.grpc.MethodDescriptor.<io.mica.acceptor.service.v2.ProvisionRecurringPaymentUUEKRequest, io.mica.acceptor.service.v2.ProvisionRecurringPaymentUUEKResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProvisionRecurringPaymentUUEK"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.acceptor.service.v2.ProvisionRecurringPaymentUUEKRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.acceptor.service.v2.ProvisionRecurringPaymentUUEKResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AcceptorToMicaWIPServiceMethodDescriptorSupplier("ProvisionRecurringPaymentUUEK"))
              .build();
        }
      }
    }
    return getProvisionRecurringPaymentUUEKMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AcceptorToMicaWIPServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AcceptorToMicaWIPServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AcceptorToMicaWIPServiceStub>() {
        @java.lang.Override
        public AcceptorToMicaWIPServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AcceptorToMicaWIPServiceStub(channel, callOptions);
        }
      };
    return AcceptorToMicaWIPServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static AcceptorToMicaWIPServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AcceptorToMicaWIPServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AcceptorToMicaWIPServiceBlockingV2Stub>() {
        @java.lang.Override
        public AcceptorToMicaWIPServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AcceptorToMicaWIPServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return AcceptorToMicaWIPServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AcceptorToMicaWIPServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AcceptorToMicaWIPServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AcceptorToMicaWIPServiceBlockingStub>() {
        @java.lang.Override
        public AcceptorToMicaWIPServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AcceptorToMicaWIPServiceBlockingStub(channel, callOptions);
        }
      };
    return AcceptorToMicaWIPServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AcceptorToMicaWIPServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AcceptorToMicaWIPServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AcceptorToMicaWIPServiceFutureStub>() {
        @java.lang.Override
        public AcceptorToMicaWIPServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AcceptorToMicaWIPServiceFutureStub(channel, callOptions);
        }
      };
    return AcceptorToMicaWIPServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Operations still in development. They may change without notice.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Work in progress. Creates a recurring payment: standing permission, within the terms you set, to take future
     * payments from a user's linked payment profile. Pass a UUEK provisioned with ProvisionUUEKFromLink on
     * AcceptorToMicaLinkService using the create_recurring_payment intent. Returns a recurring_payment_key for later
     * calls. Creating a recurring payment moves no value; take each payment with ProvisionRecurringPaymentUUEK and
     * ObtainValue.
     * </pre>
     */
    default void createRecurringPayment(io.mica.acceptor.service.v2.CreateRecurringPaymentRequest request,
        io.grpc.stub.StreamObserver<io.mica.acceptor.service.v2.CreateRecurringPaymentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateRecurringPaymentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Work in progress. Retrieves a recurring payment by its recurring_payment_key. An unknown key is reported as the
     * gRPC status NOT_FOUND.
     * </pre>
     */
    default void getRecurringPayment(io.mica.acceptor.service.v2.GetRecurringPaymentRequest request,
        io.grpc.stub.StreamObserver<io.mica.acceptor.service.v2.GetRecurringPaymentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRecurringPaymentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Work in progress. Provisions a UUEK for taking one payment under a recurring payment; pass it to ObtainValue on
     * AcceptorToMicaValueService. An unknown key is reported as the gRPC status NOT_FOUND, and a recurring payment that
     * cannot currently be used, for example because its terms are used up, as PERMISSION_DENIED.
     * </pre>
     */
    default void provisionRecurringPaymentUUEK(io.mica.acceptor.service.v2.ProvisionRecurringPaymentUUEKRequest request,
        io.grpc.stub.StreamObserver<io.mica.acceptor.service.v2.ProvisionRecurringPaymentUUEKResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProvisionRecurringPaymentUUEKMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AcceptorToMicaWIPService.
   * <pre>
   * Operations still in development. They may change without notice.
   * </pre>
   */
  public static abstract class AcceptorToMicaWIPServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AcceptorToMicaWIPServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AcceptorToMicaWIPService.
   * <pre>
   * Operations still in development. They may change without notice.
   * </pre>
   */
  public static final class AcceptorToMicaWIPServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AcceptorToMicaWIPServiceStub> {
    private AcceptorToMicaWIPServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AcceptorToMicaWIPServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AcceptorToMicaWIPServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Work in progress. Creates a recurring payment: standing permission, within the terms you set, to take future
     * payments from a user's linked payment profile. Pass a UUEK provisioned with ProvisionUUEKFromLink on
     * AcceptorToMicaLinkService using the create_recurring_payment intent. Returns a recurring_payment_key for later
     * calls. Creating a recurring payment moves no value; take each payment with ProvisionRecurringPaymentUUEK and
     * ObtainValue.
     * </pre>
     */
    public void createRecurringPayment(io.mica.acceptor.service.v2.CreateRecurringPaymentRequest request,
        io.grpc.stub.StreamObserver<io.mica.acceptor.service.v2.CreateRecurringPaymentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateRecurringPaymentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Work in progress. Retrieves a recurring payment by its recurring_payment_key. An unknown key is reported as the
     * gRPC status NOT_FOUND.
     * </pre>
     */
    public void getRecurringPayment(io.mica.acceptor.service.v2.GetRecurringPaymentRequest request,
        io.grpc.stub.StreamObserver<io.mica.acceptor.service.v2.GetRecurringPaymentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRecurringPaymentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Work in progress. Provisions a UUEK for taking one payment under a recurring payment; pass it to ObtainValue on
     * AcceptorToMicaValueService. An unknown key is reported as the gRPC status NOT_FOUND, and a recurring payment that
     * cannot currently be used, for example because its terms are used up, as PERMISSION_DENIED.
     * </pre>
     */
    public void provisionRecurringPaymentUUEK(io.mica.acceptor.service.v2.ProvisionRecurringPaymentUUEKRequest request,
        io.grpc.stub.StreamObserver<io.mica.acceptor.service.v2.ProvisionRecurringPaymentUUEKResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProvisionRecurringPaymentUUEKMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AcceptorToMicaWIPService.
   * <pre>
   * Operations still in development. They may change without notice.
   * </pre>
   */
  public static final class AcceptorToMicaWIPServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<AcceptorToMicaWIPServiceBlockingV2Stub> {
    private AcceptorToMicaWIPServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AcceptorToMicaWIPServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AcceptorToMicaWIPServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Work in progress. Creates a recurring payment: standing permission, within the terms you set, to take future
     * payments from a user's linked payment profile. Pass a UUEK provisioned with ProvisionUUEKFromLink on
     * AcceptorToMicaLinkService using the create_recurring_payment intent. Returns a recurring_payment_key for later
     * calls. Creating a recurring payment moves no value; take each payment with ProvisionRecurringPaymentUUEK and
     * ObtainValue.
     * </pre>
     */
    public io.mica.acceptor.service.v2.CreateRecurringPaymentResponse createRecurringPayment(io.mica.acceptor.service.v2.CreateRecurringPaymentRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getCreateRecurringPaymentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Work in progress. Retrieves a recurring payment by its recurring_payment_key. An unknown key is reported as the
     * gRPC status NOT_FOUND.
     * </pre>
     */
    public io.mica.acceptor.service.v2.GetRecurringPaymentResponse getRecurringPayment(io.mica.acceptor.service.v2.GetRecurringPaymentRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetRecurringPaymentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Work in progress. Provisions a UUEK for taking one payment under a recurring payment; pass it to ObtainValue on
     * AcceptorToMicaValueService. An unknown key is reported as the gRPC status NOT_FOUND, and a recurring payment that
     * cannot currently be used, for example because its terms are used up, as PERMISSION_DENIED.
     * </pre>
     */
    public io.mica.acceptor.service.v2.ProvisionRecurringPaymentUUEKResponse provisionRecurringPaymentUUEK(io.mica.acceptor.service.v2.ProvisionRecurringPaymentUUEKRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getProvisionRecurringPaymentUUEKMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service AcceptorToMicaWIPService.
   * <pre>
   * Operations still in development. They may change without notice.
   * </pre>
   */
  public static final class AcceptorToMicaWIPServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AcceptorToMicaWIPServiceBlockingStub> {
    private AcceptorToMicaWIPServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AcceptorToMicaWIPServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AcceptorToMicaWIPServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Work in progress. Creates a recurring payment: standing permission, within the terms you set, to take future
     * payments from a user's linked payment profile. Pass a UUEK provisioned with ProvisionUUEKFromLink on
     * AcceptorToMicaLinkService using the create_recurring_payment intent. Returns a recurring_payment_key for later
     * calls. Creating a recurring payment moves no value; take each payment with ProvisionRecurringPaymentUUEK and
     * ObtainValue.
     * </pre>
     */
    public io.mica.acceptor.service.v2.CreateRecurringPaymentResponse createRecurringPayment(io.mica.acceptor.service.v2.CreateRecurringPaymentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateRecurringPaymentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Work in progress. Retrieves a recurring payment by its recurring_payment_key. An unknown key is reported as the
     * gRPC status NOT_FOUND.
     * </pre>
     */
    public io.mica.acceptor.service.v2.GetRecurringPaymentResponse getRecurringPayment(io.mica.acceptor.service.v2.GetRecurringPaymentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRecurringPaymentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Work in progress. Provisions a UUEK for taking one payment under a recurring payment; pass it to ObtainValue on
     * AcceptorToMicaValueService. An unknown key is reported as the gRPC status NOT_FOUND, and a recurring payment that
     * cannot currently be used, for example because its terms are used up, as PERMISSION_DENIED.
     * </pre>
     */
    public io.mica.acceptor.service.v2.ProvisionRecurringPaymentUUEKResponse provisionRecurringPaymentUUEK(io.mica.acceptor.service.v2.ProvisionRecurringPaymentUUEKRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProvisionRecurringPaymentUUEKMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AcceptorToMicaWIPService.
   * <pre>
   * Operations still in development. They may change without notice.
   * </pre>
   */
  public static final class AcceptorToMicaWIPServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AcceptorToMicaWIPServiceFutureStub> {
    private AcceptorToMicaWIPServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AcceptorToMicaWIPServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AcceptorToMicaWIPServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Work in progress. Creates a recurring payment: standing permission, within the terms you set, to take future
     * payments from a user's linked payment profile. Pass a UUEK provisioned with ProvisionUUEKFromLink on
     * AcceptorToMicaLinkService using the create_recurring_payment intent. Returns a recurring_payment_key for later
     * calls. Creating a recurring payment moves no value; take each payment with ProvisionRecurringPaymentUUEK and
     * ObtainValue.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mica.acceptor.service.v2.CreateRecurringPaymentResponse> createRecurringPayment(
        io.mica.acceptor.service.v2.CreateRecurringPaymentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateRecurringPaymentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Work in progress. Retrieves a recurring payment by its recurring_payment_key. An unknown key is reported as the
     * gRPC status NOT_FOUND.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mica.acceptor.service.v2.GetRecurringPaymentResponse> getRecurringPayment(
        io.mica.acceptor.service.v2.GetRecurringPaymentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRecurringPaymentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Work in progress. Provisions a UUEK for taking one payment under a recurring payment; pass it to ObtainValue on
     * AcceptorToMicaValueService. An unknown key is reported as the gRPC status NOT_FOUND, and a recurring payment that
     * cannot currently be used, for example because its terms are used up, as PERMISSION_DENIED.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mica.acceptor.service.v2.ProvisionRecurringPaymentUUEKResponse> provisionRecurringPaymentUUEK(
        io.mica.acceptor.service.v2.ProvisionRecurringPaymentUUEKRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProvisionRecurringPaymentUUEKMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_RECURRING_PAYMENT = 0;
  private static final int METHODID_GET_RECURRING_PAYMENT = 1;
  private static final int METHODID_PROVISION_RECURRING_PAYMENT_UUEK = 2;

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
        case METHODID_CREATE_RECURRING_PAYMENT:
          serviceImpl.createRecurringPayment((io.mica.acceptor.service.v2.CreateRecurringPaymentRequest) request,
              (io.grpc.stub.StreamObserver<io.mica.acceptor.service.v2.CreateRecurringPaymentResponse>) responseObserver);
          break;
        case METHODID_GET_RECURRING_PAYMENT:
          serviceImpl.getRecurringPayment((io.mica.acceptor.service.v2.GetRecurringPaymentRequest) request,
              (io.grpc.stub.StreamObserver<io.mica.acceptor.service.v2.GetRecurringPaymentResponse>) responseObserver);
          break;
        case METHODID_PROVISION_RECURRING_PAYMENT_UUEK:
          serviceImpl.provisionRecurringPaymentUUEK((io.mica.acceptor.service.v2.ProvisionRecurringPaymentUUEKRequest) request,
              (io.grpc.stub.StreamObserver<io.mica.acceptor.service.v2.ProvisionRecurringPaymentUUEKResponse>) responseObserver);
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
          getCreateRecurringPaymentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mica.acceptor.service.v2.CreateRecurringPaymentRequest,
              io.mica.acceptor.service.v2.CreateRecurringPaymentResponse>(
                service, METHODID_CREATE_RECURRING_PAYMENT)))
        .addMethod(
          getGetRecurringPaymentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mica.acceptor.service.v2.GetRecurringPaymentRequest,
              io.mica.acceptor.service.v2.GetRecurringPaymentResponse>(
                service, METHODID_GET_RECURRING_PAYMENT)))
        .addMethod(
          getProvisionRecurringPaymentUUEKMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mica.acceptor.service.v2.ProvisionRecurringPaymentUUEKRequest,
              io.mica.acceptor.service.v2.ProvisionRecurringPaymentUUEKResponse>(
                service, METHODID_PROVISION_RECURRING_PAYMENT_UUEK)))
        .build();
  }

  private static abstract class AcceptorToMicaWIPServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AcceptorToMicaWIPServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.mica.acceptor.service.v2.AcceptorToMicaWipServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AcceptorToMicaWIPService");
    }
  }

  private static final class AcceptorToMicaWIPServiceFileDescriptorSupplier
      extends AcceptorToMicaWIPServiceBaseDescriptorSupplier {
    AcceptorToMicaWIPServiceFileDescriptorSupplier() {}
  }

  private static final class AcceptorToMicaWIPServiceMethodDescriptorSupplier
      extends AcceptorToMicaWIPServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    AcceptorToMicaWIPServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (AcceptorToMicaWIPServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AcceptorToMicaWIPServiceFileDescriptorSupplier())
              .addMethod(getCreateRecurringPaymentMethod())
              .addMethod(getGetRecurringPaymentMethod())
              .addMethod(getProvisionRecurringPaymentUUEKMethod())
              .build();
        }
      }
    }
    return result;
  }
}
