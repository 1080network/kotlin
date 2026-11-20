package io.mica.acceptor.service.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * The service an Acceptor calls to manage links to a user's payment profile: complete a link from a linking code,
 * provision UUEKs from it, look it up and remove it. Payments made with those UUEKs are in AcceptorToMicaValueService.
 * A request that breaks a validation rule on its fields is rejected with INVALID_ARGUMENT before it is processed, and
 * a caller not permitted to use an operation gets PERMISSION_DENIED. CompleteLinkingWithCode and
 * ProvisionUUEKFromLink report every other failure as a gRPC status code; GetLink and RemoveInstrumentLink report
 * their outcome in the response.
 * </pre>
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class AcceptorToMicaLinkServiceGrpc {

  private AcceptorToMicaLinkServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "mica.acceptor.service.v2.AcceptorToMicaLinkService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.mica.acceptor.service.v2.CompleteLinkingWithCodeRequest,
      io.mica.acceptor.service.v2.CompleteLinkingWithCodeResponse> getCompleteLinkingWithCodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CompleteLinkingWithCode",
      requestType = io.mica.acceptor.service.v2.CompleteLinkingWithCodeRequest.class,
      responseType = io.mica.acceptor.service.v2.CompleteLinkingWithCodeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mica.acceptor.service.v2.CompleteLinkingWithCodeRequest,
      io.mica.acceptor.service.v2.CompleteLinkingWithCodeResponse> getCompleteLinkingWithCodeMethod() {
    io.grpc.MethodDescriptor<io.mica.acceptor.service.v2.CompleteLinkingWithCodeRequest, io.mica.acceptor.service.v2.CompleteLinkingWithCodeResponse> getCompleteLinkingWithCodeMethod;
    if ((getCompleteLinkingWithCodeMethod = AcceptorToMicaLinkServiceGrpc.getCompleteLinkingWithCodeMethod) == null) {
      synchronized (AcceptorToMicaLinkServiceGrpc.class) {
        if ((getCompleteLinkingWithCodeMethod = AcceptorToMicaLinkServiceGrpc.getCompleteLinkingWithCodeMethod) == null) {
          AcceptorToMicaLinkServiceGrpc.getCompleteLinkingWithCodeMethod = getCompleteLinkingWithCodeMethod =
              io.grpc.MethodDescriptor.<io.mica.acceptor.service.v2.CompleteLinkingWithCodeRequest, io.mica.acceptor.service.v2.CompleteLinkingWithCodeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CompleteLinkingWithCode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.acceptor.service.v2.CompleteLinkingWithCodeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.acceptor.service.v2.CompleteLinkingWithCodeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AcceptorToMicaLinkServiceMethodDescriptorSupplier("CompleteLinkingWithCode"))
              .build();
        }
      }
    }
    return getCompleteLinkingWithCodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mica.acceptor.service.v2.ProvisionUUEKFromLinkRequest,
      io.mica.acceptor.service.v2.ProvisionUUEKFromLinkResponse> getProvisionUUEKFromLinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProvisionUUEKFromLink",
      requestType = io.mica.acceptor.service.v2.ProvisionUUEKFromLinkRequest.class,
      responseType = io.mica.acceptor.service.v2.ProvisionUUEKFromLinkResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mica.acceptor.service.v2.ProvisionUUEKFromLinkRequest,
      io.mica.acceptor.service.v2.ProvisionUUEKFromLinkResponse> getProvisionUUEKFromLinkMethod() {
    io.grpc.MethodDescriptor<io.mica.acceptor.service.v2.ProvisionUUEKFromLinkRequest, io.mica.acceptor.service.v2.ProvisionUUEKFromLinkResponse> getProvisionUUEKFromLinkMethod;
    if ((getProvisionUUEKFromLinkMethod = AcceptorToMicaLinkServiceGrpc.getProvisionUUEKFromLinkMethod) == null) {
      synchronized (AcceptorToMicaLinkServiceGrpc.class) {
        if ((getProvisionUUEKFromLinkMethod = AcceptorToMicaLinkServiceGrpc.getProvisionUUEKFromLinkMethod) == null) {
          AcceptorToMicaLinkServiceGrpc.getProvisionUUEKFromLinkMethod = getProvisionUUEKFromLinkMethod =
              io.grpc.MethodDescriptor.<io.mica.acceptor.service.v2.ProvisionUUEKFromLinkRequest, io.mica.acceptor.service.v2.ProvisionUUEKFromLinkResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProvisionUUEKFromLink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.acceptor.service.v2.ProvisionUUEKFromLinkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.acceptor.service.v2.ProvisionUUEKFromLinkResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AcceptorToMicaLinkServiceMethodDescriptorSupplier("ProvisionUUEKFromLink"))
              .build();
        }
      }
    }
    return getProvisionUUEKFromLinkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mica.acceptor.instrument.v2.GetLinkRequest,
      io.mica.acceptor.instrument.v2.GetLinkResponse> getGetLinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLink",
      requestType = io.mica.acceptor.instrument.v2.GetLinkRequest.class,
      responseType = io.mica.acceptor.instrument.v2.GetLinkResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mica.acceptor.instrument.v2.GetLinkRequest,
      io.mica.acceptor.instrument.v2.GetLinkResponse> getGetLinkMethod() {
    io.grpc.MethodDescriptor<io.mica.acceptor.instrument.v2.GetLinkRequest, io.mica.acceptor.instrument.v2.GetLinkResponse> getGetLinkMethod;
    if ((getGetLinkMethod = AcceptorToMicaLinkServiceGrpc.getGetLinkMethod) == null) {
      synchronized (AcceptorToMicaLinkServiceGrpc.class) {
        if ((getGetLinkMethod = AcceptorToMicaLinkServiceGrpc.getGetLinkMethod) == null) {
          AcceptorToMicaLinkServiceGrpc.getGetLinkMethod = getGetLinkMethod =
              io.grpc.MethodDescriptor.<io.mica.acceptor.instrument.v2.GetLinkRequest, io.mica.acceptor.instrument.v2.GetLinkResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.acceptor.instrument.v2.GetLinkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.acceptor.instrument.v2.GetLinkResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AcceptorToMicaLinkServiceMethodDescriptorSupplier("GetLink"))
              .build();
        }
      }
    }
    return getGetLinkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mica.acceptor.instrument.v2.RemoveInstrumentLinkRequest,
      io.mica.acceptor.instrument.v2.RemoveInstrumentLinkResponse> getRemoveInstrumentLinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveInstrumentLink",
      requestType = io.mica.acceptor.instrument.v2.RemoveInstrumentLinkRequest.class,
      responseType = io.mica.acceptor.instrument.v2.RemoveInstrumentLinkResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mica.acceptor.instrument.v2.RemoveInstrumentLinkRequest,
      io.mica.acceptor.instrument.v2.RemoveInstrumentLinkResponse> getRemoveInstrumentLinkMethod() {
    io.grpc.MethodDescriptor<io.mica.acceptor.instrument.v2.RemoveInstrumentLinkRequest, io.mica.acceptor.instrument.v2.RemoveInstrumentLinkResponse> getRemoveInstrumentLinkMethod;
    if ((getRemoveInstrumentLinkMethod = AcceptorToMicaLinkServiceGrpc.getRemoveInstrumentLinkMethod) == null) {
      synchronized (AcceptorToMicaLinkServiceGrpc.class) {
        if ((getRemoveInstrumentLinkMethod = AcceptorToMicaLinkServiceGrpc.getRemoveInstrumentLinkMethod) == null) {
          AcceptorToMicaLinkServiceGrpc.getRemoveInstrumentLinkMethod = getRemoveInstrumentLinkMethod =
              io.grpc.MethodDescriptor.<io.mica.acceptor.instrument.v2.RemoveInstrumentLinkRequest, io.mica.acceptor.instrument.v2.RemoveInstrumentLinkResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveInstrumentLink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.acceptor.instrument.v2.RemoveInstrumentLinkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.acceptor.instrument.v2.RemoveInstrumentLinkResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AcceptorToMicaLinkServiceMethodDescriptorSupplier("RemoveInstrumentLink"))
              .build();
        }
      }
    }
    return getRemoveInstrumentLinkMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AcceptorToMicaLinkServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AcceptorToMicaLinkServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AcceptorToMicaLinkServiceStub>() {
        @java.lang.Override
        public AcceptorToMicaLinkServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AcceptorToMicaLinkServiceStub(channel, callOptions);
        }
      };
    return AcceptorToMicaLinkServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static AcceptorToMicaLinkServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AcceptorToMicaLinkServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AcceptorToMicaLinkServiceBlockingV2Stub>() {
        @java.lang.Override
        public AcceptorToMicaLinkServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AcceptorToMicaLinkServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return AcceptorToMicaLinkServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AcceptorToMicaLinkServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AcceptorToMicaLinkServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AcceptorToMicaLinkServiceBlockingStub>() {
        @java.lang.Override
        public AcceptorToMicaLinkServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AcceptorToMicaLinkServiceBlockingStub(channel, callOptions);
        }
      };
    return AcceptorToMicaLinkServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AcceptorToMicaLinkServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AcceptorToMicaLinkServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AcceptorToMicaLinkServiceFutureStub>() {
        @java.lang.Override
        public AcceptorToMicaLinkServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AcceptorToMicaLinkServiceFutureStub(channel, callOptions);
        }
      };
    return AcceptorToMicaLinkServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The service an Acceptor calls to manage links to a user's payment profile: complete a link from a linking code,
   * provision UUEKs from it, look it up and remove it. Payments made with those UUEKs are in AcceptorToMicaValueService.
   * A request that breaks a validation rule on its fields is rejected with INVALID_ARGUMENT before it is processed, and
   * a caller not permitted to use an operation gets PERMISSION_DENIED. CompleteLinkingWithCode and
   * ProvisionUUEKFromLink report every other failure as a gRPC status code; GetLink and RemoveInstrumentLink report
   * their outcome in the response.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Completes a link to a user's payment profile using the linking code the user gave you, and returns a link_key you
     * can keep and use with ProvisionUUEKFromLink to pay with that profile later. Set create_uuek to also receive a UUEK
     * for an immediate payment.
     * Failures are reported as gRPC status codes:
     *   NOT_FOUND           - the linking code is unknown or has already been used
     *   FAILED_PRECONDITION - the organization or acceptor was not found, or the organization is not active
     *   INVALID_ARGUMENT    - the organization key is malformed
     *   PERMISSION_DENIED   - the caller may not complete links
     * </pre>
     */
    default void completeLinkingWithCode(io.mica.acceptor.service.v2.CompleteLinkingWithCodeRequest request,
        io.grpc.stub.StreamObserver<io.mica.acceptor.service.v2.CompleteLinkingWithCodeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCompleteLinkingWithCodeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Provisions a new UUEK from a link_key returned by CompleteLinkingWithCode. Pass the UUEK to ObtainValue on
     * AcceptorToMicaValueService to pay with the linked payment profile.
     * Failures are reported as gRPC status codes:
     *   NOT_FOUND         - no link exists for this link_key (for example it was removed with RemoveInstrumentLink)
     *   INVALID_ARGUMENT  - the link_key is malformed
     *   PERMISSION_DENIED - the caller may not provision UUEKs
     *   INTERNAL          - the UUEK could not be provisioned
     * </pre>
     */
    default void provisionUUEKFromLink(io.mica.acceptor.service.v2.ProvisionUUEKFromLinkRequest request,
        io.grpc.stub.StreamObserver<io.mica.acceptor.service.v2.ProvisionUUEKFromLinkResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProvisionUUEKFromLinkMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves a link by the link_key returned when it was completed.
     * </pre>
     */
    default void getLink(io.mica.acceptor.instrument.v2.GetLinkRequest request,
        io.grpc.stub.StreamObserver<io.mica.acceptor.instrument.v2.GetLinkResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLinkMethod(), responseObserver);
    }

    /**
     * <pre>
     * Removes a link so it can no longer be used to provision UUEKs. Mica deletes the link and, where it can, notifies
     * the other side of the link.
     * </pre>
     */
    default void removeInstrumentLink(io.mica.acceptor.instrument.v2.RemoveInstrumentLinkRequest request,
        io.grpc.stub.StreamObserver<io.mica.acceptor.instrument.v2.RemoveInstrumentLinkResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveInstrumentLinkMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AcceptorToMicaLinkService.
   * <pre>
   * The service an Acceptor calls to manage links to a user's payment profile: complete a link from a linking code,
   * provision UUEKs from it, look it up and remove it. Payments made with those UUEKs are in AcceptorToMicaValueService.
   * A request that breaks a validation rule on its fields is rejected with INVALID_ARGUMENT before it is processed, and
   * a caller not permitted to use an operation gets PERMISSION_DENIED. CompleteLinkingWithCode and
   * ProvisionUUEKFromLink report every other failure as a gRPC status code; GetLink and RemoveInstrumentLink report
   * their outcome in the response.
   * </pre>
   */
  public static abstract class AcceptorToMicaLinkServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AcceptorToMicaLinkServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AcceptorToMicaLinkService.
   * <pre>
   * The service an Acceptor calls to manage links to a user's payment profile: complete a link from a linking code,
   * provision UUEKs from it, look it up and remove it. Payments made with those UUEKs are in AcceptorToMicaValueService.
   * A request that breaks a validation rule on its fields is rejected with INVALID_ARGUMENT before it is processed, and
   * a caller not permitted to use an operation gets PERMISSION_DENIED. CompleteLinkingWithCode and
   * ProvisionUUEKFromLink report every other failure as a gRPC status code; GetLink and RemoveInstrumentLink report
   * their outcome in the response.
   * </pre>
   */
  public static final class AcceptorToMicaLinkServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AcceptorToMicaLinkServiceStub> {
    private AcceptorToMicaLinkServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AcceptorToMicaLinkServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AcceptorToMicaLinkServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Completes a link to a user's payment profile using the linking code the user gave you, and returns a link_key you
     * can keep and use with ProvisionUUEKFromLink to pay with that profile later. Set create_uuek to also receive a UUEK
     * for an immediate payment.
     * Failures are reported as gRPC status codes:
     *   NOT_FOUND           - the linking code is unknown or has already been used
     *   FAILED_PRECONDITION - the organization or acceptor was not found, or the organization is not active
     *   INVALID_ARGUMENT    - the organization key is malformed
     *   PERMISSION_DENIED   - the caller may not complete links
     * </pre>
     */
    public void completeLinkingWithCode(io.mica.acceptor.service.v2.CompleteLinkingWithCodeRequest request,
        io.grpc.stub.StreamObserver<io.mica.acceptor.service.v2.CompleteLinkingWithCodeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCompleteLinkingWithCodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Provisions a new UUEK from a link_key returned by CompleteLinkingWithCode. Pass the UUEK to ObtainValue on
     * AcceptorToMicaValueService to pay with the linked payment profile.
     * Failures are reported as gRPC status codes:
     *   NOT_FOUND         - no link exists for this link_key (for example it was removed with RemoveInstrumentLink)
     *   INVALID_ARGUMENT  - the link_key is malformed
     *   PERMISSION_DENIED - the caller may not provision UUEKs
     *   INTERNAL          - the UUEK could not be provisioned
     * </pre>
     */
    public void provisionUUEKFromLink(io.mica.acceptor.service.v2.ProvisionUUEKFromLinkRequest request,
        io.grpc.stub.StreamObserver<io.mica.acceptor.service.v2.ProvisionUUEKFromLinkResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProvisionUUEKFromLinkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves a link by the link_key returned when it was completed.
     * </pre>
     */
    public void getLink(io.mica.acceptor.instrument.v2.GetLinkRequest request,
        io.grpc.stub.StreamObserver<io.mica.acceptor.instrument.v2.GetLinkResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetLinkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Removes a link so it can no longer be used to provision UUEKs. Mica deletes the link and, where it can, notifies
     * the other side of the link.
     * </pre>
     */
    public void removeInstrumentLink(io.mica.acceptor.instrument.v2.RemoveInstrumentLinkRequest request,
        io.grpc.stub.StreamObserver<io.mica.acceptor.instrument.v2.RemoveInstrumentLinkResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveInstrumentLinkMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AcceptorToMicaLinkService.
   * <pre>
   * The service an Acceptor calls to manage links to a user's payment profile: complete a link from a linking code,
   * provision UUEKs from it, look it up and remove it. Payments made with those UUEKs are in AcceptorToMicaValueService.
   * A request that breaks a validation rule on its fields is rejected with INVALID_ARGUMENT before it is processed, and
   * a caller not permitted to use an operation gets PERMISSION_DENIED. CompleteLinkingWithCode and
   * ProvisionUUEKFromLink report every other failure as a gRPC status code; GetLink and RemoveInstrumentLink report
   * their outcome in the response.
   * </pre>
   */
  public static final class AcceptorToMicaLinkServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<AcceptorToMicaLinkServiceBlockingV2Stub> {
    private AcceptorToMicaLinkServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AcceptorToMicaLinkServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AcceptorToMicaLinkServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Completes a link to a user's payment profile using the linking code the user gave you, and returns a link_key you
     * can keep and use with ProvisionUUEKFromLink to pay with that profile later. Set create_uuek to also receive a UUEK
     * for an immediate payment.
     * Failures are reported as gRPC status codes:
     *   NOT_FOUND           - the linking code is unknown or has already been used
     *   FAILED_PRECONDITION - the organization or acceptor was not found, or the organization is not active
     *   INVALID_ARGUMENT    - the organization key is malformed
     *   PERMISSION_DENIED   - the caller may not complete links
     * </pre>
     */
    public io.mica.acceptor.service.v2.CompleteLinkingWithCodeResponse completeLinkingWithCode(io.mica.acceptor.service.v2.CompleteLinkingWithCodeRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getCompleteLinkingWithCodeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Provisions a new UUEK from a link_key returned by CompleteLinkingWithCode. Pass the UUEK to ObtainValue on
     * AcceptorToMicaValueService to pay with the linked payment profile.
     * Failures are reported as gRPC status codes:
     *   NOT_FOUND         - no link exists for this link_key (for example it was removed with RemoveInstrumentLink)
     *   INVALID_ARGUMENT  - the link_key is malformed
     *   PERMISSION_DENIED - the caller may not provision UUEKs
     *   INTERNAL          - the UUEK could not be provisioned
     * </pre>
     */
    public io.mica.acceptor.service.v2.ProvisionUUEKFromLinkResponse provisionUUEKFromLink(io.mica.acceptor.service.v2.ProvisionUUEKFromLinkRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getProvisionUUEKFromLinkMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves a link by the link_key returned when it was completed.
     * </pre>
     */
    public io.mica.acceptor.instrument.v2.GetLinkResponse getLink(io.mica.acceptor.instrument.v2.GetLinkRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetLinkMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Removes a link so it can no longer be used to provision UUEKs. Mica deletes the link and, where it can, notifies
     * the other side of the link.
     * </pre>
     */
    public io.mica.acceptor.instrument.v2.RemoveInstrumentLinkResponse removeInstrumentLink(io.mica.acceptor.instrument.v2.RemoveInstrumentLinkRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getRemoveInstrumentLinkMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service AcceptorToMicaLinkService.
   * <pre>
   * The service an Acceptor calls to manage links to a user's payment profile: complete a link from a linking code,
   * provision UUEKs from it, look it up and remove it. Payments made with those UUEKs are in AcceptorToMicaValueService.
   * A request that breaks a validation rule on its fields is rejected with INVALID_ARGUMENT before it is processed, and
   * a caller not permitted to use an operation gets PERMISSION_DENIED. CompleteLinkingWithCode and
   * ProvisionUUEKFromLink report every other failure as a gRPC status code; GetLink and RemoveInstrumentLink report
   * their outcome in the response.
   * </pre>
   */
  public static final class AcceptorToMicaLinkServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AcceptorToMicaLinkServiceBlockingStub> {
    private AcceptorToMicaLinkServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AcceptorToMicaLinkServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AcceptorToMicaLinkServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Completes a link to a user's payment profile using the linking code the user gave you, and returns a link_key you
     * can keep and use with ProvisionUUEKFromLink to pay with that profile later. Set create_uuek to also receive a UUEK
     * for an immediate payment.
     * Failures are reported as gRPC status codes:
     *   NOT_FOUND           - the linking code is unknown or has already been used
     *   FAILED_PRECONDITION - the organization or acceptor was not found, or the organization is not active
     *   INVALID_ARGUMENT    - the organization key is malformed
     *   PERMISSION_DENIED   - the caller may not complete links
     * </pre>
     */
    public io.mica.acceptor.service.v2.CompleteLinkingWithCodeResponse completeLinkingWithCode(io.mica.acceptor.service.v2.CompleteLinkingWithCodeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCompleteLinkingWithCodeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Provisions a new UUEK from a link_key returned by CompleteLinkingWithCode. Pass the UUEK to ObtainValue on
     * AcceptorToMicaValueService to pay with the linked payment profile.
     * Failures are reported as gRPC status codes:
     *   NOT_FOUND         - no link exists for this link_key (for example it was removed with RemoveInstrumentLink)
     *   INVALID_ARGUMENT  - the link_key is malformed
     *   PERMISSION_DENIED - the caller may not provision UUEKs
     *   INTERNAL          - the UUEK could not be provisioned
     * </pre>
     */
    public io.mica.acceptor.service.v2.ProvisionUUEKFromLinkResponse provisionUUEKFromLink(io.mica.acceptor.service.v2.ProvisionUUEKFromLinkRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProvisionUUEKFromLinkMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves a link by the link_key returned when it was completed.
     * </pre>
     */
    public io.mica.acceptor.instrument.v2.GetLinkResponse getLink(io.mica.acceptor.instrument.v2.GetLinkRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetLinkMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Removes a link so it can no longer be used to provision UUEKs. Mica deletes the link and, where it can, notifies
     * the other side of the link.
     * </pre>
     */
    public io.mica.acceptor.instrument.v2.RemoveInstrumentLinkResponse removeInstrumentLink(io.mica.acceptor.instrument.v2.RemoveInstrumentLinkRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveInstrumentLinkMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AcceptorToMicaLinkService.
   * <pre>
   * The service an Acceptor calls to manage links to a user's payment profile: complete a link from a linking code,
   * provision UUEKs from it, look it up and remove it. Payments made with those UUEKs are in AcceptorToMicaValueService.
   * A request that breaks a validation rule on its fields is rejected with INVALID_ARGUMENT before it is processed, and
   * a caller not permitted to use an operation gets PERMISSION_DENIED. CompleteLinkingWithCode and
   * ProvisionUUEKFromLink report every other failure as a gRPC status code; GetLink and RemoveInstrumentLink report
   * their outcome in the response.
   * </pre>
   */
  public static final class AcceptorToMicaLinkServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AcceptorToMicaLinkServiceFutureStub> {
    private AcceptorToMicaLinkServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AcceptorToMicaLinkServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AcceptorToMicaLinkServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Completes a link to a user's payment profile using the linking code the user gave you, and returns a link_key you
     * can keep and use with ProvisionUUEKFromLink to pay with that profile later. Set create_uuek to also receive a UUEK
     * for an immediate payment.
     * Failures are reported as gRPC status codes:
     *   NOT_FOUND           - the linking code is unknown or has already been used
     *   FAILED_PRECONDITION - the organization or acceptor was not found, or the organization is not active
     *   INVALID_ARGUMENT    - the organization key is malformed
     *   PERMISSION_DENIED   - the caller may not complete links
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mica.acceptor.service.v2.CompleteLinkingWithCodeResponse> completeLinkingWithCode(
        io.mica.acceptor.service.v2.CompleteLinkingWithCodeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCompleteLinkingWithCodeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Provisions a new UUEK from a link_key returned by CompleteLinkingWithCode. Pass the UUEK to ObtainValue on
     * AcceptorToMicaValueService to pay with the linked payment profile.
     * Failures are reported as gRPC status codes:
     *   NOT_FOUND         - no link exists for this link_key (for example it was removed with RemoveInstrumentLink)
     *   INVALID_ARGUMENT  - the link_key is malformed
     *   PERMISSION_DENIED - the caller may not provision UUEKs
     *   INTERNAL          - the UUEK could not be provisioned
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mica.acceptor.service.v2.ProvisionUUEKFromLinkResponse> provisionUUEKFromLink(
        io.mica.acceptor.service.v2.ProvisionUUEKFromLinkRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProvisionUUEKFromLinkMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves a link by the link_key returned when it was completed.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mica.acceptor.instrument.v2.GetLinkResponse> getLink(
        io.mica.acceptor.instrument.v2.GetLinkRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetLinkMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Removes a link so it can no longer be used to provision UUEKs. Mica deletes the link and, where it can, notifies
     * the other side of the link.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mica.acceptor.instrument.v2.RemoveInstrumentLinkResponse> removeInstrumentLink(
        io.mica.acceptor.instrument.v2.RemoveInstrumentLinkRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveInstrumentLinkMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_COMPLETE_LINKING_WITH_CODE = 0;
  private static final int METHODID_PROVISION_UUEKFROM_LINK = 1;
  private static final int METHODID_GET_LINK = 2;
  private static final int METHODID_REMOVE_INSTRUMENT_LINK = 3;

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
        case METHODID_COMPLETE_LINKING_WITH_CODE:
          serviceImpl.completeLinkingWithCode((io.mica.acceptor.service.v2.CompleteLinkingWithCodeRequest) request,
              (io.grpc.stub.StreamObserver<io.mica.acceptor.service.v2.CompleteLinkingWithCodeResponse>) responseObserver);
          break;
        case METHODID_PROVISION_UUEKFROM_LINK:
          serviceImpl.provisionUUEKFromLink((io.mica.acceptor.service.v2.ProvisionUUEKFromLinkRequest) request,
              (io.grpc.stub.StreamObserver<io.mica.acceptor.service.v2.ProvisionUUEKFromLinkResponse>) responseObserver);
          break;
        case METHODID_GET_LINK:
          serviceImpl.getLink((io.mica.acceptor.instrument.v2.GetLinkRequest) request,
              (io.grpc.stub.StreamObserver<io.mica.acceptor.instrument.v2.GetLinkResponse>) responseObserver);
          break;
        case METHODID_REMOVE_INSTRUMENT_LINK:
          serviceImpl.removeInstrumentLink((io.mica.acceptor.instrument.v2.RemoveInstrumentLinkRequest) request,
              (io.grpc.stub.StreamObserver<io.mica.acceptor.instrument.v2.RemoveInstrumentLinkResponse>) responseObserver);
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
          getCompleteLinkingWithCodeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mica.acceptor.service.v2.CompleteLinkingWithCodeRequest,
              io.mica.acceptor.service.v2.CompleteLinkingWithCodeResponse>(
                service, METHODID_COMPLETE_LINKING_WITH_CODE)))
        .addMethod(
          getProvisionUUEKFromLinkMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mica.acceptor.service.v2.ProvisionUUEKFromLinkRequest,
              io.mica.acceptor.service.v2.ProvisionUUEKFromLinkResponse>(
                service, METHODID_PROVISION_UUEKFROM_LINK)))
        .addMethod(
          getGetLinkMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mica.acceptor.instrument.v2.GetLinkRequest,
              io.mica.acceptor.instrument.v2.GetLinkResponse>(
                service, METHODID_GET_LINK)))
        .addMethod(
          getRemoveInstrumentLinkMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mica.acceptor.instrument.v2.RemoveInstrumentLinkRequest,
              io.mica.acceptor.instrument.v2.RemoveInstrumentLinkResponse>(
                service, METHODID_REMOVE_INSTRUMENT_LINK)))
        .build();
  }

  private static abstract class AcceptorToMicaLinkServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AcceptorToMicaLinkServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.mica.acceptor.service.v2.AcceptorToMicaLinkServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AcceptorToMicaLinkService");
    }
  }

  private static final class AcceptorToMicaLinkServiceFileDescriptorSupplier
      extends AcceptorToMicaLinkServiceBaseDescriptorSupplier {
    AcceptorToMicaLinkServiceFileDescriptorSupplier() {}
  }

  private static final class AcceptorToMicaLinkServiceMethodDescriptorSupplier
      extends AcceptorToMicaLinkServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    AcceptorToMicaLinkServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (AcceptorToMicaLinkServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AcceptorToMicaLinkServiceFileDescriptorSupplier())
              .addMethod(getCompleteLinkingWithCodeMethod())
              .addMethod(getProvisionUUEKFromLinkMethod())
              .addMethod(getGetLinkMethod())
              .addMethod(getRemoveInstrumentLinkMethod())
              .build();
        }
      }
    }
    return result;
  }
}
