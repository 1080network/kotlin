package io.mica.member.auth.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Manages the client certificates ("to Mica" certificates) that a member uses to authenticate its calls to Mica's
 * Issuer and Acceptor APIs over mutual TLS. Each certificate carries a set of roles that decide which calls it may
 * make. You keep the private key: you send Mica a certificate signing request (CSR) and Mica returns the signed
 * certificate.
 * Every call requires a certificate with the matching permission; a caller without it gets the gRPC status
 * `PERMISSION_DENIED`.
 * </pre>
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class MTLSToMicaServiceGrpc {

  private MTLSToMicaServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "mica.member.auth.v1.MTLSToMicaService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.mica.member.auth.v1.GenerateCertificateRequest,
      io.mica.member.auth.v1.GenerateCertificateResponse> getGenerateCertificateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateCertificate",
      requestType = io.mica.member.auth.v1.GenerateCertificateRequest.class,
      responseType = io.mica.member.auth.v1.GenerateCertificateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mica.member.auth.v1.GenerateCertificateRequest,
      io.mica.member.auth.v1.GenerateCertificateResponse> getGenerateCertificateMethod() {
    io.grpc.MethodDescriptor<io.mica.member.auth.v1.GenerateCertificateRequest, io.mica.member.auth.v1.GenerateCertificateResponse> getGenerateCertificateMethod;
    if ((getGenerateCertificateMethod = MTLSToMicaServiceGrpc.getGenerateCertificateMethod) == null) {
      synchronized (MTLSToMicaServiceGrpc.class) {
        if ((getGenerateCertificateMethod = MTLSToMicaServiceGrpc.getGenerateCertificateMethod) == null) {
          MTLSToMicaServiceGrpc.getGenerateCertificateMethod = getGenerateCertificateMethod =
              io.grpc.MethodDescriptor.<io.mica.member.auth.v1.GenerateCertificateRequest, io.mica.member.auth.v1.GenerateCertificateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenerateCertificate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.member.auth.v1.GenerateCertificateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.member.auth.v1.GenerateCertificateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MTLSToMicaServiceMethodDescriptorSupplier("GenerateCertificate"))
              .build();
        }
      }
    }
    return getGenerateCertificateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mica.member.auth.v1.EnableCertificateRequest,
      io.mica.member.auth.v1.EnableCertificateResponse> getEnableCertificateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnableCertificate",
      requestType = io.mica.member.auth.v1.EnableCertificateRequest.class,
      responseType = io.mica.member.auth.v1.EnableCertificateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mica.member.auth.v1.EnableCertificateRequest,
      io.mica.member.auth.v1.EnableCertificateResponse> getEnableCertificateMethod() {
    io.grpc.MethodDescriptor<io.mica.member.auth.v1.EnableCertificateRequest, io.mica.member.auth.v1.EnableCertificateResponse> getEnableCertificateMethod;
    if ((getEnableCertificateMethod = MTLSToMicaServiceGrpc.getEnableCertificateMethod) == null) {
      synchronized (MTLSToMicaServiceGrpc.class) {
        if ((getEnableCertificateMethod = MTLSToMicaServiceGrpc.getEnableCertificateMethod) == null) {
          MTLSToMicaServiceGrpc.getEnableCertificateMethod = getEnableCertificateMethod =
              io.grpc.MethodDescriptor.<io.mica.member.auth.v1.EnableCertificateRequest, io.mica.member.auth.v1.EnableCertificateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EnableCertificate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.member.auth.v1.EnableCertificateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.member.auth.v1.EnableCertificateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MTLSToMicaServiceMethodDescriptorSupplier("EnableCertificate"))
              .build();
        }
      }
    }
    return getEnableCertificateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mica.member.auth.v1.DisableCertificateRequest,
      io.mica.member.auth.v1.DisableCertificateResponse> getDisableCertificateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DisableCertificate",
      requestType = io.mica.member.auth.v1.DisableCertificateRequest.class,
      responseType = io.mica.member.auth.v1.DisableCertificateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mica.member.auth.v1.DisableCertificateRequest,
      io.mica.member.auth.v1.DisableCertificateResponse> getDisableCertificateMethod() {
    io.grpc.MethodDescriptor<io.mica.member.auth.v1.DisableCertificateRequest, io.mica.member.auth.v1.DisableCertificateResponse> getDisableCertificateMethod;
    if ((getDisableCertificateMethod = MTLSToMicaServiceGrpc.getDisableCertificateMethod) == null) {
      synchronized (MTLSToMicaServiceGrpc.class) {
        if ((getDisableCertificateMethod = MTLSToMicaServiceGrpc.getDisableCertificateMethod) == null) {
          MTLSToMicaServiceGrpc.getDisableCertificateMethod = getDisableCertificateMethod =
              io.grpc.MethodDescriptor.<io.mica.member.auth.v1.DisableCertificateRequest, io.mica.member.auth.v1.DisableCertificateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DisableCertificate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.member.auth.v1.DisableCertificateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.member.auth.v1.DisableCertificateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MTLSToMicaServiceMethodDescriptorSupplier("DisableCertificate"))
              .build();
        }
      }
    }
    return getDisableCertificateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mica.member.auth.v1.SearchCertificateRequest,
      io.mica.member.auth.v1.SearchCertificateResponse> getSearchCertificateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchCertificate",
      requestType = io.mica.member.auth.v1.SearchCertificateRequest.class,
      responseType = io.mica.member.auth.v1.SearchCertificateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mica.member.auth.v1.SearchCertificateRequest,
      io.mica.member.auth.v1.SearchCertificateResponse> getSearchCertificateMethod() {
    io.grpc.MethodDescriptor<io.mica.member.auth.v1.SearchCertificateRequest, io.mica.member.auth.v1.SearchCertificateResponse> getSearchCertificateMethod;
    if ((getSearchCertificateMethod = MTLSToMicaServiceGrpc.getSearchCertificateMethod) == null) {
      synchronized (MTLSToMicaServiceGrpc.class) {
        if ((getSearchCertificateMethod = MTLSToMicaServiceGrpc.getSearchCertificateMethod) == null) {
          MTLSToMicaServiceGrpc.getSearchCertificateMethod = getSearchCertificateMethod =
              io.grpc.MethodDescriptor.<io.mica.member.auth.v1.SearchCertificateRequest, io.mica.member.auth.v1.SearchCertificateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchCertificate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.member.auth.v1.SearchCertificateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.member.auth.v1.SearchCertificateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MTLSToMicaServiceMethodDescriptorSupplier("SearchCertificate"))
              .build();
        }
      }
    }
    return getSearchCertificateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mica.member.auth.v1.GetCertificateRequest,
      io.mica.member.auth.v1.GetCertificateResponse> getGetCertificateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCertificate",
      requestType = io.mica.member.auth.v1.GetCertificateRequest.class,
      responseType = io.mica.member.auth.v1.GetCertificateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mica.member.auth.v1.GetCertificateRequest,
      io.mica.member.auth.v1.GetCertificateResponse> getGetCertificateMethod() {
    io.grpc.MethodDescriptor<io.mica.member.auth.v1.GetCertificateRequest, io.mica.member.auth.v1.GetCertificateResponse> getGetCertificateMethod;
    if ((getGetCertificateMethod = MTLSToMicaServiceGrpc.getGetCertificateMethod) == null) {
      synchronized (MTLSToMicaServiceGrpc.class) {
        if ((getGetCertificateMethod = MTLSToMicaServiceGrpc.getGetCertificateMethod) == null) {
          MTLSToMicaServiceGrpc.getGetCertificateMethod = getGetCertificateMethod =
              io.grpc.MethodDescriptor.<io.mica.member.auth.v1.GetCertificateRequest, io.mica.member.auth.v1.GetCertificateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCertificate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.member.auth.v1.GetCertificateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.member.auth.v1.GetCertificateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MTLSToMicaServiceMethodDescriptorSupplier("GetCertificate"))
              .build();
        }
      }
    }
    return getGetCertificateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MTLSToMicaServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MTLSToMicaServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MTLSToMicaServiceStub>() {
        @java.lang.Override
        public MTLSToMicaServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MTLSToMicaServiceStub(channel, callOptions);
        }
      };
    return MTLSToMicaServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static MTLSToMicaServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MTLSToMicaServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MTLSToMicaServiceBlockingV2Stub>() {
        @java.lang.Override
        public MTLSToMicaServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MTLSToMicaServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return MTLSToMicaServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MTLSToMicaServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MTLSToMicaServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MTLSToMicaServiceBlockingStub>() {
        @java.lang.Override
        public MTLSToMicaServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MTLSToMicaServiceBlockingStub(channel, callOptions);
        }
      };
    return MTLSToMicaServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MTLSToMicaServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MTLSToMicaServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MTLSToMicaServiceFutureStub>() {
        @java.lang.Override
        public MTLSToMicaServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MTLSToMicaServiceFutureStub(channel, callOptions);
        }
      };
    return MTLSToMicaServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Manages the client certificates ("to Mica" certificates) that a member uses to authenticate its calls to Mica's
   * Issuer and Acceptor APIs over mutual TLS. Each certificate carries a set of roles that decide which calls it may
   * make. You keep the private key: you send Mica a certificate signing request (CSR) and Mica returns the signed
   * certificate.
   * Every call requires a certificate with the matching permission; a caller without it gets the gRPC status
   * `PERMISSION_DENIED`.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Signs a CSR and returns a new client certificate with the requested roles. The certificate is enabled
     * immediately.
     * </pre>
     */
    default void generateCertificate(io.mica.member.auth.v1.GenerateCertificateRequest request,
        io.grpc.stub.StreamObserver<io.mica.member.auth.v1.GenerateCertificateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenerateCertificateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Re-enables a disabled certificate so that it can be used again.
     * </pre>
     */
    default void enableCertificate(io.mica.member.auth.v1.EnableCertificateRequest request,
        io.grpc.stub.StreamObserver<io.mica.member.auth.v1.EnableCertificateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEnableCertificateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Disables a certificate: Mica rejects calls made with it until it is enabled again. Use this to revoke access.
     * </pre>
     */
    default void disableCertificate(io.mica.member.auth.v1.DisableCertificateRequest request,
        io.grpc.stub.StreamObserver<io.mica.member.auth.v1.DisableCertificateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDisableCertificateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists every certificate issued for this member, including disabled and expired ones. Takes no filters. The listed
     * certificates do not include PEM data; use GetCertificate for that.
     * </pre>
     */
    default void searchCertificate(io.mica.member.auth.v1.SearchCertificateRequest request,
        io.grpc.stub.StreamObserver<io.mica.member.auth.v1.SearchCertificateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchCertificateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns one certificate, including its PEM data, by serial number.
     * </pre>
     */
    default void getCertificate(io.mica.member.auth.v1.GetCertificateRequest request,
        io.grpc.stub.StreamObserver<io.mica.member.auth.v1.GetCertificateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCertificateMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service MTLSToMicaService.
   * <pre>
   * Manages the client certificates ("to Mica" certificates) that a member uses to authenticate its calls to Mica's
   * Issuer and Acceptor APIs over mutual TLS. Each certificate carries a set of roles that decide which calls it may
   * make. You keep the private key: you send Mica a certificate signing request (CSR) and Mica returns the signed
   * certificate.
   * Every call requires a certificate with the matching permission; a caller without it gets the gRPC status
   * `PERMISSION_DENIED`.
   * </pre>
   */
  public static abstract class MTLSToMicaServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MTLSToMicaServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service MTLSToMicaService.
   * <pre>
   * Manages the client certificates ("to Mica" certificates) that a member uses to authenticate its calls to Mica's
   * Issuer and Acceptor APIs over mutual TLS. Each certificate carries a set of roles that decide which calls it may
   * make. You keep the private key: you send Mica a certificate signing request (CSR) and Mica returns the signed
   * certificate.
   * Every call requires a certificate with the matching permission; a caller without it gets the gRPC status
   * `PERMISSION_DENIED`.
   * </pre>
   */
  public static final class MTLSToMicaServiceStub
      extends io.grpc.stub.AbstractAsyncStub<MTLSToMicaServiceStub> {
    private MTLSToMicaServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MTLSToMicaServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MTLSToMicaServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Signs a CSR and returns a new client certificate with the requested roles. The certificate is enabled
     * immediately.
     * </pre>
     */
    public void generateCertificate(io.mica.member.auth.v1.GenerateCertificateRequest request,
        io.grpc.stub.StreamObserver<io.mica.member.auth.v1.GenerateCertificateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGenerateCertificateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Re-enables a disabled certificate so that it can be used again.
     * </pre>
     */
    public void enableCertificate(io.mica.member.auth.v1.EnableCertificateRequest request,
        io.grpc.stub.StreamObserver<io.mica.member.auth.v1.EnableCertificateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEnableCertificateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Disables a certificate: Mica rejects calls made with it until it is enabled again. Use this to revoke access.
     * </pre>
     */
    public void disableCertificate(io.mica.member.auth.v1.DisableCertificateRequest request,
        io.grpc.stub.StreamObserver<io.mica.member.auth.v1.DisableCertificateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDisableCertificateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists every certificate issued for this member, including disabled and expired ones. Takes no filters. The listed
     * certificates do not include PEM data; use GetCertificate for that.
     * </pre>
     */
    public void searchCertificate(io.mica.member.auth.v1.SearchCertificateRequest request,
        io.grpc.stub.StreamObserver<io.mica.member.auth.v1.SearchCertificateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchCertificateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns one certificate, including its PEM data, by serial number.
     * </pre>
     */
    public void getCertificate(io.mica.member.auth.v1.GetCertificateRequest request,
        io.grpc.stub.StreamObserver<io.mica.member.auth.v1.GetCertificateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCertificateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service MTLSToMicaService.
   * <pre>
   * Manages the client certificates ("to Mica" certificates) that a member uses to authenticate its calls to Mica's
   * Issuer and Acceptor APIs over mutual TLS. Each certificate carries a set of roles that decide which calls it may
   * make. You keep the private key: you send Mica a certificate signing request (CSR) and Mica returns the signed
   * certificate.
   * Every call requires a certificate with the matching permission; a caller without it gets the gRPC status
   * `PERMISSION_DENIED`.
   * </pre>
   */
  public static final class MTLSToMicaServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<MTLSToMicaServiceBlockingV2Stub> {
    private MTLSToMicaServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MTLSToMicaServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MTLSToMicaServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Signs a CSR and returns a new client certificate with the requested roles. The certificate is enabled
     * immediately.
     * </pre>
     */
    public io.mica.member.auth.v1.GenerateCertificateResponse generateCertificate(io.mica.member.auth.v1.GenerateCertificateRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGenerateCertificateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Re-enables a disabled certificate so that it can be used again.
     * </pre>
     */
    public io.mica.member.auth.v1.EnableCertificateResponse enableCertificate(io.mica.member.auth.v1.EnableCertificateRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getEnableCertificateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Disables a certificate: Mica rejects calls made with it until it is enabled again. Use this to revoke access.
     * </pre>
     */
    public io.mica.member.auth.v1.DisableCertificateResponse disableCertificate(io.mica.member.auth.v1.DisableCertificateRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getDisableCertificateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists every certificate issued for this member, including disabled and expired ones. Takes no filters. The listed
     * certificates do not include PEM data; use GetCertificate for that.
     * </pre>
     */
    public io.mica.member.auth.v1.SearchCertificateResponse searchCertificate(io.mica.member.auth.v1.SearchCertificateRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getSearchCertificateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns one certificate, including its PEM data, by serial number.
     * </pre>
     */
    public io.mica.member.auth.v1.GetCertificateResponse getCertificate(io.mica.member.auth.v1.GetCertificateRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetCertificateMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service MTLSToMicaService.
   * <pre>
   * Manages the client certificates ("to Mica" certificates) that a member uses to authenticate its calls to Mica's
   * Issuer and Acceptor APIs over mutual TLS. Each certificate carries a set of roles that decide which calls it may
   * make. You keep the private key: you send Mica a certificate signing request (CSR) and Mica returns the signed
   * certificate.
   * Every call requires a certificate with the matching permission; a caller without it gets the gRPC status
   * `PERMISSION_DENIED`.
   * </pre>
   */
  public static final class MTLSToMicaServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<MTLSToMicaServiceBlockingStub> {
    private MTLSToMicaServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MTLSToMicaServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MTLSToMicaServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Signs a CSR and returns a new client certificate with the requested roles. The certificate is enabled
     * immediately.
     * </pre>
     */
    public io.mica.member.auth.v1.GenerateCertificateResponse generateCertificate(io.mica.member.auth.v1.GenerateCertificateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateCertificateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Re-enables a disabled certificate so that it can be used again.
     * </pre>
     */
    public io.mica.member.auth.v1.EnableCertificateResponse enableCertificate(io.mica.member.auth.v1.EnableCertificateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEnableCertificateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Disables a certificate: Mica rejects calls made with it until it is enabled again. Use this to revoke access.
     * </pre>
     */
    public io.mica.member.auth.v1.DisableCertificateResponse disableCertificate(io.mica.member.auth.v1.DisableCertificateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDisableCertificateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists every certificate issued for this member, including disabled and expired ones. Takes no filters. The listed
     * certificates do not include PEM data; use GetCertificate for that.
     * </pre>
     */
    public io.mica.member.auth.v1.SearchCertificateResponse searchCertificate(io.mica.member.auth.v1.SearchCertificateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchCertificateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns one certificate, including its PEM data, by serial number.
     * </pre>
     */
    public io.mica.member.auth.v1.GetCertificateResponse getCertificate(io.mica.member.auth.v1.GetCertificateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCertificateMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service MTLSToMicaService.
   * <pre>
   * Manages the client certificates ("to Mica" certificates) that a member uses to authenticate its calls to Mica's
   * Issuer and Acceptor APIs over mutual TLS. Each certificate carries a set of roles that decide which calls it may
   * make. You keep the private key: you send Mica a certificate signing request (CSR) and Mica returns the signed
   * certificate.
   * Every call requires a certificate with the matching permission; a caller without it gets the gRPC status
   * `PERMISSION_DENIED`.
   * </pre>
   */
  public static final class MTLSToMicaServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<MTLSToMicaServiceFutureStub> {
    private MTLSToMicaServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MTLSToMicaServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MTLSToMicaServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Signs a CSR and returns a new client certificate with the requested roles. The certificate is enabled
     * immediately.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mica.member.auth.v1.GenerateCertificateResponse> generateCertificate(
        io.mica.member.auth.v1.GenerateCertificateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenerateCertificateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Re-enables a disabled certificate so that it can be used again.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mica.member.auth.v1.EnableCertificateResponse> enableCertificate(
        io.mica.member.auth.v1.EnableCertificateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEnableCertificateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Disables a certificate: Mica rejects calls made with it until it is enabled again. Use this to revoke access.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mica.member.auth.v1.DisableCertificateResponse> disableCertificate(
        io.mica.member.auth.v1.DisableCertificateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDisableCertificateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists every certificate issued for this member, including disabled and expired ones. Takes no filters. The listed
     * certificates do not include PEM data; use GetCertificate for that.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mica.member.auth.v1.SearchCertificateResponse> searchCertificate(
        io.mica.member.auth.v1.SearchCertificateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchCertificateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns one certificate, including its PEM data, by serial number.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mica.member.auth.v1.GetCertificateResponse> getCertificate(
        io.mica.member.auth.v1.GetCertificateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCertificateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GENERATE_CERTIFICATE = 0;
  private static final int METHODID_ENABLE_CERTIFICATE = 1;
  private static final int METHODID_DISABLE_CERTIFICATE = 2;
  private static final int METHODID_SEARCH_CERTIFICATE = 3;
  private static final int METHODID_GET_CERTIFICATE = 4;

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
        case METHODID_GENERATE_CERTIFICATE:
          serviceImpl.generateCertificate((io.mica.member.auth.v1.GenerateCertificateRequest) request,
              (io.grpc.stub.StreamObserver<io.mica.member.auth.v1.GenerateCertificateResponse>) responseObserver);
          break;
        case METHODID_ENABLE_CERTIFICATE:
          serviceImpl.enableCertificate((io.mica.member.auth.v1.EnableCertificateRequest) request,
              (io.grpc.stub.StreamObserver<io.mica.member.auth.v1.EnableCertificateResponse>) responseObserver);
          break;
        case METHODID_DISABLE_CERTIFICATE:
          serviceImpl.disableCertificate((io.mica.member.auth.v1.DisableCertificateRequest) request,
              (io.grpc.stub.StreamObserver<io.mica.member.auth.v1.DisableCertificateResponse>) responseObserver);
          break;
        case METHODID_SEARCH_CERTIFICATE:
          serviceImpl.searchCertificate((io.mica.member.auth.v1.SearchCertificateRequest) request,
              (io.grpc.stub.StreamObserver<io.mica.member.auth.v1.SearchCertificateResponse>) responseObserver);
          break;
        case METHODID_GET_CERTIFICATE:
          serviceImpl.getCertificate((io.mica.member.auth.v1.GetCertificateRequest) request,
              (io.grpc.stub.StreamObserver<io.mica.member.auth.v1.GetCertificateResponse>) responseObserver);
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
          getGenerateCertificateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mica.member.auth.v1.GenerateCertificateRequest,
              io.mica.member.auth.v1.GenerateCertificateResponse>(
                service, METHODID_GENERATE_CERTIFICATE)))
        .addMethod(
          getEnableCertificateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mica.member.auth.v1.EnableCertificateRequest,
              io.mica.member.auth.v1.EnableCertificateResponse>(
                service, METHODID_ENABLE_CERTIFICATE)))
        .addMethod(
          getDisableCertificateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mica.member.auth.v1.DisableCertificateRequest,
              io.mica.member.auth.v1.DisableCertificateResponse>(
                service, METHODID_DISABLE_CERTIFICATE)))
        .addMethod(
          getSearchCertificateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mica.member.auth.v1.SearchCertificateRequest,
              io.mica.member.auth.v1.SearchCertificateResponse>(
                service, METHODID_SEARCH_CERTIFICATE)))
        .addMethod(
          getGetCertificateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mica.member.auth.v1.GetCertificateRequest,
              io.mica.member.auth.v1.GetCertificateResponse>(
                service, METHODID_GET_CERTIFICATE)))
        .build();
  }

  private static abstract class MTLSToMicaServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MTLSToMicaServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.mica.member.auth.v1.MtlsToMicaServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MTLSToMicaService");
    }
  }

  private static final class MTLSToMicaServiceFileDescriptorSupplier
      extends MTLSToMicaServiceBaseDescriptorSupplier {
    MTLSToMicaServiceFileDescriptorSupplier() {}
  }

  private static final class MTLSToMicaServiceMethodDescriptorSupplier
      extends MTLSToMicaServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    MTLSToMicaServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (MTLSToMicaServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MTLSToMicaServiceFileDescriptorSupplier())
              .addMethod(getGenerateCertificateMethod())
              .addMethod(getEnableCertificateMethod())
              .addMethod(getDisableCertificateMethod())
              .addMethod(getSearchCertificateMethod())
              .addMethod(getGetCertificateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
