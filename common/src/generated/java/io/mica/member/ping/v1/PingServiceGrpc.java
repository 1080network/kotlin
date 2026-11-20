package io.mica.member.ping.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Connectivity check available on every Issuer and Acceptor endpoint.
 * </pre>
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class PingServiceGrpc {

  private PingServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "mica.member.ping.v1.PingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.mica.member.ping.v1.PingRequest,
      io.mica.member.ping.v1.PingResponse> getPingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Ping",
      requestType = io.mica.member.ping.v1.PingRequest.class,
      responseType = io.mica.member.ping.v1.PingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mica.member.ping.v1.PingRequest,
      io.mica.member.ping.v1.PingResponse> getPingMethod() {
    io.grpc.MethodDescriptor<io.mica.member.ping.v1.PingRequest, io.mica.member.ping.v1.PingResponse> getPingMethod;
    if ((getPingMethod = PingServiceGrpc.getPingMethod) == null) {
      synchronized (PingServiceGrpc.class) {
        if ((getPingMethod = PingServiceGrpc.getPingMethod) == null) {
          PingServiceGrpc.getPingMethod = getPingMethod =
              io.grpc.MethodDescriptor.<io.mica.member.ping.v1.PingRequest, io.mica.member.ping.v1.PingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Ping"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.member.ping.v1.PingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.member.ping.v1.PingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PingServiceMethodDescriptorSupplier("Ping"))
              .build();
        }
      }
    }
    return getPingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PingServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PingServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PingServiceStub>() {
        @java.lang.Override
        public PingServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PingServiceStub(channel, callOptions);
        }
      };
    return PingServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static PingServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PingServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PingServiceBlockingV2Stub>() {
        @java.lang.Override
        public PingServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PingServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return PingServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PingServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PingServiceBlockingStub>() {
        @java.lang.Override
        public PingServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PingServiceBlockingStub(channel, callOptions);
        }
      };
    return PingServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PingServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PingServiceFutureStub>() {
        @java.lang.Override
        public PingServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PingServiceFutureStub(channel, callOptions);
        }
      };
    return PingServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Connectivity check available on every Issuer and Acceptor endpoint.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Checks that you can reach Mica and that your client certificate is accepted. Needs no role beyond a valid
     * certificate, so it is a good first call when setting up a connection.
     * </pre>
     */
    default void ping(io.mica.member.ping.v1.PingRequest request,
        io.grpc.stub.StreamObserver<io.mica.member.ping.v1.PingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPingMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service PingService.
   * <pre>
   * Connectivity check available on every Issuer and Acceptor endpoint.
   * </pre>
   */
  public static abstract class PingServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return PingServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service PingService.
   * <pre>
   * Connectivity check available on every Issuer and Acceptor endpoint.
   * </pre>
   */
  public static final class PingServiceStub
      extends io.grpc.stub.AbstractAsyncStub<PingServiceStub> {
    private PingServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PingServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PingServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Checks that you can reach Mica and that your client certificate is accepted. Needs no role beyond a valid
     * certificate, so it is a good first call when setting up a connection.
     * </pre>
     */
    public void ping(io.mica.member.ping.v1.PingRequest request,
        io.grpc.stub.StreamObserver<io.mica.member.ping.v1.PingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service PingService.
   * <pre>
   * Connectivity check available on every Issuer and Acceptor endpoint.
   * </pre>
   */
  public static final class PingServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<PingServiceBlockingV2Stub> {
    private PingServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PingServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PingServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Checks that you can reach Mica and that your client certificate is accepted. Needs no role beyond a valid
     * certificate, so it is a good first call when setting up a connection.
     * </pre>
     */
    public io.mica.member.ping.v1.PingResponse ping(io.mica.member.ping.v1.PingRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getPingMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service PingService.
   * <pre>
   * Connectivity check available on every Issuer and Acceptor endpoint.
   * </pre>
   */
  public static final class PingServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<PingServiceBlockingStub> {
    private PingServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PingServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PingServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Checks that you can reach Mica and that your client certificate is accepted. Needs no role beyond a valid
     * certificate, so it is a good first call when setting up a connection.
     * </pre>
     */
    public io.mica.member.ping.v1.PingResponse ping(io.mica.member.ping.v1.PingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPingMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service PingService.
   * <pre>
   * Connectivity check available on every Issuer and Acceptor endpoint.
   * </pre>
   */
  public static final class PingServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<PingServiceFutureStub> {
    private PingServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PingServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PingServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Checks that you can reach Mica and that your client certificate is accepted. Needs no role beyond a valid
     * certificate, so it is a good first call when setting up a connection.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mica.member.ping.v1.PingResponse> ping(
        io.mica.member.ping.v1.PingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PING = 0;

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
        case METHODID_PING:
          serviceImpl.ping((io.mica.member.ping.v1.PingRequest) request,
              (io.grpc.stub.StreamObserver<io.mica.member.ping.v1.PingResponse>) responseObserver);
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
          getPingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mica.member.ping.v1.PingRequest,
              io.mica.member.ping.v1.PingResponse>(
                service, METHODID_PING)))
        .build();
  }

  private static abstract class PingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.mica.member.ping.v1.PingServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PingService");
    }
  }

  private static final class PingServiceFileDescriptorSupplier
      extends PingServiceBaseDescriptorSupplier {
    PingServiceFileDescriptorSupplier() {}
  }

  private static final class PingServiceMethodDescriptorSupplier
      extends PingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    PingServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (PingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PingServiceFileDescriptorSupplier())
              .addMethod(getPingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
