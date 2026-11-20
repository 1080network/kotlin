package io.mica.acceptor.administration.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Administrative operations for an Acceptor's own Mica instance.
 * </pre>
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class AcceptorAdministrationServiceGrpc {

  private AcceptorAdministrationServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "mica.acceptor.administration.v2.AcceptorAdministrationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.mica.acceptor.administration.v2.SearchDataExtractionStatisticsRequest,
      io.mica.acceptor.administration.v2.SearchDataExtractionStatisticsResponse> getSearchDataExtractionStatisticsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchDataExtractionStatistics",
      requestType = io.mica.acceptor.administration.v2.SearchDataExtractionStatisticsRequest.class,
      responseType = io.mica.acceptor.administration.v2.SearchDataExtractionStatisticsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mica.acceptor.administration.v2.SearchDataExtractionStatisticsRequest,
      io.mica.acceptor.administration.v2.SearchDataExtractionStatisticsResponse> getSearchDataExtractionStatisticsMethod() {
    io.grpc.MethodDescriptor<io.mica.acceptor.administration.v2.SearchDataExtractionStatisticsRequest, io.mica.acceptor.administration.v2.SearchDataExtractionStatisticsResponse> getSearchDataExtractionStatisticsMethod;
    if ((getSearchDataExtractionStatisticsMethod = AcceptorAdministrationServiceGrpc.getSearchDataExtractionStatisticsMethod) == null) {
      synchronized (AcceptorAdministrationServiceGrpc.class) {
        if ((getSearchDataExtractionStatisticsMethod = AcceptorAdministrationServiceGrpc.getSearchDataExtractionStatisticsMethod) == null) {
          AcceptorAdministrationServiceGrpc.getSearchDataExtractionStatisticsMethod = getSearchDataExtractionStatisticsMethod =
              io.grpc.MethodDescriptor.<io.mica.acceptor.administration.v2.SearchDataExtractionStatisticsRequest, io.mica.acceptor.administration.v2.SearchDataExtractionStatisticsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchDataExtractionStatistics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.acceptor.administration.v2.SearchDataExtractionStatisticsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.acceptor.administration.v2.SearchDataExtractionStatisticsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AcceptorAdministrationServiceMethodDescriptorSupplier("SearchDataExtractionStatistics"))
              .build();
        }
      }
    }
    return getSearchDataExtractionStatisticsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mica.acceptor.administration.v2.GetDataExtractionStatisticsRequest,
      io.mica.acceptor.administration.v2.GetDataExtractionStatisticsResponse> getGetDataExtractionStatisticsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDataExtractionStatistics",
      requestType = io.mica.acceptor.administration.v2.GetDataExtractionStatisticsRequest.class,
      responseType = io.mica.acceptor.administration.v2.GetDataExtractionStatisticsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mica.acceptor.administration.v2.GetDataExtractionStatisticsRequest,
      io.mica.acceptor.administration.v2.GetDataExtractionStatisticsResponse> getGetDataExtractionStatisticsMethod() {
    io.grpc.MethodDescriptor<io.mica.acceptor.administration.v2.GetDataExtractionStatisticsRequest, io.mica.acceptor.administration.v2.GetDataExtractionStatisticsResponse> getGetDataExtractionStatisticsMethod;
    if ((getGetDataExtractionStatisticsMethod = AcceptorAdministrationServiceGrpc.getGetDataExtractionStatisticsMethod) == null) {
      synchronized (AcceptorAdministrationServiceGrpc.class) {
        if ((getGetDataExtractionStatisticsMethod = AcceptorAdministrationServiceGrpc.getGetDataExtractionStatisticsMethod) == null) {
          AcceptorAdministrationServiceGrpc.getGetDataExtractionStatisticsMethod = getGetDataExtractionStatisticsMethod =
              io.grpc.MethodDescriptor.<io.mica.acceptor.administration.v2.GetDataExtractionStatisticsRequest, io.mica.acceptor.administration.v2.GetDataExtractionStatisticsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDataExtractionStatistics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.acceptor.administration.v2.GetDataExtractionStatisticsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.acceptor.administration.v2.GetDataExtractionStatisticsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AcceptorAdministrationServiceMethodDescriptorSupplier("GetDataExtractionStatistics"))
              .build();
        }
      }
    }
    return getGetDataExtractionStatisticsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AcceptorAdministrationServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AcceptorAdministrationServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AcceptorAdministrationServiceStub>() {
        @java.lang.Override
        public AcceptorAdministrationServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AcceptorAdministrationServiceStub(channel, callOptions);
        }
      };
    return AcceptorAdministrationServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static AcceptorAdministrationServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AcceptorAdministrationServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AcceptorAdministrationServiceBlockingV2Stub>() {
        @java.lang.Override
        public AcceptorAdministrationServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AcceptorAdministrationServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return AcceptorAdministrationServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AcceptorAdministrationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AcceptorAdministrationServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AcceptorAdministrationServiceBlockingStub>() {
        @java.lang.Override
        public AcceptorAdministrationServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AcceptorAdministrationServiceBlockingStub(channel, callOptions);
        }
      };
    return AcceptorAdministrationServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AcceptorAdministrationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AcceptorAdministrationServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AcceptorAdministrationServiceFutureStub>() {
        @java.lang.Override
        public AcceptorAdministrationServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AcceptorAdministrationServiceFutureStub(channel, callOptions);
        }
      };
    return AcceptorAdministrationServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Administrative operations for an Acceptor's own Mica instance.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Lists the statistics of every data extractor running for your instance.
     * </pre>
     */
    default void searchDataExtractionStatistics(io.mica.acceptor.administration.v2.SearchDataExtractionStatisticsRequest request,
        io.grpc.stub.StreamObserver<io.mica.acceptor.administration.v2.SearchDataExtractionStatisticsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchDataExtractionStatisticsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the statistics of one data extractor by name. An unknown name is reported as the gRPC status NOT_FOUND.
     * </pre>
     */
    default void getDataExtractionStatistics(io.mica.acceptor.administration.v2.GetDataExtractionStatisticsRequest request,
        io.grpc.stub.StreamObserver<io.mica.acceptor.administration.v2.GetDataExtractionStatisticsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDataExtractionStatisticsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AcceptorAdministrationService.
   * <pre>
   * Administrative operations for an Acceptor's own Mica instance.
   * </pre>
   */
  public static abstract class AcceptorAdministrationServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AcceptorAdministrationServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AcceptorAdministrationService.
   * <pre>
   * Administrative operations for an Acceptor's own Mica instance.
   * </pre>
   */
  public static final class AcceptorAdministrationServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AcceptorAdministrationServiceStub> {
    private AcceptorAdministrationServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AcceptorAdministrationServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AcceptorAdministrationServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists the statistics of every data extractor running for your instance.
     * </pre>
     */
    public void searchDataExtractionStatistics(io.mica.acceptor.administration.v2.SearchDataExtractionStatisticsRequest request,
        io.grpc.stub.StreamObserver<io.mica.acceptor.administration.v2.SearchDataExtractionStatisticsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchDataExtractionStatisticsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the statistics of one data extractor by name. An unknown name is reported as the gRPC status NOT_FOUND.
     * </pre>
     */
    public void getDataExtractionStatistics(io.mica.acceptor.administration.v2.GetDataExtractionStatisticsRequest request,
        io.grpc.stub.StreamObserver<io.mica.acceptor.administration.v2.GetDataExtractionStatisticsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDataExtractionStatisticsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AcceptorAdministrationService.
   * <pre>
   * Administrative operations for an Acceptor's own Mica instance.
   * </pre>
   */
  public static final class AcceptorAdministrationServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<AcceptorAdministrationServiceBlockingV2Stub> {
    private AcceptorAdministrationServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AcceptorAdministrationServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AcceptorAdministrationServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists the statistics of every data extractor running for your instance.
     * </pre>
     */
    public io.mica.acceptor.administration.v2.SearchDataExtractionStatisticsResponse searchDataExtractionStatistics(io.mica.acceptor.administration.v2.SearchDataExtractionStatisticsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getSearchDataExtractionStatisticsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the statistics of one data extractor by name. An unknown name is reported as the gRPC status NOT_FOUND.
     * </pre>
     */
    public io.mica.acceptor.administration.v2.GetDataExtractionStatisticsResponse getDataExtractionStatistics(io.mica.acceptor.administration.v2.GetDataExtractionStatisticsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetDataExtractionStatisticsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service AcceptorAdministrationService.
   * <pre>
   * Administrative operations for an Acceptor's own Mica instance.
   * </pre>
   */
  public static final class AcceptorAdministrationServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AcceptorAdministrationServiceBlockingStub> {
    private AcceptorAdministrationServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AcceptorAdministrationServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AcceptorAdministrationServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists the statistics of every data extractor running for your instance.
     * </pre>
     */
    public io.mica.acceptor.administration.v2.SearchDataExtractionStatisticsResponse searchDataExtractionStatistics(io.mica.acceptor.administration.v2.SearchDataExtractionStatisticsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchDataExtractionStatisticsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the statistics of one data extractor by name. An unknown name is reported as the gRPC status NOT_FOUND.
     * </pre>
     */
    public io.mica.acceptor.administration.v2.GetDataExtractionStatisticsResponse getDataExtractionStatistics(io.mica.acceptor.administration.v2.GetDataExtractionStatisticsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDataExtractionStatisticsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AcceptorAdministrationService.
   * <pre>
   * Administrative operations for an Acceptor's own Mica instance.
   * </pre>
   */
  public static final class AcceptorAdministrationServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AcceptorAdministrationServiceFutureStub> {
    private AcceptorAdministrationServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AcceptorAdministrationServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AcceptorAdministrationServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists the statistics of every data extractor running for your instance.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mica.acceptor.administration.v2.SearchDataExtractionStatisticsResponse> searchDataExtractionStatistics(
        io.mica.acceptor.administration.v2.SearchDataExtractionStatisticsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchDataExtractionStatisticsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the statistics of one data extractor by name. An unknown name is reported as the gRPC status NOT_FOUND.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mica.acceptor.administration.v2.GetDataExtractionStatisticsResponse> getDataExtractionStatistics(
        io.mica.acceptor.administration.v2.GetDataExtractionStatisticsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDataExtractionStatisticsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEARCH_DATA_EXTRACTION_STATISTICS = 0;
  private static final int METHODID_GET_DATA_EXTRACTION_STATISTICS = 1;

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
        case METHODID_SEARCH_DATA_EXTRACTION_STATISTICS:
          serviceImpl.searchDataExtractionStatistics((io.mica.acceptor.administration.v2.SearchDataExtractionStatisticsRequest) request,
              (io.grpc.stub.StreamObserver<io.mica.acceptor.administration.v2.SearchDataExtractionStatisticsResponse>) responseObserver);
          break;
        case METHODID_GET_DATA_EXTRACTION_STATISTICS:
          serviceImpl.getDataExtractionStatistics((io.mica.acceptor.administration.v2.GetDataExtractionStatisticsRequest) request,
              (io.grpc.stub.StreamObserver<io.mica.acceptor.administration.v2.GetDataExtractionStatisticsResponse>) responseObserver);
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
          getSearchDataExtractionStatisticsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mica.acceptor.administration.v2.SearchDataExtractionStatisticsRequest,
              io.mica.acceptor.administration.v2.SearchDataExtractionStatisticsResponse>(
                service, METHODID_SEARCH_DATA_EXTRACTION_STATISTICS)))
        .addMethod(
          getGetDataExtractionStatisticsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mica.acceptor.administration.v2.GetDataExtractionStatisticsRequest,
              io.mica.acceptor.administration.v2.GetDataExtractionStatisticsResponse>(
                service, METHODID_GET_DATA_EXTRACTION_STATISTICS)))
        .build();
  }

  private static abstract class AcceptorAdministrationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AcceptorAdministrationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.mica.acceptor.administration.v2.AdminServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AcceptorAdministrationService");
    }
  }

  private static final class AcceptorAdministrationServiceFileDescriptorSupplier
      extends AcceptorAdministrationServiceBaseDescriptorSupplier {
    AcceptorAdministrationServiceFileDescriptorSupplier() {}
  }

  private static final class AcceptorAdministrationServiceMethodDescriptorSupplier
      extends AcceptorAdministrationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    AcceptorAdministrationServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (AcceptorAdministrationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AcceptorAdministrationServiceFileDescriptorSupplier())
              .addMethod(getSearchDataExtractionStatisticsMethod())
              .addMethod(getGetDataExtractionStatisticsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
