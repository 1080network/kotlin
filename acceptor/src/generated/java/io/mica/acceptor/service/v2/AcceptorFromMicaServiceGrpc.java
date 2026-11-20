package io.mica.acceptor.service.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * The service an Acceptor would implement for Mica to call. It has no operations yet, so there is nothing to
 * implement.
 * </pre>
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class AcceptorFromMicaServiceGrpc {

  private AcceptorFromMicaServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "mica.acceptor.service.v2.AcceptorFromMicaService";

  // Static method descriptors that strictly reflect the proto.
  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AcceptorFromMicaServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AcceptorFromMicaServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AcceptorFromMicaServiceStub>() {
        @java.lang.Override
        public AcceptorFromMicaServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AcceptorFromMicaServiceStub(channel, callOptions);
        }
      };
    return AcceptorFromMicaServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static AcceptorFromMicaServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AcceptorFromMicaServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AcceptorFromMicaServiceBlockingV2Stub>() {
        @java.lang.Override
        public AcceptorFromMicaServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AcceptorFromMicaServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return AcceptorFromMicaServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AcceptorFromMicaServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AcceptorFromMicaServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AcceptorFromMicaServiceBlockingStub>() {
        @java.lang.Override
        public AcceptorFromMicaServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AcceptorFromMicaServiceBlockingStub(channel, callOptions);
        }
      };
    return AcceptorFromMicaServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AcceptorFromMicaServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AcceptorFromMicaServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AcceptorFromMicaServiceFutureStub>() {
        @java.lang.Override
        public AcceptorFromMicaServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AcceptorFromMicaServiceFutureStub(channel, callOptions);
        }
      };
    return AcceptorFromMicaServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The service an Acceptor would implement for Mica to call. It has no operations yet, so there is nothing to
   * implement.
   * </pre>
   */
  public interface AsyncService {
  }

  /**
   * Base class for the server implementation of the service AcceptorFromMicaService.
   * <pre>
   * The service an Acceptor would implement for Mica to call. It has no operations yet, so there is nothing to
   * implement.
   * </pre>
   */
  public static abstract class AcceptorFromMicaServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AcceptorFromMicaServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AcceptorFromMicaService.
   * <pre>
   * The service an Acceptor would implement for Mica to call. It has no operations yet, so there is nothing to
   * implement.
   * </pre>
   */
  public static final class AcceptorFromMicaServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AcceptorFromMicaServiceStub> {
    private AcceptorFromMicaServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AcceptorFromMicaServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AcceptorFromMicaServiceStub(channel, callOptions);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AcceptorFromMicaService.
   * <pre>
   * The service an Acceptor would implement for Mica to call. It has no operations yet, so there is nothing to
   * implement.
   * </pre>
   */
  public static final class AcceptorFromMicaServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<AcceptorFromMicaServiceBlockingV2Stub> {
    private AcceptorFromMicaServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AcceptorFromMicaServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AcceptorFromMicaServiceBlockingV2Stub(channel, callOptions);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service AcceptorFromMicaService.
   * <pre>
   * The service an Acceptor would implement for Mica to call. It has no operations yet, so there is nothing to
   * implement.
   * </pre>
   */
  public static final class AcceptorFromMicaServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AcceptorFromMicaServiceBlockingStub> {
    private AcceptorFromMicaServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AcceptorFromMicaServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AcceptorFromMicaServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AcceptorFromMicaService.
   * <pre>
   * The service an Acceptor would implement for Mica to call. It has no operations yet, so there is nothing to
   * implement.
   * </pre>
   */
  public static final class AcceptorFromMicaServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AcceptorFromMicaServiceFutureStub> {
    private AcceptorFromMicaServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AcceptorFromMicaServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AcceptorFromMicaServiceFutureStub(channel, callOptions);
    }
  }


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
        .build();
  }

  private static abstract class AcceptorFromMicaServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AcceptorFromMicaServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.mica.acceptor.service.v2.AcceptorFromMicaServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AcceptorFromMicaService");
    }
  }

  private static final class AcceptorFromMicaServiceFileDescriptorSupplier
      extends AcceptorFromMicaServiceBaseDescriptorSupplier {
    AcceptorFromMicaServiceFileDescriptorSupplier() {}
  }

  private static final class AcceptorFromMicaServiceMethodDescriptorSupplier
      extends AcceptorFromMicaServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    AcceptorFromMicaServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (AcceptorFromMicaServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AcceptorFromMicaServiceFileDescriptorSupplier())
              .build();
        }
      }
    }
    return result;
  }
}
