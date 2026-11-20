package io.mica.issuer.service.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Operations Mica calls on the Issuer. The Issuer hosts this service at the callback address configured with
 * IssuerAdministrationService.UpdateFromMicaClientCallbackAddress, and Mica authenticates with the client certificate
 * enabled through that administration service.
 * Each value operation asks the Issuer to move value on one of its instruments for a network transaction. The
 * operations correspond to those on AcceptorToMicaValueService.
 * Every value operation runs in two steps, identified by `transaction_identifier` and the instrument, so that Mica can
 * apply a transaction completely or not at all. The request's `phase` says which step it is:
 *   "PREFLIGHT" - check that the operation can be applied and reserve what it needs, without applying it
 *   "COMMIT"    - apply the operation, for the amount approved at preflight
 *   "ROLLBACK"  - release what the preflight reserved; nothing is applied
 * Reject a request whose `phase` is anything else. A request whose preflight result Mica did not receive is always
 * rolled back. Mica may repeat a COMMIT or ROLLBACK it did not get an answer to, so apply each only once.
 * The Issuer reports its decision in the response. A failure to process the request at all, rather than a decline, is
 * reported as a gRPC status code, and an operation the Issuer does not support returns UNIMPLEMENTED.
 * </pre>
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class IssuerFromMicaServiceGrpc {

  private IssuerFromMicaServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "mica.issuer.service.v2.IssuerFromMicaService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.mica.issuer.service.v2.ObtainValueRequest,
      io.mica.issuer.service.v2.ObtainValueResponse> getObtainValueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ObtainValue",
      requestType = io.mica.issuer.service.v2.ObtainValueRequest.class,
      responseType = io.mica.issuer.service.v2.ObtainValueResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mica.issuer.service.v2.ObtainValueRequest,
      io.mica.issuer.service.v2.ObtainValueResponse> getObtainValueMethod() {
    io.grpc.MethodDescriptor<io.mica.issuer.service.v2.ObtainValueRequest, io.mica.issuer.service.v2.ObtainValueResponse> getObtainValueMethod;
    if ((getObtainValueMethod = IssuerFromMicaServiceGrpc.getObtainValueMethod) == null) {
      synchronized (IssuerFromMicaServiceGrpc.class) {
        if ((getObtainValueMethod = IssuerFromMicaServiceGrpc.getObtainValueMethod) == null) {
          IssuerFromMicaServiceGrpc.getObtainValueMethod = getObtainValueMethod =
              io.grpc.MethodDescriptor.<io.mica.issuer.service.v2.ObtainValueRequest, io.mica.issuer.service.v2.ObtainValueResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ObtainValue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.issuer.service.v2.ObtainValueRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.issuer.service.v2.ObtainValueResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IssuerFromMicaServiceMethodDescriptorSupplier("ObtainValue"))
              .build();
        }
      }
    }
    return getObtainValueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mica.issuer.service.v2.ReverseObtainValueRequest,
      io.mica.issuer.service.v2.ReverseObtainValueResponse> getReverseObtainValueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReverseObtainValue",
      requestType = io.mica.issuer.service.v2.ReverseObtainValueRequest.class,
      responseType = io.mica.issuer.service.v2.ReverseObtainValueResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mica.issuer.service.v2.ReverseObtainValueRequest,
      io.mica.issuer.service.v2.ReverseObtainValueResponse> getReverseObtainValueMethod() {
    io.grpc.MethodDescriptor<io.mica.issuer.service.v2.ReverseObtainValueRequest, io.mica.issuer.service.v2.ReverseObtainValueResponse> getReverseObtainValueMethod;
    if ((getReverseObtainValueMethod = IssuerFromMicaServiceGrpc.getReverseObtainValueMethod) == null) {
      synchronized (IssuerFromMicaServiceGrpc.class) {
        if ((getReverseObtainValueMethod = IssuerFromMicaServiceGrpc.getReverseObtainValueMethod) == null) {
          IssuerFromMicaServiceGrpc.getReverseObtainValueMethod = getReverseObtainValueMethod =
              io.grpc.MethodDescriptor.<io.mica.issuer.service.v2.ReverseObtainValueRequest, io.mica.issuer.service.v2.ReverseObtainValueResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReverseObtainValue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.issuer.service.v2.ReverseObtainValueRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.issuer.service.v2.ReverseObtainValueResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IssuerFromMicaServiceMethodDescriptorSupplier("ReverseObtainValue"))
              .build();
        }
      }
    }
    return getReverseObtainValueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mica.issuer.service.v2.RefundValueRequest,
      io.mica.issuer.service.v2.RefundValueResponse> getRefundValueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RefundValue",
      requestType = io.mica.issuer.service.v2.RefundValueRequest.class,
      responseType = io.mica.issuer.service.v2.RefundValueResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mica.issuer.service.v2.RefundValueRequest,
      io.mica.issuer.service.v2.RefundValueResponse> getRefundValueMethod() {
    io.grpc.MethodDescriptor<io.mica.issuer.service.v2.RefundValueRequest, io.mica.issuer.service.v2.RefundValueResponse> getRefundValueMethod;
    if ((getRefundValueMethod = IssuerFromMicaServiceGrpc.getRefundValueMethod) == null) {
      synchronized (IssuerFromMicaServiceGrpc.class) {
        if ((getRefundValueMethod = IssuerFromMicaServiceGrpc.getRefundValueMethod) == null) {
          IssuerFromMicaServiceGrpc.getRefundValueMethod = getRefundValueMethod =
              io.grpc.MethodDescriptor.<io.mica.issuer.service.v2.RefundValueRequest, io.mica.issuer.service.v2.RefundValueResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RefundValue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.issuer.service.v2.RefundValueRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.issuer.service.v2.RefundValueResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IssuerFromMicaServiceMethodDescriptorSupplier("RefundValue"))
              .build();
        }
      }
    }
    return getRefundValueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mica.issuer.service.v2.PayoutValueRequest,
      io.mica.issuer.service.v2.PayoutValueResponse> getPayoutValueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PayoutValue",
      requestType = io.mica.issuer.service.v2.PayoutValueRequest.class,
      responseType = io.mica.issuer.service.v2.PayoutValueResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mica.issuer.service.v2.PayoutValueRequest,
      io.mica.issuer.service.v2.PayoutValueResponse> getPayoutValueMethod() {
    io.grpc.MethodDescriptor<io.mica.issuer.service.v2.PayoutValueRequest, io.mica.issuer.service.v2.PayoutValueResponse> getPayoutValueMethod;
    if ((getPayoutValueMethod = IssuerFromMicaServiceGrpc.getPayoutValueMethod) == null) {
      synchronized (IssuerFromMicaServiceGrpc.class) {
        if ((getPayoutValueMethod = IssuerFromMicaServiceGrpc.getPayoutValueMethod) == null) {
          IssuerFromMicaServiceGrpc.getPayoutValueMethod = getPayoutValueMethod =
              io.grpc.MethodDescriptor.<io.mica.issuer.service.v2.PayoutValueRequest, io.mica.issuer.service.v2.PayoutValueResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PayoutValue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.issuer.service.v2.PayoutValueRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.issuer.service.v2.PayoutValueResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IssuerFromMicaServiceMethodDescriptorSupplier("PayoutValue"))
              .build();
        }
      }
    }
    return getPayoutValueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mica.issuer.service.v2.HoldValueRequest,
      io.mica.issuer.service.v2.HoldValueResponse> getHoldValueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HoldValue",
      requestType = io.mica.issuer.service.v2.HoldValueRequest.class,
      responseType = io.mica.issuer.service.v2.HoldValueResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mica.issuer.service.v2.HoldValueRequest,
      io.mica.issuer.service.v2.HoldValueResponse> getHoldValueMethod() {
    io.grpc.MethodDescriptor<io.mica.issuer.service.v2.HoldValueRequest, io.mica.issuer.service.v2.HoldValueResponse> getHoldValueMethod;
    if ((getHoldValueMethod = IssuerFromMicaServiceGrpc.getHoldValueMethod) == null) {
      synchronized (IssuerFromMicaServiceGrpc.class) {
        if ((getHoldValueMethod = IssuerFromMicaServiceGrpc.getHoldValueMethod) == null) {
          IssuerFromMicaServiceGrpc.getHoldValueMethod = getHoldValueMethod =
              io.grpc.MethodDescriptor.<io.mica.issuer.service.v2.HoldValueRequest, io.mica.issuer.service.v2.HoldValueResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HoldValue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.issuer.service.v2.HoldValueRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.issuer.service.v2.HoldValueResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IssuerFromMicaServiceMethodDescriptorSupplier("HoldValue"))
              .build();
        }
      }
    }
    return getHoldValueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mica.issuer.service.v2.ReleaseHoldValueRequest,
      io.mica.issuer.service.v2.ReleaseHoldValueResponse> getReleaseHoldValueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReleaseHoldValue",
      requestType = io.mica.issuer.service.v2.ReleaseHoldValueRequest.class,
      responseType = io.mica.issuer.service.v2.ReleaseHoldValueResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mica.issuer.service.v2.ReleaseHoldValueRequest,
      io.mica.issuer.service.v2.ReleaseHoldValueResponse> getReleaseHoldValueMethod() {
    io.grpc.MethodDescriptor<io.mica.issuer.service.v2.ReleaseHoldValueRequest, io.mica.issuer.service.v2.ReleaseHoldValueResponse> getReleaseHoldValueMethod;
    if ((getReleaseHoldValueMethod = IssuerFromMicaServiceGrpc.getReleaseHoldValueMethod) == null) {
      synchronized (IssuerFromMicaServiceGrpc.class) {
        if ((getReleaseHoldValueMethod = IssuerFromMicaServiceGrpc.getReleaseHoldValueMethod) == null) {
          IssuerFromMicaServiceGrpc.getReleaseHoldValueMethod = getReleaseHoldValueMethod =
              io.grpc.MethodDescriptor.<io.mica.issuer.service.v2.ReleaseHoldValueRequest, io.mica.issuer.service.v2.ReleaseHoldValueResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReleaseHoldValue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.issuer.service.v2.ReleaseHoldValueRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.issuer.service.v2.ReleaseHoldValueResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IssuerFromMicaServiceMethodDescriptorSupplier("ReleaseHoldValue"))
              .build();
        }
      }
    }
    return getReleaseHoldValueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mica.issuer.service.v2.ObtainHoldValueRequest,
      io.mica.issuer.service.v2.ObtainHoldValueResponse> getObtainHoldValueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ObtainHoldValue",
      requestType = io.mica.issuer.service.v2.ObtainHoldValueRequest.class,
      responseType = io.mica.issuer.service.v2.ObtainHoldValueResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mica.issuer.service.v2.ObtainHoldValueRequest,
      io.mica.issuer.service.v2.ObtainHoldValueResponse> getObtainHoldValueMethod() {
    io.grpc.MethodDescriptor<io.mica.issuer.service.v2.ObtainHoldValueRequest, io.mica.issuer.service.v2.ObtainHoldValueResponse> getObtainHoldValueMethod;
    if ((getObtainHoldValueMethod = IssuerFromMicaServiceGrpc.getObtainHoldValueMethod) == null) {
      synchronized (IssuerFromMicaServiceGrpc.class) {
        if ((getObtainHoldValueMethod = IssuerFromMicaServiceGrpc.getObtainHoldValueMethod) == null) {
          IssuerFromMicaServiceGrpc.getObtainHoldValueMethod = getObtainHoldValueMethod =
              io.grpc.MethodDescriptor.<io.mica.issuer.service.v2.ObtainHoldValueRequest, io.mica.issuer.service.v2.ObtainHoldValueResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ObtainHoldValue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.issuer.service.v2.ObtainHoldValueRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.issuer.service.v2.ObtainHoldValueResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IssuerFromMicaServiceMethodDescriptorSupplier("ObtainHoldValue"))
              .build();
        }
      }
    }
    return getObtainHoldValueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mica.issuer.service.v2.ValueAdviceRequest,
      io.mica.issuer.service.v2.ValueAdviceResponse> getValueAdviceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValueAdvice",
      requestType = io.mica.issuer.service.v2.ValueAdviceRequest.class,
      responseType = io.mica.issuer.service.v2.ValueAdviceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mica.issuer.service.v2.ValueAdviceRequest,
      io.mica.issuer.service.v2.ValueAdviceResponse> getValueAdviceMethod() {
    io.grpc.MethodDescriptor<io.mica.issuer.service.v2.ValueAdviceRequest, io.mica.issuer.service.v2.ValueAdviceResponse> getValueAdviceMethod;
    if ((getValueAdviceMethod = IssuerFromMicaServiceGrpc.getValueAdviceMethod) == null) {
      synchronized (IssuerFromMicaServiceGrpc.class) {
        if ((getValueAdviceMethod = IssuerFromMicaServiceGrpc.getValueAdviceMethod) == null) {
          IssuerFromMicaServiceGrpc.getValueAdviceMethod = getValueAdviceMethod =
              io.grpc.MethodDescriptor.<io.mica.issuer.service.v2.ValueAdviceRequest, io.mica.issuer.service.v2.ValueAdviceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ValueAdvice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.issuer.service.v2.ValueAdviceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.issuer.service.v2.ValueAdviceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IssuerFromMicaServiceMethodDescriptorSupplier("ValueAdvice"))
              .build();
        }
      }
    }
    return getValueAdviceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mica.issuer.service.v2.IssuerFromMicaServicePingRequest,
      io.mica.issuer.service.v2.IssuerFromMicaServicePingResponse> getPingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Ping",
      requestType = io.mica.issuer.service.v2.IssuerFromMicaServicePingRequest.class,
      responseType = io.mica.issuer.service.v2.IssuerFromMicaServicePingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mica.issuer.service.v2.IssuerFromMicaServicePingRequest,
      io.mica.issuer.service.v2.IssuerFromMicaServicePingResponse> getPingMethod() {
    io.grpc.MethodDescriptor<io.mica.issuer.service.v2.IssuerFromMicaServicePingRequest, io.mica.issuer.service.v2.IssuerFromMicaServicePingResponse> getPingMethod;
    if ((getPingMethod = IssuerFromMicaServiceGrpc.getPingMethod) == null) {
      synchronized (IssuerFromMicaServiceGrpc.class) {
        if ((getPingMethod = IssuerFromMicaServiceGrpc.getPingMethod) == null) {
          IssuerFromMicaServiceGrpc.getPingMethod = getPingMethod =
              io.grpc.MethodDescriptor.<io.mica.issuer.service.v2.IssuerFromMicaServicePingRequest, io.mica.issuer.service.v2.IssuerFromMicaServicePingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Ping"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.issuer.service.v2.IssuerFromMicaServicePingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.issuer.service.v2.IssuerFromMicaServicePingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IssuerFromMicaServiceMethodDescriptorSupplier("Ping"))
              .build();
        }
      }
    }
    return getPingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static IssuerFromMicaServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IssuerFromMicaServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IssuerFromMicaServiceStub>() {
        @java.lang.Override
        public IssuerFromMicaServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IssuerFromMicaServiceStub(channel, callOptions);
        }
      };
    return IssuerFromMicaServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static IssuerFromMicaServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IssuerFromMicaServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IssuerFromMicaServiceBlockingV2Stub>() {
        @java.lang.Override
        public IssuerFromMicaServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IssuerFromMicaServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return IssuerFromMicaServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static IssuerFromMicaServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IssuerFromMicaServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IssuerFromMicaServiceBlockingStub>() {
        @java.lang.Override
        public IssuerFromMicaServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IssuerFromMicaServiceBlockingStub(channel, callOptions);
        }
      };
    return IssuerFromMicaServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static IssuerFromMicaServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IssuerFromMicaServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IssuerFromMicaServiceFutureStub>() {
        @java.lang.Override
        public IssuerFromMicaServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IssuerFromMicaServiceFutureStub(channel, callOptions);
        }
      };
    return IssuerFromMicaServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Operations Mica calls on the Issuer. The Issuer hosts this service at the callback address configured with
   * IssuerAdministrationService.UpdateFromMicaClientCallbackAddress, and Mica authenticates with the client certificate
   * enabled through that administration service.
   * Each value operation asks the Issuer to move value on one of its instruments for a network transaction. The
   * operations correspond to those on AcceptorToMicaValueService.
   * Every value operation runs in two steps, identified by `transaction_identifier` and the instrument, so that Mica can
   * apply a transaction completely or not at all. The request's `phase` says which step it is:
   *   "PREFLIGHT" - check that the operation can be applied and reserve what it needs, without applying it
   *   "COMMIT"    - apply the operation, for the amount approved at preflight
   *   "ROLLBACK"  - release what the preflight reserved; nothing is applied
   * Reject a request whose `phase` is anything else. A request whose preflight result Mica did not receive is always
   * rolled back. Mica may repeat a COMMIT or ROLLBACK it did not get an answer to, so apply each only once.
   * The Issuer reports its decision in the response. A failure to process the request at all, rather than a decline, is
   * reported as a gRPC status code, and an operation the Issuer does not support returns UNIMPLEMENTED.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Asks the Issuer to take value from the instrument for a payment. The Issuer may approve less than `amount` at
     * preflight.
     * </pre>
     */
    default void obtainValue(io.mica.issuer.service.v2.ObtainValueRequest request,
        io.grpc.stub.StreamObserver<io.mica.issuer.service.v2.ObtainValueResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getObtainValueMethod(), responseObserver);
    }

    /**
     * <pre>
     * Asks the Issuer to reverse an earlier ObtainValue in full, returning everything it took to the instrument.
     * </pre>
     */
    default void reverseObtainValue(io.mica.issuer.service.v2.ReverseObtainValueRequest request,
        io.grpc.stub.StreamObserver<io.mica.issuer.service.v2.ReverseObtainValueResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReverseObtainValueMethod(), responseObserver);
    }

    /**
     * <pre>
     * Asks the Issuer to credit the instrument with part or all of an earlier payment, for example for a returned
     * item.
     * </pre>
     */
    default void refundValue(io.mica.issuer.service.v2.RefundValueRequest request,
        io.grpc.stub.StreamObserver<io.mica.issuer.service.v2.RefundValueResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRefundValueMethod(), responseObserver);
    }

    /**
     * <pre>
     * Asks the Issuer to credit the instrument for a payout: value sent to the user that does not refer to an earlier
     * payment.
     * </pre>
     */
    default void payoutValue(io.mica.issuer.service.v2.PayoutValueRequest request,
        io.grpc.stub.StreamObserver<io.mica.issuer.service.v2.PayoutValueResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPayoutValueMethod(), responseObserver);
    }

    /**
     * <pre>
     * Asks the Issuer to reserve value on the instrument until `expiration`. The hold is later captured with
     * ObtainHoldValue, released with ReleaseHoldValue, or left to expire.
     * </pre>
     */
    default void holdValue(io.mica.issuer.service.v2.HoldValueRequest request,
        io.grpc.stub.StreamObserver<io.mica.issuer.service.v2.HoldValueResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHoldValueMethod(), responseObserver);
    }

    /**
     * <pre>
     * Asks the Issuer to release an earlier hold in full without capturing it, returning all of the reserved value to
     * the instrument.
     * </pre>
     */
    default void releaseHoldValue(io.mica.issuer.service.v2.ReleaseHoldValueRequest request,
        io.grpc.stub.StreamObserver<io.mica.issuer.service.v2.ReleaseHoldValueResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReleaseHoldValueMethod(), responseObserver);
    }

    /**
     * <pre>
     * Asks the Issuer to take value against an earlier hold, once the final amount is known. This settles the hold.
     * </pre>
     */
    default void obtainHoldValue(io.mica.issuer.service.v2.ObtainHoldValueRequest request,
        io.grpc.stub.StreamObserver<io.mica.issuer.service.v2.ObtainHoldValueResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getObtainHoldValueMethod(), responseObserver);
    }

    /**
     * <pre>
     * Informs the Issuer about steps of value operations that Mica could not complete with the Issuer, for example a
     * COMMIT the Issuer did not answer in time. The Issuer should acknowledge promptly and reconcile afterwards, undoing
     * any value movement it applied for a transaction the network declined. Not sent by the current network release.
     * </pre>
     */
    default void valueAdvice(io.mica.issuer.service.v2.ValueAdviceRequest request,
        io.grpc.stub.StreamObserver<io.mica.issuer.service.v2.ValueAdviceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValueAdviceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lets Mica check that the Issuer's service is reachable and that the mTLS connection works. Mica calls this when
     * the Issuer tests connectivity with IssuerAdministrationService.PingExternal or enables a new client certificate.
     * </pre>
     */
    default void ping(io.mica.issuer.service.v2.IssuerFromMicaServicePingRequest request,
        io.grpc.stub.StreamObserver<io.mica.issuer.service.v2.IssuerFromMicaServicePingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPingMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service IssuerFromMicaService.
   * <pre>
   * Operations Mica calls on the Issuer. The Issuer hosts this service at the callback address configured with
   * IssuerAdministrationService.UpdateFromMicaClientCallbackAddress, and Mica authenticates with the client certificate
   * enabled through that administration service.
   * Each value operation asks the Issuer to move value on one of its instruments for a network transaction. The
   * operations correspond to those on AcceptorToMicaValueService.
   * Every value operation runs in two steps, identified by `transaction_identifier` and the instrument, so that Mica can
   * apply a transaction completely or not at all. The request's `phase` says which step it is:
   *   "PREFLIGHT" - check that the operation can be applied and reserve what it needs, without applying it
   *   "COMMIT"    - apply the operation, for the amount approved at preflight
   *   "ROLLBACK"  - release what the preflight reserved; nothing is applied
   * Reject a request whose `phase` is anything else. A request whose preflight result Mica did not receive is always
   * rolled back. Mica may repeat a COMMIT or ROLLBACK it did not get an answer to, so apply each only once.
   * The Issuer reports its decision in the response. A failure to process the request at all, rather than a decline, is
   * reported as a gRPC status code, and an operation the Issuer does not support returns UNIMPLEMENTED.
   * </pre>
   */
  public static abstract class IssuerFromMicaServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return IssuerFromMicaServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service IssuerFromMicaService.
   * <pre>
   * Operations Mica calls on the Issuer. The Issuer hosts this service at the callback address configured with
   * IssuerAdministrationService.UpdateFromMicaClientCallbackAddress, and Mica authenticates with the client certificate
   * enabled through that administration service.
   * Each value operation asks the Issuer to move value on one of its instruments for a network transaction. The
   * operations correspond to those on AcceptorToMicaValueService.
   * Every value operation runs in two steps, identified by `transaction_identifier` and the instrument, so that Mica can
   * apply a transaction completely or not at all. The request's `phase` says which step it is:
   *   "PREFLIGHT" - check that the operation can be applied and reserve what it needs, without applying it
   *   "COMMIT"    - apply the operation, for the amount approved at preflight
   *   "ROLLBACK"  - release what the preflight reserved; nothing is applied
   * Reject a request whose `phase` is anything else. A request whose preflight result Mica did not receive is always
   * rolled back. Mica may repeat a COMMIT or ROLLBACK it did not get an answer to, so apply each only once.
   * The Issuer reports its decision in the response. A failure to process the request at all, rather than a decline, is
   * reported as a gRPC status code, and an operation the Issuer does not support returns UNIMPLEMENTED.
   * </pre>
   */
  public static final class IssuerFromMicaServiceStub
      extends io.grpc.stub.AbstractAsyncStub<IssuerFromMicaServiceStub> {
    private IssuerFromMicaServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IssuerFromMicaServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IssuerFromMicaServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Asks the Issuer to take value from the instrument for a payment. The Issuer may approve less than `amount` at
     * preflight.
     * </pre>
     */
    public void obtainValue(io.mica.issuer.service.v2.ObtainValueRequest request,
        io.grpc.stub.StreamObserver<io.mica.issuer.service.v2.ObtainValueResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getObtainValueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Asks the Issuer to reverse an earlier ObtainValue in full, returning everything it took to the instrument.
     * </pre>
     */
    public void reverseObtainValue(io.mica.issuer.service.v2.ReverseObtainValueRequest request,
        io.grpc.stub.StreamObserver<io.mica.issuer.service.v2.ReverseObtainValueResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReverseObtainValueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Asks the Issuer to credit the instrument with part or all of an earlier payment, for example for a returned
     * item.
     * </pre>
     */
    public void refundValue(io.mica.issuer.service.v2.RefundValueRequest request,
        io.grpc.stub.StreamObserver<io.mica.issuer.service.v2.RefundValueResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRefundValueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Asks the Issuer to credit the instrument for a payout: value sent to the user that does not refer to an earlier
     * payment.
     * </pre>
     */
    public void payoutValue(io.mica.issuer.service.v2.PayoutValueRequest request,
        io.grpc.stub.StreamObserver<io.mica.issuer.service.v2.PayoutValueResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPayoutValueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Asks the Issuer to reserve value on the instrument until `expiration`. The hold is later captured with
     * ObtainHoldValue, released with ReleaseHoldValue, or left to expire.
     * </pre>
     */
    public void holdValue(io.mica.issuer.service.v2.HoldValueRequest request,
        io.grpc.stub.StreamObserver<io.mica.issuer.service.v2.HoldValueResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHoldValueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Asks the Issuer to release an earlier hold in full without capturing it, returning all of the reserved value to
     * the instrument.
     * </pre>
     */
    public void releaseHoldValue(io.mica.issuer.service.v2.ReleaseHoldValueRequest request,
        io.grpc.stub.StreamObserver<io.mica.issuer.service.v2.ReleaseHoldValueResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReleaseHoldValueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Asks the Issuer to take value against an earlier hold, once the final amount is known. This settles the hold.
     * </pre>
     */
    public void obtainHoldValue(io.mica.issuer.service.v2.ObtainHoldValueRequest request,
        io.grpc.stub.StreamObserver<io.mica.issuer.service.v2.ObtainHoldValueResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getObtainHoldValueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Informs the Issuer about steps of value operations that Mica could not complete with the Issuer, for example a
     * COMMIT the Issuer did not answer in time. The Issuer should acknowledge promptly and reconcile afterwards, undoing
     * any value movement it applied for a transaction the network declined. Not sent by the current network release.
     * </pre>
     */
    public void valueAdvice(io.mica.issuer.service.v2.ValueAdviceRequest request,
        io.grpc.stub.StreamObserver<io.mica.issuer.service.v2.ValueAdviceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValueAdviceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lets Mica check that the Issuer's service is reachable and that the mTLS connection works. Mica calls this when
     * the Issuer tests connectivity with IssuerAdministrationService.PingExternal or enables a new client certificate.
     * </pre>
     */
    public void ping(io.mica.issuer.service.v2.IssuerFromMicaServicePingRequest request,
        io.grpc.stub.StreamObserver<io.mica.issuer.service.v2.IssuerFromMicaServicePingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service IssuerFromMicaService.
   * <pre>
   * Operations Mica calls on the Issuer. The Issuer hosts this service at the callback address configured with
   * IssuerAdministrationService.UpdateFromMicaClientCallbackAddress, and Mica authenticates with the client certificate
   * enabled through that administration service.
   * Each value operation asks the Issuer to move value on one of its instruments for a network transaction. The
   * operations correspond to those on AcceptorToMicaValueService.
   * Every value operation runs in two steps, identified by `transaction_identifier` and the instrument, so that Mica can
   * apply a transaction completely or not at all. The request's `phase` says which step it is:
   *   "PREFLIGHT" - check that the operation can be applied and reserve what it needs, without applying it
   *   "COMMIT"    - apply the operation, for the amount approved at preflight
   *   "ROLLBACK"  - release what the preflight reserved; nothing is applied
   * Reject a request whose `phase` is anything else. A request whose preflight result Mica did not receive is always
   * rolled back. Mica may repeat a COMMIT or ROLLBACK it did not get an answer to, so apply each only once.
   * The Issuer reports its decision in the response. A failure to process the request at all, rather than a decline, is
   * reported as a gRPC status code, and an operation the Issuer does not support returns UNIMPLEMENTED.
   * </pre>
   */
  public static final class IssuerFromMicaServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<IssuerFromMicaServiceBlockingV2Stub> {
    private IssuerFromMicaServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IssuerFromMicaServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IssuerFromMicaServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Asks the Issuer to take value from the instrument for a payment. The Issuer may approve less than `amount` at
     * preflight.
     * </pre>
     */
    public io.mica.issuer.service.v2.ObtainValueResponse obtainValue(io.mica.issuer.service.v2.ObtainValueRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getObtainValueMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Asks the Issuer to reverse an earlier ObtainValue in full, returning everything it took to the instrument.
     * </pre>
     */
    public io.mica.issuer.service.v2.ReverseObtainValueResponse reverseObtainValue(io.mica.issuer.service.v2.ReverseObtainValueRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getReverseObtainValueMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Asks the Issuer to credit the instrument with part or all of an earlier payment, for example for a returned
     * item.
     * </pre>
     */
    public io.mica.issuer.service.v2.RefundValueResponse refundValue(io.mica.issuer.service.v2.RefundValueRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getRefundValueMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Asks the Issuer to credit the instrument for a payout: value sent to the user that does not refer to an earlier
     * payment.
     * </pre>
     */
    public io.mica.issuer.service.v2.PayoutValueResponse payoutValue(io.mica.issuer.service.v2.PayoutValueRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getPayoutValueMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Asks the Issuer to reserve value on the instrument until `expiration`. The hold is later captured with
     * ObtainHoldValue, released with ReleaseHoldValue, or left to expire.
     * </pre>
     */
    public io.mica.issuer.service.v2.HoldValueResponse holdValue(io.mica.issuer.service.v2.HoldValueRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getHoldValueMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Asks the Issuer to release an earlier hold in full without capturing it, returning all of the reserved value to
     * the instrument.
     * </pre>
     */
    public io.mica.issuer.service.v2.ReleaseHoldValueResponse releaseHoldValue(io.mica.issuer.service.v2.ReleaseHoldValueRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getReleaseHoldValueMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Asks the Issuer to take value against an earlier hold, once the final amount is known. This settles the hold.
     * </pre>
     */
    public io.mica.issuer.service.v2.ObtainHoldValueResponse obtainHoldValue(io.mica.issuer.service.v2.ObtainHoldValueRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getObtainHoldValueMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Informs the Issuer about steps of value operations that Mica could not complete with the Issuer, for example a
     * COMMIT the Issuer did not answer in time. The Issuer should acknowledge promptly and reconcile afterwards, undoing
     * any value movement it applied for a transaction the network declined. Not sent by the current network release.
     * </pre>
     */
    public io.mica.issuer.service.v2.ValueAdviceResponse valueAdvice(io.mica.issuer.service.v2.ValueAdviceRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getValueAdviceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lets Mica check that the Issuer's service is reachable and that the mTLS connection works. Mica calls this when
     * the Issuer tests connectivity with IssuerAdministrationService.PingExternal or enables a new client certificate.
     * </pre>
     */
    public io.mica.issuer.service.v2.IssuerFromMicaServicePingResponse ping(io.mica.issuer.service.v2.IssuerFromMicaServicePingRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getPingMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service IssuerFromMicaService.
   * <pre>
   * Operations Mica calls on the Issuer. The Issuer hosts this service at the callback address configured with
   * IssuerAdministrationService.UpdateFromMicaClientCallbackAddress, and Mica authenticates with the client certificate
   * enabled through that administration service.
   * Each value operation asks the Issuer to move value on one of its instruments for a network transaction. The
   * operations correspond to those on AcceptorToMicaValueService.
   * Every value operation runs in two steps, identified by `transaction_identifier` and the instrument, so that Mica can
   * apply a transaction completely or not at all. The request's `phase` says which step it is:
   *   "PREFLIGHT" - check that the operation can be applied and reserve what it needs, without applying it
   *   "COMMIT"    - apply the operation, for the amount approved at preflight
   *   "ROLLBACK"  - release what the preflight reserved; nothing is applied
   * Reject a request whose `phase` is anything else. A request whose preflight result Mica did not receive is always
   * rolled back. Mica may repeat a COMMIT or ROLLBACK it did not get an answer to, so apply each only once.
   * The Issuer reports its decision in the response. A failure to process the request at all, rather than a decline, is
   * reported as a gRPC status code, and an operation the Issuer does not support returns UNIMPLEMENTED.
   * </pre>
   */
  public static final class IssuerFromMicaServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<IssuerFromMicaServiceBlockingStub> {
    private IssuerFromMicaServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IssuerFromMicaServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IssuerFromMicaServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Asks the Issuer to take value from the instrument for a payment. The Issuer may approve less than `amount` at
     * preflight.
     * </pre>
     */
    public io.mica.issuer.service.v2.ObtainValueResponse obtainValue(io.mica.issuer.service.v2.ObtainValueRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getObtainValueMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Asks the Issuer to reverse an earlier ObtainValue in full, returning everything it took to the instrument.
     * </pre>
     */
    public io.mica.issuer.service.v2.ReverseObtainValueResponse reverseObtainValue(io.mica.issuer.service.v2.ReverseObtainValueRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReverseObtainValueMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Asks the Issuer to credit the instrument with part or all of an earlier payment, for example for a returned
     * item.
     * </pre>
     */
    public io.mica.issuer.service.v2.RefundValueResponse refundValue(io.mica.issuer.service.v2.RefundValueRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRefundValueMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Asks the Issuer to credit the instrument for a payout: value sent to the user that does not refer to an earlier
     * payment.
     * </pre>
     */
    public io.mica.issuer.service.v2.PayoutValueResponse payoutValue(io.mica.issuer.service.v2.PayoutValueRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPayoutValueMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Asks the Issuer to reserve value on the instrument until `expiration`. The hold is later captured with
     * ObtainHoldValue, released with ReleaseHoldValue, or left to expire.
     * </pre>
     */
    public io.mica.issuer.service.v2.HoldValueResponse holdValue(io.mica.issuer.service.v2.HoldValueRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHoldValueMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Asks the Issuer to release an earlier hold in full without capturing it, returning all of the reserved value to
     * the instrument.
     * </pre>
     */
    public io.mica.issuer.service.v2.ReleaseHoldValueResponse releaseHoldValue(io.mica.issuer.service.v2.ReleaseHoldValueRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReleaseHoldValueMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Asks the Issuer to take value against an earlier hold, once the final amount is known. This settles the hold.
     * </pre>
     */
    public io.mica.issuer.service.v2.ObtainHoldValueResponse obtainHoldValue(io.mica.issuer.service.v2.ObtainHoldValueRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getObtainHoldValueMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Informs the Issuer about steps of value operations that Mica could not complete with the Issuer, for example a
     * COMMIT the Issuer did not answer in time. The Issuer should acknowledge promptly and reconcile afterwards, undoing
     * any value movement it applied for a transaction the network declined. Not sent by the current network release.
     * </pre>
     */
    public io.mica.issuer.service.v2.ValueAdviceResponse valueAdvice(io.mica.issuer.service.v2.ValueAdviceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValueAdviceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lets Mica check that the Issuer's service is reachable and that the mTLS connection works. Mica calls this when
     * the Issuer tests connectivity with IssuerAdministrationService.PingExternal or enables a new client certificate.
     * </pre>
     */
    public io.mica.issuer.service.v2.IssuerFromMicaServicePingResponse ping(io.mica.issuer.service.v2.IssuerFromMicaServicePingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPingMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service IssuerFromMicaService.
   * <pre>
   * Operations Mica calls on the Issuer. The Issuer hosts this service at the callback address configured with
   * IssuerAdministrationService.UpdateFromMicaClientCallbackAddress, and Mica authenticates with the client certificate
   * enabled through that administration service.
   * Each value operation asks the Issuer to move value on one of its instruments for a network transaction. The
   * operations correspond to those on AcceptorToMicaValueService.
   * Every value operation runs in two steps, identified by `transaction_identifier` and the instrument, so that Mica can
   * apply a transaction completely or not at all. The request's `phase` says which step it is:
   *   "PREFLIGHT" - check that the operation can be applied and reserve what it needs, without applying it
   *   "COMMIT"    - apply the operation, for the amount approved at preflight
   *   "ROLLBACK"  - release what the preflight reserved; nothing is applied
   * Reject a request whose `phase` is anything else. A request whose preflight result Mica did not receive is always
   * rolled back. Mica may repeat a COMMIT or ROLLBACK it did not get an answer to, so apply each only once.
   * The Issuer reports its decision in the response. A failure to process the request at all, rather than a decline, is
   * reported as a gRPC status code, and an operation the Issuer does not support returns UNIMPLEMENTED.
   * </pre>
   */
  public static final class IssuerFromMicaServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<IssuerFromMicaServiceFutureStub> {
    private IssuerFromMicaServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IssuerFromMicaServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IssuerFromMicaServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Asks the Issuer to take value from the instrument for a payment. The Issuer may approve less than `amount` at
     * preflight.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mica.issuer.service.v2.ObtainValueResponse> obtainValue(
        io.mica.issuer.service.v2.ObtainValueRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getObtainValueMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Asks the Issuer to reverse an earlier ObtainValue in full, returning everything it took to the instrument.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mica.issuer.service.v2.ReverseObtainValueResponse> reverseObtainValue(
        io.mica.issuer.service.v2.ReverseObtainValueRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReverseObtainValueMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Asks the Issuer to credit the instrument with part or all of an earlier payment, for example for a returned
     * item.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mica.issuer.service.v2.RefundValueResponse> refundValue(
        io.mica.issuer.service.v2.RefundValueRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRefundValueMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Asks the Issuer to credit the instrument for a payout: value sent to the user that does not refer to an earlier
     * payment.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mica.issuer.service.v2.PayoutValueResponse> payoutValue(
        io.mica.issuer.service.v2.PayoutValueRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPayoutValueMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Asks the Issuer to reserve value on the instrument until `expiration`. The hold is later captured with
     * ObtainHoldValue, released with ReleaseHoldValue, or left to expire.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mica.issuer.service.v2.HoldValueResponse> holdValue(
        io.mica.issuer.service.v2.HoldValueRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHoldValueMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Asks the Issuer to release an earlier hold in full without capturing it, returning all of the reserved value to
     * the instrument.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mica.issuer.service.v2.ReleaseHoldValueResponse> releaseHoldValue(
        io.mica.issuer.service.v2.ReleaseHoldValueRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReleaseHoldValueMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Asks the Issuer to take value against an earlier hold, once the final amount is known. This settles the hold.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mica.issuer.service.v2.ObtainHoldValueResponse> obtainHoldValue(
        io.mica.issuer.service.v2.ObtainHoldValueRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getObtainHoldValueMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Informs the Issuer about steps of value operations that Mica could not complete with the Issuer, for example a
     * COMMIT the Issuer did not answer in time. The Issuer should acknowledge promptly and reconcile afterwards, undoing
     * any value movement it applied for a transaction the network declined. Not sent by the current network release.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mica.issuer.service.v2.ValueAdviceResponse> valueAdvice(
        io.mica.issuer.service.v2.ValueAdviceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValueAdviceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lets Mica check that the Issuer's service is reachable and that the mTLS connection works. Mica calls this when
     * the Issuer tests connectivity with IssuerAdministrationService.PingExternal or enables a new client certificate.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mica.issuer.service.v2.IssuerFromMicaServicePingResponse> ping(
        io.mica.issuer.service.v2.IssuerFromMicaServicePingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_OBTAIN_VALUE = 0;
  private static final int METHODID_REVERSE_OBTAIN_VALUE = 1;
  private static final int METHODID_REFUND_VALUE = 2;
  private static final int METHODID_PAYOUT_VALUE = 3;
  private static final int METHODID_HOLD_VALUE = 4;
  private static final int METHODID_RELEASE_HOLD_VALUE = 5;
  private static final int METHODID_OBTAIN_HOLD_VALUE = 6;
  private static final int METHODID_VALUE_ADVICE = 7;
  private static final int METHODID_PING = 8;

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
          serviceImpl.obtainValue((io.mica.issuer.service.v2.ObtainValueRequest) request,
              (io.grpc.stub.StreamObserver<io.mica.issuer.service.v2.ObtainValueResponse>) responseObserver);
          break;
        case METHODID_REVERSE_OBTAIN_VALUE:
          serviceImpl.reverseObtainValue((io.mica.issuer.service.v2.ReverseObtainValueRequest) request,
              (io.grpc.stub.StreamObserver<io.mica.issuer.service.v2.ReverseObtainValueResponse>) responseObserver);
          break;
        case METHODID_REFUND_VALUE:
          serviceImpl.refundValue((io.mica.issuer.service.v2.RefundValueRequest) request,
              (io.grpc.stub.StreamObserver<io.mica.issuer.service.v2.RefundValueResponse>) responseObserver);
          break;
        case METHODID_PAYOUT_VALUE:
          serviceImpl.payoutValue((io.mica.issuer.service.v2.PayoutValueRequest) request,
              (io.grpc.stub.StreamObserver<io.mica.issuer.service.v2.PayoutValueResponse>) responseObserver);
          break;
        case METHODID_HOLD_VALUE:
          serviceImpl.holdValue((io.mica.issuer.service.v2.HoldValueRequest) request,
              (io.grpc.stub.StreamObserver<io.mica.issuer.service.v2.HoldValueResponse>) responseObserver);
          break;
        case METHODID_RELEASE_HOLD_VALUE:
          serviceImpl.releaseHoldValue((io.mica.issuer.service.v2.ReleaseHoldValueRequest) request,
              (io.grpc.stub.StreamObserver<io.mica.issuer.service.v2.ReleaseHoldValueResponse>) responseObserver);
          break;
        case METHODID_OBTAIN_HOLD_VALUE:
          serviceImpl.obtainHoldValue((io.mica.issuer.service.v2.ObtainHoldValueRequest) request,
              (io.grpc.stub.StreamObserver<io.mica.issuer.service.v2.ObtainHoldValueResponse>) responseObserver);
          break;
        case METHODID_VALUE_ADVICE:
          serviceImpl.valueAdvice((io.mica.issuer.service.v2.ValueAdviceRequest) request,
              (io.grpc.stub.StreamObserver<io.mica.issuer.service.v2.ValueAdviceResponse>) responseObserver);
          break;
        case METHODID_PING:
          serviceImpl.ping((io.mica.issuer.service.v2.IssuerFromMicaServicePingRequest) request,
              (io.grpc.stub.StreamObserver<io.mica.issuer.service.v2.IssuerFromMicaServicePingResponse>) responseObserver);
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
              io.mica.issuer.service.v2.ObtainValueRequest,
              io.mica.issuer.service.v2.ObtainValueResponse>(
                service, METHODID_OBTAIN_VALUE)))
        .addMethod(
          getReverseObtainValueMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mica.issuer.service.v2.ReverseObtainValueRequest,
              io.mica.issuer.service.v2.ReverseObtainValueResponse>(
                service, METHODID_REVERSE_OBTAIN_VALUE)))
        .addMethod(
          getRefundValueMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mica.issuer.service.v2.RefundValueRequest,
              io.mica.issuer.service.v2.RefundValueResponse>(
                service, METHODID_REFUND_VALUE)))
        .addMethod(
          getPayoutValueMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mica.issuer.service.v2.PayoutValueRequest,
              io.mica.issuer.service.v2.PayoutValueResponse>(
                service, METHODID_PAYOUT_VALUE)))
        .addMethod(
          getHoldValueMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mica.issuer.service.v2.HoldValueRequest,
              io.mica.issuer.service.v2.HoldValueResponse>(
                service, METHODID_HOLD_VALUE)))
        .addMethod(
          getReleaseHoldValueMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mica.issuer.service.v2.ReleaseHoldValueRequest,
              io.mica.issuer.service.v2.ReleaseHoldValueResponse>(
                service, METHODID_RELEASE_HOLD_VALUE)))
        .addMethod(
          getObtainHoldValueMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mica.issuer.service.v2.ObtainHoldValueRequest,
              io.mica.issuer.service.v2.ObtainHoldValueResponse>(
                service, METHODID_OBTAIN_HOLD_VALUE)))
        .addMethod(
          getValueAdviceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mica.issuer.service.v2.ValueAdviceRequest,
              io.mica.issuer.service.v2.ValueAdviceResponse>(
                service, METHODID_VALUE_ADVICE)))
        .addMethod(
          getPingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mica.issuer.service.v2.IssuerFromMicaServicePingRequest,
              io.mica.issuer.service.v2.IssuerFromMicaServicePingResponse>(
                service, METHODID_PING)))
        .build();
  }

  private static abstract class IssuerFromMicaServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    IssuerFromMicaServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.mica.issuer.service.v2.IssuerFromMicaServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("IssuerFromMicaService");
    }
  }

  private static final class IssuerFromMicaServiceFileDescriptorSupplier
      extends IssuerFromMicaServiceBaseDescriptorSupplier {
    IssuerFromMicaServiceFileDescriptorSupplier() {}
  }

  private static final class IssuerFromMicaServiceMethodDescriptorSupplier
      extends IssuerFromMicaServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    IssuerFromMicaServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (IssuerFromMicaServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new IssuerFromMicaServiceFileDescriptorSupplier())
              .addMethod(getObtainValueMethod())
              .addMethod(getReverseObtainValueMethod())
              .addMethod(getRefundValueMethod())
              .addMethod(getPayoutValueMethod())
              .addMethod(getHoldValueMethod())
              .addMethod(getReleaseHoldValueMethod())
              .addMethod(getObtainHoldValueMethod())
              .addMethod(getValueAdviceMethod())
              .addMethod(getPingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
