package io.mica.acceptor.service.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * The service an Acceptor calls to move value using UUEKs provisioned from a link on AcceptorToMicaLinkService. It
 * replaces the value operations of the v1 PartnerToMicaService.
 * Unlike the v1 service, failures are reported as gRPC status codes rather than a status enum in the response. A
 * request that breaks a validation rule on its fields is rejected with INVALID_ARGUMENT before it is processed.
 * </pre>
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class AcceptorToMicaValueServiceGrpc {

  private AcceptorToMicaValueServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "mica.acceptor.service.v2.AcceptorToMicaValueService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.mica.acceptor.service.v2.ObtainValueRequest,
      io.mica.acceptor.service.v2.ObtainValueResponse> getObtainValueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ObtainValue",
      requestType = io.mica.acceptor.service.v2.ObtainValueRequest.class,
      responseType = io.mica.acceptor.service.v2.ObtainValueResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mica.acceptor.service.v2.ObtainValueRequest,
      io.mica.acceptor.service.v2.ObtainValueResponse> getObtainValueMethod() {
    io.grpc.MethodDescriptor<io.mica.acceptor.service.v2.ObtainValueRequest, io.mica.acceptor.service.v2.ObtainValueResponse> getObtainValueMethod;
    if ((getObtainValueMethod = AcceptorToMicaValueServiceGrpc.getObtainValueMethod) == null) {
      synchronized (AcceptorToMicaValueServiceGrpc.class) {
        if ((getObtainValueMethod = AcceptorToMicaValueServiceGrpc.getObtainValueMethod) == null) {
          AcceptorToMicaValueServiceGrpc.getObtainValueMethod = getObtainValueMethod =
              io.grpc.MethodDescriptor.<io.mica.acceptor.service.v2.ObtainValueRequest, io.mica.acceptor.service.v2.ObtainValueResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ObtainValue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.acceptor.service.v2.ObtainValueRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.acceptor.service.v2.ObtainValueResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AcceptorToMicaValueServiceMethodDescriptorSupplier("ObtainValue"))
              .build();
        }
      }
    }
    return getObtainValueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mica.acceptor.service.v2.ReverseObtainValueRequest,
      io.mica.acceptor.service.v2.ReverseObtainValueResponse> getReverseObtainValueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReverseObtainValue",
      requestType = io.mica.acceptor.service.v2.ReverseObtainValueRequest.class,
      responseType = io.mica.acceptor.service.v2.ReverseObtainValueResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mica.acceptor.service.v2.ReverseObtainValueRequest,
      io.mica.acceptor.service.v2.ReverseObtainValueResponse> getReverseObtainValueMethod() {
    io.grpc.MethodDescriptor<io.mica.acceptor.service.v2.ReverseObtainValueRequest, io.mica.acceptor.service.v2.ReverseObtainValueResponse> getReverseObtainValueMethod;
    if ((getReverseObtainValueMethod = AcceptorToMicaValueServiceGrpc.getReverseObtainValueMethod) == null) {
      synchronized (AcceptorToMicaValueServiceGrpc.class) {
        if ((getReverseObtainValueMethod = AcceptorToMicaValueServiceGrpc.getReverseObtainValueMethod) == null) {
          AcceptorToMicaValueServiceGrpc.getReverseObtainValueMethod = getReverseObtainValueMethod =
              io.grpc.MethodDescriptor.<io.mica.acceptor.service.v2.ReverseObtainValueRequest, io.mica.acceptor.service.v2.ReverseObtainValueResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReverseObtainValue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.acceptor.service.v2.ReverseObtainValueRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.acceptor.service.v2.ReverseObtainValueResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AcceptorToMicaValueServiceMethodDescriptorSupplier("ReverseObtainValue"))
              .build();
        }
      }
    }
    return getReverseObtainValueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mica.acceptor.service.v2.RefundValueRequest,
      io.mica.acceptor.service.v2.RefundValueResponse> getRefundValueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RefundValue",
      requestType = io.mica.acceptor.service.v2.RefundValueRequest.class,
      responseType = io.mica.acceptor.service.v2.RefundValueResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mica.acceptor.service.v2.RefundValueRequest,
      io.mica.acceptor.service.v2.RefundValueResponse> getRefundValueMethod() {
    io.grpc.MethodDescriptor<io.mica.acceptor.service.v2.RefundValueRequest, io.mica.acceptor.service.v2.RefundValueResponse> getRefundValueMethod;
    if ((getRefundValueMethod = AcceptorToMicaValueServiceGrpc.getRefundValueMethod) == null) {
      synchronized (AcceptorToMicaValueServiceGrpc.class) {
        if ((getRefundValueMethod = AcceptorToMicaValueServiceGrpc.getRefundValueMethod) == null) {
          AcceptorToMicaValueServiceGrpc.getRefundValueMethod = getRefundValueMethod =
              io.grpc.MethodDescriptor.<io.mica.acceptor.service.v2.RefundValueRequest, io.mica.acceptor.service.v2.RefundValueResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RefundValue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.acceptor.service.v2.RefundValueRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.acceptor.service.v2.RefundValueResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AcceptorToMicaValueServiceMethodDescriptorSupplier("RefundValue"))
              .build();
        }
      }
    }
    return getRefundValueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mica.acceptor.service.v2.PayoutValueRequest,
      io.mica.acceptor.service.v2.PayoutValueResponse> getPayoutValueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PayoutValue",
      requestType = io.mica.acceptor.service.v2.PayoutValueRequest.class,
      responseType = io.mica.acceptor.service.v2.PayoutValueResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mica.acceptor.service.v2.PayoutValueRequest,
      io.mica.acceptor.service.v2.PayoutValueResponse> getPayoutValueMethod() {
    io.grpc.MethodDescriptor<io.mica.acceptor.service.v2.PayoutValueRequest, io.mica.acceptor.service.v2.PayoutValueResponse> getPayoutValueMethod;
    if ((getPayoutValueMethod = AcceptorToMicaValueServiceGrpc.getPayoutValueMethod) == null) {
      synchronized (AcceptorToMicaValueServiceGrpc.class) {
        if ((getPayoutValueMethod = AcceptorToMicaValueServiceGrpc.getPayoutValueMethod) == null) {
          AcceptorToMicaValueServiceGrpc.getPayoutValueMethod = getPayoutValueMethod =
              io.grpc.MethodDescriptor.<io.mica.acceptor.service.v2.PayoutValueRequest, io.mica.acceptor.service.v2.PayoutValueResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PayoutValue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.acceptor.service.v2.PayoutValueRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.acceptor.service.v2.PayoutValueResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AcceptorToMicaValueServiceMethodDescriptorSupplier("PayoutValue"))
              .build();
        }
      }
    }
    return getPayoutValueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mica.acceptor.service.v2.HoldValueRequest,
      io.mica.acceptor.service.v2.HoldValueResponse> getHoldValueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HoldValue",
      requestType = io.mica.acceptor.service.v2.HoldValueRequest.class,
      responseType = io.mica.acceptor.service.v2.HoldValueResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mica.acceptor.service.v2.HoldValueRequest,
      io.mica.acceptor.service.v2.HoldValueResponse> getHoldValueMethod() {
    io.grpc.MethodDescriptor<io.mica.acceptor.service.v2.HoldValueRequest, io.mica.acceptor.service.v2.HoldValueResponse> getHoldValueMethod;
    if ((getHoldValueMethod = AcceptorToMicaValueServiceGrpc.getHoldValueMethod) == null) {
      synchronized (AcceptorToMicaValueServiceGrpc.class) {
        if ((getHoldValueMethod = AcceptorToMicaValueServiceGrpc.getHoldValueMethod) == null) {
          AcceptorToMicaValueServiceGrpc.getHoldValueMethod = getHoldValueMethod =
              io.grpc.MethodDescriptor.<io.mica.acceptor.service.v2.HoldValueRequest, io.mica.acceptor.service.v2.HoldValueResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HoldValue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.acceptor.service.v2.HoldValueRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.acceptor.service.v2.HoldValueResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AcceptorToMicaValueServiceMethodDescriptorSupplier("HoldValue"))
              .build();
        }
      }
    }
    return getHoldValueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mica.acceptor.service.v2.ReleaseHoldValueRequest,
      io.mica.acceptor.service.v2.ReleaseHoldValueResponse> getReleaseHoldValueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReleaseHoldValue",
      requestType = io.mica.acceptor.service.v2.ReleaseHoldValueRequest.class,
      responseType = io.mica.acceptor.service.v2.ReleaseHoldValueResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mica.acceptor.service.v2.ReleaseHoldValueRequest,
      io.mica.acceptor.service.v2.ReleaseHoldValueResponse> getReleaseHoldValueMethod() {
    io.grpc.MethodDescriptor<io.mica.acceptor.service.v2.ReleaseHoldValueRequest, io.mica.acceptor.service.v2.ReleaseHoldValueResponse> getReleaseHoldValueMethod;
    if ((getReleaseHoldValueMethod = AcceptorToMicaValueServiceGrpc.getReleaseHoldValueMethod) == null) {
      synchronized (AcceptorToMicaValueServiceGrpc.class) {
        if ((getReleaseHoldValueMethod = AcceptorToMicaValueServiceGrpc.getReleaseHoldValueMethod) == null) {
          AcceptorToMicaValueServiceGrpc.getReleaseHoldValueMethod = getReleaseHoldValueMethod =
              io.grpc.MethodDescriptor.<io.mica.acceptor.service.v2.ReleaseHoldValueRequest, io.mica.acceptor.service.v2.ReleaseHoldValueResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReleaseHoldValue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.acceptor.service.v2.ReleaseHoldValueRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.acceptor.service.v2.ReleaseHoldValueResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AcceptorToMicaValueServiceMethodDescriptorSupplier("ReleaseHoldValue"))
              .build();
        }
      }
    }
    return getReleaseHoldValueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mica.acceptor.service.v2.ObtainHoldValueRequest,
      io.mica.acceptor.service.v2.ObtainHoldValueResponse> getObtainHoldValueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ObtainHoldValue",
      requestType = io.mica.acceptor.service.v2.ObtainHoldValueRequest.class,
      responseType = io.mica.acceptor.service.v2.ObtainHoldValueResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mica.acceptor.service.v2.ObtainHoldValueRequest,
      io.mica.acceptor.service.v2.ObtainHoldValueResponse> getObtainHoldValueMethod() {
    io.grpc.MethodDescriptor<io.mica.acceptor.service.v2.ObtainHoldValueRequest, io.mica.acceptor.service.v2.ObtainHoldValueResponse> getObtainHoldValueMethod;
    if ((getObtainHoldValueMethod = AcceptorToMicaValueServiceGrpc.getObtainHoldValueMethod) == null) {
      synchronized (AcceptorToMicaValueServiceGrpc.class) {
        if ((getObtainHoldValueMethod = AcceptorToMicaValueServiceGrpc.getObtainHoldValueMethod) == null) {
          AcceptorToMicaValueServiceGrpc.getObtainHoldValueMethod = getObtainHoldValueMethod =
              io.grpc.MethodDescriptor.<io.mica.acceptor.service.v2.ObtainHoldValueRequest, io.mica.acceptor.service.v2.ObtainHoldValueResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ObtainHoldValue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.acceptor.service.v2.ObtainHoldValueRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.acceptor.service.v2.ObtainHoldValueResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AcceptorToMicaValueServiceMethodDescriptorSupplier("ObtainHoldValue"))
              .build();
        }
      }
    }
    return getObtainHoldValueMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AcceptorToMicaValueServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AcceptorToMicaValueServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AcceptorToMicaValueServiceStub>() {
        @java.lang.Override
        public AcceptorToMicaValueServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AcceptorToMicaValueServiceStub(channel, callOptions);
        }
      };
    return AcceptorToMicaValueServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static AcceptorToMicaValueServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AcceptorToMicaValueServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AcceptorToMicaValueServiceBlockingV2Stub>() {
        @java.lang.Override
        public AcceptorToMicaValueServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AcceptorToMicaValueServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return AcceptorToMicaValueServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AcceptorToMicaValueServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AcceptorToMicaValueServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AcceptorToMicaValueServiceBlockingStub>() {
        @java.lang.Override
        public AcceptorToMicaValueServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AcceptorToMicaValueServiceBlockingStub(channel, callOptions);
        }
      };
    return AcceptorToMicaValueServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AcceptorToMicaValueServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AcceptorToMicaValueServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AcceptorToMicaValueServiceFutureStub>() {
        @java.lang.Override
        public AcceptorToMicaValueServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AcceptorToMicaValueServiceFutureStub(channel, callOptions);
        }
      };
    return AcceptorToMicaValueServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The service an Acceptor calls to move value using UUEKs provisioned from a link on AcceptorToMicaLinkService. It
   * replaces the value operations of the v1 PartnerToMicaService.
   * Unlike the v1 service, failures are reported as gRPC status codes rather than a status enum in the response. A
   * request that breaks a validation rule on its fields is rejected with INVALID_ARGUMENT before it is processed.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Obtains value from the user behind a UUEK to pay for goods or services. Mica may split the payment across several
     * of the user's tenders; the response reports the combined outcome.
     * A business outcome is reported in the response's result: approved (possibly for part of the amount), declined, or
     * error. Once Mica has recorded a transaction, the outcome is normally reported there rather than as a status code.
     * Failures before a transaction is recorded are reported as gRPC status codes:
     *   INVALID_ARGUMENT - the request failed validation, or the UUEK is missing, malformed or cannot be used to pay
     *   INTERNAL         - the UUEK could not be exchanged or the payment could not be started. Other problems with
     *                      the request found during processing, such as an unknown organization or an
     *                      APPROVAL_TYPE_UNSPECIFIED approval_type, currently also surface as INTERNAL.
     * </pre>
     */
    default void obtainValue(io.mica.acceptor.service.v2.ObtainValueRequest request,
        io.grpc.stub.StreamObserver<io.mica.acceptor.service.v2.ObtainValueResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getObtainValueMethod(), responseObserver);
    }

    /**
     * <pre>
     * Intended to reverse an earlier ObtainValue, returning the value it obtained to the user.
     * </pre>
     */
    default void reverseObtainValue(io.mica.acceptor.service.v2.ReverseObtainValueRequest request,
        io.grpc.stub.StreamObserver<io.mica.acceptor.service.v2.ReverseObtainValueResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReverseObtainValueMethod(), responseObserver);
    }

    /**
     * <pre>
     * Intended to refund the user, in whole or in part, for an earlier transaction.
     * </pre>
     */
    default void refundValue(io.mica.acceptor.service.v2.RefundValueRequest request,
        io.grpc.stub.StreamObserver<io.mica.acceptor.service.v2.RefundValueResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRefundValueMethod(), responseObserver);
    }

    /**
     * <pre>
     * Intended to send value to the user behind a UUEK without referring to an earlier transaction.
     * </pre>
     */
    default void payoutValue(io.mica.acceptor.service.v2.PayoutValueRequest request,
        io.grpc.stub.StreamObserver<io.mica.acceptor.service.v2.PayoutValueResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPayoutValueMethod(), responseObserver);
    }

    /**
     * <pre>
     * Intended to place a hold on value from the user behind a UUEK, to be obtained later with ObtainHoldValue or
     * released with ReleaseHoldValue.
     * </pre>
     */
    default void holdValue(io.mica.acceptor.service.v2.HoldValueRequest request,
        io.grpc.stub.StreamObserver<io.mica.acceptor.service.v2.HoldValueResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHoldValueMethod(), responseObserver);
    }

    /**
     * <pre>
     * Intended to release value held by an earlier HoldValue back to the user.
     * </pre>
     */
    default void releaseHoldValue(io.mica.acceptor.service.v2.ReleaseHoldValueRequest request,
        io.grpc.stub.StreamObserver<io.mica.acceptor.service.v2.ReleaseHoldValueResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReleaseHoldValueMethod(), responseObserver);
    }

    /**
     * <pre>
     * Intended to obtain value held by an earlier HoldValue.
     * </pre>
     */
    default void obtainHoldValue(io.mica.acceptor.service.v2.ObtainHoldValueRequest request,
        io.grpc.stub.StreamObserver<io.mica.acceptor.service.v2.ObtainHoldValueResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getObtainHoldValueMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AcceptorToMicaValueService.
   * <pre>
   * The service an Acceptor calls to move value using UUEKs provisioned from a link on AcceptorToMicaLinkService. It
   * replaces the value operations of the v1 PartnerToMicaService.
   * Unlike the v1 service, failures are reported as gRPC status codes rather than a status enum in the response. A
   * request that breaks a validation rule on its fields is rejected with INVALID_ARGUMENT before it is processed.
   * </pre>
   */
  public static abstract class AcceptorToMicaValueServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AcceptorToMicaValueServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AcceptorToMicaValueService.
   * <pre>
   * The service an Acceptor calls to move value using UUEKs provisioned from a link on AcceptorToMicaLinkService. It
   * replaces the value operations of the v1 PartnerToMicaService.
   * Unlike the v1 service, failures are reported as gRPC status codes rather than a status enum in the response. A
   * request that breaks a validation rule on its fields is rejected with INVALID_ARGUMENT before it is processed.
   * </pre>
   */
  public static final class AcceptorToMicaValueServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AcceptorToMicaValueServiceStub> {
    private AcceptorToMicaValueServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AcceptorToMicaValueServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AcceptorToMicaValueServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Obtains value from the user behind a UUEK to pay for goods or services. Mica may split the payment across several
     * of the user's tenders; the response reports the combined outcome.
     * A business outcome is reported in the response's result: approved (possibly for part of the amount), declined, or
     * error. Once Mica has recorded a transaction, the outcome is normally reported there rather than as a status code.
     * Failures before a transaction is recorded are reported as gRPC status codes:
     *   INVALID_ARGUMENT - the request failed validation, or the UUEK is missing, malformed or cannot be used to pay
     *   INTERNAL         - the UUEK could not be exchanged or the payment could not be started. Other problems with
     *                      the request found during processing, such as an unknown organization or an
     *                      APPROVAL_TYPE_UNSPECIFIED approval_type, currently also surface as INTERNAL.
     * </pre>
     */
    public void obtainValue(io.mica.acceptor.service.v2.ObtainValueRequest request,
        io.grpc.stub.StreamObserver<io.mica.acceptor.service.v2.ObtainValueResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getObtainValueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Intended to reverse an earlier ObtainValue, returning the value it obtained to the user.
     * </pre>
     */
    public void reverseObtainValue(io.mica.acceptor.service.v2.ReverseObtainValueRequest request,
        io.grpc.stub.StreamObserver<io.mica.acceptor.service.v2.ReverseObtainValueResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReverseObtainValueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Intended to refund the user, in whole or in part, for an earlier transaction.
     * </pre>
     */
    public void refundValue(io.mica.acceptor.service.v2.RefundValueRequest request,
        io.grpc.stub.StreamObserver<io.mica.acceptor.service.v2.RefundValueResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRefundValueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Intended to send value to the user behind a UUEK without referring to an earlier transaction.
     * </pre>
     */
    public void payoutValue(io.mica.acceptor.service.v2.PayoutValueRequest request,
        io.grpc.stub.StreamObserver<io.mica.acceptor.service.v2.PayoutValueResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPayoutValueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Intended to place a hold on value from the user behind a UUEK, to be obtained later with ObtainHoldValue or
     * released with ReleaseHoldValue.
     * </pre>
     */
    public void holdValue(io.mica.acceptor.service.v2.HoldValueRequest request,
        io.grpc.stub.StreamObserver<io.mica.acceptor.service.v2.HoldValueResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHoldValueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Intended to release value held by an earlier HoldValue back to the user.
     * </pre>
     */
    public void releaseHoldValue(io.mica.acceptor.service.v2.ReleaseHoldValueRequest request,
        io.grpc.stub.StreamObserver<io.mica.acceptor.service.v2.ReleaseHoldValueResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReleaseHoldValueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Intended to obtain value held by an earlier HoldValue.
     * </pre>
     */
    public void obtainHoldValue(io.mica.acceptor.service.v2.ObtainHoldValueRequest request,
        io.grpc.stub.StreamObserver<io.mica.acceptor.service.v2.ObtainHoldValueResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getObtainHoldValueMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AcceptorToMicaValueService.
   * <pre>
   * The service an Acceptor calls to move value using UUEKs provisioned from a link on AcceptorToMicaLinkService. It
   * replaces the value operations of the v1 PartnerToMicaService.
   * Unlike the v1 service, failures are reported as gRPC status codes rather than a status enum in the response. A
   * request that breaks a validation rule on its fields is rejected with INVALID_ARGUMENT before it is processed.
   * </pre>
   */
  public static final class AcceptorToMicaValueServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<AcceptorToMicaValueServiceBlockingV2Stub> {
    private AcceptorToMicaValueServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AcceptorToMicaValueServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AcceptorToMicaValueServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Obtains value from the user behind a UUEK to pay for goods or services. Mica may split the payment across several
     * of the user's tenders; the response reports the combined outcome.
     * A business outcome is reported in the response's result: approved (possibly for part of the amount), declined, or
     * error. Once Mica has recorded a transaction, the outcome is normally reported there rather than as a status code.
     * Failures before a transaction is recorded are reported as gRPC status codes:
     *   INVALID_ARGUMENT - the request failed validation, or the UUEK is missing, malformed or cannot be used to pay
     *   INTERNAL         - the UUEK could not be exchanged or the payment could not be started. Other problems with
     *                      the request found during processing, such as an unknown organization or an
     *                      APPROVAL_TYPE_UNSPECIFIED approval_type, currently also surface as INTERNAL.
     * </pre>
     */
    public io.mica.acceptor.service.v2.ObtainValueResponse obtainValue(io.mica.acceptor.service.v2.ObtainValueRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getObtainValueMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Intended to reverse an earlier ObtainValue, returning the value it obtained to the user.
     * </pre>
     */
    public io.mica.acceptor.service.v2.ReverseObtainValueResponse reverseObtainValue(io.mica.acceptor.service.v2.ReverseObtainValueRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getReverseObtainValueMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Intended to refund the user, in whole or in part, for an earlier transaction.
     * </pre>
     */
    public io.mica.acceptor.service.v2.RefundValueResponse refundValue(io.mica.acceptor.service.v2.RefundValueRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getRefundValueMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Intended to send value to the user behind a UUEK without referring to an earlier transaction.
     * </pre>
     */
    public io.mica.acceptor.service.v2.PayoutValueResponse payoutValue(io.mica.acceptor.service.v2.PayoutValueRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getPayoutValueMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Intended to place a hold on value from the user behind a UUEK, to be obtained later with ObtainHoldValue or
     * released with ReleaseHoldValue.
     * </pre>
     */
    public io.mica.acceptor.service.v2.HoldValueResponse holdValue(io.mica.acceptor.service.v2.HoldValueRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getHoldValueMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Intended to release value held by an earlier HoldValue back to the user.
     * </pre>
     */
    public io.mica.acceptor.service.v2.ReleaseHoldValueResponse releaseHoldValue(io.mica.acceptor.service.v2.ReleaseHoldValueRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getReleaseHoldValueMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Intended to obtain value held by an earlier HoldValue.
     * </pre>
     */
    public io.mica.acceptor.service.v2.ObtainHoldValueResponse obtainHoldValue(io.mica.acceptor.service.v2.ObtainHoldValueRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getObtainHoldValueMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service AcceptorToMicaValueService.
   * <pre>
   * The service an Acceptor calls to move value using UUEKs provisioned from a link on AcceptorToMicaLinkService. It
   * replaces the value operations of the v1 PartnerToMicaService.
   * Unlike the v1 service, failures are reported as gRPC status codes rather than a status enum in the response. A
   * request that breaks a validation rule on its fields is rejected with INVALID_ARGUMENT before it is processed.
   * </pre>
   */
  public static final class AcceptorToMicaValueServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AcceptorToMicaValueServiceBlockingStub> {
    private AcceptorToMicaValueServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AcceptorToMicaValueServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AcceptorToMicaValueServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Obtains value from the user behind a UUEK to pay for goods or services. Mica may split the payment across several
     * of the user's tenders; the response reports the combined outcome.
     * A business outcome is reported in the response's result: approved (possibly for part of the amount), declined, or
     * error. Once Mica has recorded a transaction, the outcome is normally reported there rather than as a status code.
     * Failures before a transaction is recorded are reported as gRPC status codes:
     *   INVALID_ARGUMENT - the request failed validation, or the UUEK is missing, malformed or cannot be used to pay
     *   INTERNAL         - the UUEK could not be exchanged or the payment could not be started. Other problems with
     *                      the request found during processing, such as an unknown organization or an
     *                      APPROVAL_TYPE_UNSPECIFIED approval_type, currently also surface as INTERNAL.
     * </pre>
     */
    public io.mica.acceptor.service.v2.ObtainValueResponse obtainValue(io.mica.acceptor.service.v2.ObtainValueRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getObtainValueMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Intended to reverse an earlier ObtainValue, returning the value it obtained to the user.
     * </pre>
     */
    public io.mica.acceptor.service.v2.ReverseObtainValueResponse reverseObtainValue(io.mica.acceptor.service.v2.ReverseObtainValueRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReverseObtainValueMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Intended to refund the user, in whole or in part, for an earlier transaction.
     * </pre>
     */
    public io.mica.acceptor.service.v2.RefundValueResponse refundValue(io.mica.acceptor.service.v2.RefundValueRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRefundValueMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Intended to send value to the user behind a UUEK without referring to an earlier transaction.
     * </pre>
     */
    public io.mica.acceptor.service.v2.PayoutValueResponse payoutValue(io.mica.acceptor.service.v2.PayoutValueRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPayoutValueMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Intended to place a hold on value from the user behind a UUEK, to be obtained later with ObtainHoldValue or
     * released with ReleaseHoldValue.
     * </pre>
     */
    public io.mica.acceptor.service.v2.HoldValueResponse holdValue(io.mica.acceptor.service.v2.HoldValueRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHoldValueMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Intended to release value held by an earlier HoldValue back to the user.
     * </pre>
     */
    public io.mica.acceptor.service.v2.ReleaseHoldValueResponse releaseHoldValue(io.mica.acceptor.service.v2.ReleaseHoldValueRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReleaseHoldValueMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Intended to obtain value held by an earlier HoldValue.
     * </pre>
     */
    public io.mica.acceptor.service.v2.ObtainHoldValueResponse obtainHoldValue(io.mica.acceptor.service.v2.ObtainHoldValueRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getObtainHoldValueMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AcceptorToMicaValueService.
   * <pre>
   * The service an Acceptor calls to move value using UUEKs provisioned from a link on AcceptorToMicaLinkService. It
   * replaces the value operations of the v1 PartnerToMicaService.
   * Unlike the v1 service, failures are reported as gRPC status codes rather than a status enum in the response. A
   * request that breaks a validation rule on its fields is rejected with INVALID_ARGUMENT before it is processed.
   * </pre>
   */
  public static final class AcceptorToMicaValueServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AcceptorToMicaValueServiceFutureStub> {
    private AcceptorToMicaValueServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AcceptorToMicaValueServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AcceptorToMicaValueServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Obtains value from the user behind a UUEK to pay for goods or services. Mica may split the payment across several
     * of the user's tenders; the response reports the combined outcome.
     * A business outcome is reported in the response's result: approved (possibly for part of the amount), declined, or
     * error. Once Mica has recorded a transaction, the outcome is normally reported there rather than as a status code.
     * Failures before a transaction is recorded are reported as gRPC status codes:
     *   INVALID_ARGUMENT - the request failed validation, or the UUEK is missing, malformed or cannot be used to pay
     *   INTERNAL         - the UUEK could not be exchanged or the payment could not be started. Other problems with
     *                      the request found during processing, such as an unknown organization or an
     *                      APPROVAL_TYPE_UNSPECIFIED approval_type, currently also surface as INTERNAL.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mica.acceptor.service.v2.ObtainValueResponse> obtainValue(
        io.mica.acceptor.service.v2.ObtainValueRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getObtainValueMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Intended to reverse an earlier ObtainValue, returning the value it obtained to the user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mica.acceptor.service.v2.ReverseObtainValueResponse> reverseObtainValue(
        io.mica.acceptor.service.v2.ReverseObtainValueRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReverseObtainValueMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Intended to refund the user, in whole or in part, for an earlier transaction.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mica.acceptor.service.v2.RefundValueResponse> refundValue(
        io.mica.acceptor.service.v2.RefundValueRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRefundValueMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Intended to send value to the user behind a UUEK without referring to an earlier transaction.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mica.acceptor.service.v2.PayoutValueResponse> payoutValue(
        io.mica.acceptor.service.v2.PayoutValueRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPayoutValueMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Intended to place a hold on value from the user behind a UUEK, to be obtained later with ObtainHoldValue or
     * released with ReleaseHoldValue.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mica.acceptor.service.v2.HoldValueResponse> holdValue(
        io.mica.acceptor.service.v2.HoldValueRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHoldValueMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Intended to release value held by an earlier HoldValue back to the user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mica.acceptor.service.v2.ReleaseHoldValueResponse> releaseHoldValue(
        io.mica.acceptor.service.v2.ReleaseHoldValueRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReleaseHoldValueMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Intended to obtain value held by an earlier HoldValue.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mica.acceptor.service.v2.ObtainHoldValueResponse> obtainHoldValue(
        io.mica.acceptor.service.v2.ObtainHoldValueRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getObtainHoldValueMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_OBTAIN_VALUE = 0;
  private static final int METHODID_REVERSE_OBTAIN_VALUE = 1;
  private static final int METHODID_REFUND_VALUE = 2;
  private static final int METHODID_PAYOUT_VALUE = 3;
  private static final int METHODID_HOLD_VALUE = 4;
  private static final int METHODID_RELEASE_HOLD_VALUE = 5;
  private static final int METHODID_OBTAIN_HOLD_VALUE = 6;

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
        case METHODID_OBTAIN_VALUE:
          serviceImpl.obtainValue((io.mica.acceptor.service.v2.ObtainValueRequest) request,
              (io.grpc.stub.StreamObserver<io.mica.acceptor.service.v2.ObtainValueResponse>) responseObserver);
          break;
        case METHODID_REVERSE_OBTAIN_VALUE:
          serviceImpl.reverseObtainValue((io.mica.acceptor.service.v2.ReverseObtainValueRequest) request,
              (io.grpc.stub.StreamObserver<io.mica.acceptor.service.v2.ReverseObtainValueResponse>) responseObserver);
          break;
        case METHODID_REFUND_VALUE:
          serviceImpl.refundValue((io.mica.acceptor.service.v2.RefundValueRequest) request,
              (io.grpc.stub.StreamObserver<io.mica.acceptor.service.v2.RefundValueResponse>) responseObserver);
          break;
        case METHODID_PAYOUT_VALUE:
          serviceImpl.payoutValue((io.mica.acceptor.service.v2.PayoutValueRequest) request,
              (io.grpc.stub.StreamObserver<io.mica.acceptor.service.v2.PayoutValueResponse>) responseObserver);
          break;
        case METHODID_HOLD_VALUE:
          serviceImpl.holdValue((io.mica.acceptor.service.v2.HoldValueRequest) request,
              (io.grpc.stub.StreamObserver<io.mica.acceptor.service.v2.HoldValueResponse>) responseObserver);
          break;
        case METHODID_RELEASE_HOLD_VALUE:
          serviceImpl.releaseHoldValue((io.mica.acceptor.service.v2.ReleaseHoldValueRequest) request,
              (io.grpc.stub.StreamObserver<io.mica.acceptor.service.v2.ReleaseHoldValueResponse>) responseObserver);
          break;
        case METHODID_OBTAIN_HOLD_VALUE:
          serviceImpl.obtainHoldValue((io.mica.acceptor.service.v2.ObtainHoldValueRequest) request,
              (io.grpc.stub.StreamObserver<io.mica.acceptor.service.v2.ObtainHoldValueResponse>) responseObserver);
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
          getObtainValueMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mica.acceptor.service.v2.ObtainValueRequest,
              io.mica.acceptor.service.v2.ObtainValueResponse>(
                service, METHODID_OBTAIN_VALUE)))
        .addMethod(
          getReverseObtainValueMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mica.acceptor.service.v2.ReverseObtainValueRequest,
              io.mica.acceptor.service.v2.ReverseObtainValueResponse>(
                service, METHODID_REVERSE_OBTAIN_VALUE)))
        .addMethod(
          getRefundValueMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mica.acceptor.service.v2.RefundValueRequest,
              io.mica.acceptor.service.v2.RefundValueResponse>(
                service, METHODID_REFUND_VALUE)))
        .addMethod(
          getPayoutValueMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mica.acceptor.service.v2.PayoutValueRequest,
              io.mica.acceptor.service.v2.PayoutValueResponse>(
                service, METHODID_PAYOUT_VALUE)))
        .addMethod(
          getHoldValueMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mica.acceptor.service.v2.HoldValueRequest,
              io.mica.acceptor.service.v2.HoldValueResponse>(
                service, METHODID_HOLD_VALUE)))
        .addMethod(
          getReleaseHoldValueMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mica.acceptor.service.v2.ReleaseHoldValueRequest,
              io.mica.acceptor.service.v2.ReleaseHoldValueResponse>(
                service, METHODID_RELEASE_HOLD_VALUE)))
        .addMethod(
          getObtainHoldValueMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mica.acceptor.service.v2.ObtainHoldValueRequest,
              io.mica.acceptor.service.v2.ObtainHoldValueResponse>(
                service, METHODID_OBTAIN_HOLD_VALUE)))
        .build();
  }

  private static abstract class AcceptorToMicaValueServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AcceptorToMicaValueServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.mica.acceptor.service.v2.AcceptorToMicaValueServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AcceptorToMicaValueService");
    }
  }

  private static final class AcceptorToMicaValueServiceFileDescriptorSupplier
      extends AcceptorToMicaValueServiceBaseDescriptorSupplier {
    AcceptorToMicaValueServiceFileDescriptorSupplier() {}
  }

  private static final class AcceptorToMicaValueServiceMethodDescriptorSupplier
      extends AcceptorToMicaValueServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    AcceptorToMicaValueServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (AcceptorToMicaValueServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AcceptorToMicaValueServiceFileDescriptorSupplier())
              .addMethod(getObtainValueMethod())
              .addMethod(getReverseObtainValueMethod())
              .addMethod(getRefundValueMethod())
              .addMethod(getPayoutValueMethod())
              .addMethod(getHoldValueMethod())
              .addMethod(getReleaseHoldValueMethod())
              .addMethod(getObtainHoldValueMethod())
              .build();
        }
      }
    }
    return result;
  }
}
