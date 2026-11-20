package io.mica.issuer.service.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Work-in-progress and experimental operations Mica calls on the Issuer, hosted at the same callback address as
 * IssuerFromMicaService. They may change, or become standard product features, in future releases.
 * </pre>
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class IssuerFromMicaWIPServiceGrpc {

  private IssuerFromMicaWIPServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "mica.issuer.service.v2.IssuerFromMicaWIPService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.mica.issuer.service.v2.ApproveChargebackRequest,
      io.mica.issuer.service.v2.ApproveChargebackResponse> getApproveChargebackMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ApproveChargeback",
      requestType = io.mica.issuer.service.v2.ApproveChargebackRequest.class,
      responseType = io.mica.issuer.service.v2.ApproveChargebackResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mica.issuer.service.v2.ApproveChargebackRequest,
      io.mica.issuer.service.v2.ApproveChargebackResponse> getApproveChargebackMethod() {
    io.grpc.MethodDescriptor<io.mica.issuer.service.v2.ApproveChargebackRequest, io.mica.issuer.service.v2.ApproveChargebackResponse> getApproveChargebackMethod;
    if ((getApproveChargebackMethod = IssuerFromMicaWIPServiceGrpc.getApproveChargebackMethod) == null) {
      synchronized (IssuerFromMicaWIPServiceGrpc.class) {
        if ((getApproveChargebackMethod = IssuerFromMicaWIPServiceGrpc.getApproveChargebackMethod) == null) {
          IssuerFromMicaWIPServiceGrpc.getApproveChargebackMethod = getApproveChargebackMethod =
              io.grpc.MethodDescriptor.<io.mica.issuer.service.v2.ApproveChargebackRequest, io.mica.issuer.service.v2.ApproveChargebackResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ApproveChargeback"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.issuer.service.v2.ApproveChargebackRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.issuer.service.v2.ApproveChargebackResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IssuerFromMicaWIPServiceMethodDescriptorSupplier("ApproveChargeback"))
              .build();
        }
      }
    }
    return getApproveChargebackMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mica.issuer.value.v2.ReceiveValueRequest,
      io.mica.issuer.value.v2.ReceiveValueResponse> getReceiveValueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReceiveValue",
      requestType = io.mica.issuer.value.v2.ReceiveValueRequest.class,
      responseType = io.mica.issuer.value.v2.ReceiveValueResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mica.issuer.value.v2.ReceiveValueRequest,
      io.mica.issuer.value.v2.ReceiveValueResponse> getReceiveValueMethod() {
    io.grpc.MethodDescriptor<io.mica.issuer.value.v2.ReceiveValueRequest, io.mica.issuer.value.v2.ReceiveValueResponse> getReceiveValueMethod;
    if ((getReceiveValueMethod = IssuerFromMicaWIPServiceGrpc.getReceiveValueMethod) == null) {
      synchronized (IssuerFromMicaWIPServiceGrpc.class) {
        if ((getReceiveValueMethod = IssuerFromMicaWIPServiceGrpc.getReceiveValueMethod) == null) {
          IssuerFromMicaWIPServiceGrpc.getReceiveValueMethod = getReceiveValueMethod =
              io.grpc.MethodDescriptor.<io.mica.issuer.value.v2.ReceiveValueRequest, io.mica.issuer.value.v2.ReceiveValueResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReceiveValue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.issuer.value.v2.ReceiveValueRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.issuer.value.v2.ReceiveValueResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IssuerFromMicaWIPServiceMethodDescriptorSupplier("ReceiveValue"))
              .build();
        }
      }
    }
    return getReceiveValueMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static IssuerFromMicaWIPServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IssuerFromMicaWIPServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IssuerFromMicaWIPServiceStub>() {
        @java.lang.Override
        public IssuerFromMicaWIPServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IssuerFromMicaWIPServiceStub(channel, callOptions);
        }
      };
    return IssuerFromMicaWIPServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static IssuerFromMicaWIPServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IssuerFromMicaWIPServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IssuerFromMicaWIPServiceBlockingV2Stub>() {
        @java.lang.Override
        public IssuerFromMicaWIPServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IssuerFromMicaWIPServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return IssuerFromMicaWIPServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static IssuerFromMicaWIPServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IssuerFromMicaWIPServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IssuerFromMicaWIPServiceBlockingStub>() {
        @java.lang.Override
        public IssuerFromMicaWIPServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IssuerFromMicaWIPServiceBlockingStub(channel, callOptions);
        }
      };
    return IssuerFromMicaWIPServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static IssuerFromMicaWIPServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IssuerFromMicaWIPServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IssuerFromMicaWIPServiceFutureStub>() {
        @java.lang.Override
        public IssuerFromMicaWIPServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IssuerFromMicaWIPServiceFutureStub(channel, callOptions);
        }
      };
    return IssuerFromMicaWIPServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Work-in-progress and experimental operations Mica calls on the Issuer, hosted at the same callback address as
   * IssuerFromMicaService. They may change, or become standard product features, in future releases.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Asks the Issuer to credit the user's instrument for a chargeback. Mica calls this only when a dispute is resolved
     * in the user's favor _and_ the money goes back to the user's instrument; if the dispute ends in a replacement or
     * an in-store credit, the Issuer is not called.
     * </pre>
     */
    default void approveChargeback(io.mica.issuer.service.v2.ApproveChargebackRequest request,
        io.grpc.stub.StreamObserver<io.mica.issuer.service.v2.ApproveChargebackResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getApproveChargebackMethod(), responseObserver);
    }

    /**
     * <pre>
     * Asks the Issuer to credit a person-to-person transfer, sent with IssuerToMicaWIPService.SendValue, to one of its
     * users' instruments.
     * </pre>
     */
    default void receiveValue(io.mica.issuer.value.v2.ReceiveValueRequest request,
        io.grpc.stub.StreamObserver<io.mica.issuer.value.v2.ReceiveValueResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReceiveValueMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service IssuerFromMicaWIPService.
   * <pre>
   * Work-in-progress and experimental operations Mica calls on the Issuer, hosted at the same callback address as
   * IssuerFromMicaService. They may change, or become standard product features, in future releases.
   * </pre>
   */
  public static abstract class IssuerFromMicaWIPServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return IssuerFromMicaWIPServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service IssuerFromMicaWIPService.
   * <pre>
   * Work-in-progress and experimental operations Mica calls on the Issuer, hosted at the same callback address as
   * IssuerFromMicaService. They may change, or become standard product features, in future releases.
   * </pre>
   */
  public static final class IssuerFromMicaWIPServiceStub
      extends io.grpc.stub.AbstractAsyncStub<IssuerFromMicaWIPServiceStub> {
    private IssuerFromMicaWIPServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IssuerFromMicaWIPServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IssuerFromMicaWIPServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Asks the Issuer to credit the user's instrument for a chargeback. Mica calls this only when a dispute is resolved
     * in the user's favor _and_ the money goes back to the user's instrument; if the dispute ends in a replacement or
     * an in-store credit, the Issuer is not called.
     * </pre>
     */
    public void approveChargeback(io.mica.issuer.service.v2.ApproveChargebackRequest request,
        io.grpc.stub.StreamObserver<io.mica.issuer.service.v2.ApproveChargebackResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getApproveChargebackMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Asks the Issuer to credit a person-to-person transfer, sent with IssuerToMicaWIPService.SendValue, to one of its
     * users' instruments.
     * </pre>
     */
    public void receiveValue(io.mica.issuer.value.v2.ReceiveValueRequest request,
        io.grpc.stub.StreamObserver<io.mica.issuer.value.v2.ReceiveValueResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReceiveValueMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service IssuerFromMicaWIPService.
   * <pre>
   * Work-in-progress and experimental operations Mica calls on the Issuer, hosted at the same callback address as
   * IssuerFromMicaService. They may change, or become standard product features, in future releases.
   * </pre>
   */
  public static final class IssuerFromMicaWIPServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<IssuerFromMicaWIPServiceBlockingV2Stub> {
    private IssuerFromMicaWIPServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IssuerFromMicaWIPServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IssuerFromMicaWIPServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Asks the Issuer to credit the user's instrument for a chargeback. Mica calls this only when a dispute is resolved
     * in the user's favor _and_ the money goes back to the user's instrument; if the dispute ends in a replacement or
     * an in-store credit, the Issuer is not called.
     * </pre>
     */
    public io.mica.issuer.service.v2.ApproveChargebackResponse approveChargeback(io.mica.issuer.service.v2.ApproveChargebackRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getApproveChargebackMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Asks the Issuer to credit a person-to-person transfer, sent with IssuerToMicaWIPService.SendValue, to one of its
     * users' instruments.
     * </pre>
     */
    public io.mica.issuer.value.v2.ReceiveValueResponse receiveValue(io.mica.issuer.value.v2.ReceiveValueRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getReceiveValueMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service IssuerFromMicaWIPService.
   * <pre>
   * Work-in-progress and experimental operations Mica calls on the Issuer, hosted at the same callback address as
   * IssuerFromMicaService. They may change, or become standard product features, in future releases.
   * </pre>
   */
  public static final class IssuerFromMicaWIPServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<IssuerFromMicaWIPServiceBlockingStub> {
    private IssuerFromMicaWIPServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IssuerFromMicaWIPServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IssuerFromMicaWIPServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Asks the Issuer to credit the user's instrument for a chargeback. Mica calls this only when a dispute is resolved
     * in the user's favor _and_ the money goes back to the user's instrument; if the dispute ends in a replacement or
     * an in-store credit, the Issuer is not called.
     * </pre>
     */
    public io.mica.issuer.service.v2.ApproveChargebackResponse approveChargeback(io.mica.issuer.service.v2.ApproveChargebackRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getApproveChargebackMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Asks the Issuer to credit a person-to-person transfer, sent with IssuerToMicaWIPService.SendValue, to one of its
     * users' instruments.
     * </pre>
     */
    public io.mica.issuer.value.v2.ReceiveValueResponse receiveValue(io.mica.issuer.value.v2.ReceiveValueRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReceiveValueMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service IssuerFromMicaWIPService.
   * <pre>
   * Work-in-progress and experimental operations Mica calls on the Issuer, hosted at the same callback address as
   * IssuerFromMicaService. They may change, or become standard product features, in future releases.
   * </pre>
   */
  public static final class IssuerFromMicaWIPServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<IssuerFromMicaWIPServiceFutureStub> {
    private IssuerFromMicaWIPServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IssuerFromMicaWIPServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IssuerFromMicaWIPServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Asks the Issuer to credit the user's instrument for a chargeback. Mica calls this only when a dispute is resolved
     * in the user's favor _and_ the money goes back to the user's instrument; if the dispute ends in a replacement or
     * an in-store credit, the Issuer is not called.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mica.issuer.service.v2.ApproveChargebackResponse> approveChargeback(
        io.mica.issuer.service.v2.ApproveChargebackRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getApproveChargebackMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Asks the Issuer to credit a person-to-person transfer, sent with IssuerToMicaWIPService.SendValue, to one of its
     * users' instruments.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mica.issuer.value.v2.ReceiveValueResponse> receiveValue(
        io.mica.issuer.value.v2.ReceiveValueRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReceiveValueMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_APPROVE_CHARGEBACK = 0;
  private static final int METHODID_RECEIVE_VALUE = 1;

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
        case METHODID_APPROVE_CHARGEBACK:
          serviceImpl.approveChargeback((io.mica.issuer.service.v2.ApproveChargebackRequest) request,
              (io.grpc.stub.StreamObserver<io.mica.issuer.service.v2.ApproveChargebackResponse>) responseObserver);
          break;
        case METHODID_RECEIVE_VALUE:
          serviceImpl.receiveValue((io.mica.issuer.value.v2.ReceiveValueRequest) request,
              (io.grpc.stub.StreamObserver<io.mica.issuer.value.v2.ReceiveValueResponse>) responseObserver);
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
          getApproveChargebackMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mica.issuer.service.v2.ApproveChargebackRequest,
              io.mica.issuer.service.v2.ApproveChargebackResponse>(
                service, METHODID_APPROVE_CHARGEBACK)))
        .addMethod(
          getReceiveValueMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mica.issuer.value.v2.ReceiveValueRequest,
              io.mica.issuer.value.v2.ReceiveValueResponse>(
                service, METHODID_RECEIVE_VALUE)))
        .build();
  }

  private static abstract class IssuerFromMicaWIPServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    IssuerFromMicaWIPServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.mica.issuer.service.v2.IssuerFromMicaWipServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("IssuerFromMicaWIPService");
    }
  }

  private static final class IssuerFromMicaWIPServiceFileDescriptorSupplier
      extends IssuerFromMicaWIPServiceBaseDescriptorSupplier {
    IssuerFromMicaWIPServiceFileDescriptorSupplier() {}
  }

  private static final class IssuerFromMicaWIPServiceMethodDescriptorSupplier
      extends IssuerFromMicaWIPServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    IssuerFromMicaWIPServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (IssuerFromMicaWIPServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new IssuerFromMicaWIPServiceFileDescriptorSupplier())
              .addMethod(getApproveChargebackMethod())
              .addMethod(getReceiveValueMethod())
              .build();
        }
      }
    }
    return result;
  }
}
