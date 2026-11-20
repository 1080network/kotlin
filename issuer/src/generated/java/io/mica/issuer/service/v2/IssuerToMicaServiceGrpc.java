package io.mica.issuer.service.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Operations the Issuer calls on Mica, authenticated with the Issuer's mTLS client certificate.
 * Before Mica can route payments to the Issuer, the Issuer registers each user with RegisterUser and each of that
 * user's instruments (accounts) with RegisterInstrument. Mica returns its own key for every record it creates
 * (`issuer_user_key`, `issuer_instrument_key`); most operations accept either that key or the Issuer's own reference
 * (`issuer_user_ref`, `issuer_instrument_ref`). The Issuer then provisions UUEKs for an instrument with
 * ProvisionIssuerUUEK and hands them to its users to pay at Acceptors.
 * The instrument link operations let a user connect one of their instruments to another member (for example, to save
 * a payment method at a merchant).
 * </pre>
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class IssuerToMicaServiceGrpc {

  private IssuerToMicaServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "mica.issuer.service.v2.IssuerToMicaService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.mica.issuer.issuer.v2.GetIssuerRequest,
      io.mica.issuer.issuer.v2.GetIssuerResponse> getGetIssuerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetIssuer",
      requestType = io.mica.issuer.issuer.v2.GetIssuerRequest.class,
      responseType = io.mica.issuer.issuer.v2.GetIssuerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mica.issuer.issuer.v2.GetIssuerRequest,
      io.mica.issuer.issuer.v2.GetIssuerResponse> getGetIssuerMethod() {
    io.grpc.MethodDescriptor<io.mica.issuer.issuer.v2.GetIssuerRequest, io.mica.issuer.issuer.v2.GetIssuerResponse> getGetIssuerMethod;
    if ((getGetIssuerMethod = IssuerToMicaServiceGrpc.getGetIssuerMethod) == null) {
      synchronized (IssuerToMicaServiceGrpc.class) {
        if ((getGetIssuerMethod = IssuerToMicaServiceGrpc.getGetIssuerMethod) == null) {
          IssuerToMicaServiceGrpc.getGetIssuerMethod = getGetIssuerMethod =
              io.grpc.MethodDescriptor.<io.mica.issuer.issuer.v2.GetIssuerRequest, io.mica.issuer.issuer.v2.GetIssuerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetIssuer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.issuer.issuer.v2.GetIssuerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.issuer.issuer.v2.GetIssuerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IssuerToMicaServiceMethodDescriptorSupplier("GetIssuer"))
              .build();
        }
      }
    }
    return getGetIssuerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mica.issuer.user.v2.RegisterUserRequest,
      io.mica.issuer.user.v2.RegisterUserResponse> getRegisterUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterUser",
      requestType = io.mica.issuer.user.v2.RegisterUserRequest.class,
      responseType = io.mica.issuer.user.v2.RegisterUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mica.issuer.user.v2.RegisterUserRequest,
      io.mica.issuer.user.v2.RegisterUserResponse> getRegisterUserMethod() {
    io.grpc.MethodDescriptor<io.mica.issuer.user.v2.RegisterUserRequest, io.mica.issuer.user.v2.RegisterUserResponse> getRegisterUserMethod;
    if ((getRegisterUserMethod = IssuerToMicaServiceGrpc.getRegisterUserMethod) == null) {
      synchronized (IssuerToMicaServiceGrpc.class) {
        if ((getRegisterUserMethod = IssuerToMicaServiceGrpc.getRegisterUserMethod) == null) {
          IssuerToMicaServiceGrpc.getRegisterUserMethod = getRegisterUserMethod =
              io.grpc.MethodDescriptor.<io.mica.issuer.user.v2.RegisterUserRequest, io.mica.issuer.user.v2.RegisterUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.issuer.user.v2.RegisterUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.issuer.user.v2.RegisterUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IssuerToMicaServiceMethodDescriptorSupplier("RegisterUser"))
              .build();
        }
      }
    }
    return getRegisterUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mica.issuer.user.v2.GetUserRequest,
      io.mica.issuer.user.v2.GetUserResponse> getGetUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUser",
      requestType = io.mica.issuer.user.v2.GetUserRequest.class,
      responseType = io.mica.issuer.user.v2.GetUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mica.issuer.user.v2.GetUserRequest,
      io.mica.issuer.user.v2.GetUserResponse> getGetUserMethod() {
    io.grpc.MethodDescriptor<io.mica.issuer.user.v2.GetUserRequest, io.mica.issuer.user.v2.GetUserResponse> getGetUserMethod;
    if ((getGetUserMethod = IssuerToMicaServiceGrpc.getGetUserMethod) == null) {
      synchronized (IssuerToMicaServiceGrpc.class) {
        if ((getGetUserMethod = IssuerToMicaServiceGrpc.getGetUserMethod) == null) {
          IssuerToMicaServiceGrpc.getGetUserMethod = getGetUserMethod =
              io.grpc.MethodDescriptor.<io.mica.issuer.user.v2.GetUserRequest, io.mica.issuer.user.v2.GetUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.issuer.user.v2.GetUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.issuer.user.v2.GetUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IssuerToMicaServiceMethodDescriptorSupplier("GetUser"))
              .build();
        }
      }
    }
    return getGetUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mica.issuer.user.v2.UpdateUserRequest,
      io.mica.issuer.user.v2.UpdateUserResponse> getUpdateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateUser",
      requestType = io.mica.issuer.user.v2.UpdateUserRequest.class,
      responseType = io.mica.issuer.user.v2.UpdateUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mica.issuer.user.v2.UpdateUserRequest,
      io.mica.issuer.user.v2.UpdateUserResponse> getUpdateUserMethod() {
    io.grpc.MethodDescriptor<io.mica.issuer.user.v2.UpdateUserRequest, io.mica.issuer.user.v2.UpdateUserResponse> getUpdateUserMethod;
    if ((getUpdateUserMethod = IssuerToMicaServiceGrpc.getUpdateUserMethod) == null) {
      synchronized (IssuerToMicaServiceGrpc.class) {
        if ((getUpdateUserMethod = IssuerToMicaServiceGrpc.getUpdateUserMethod) == null) {
          IssuerToMicaServiceGrpc.getUpdateUserMethod = getUpdateUserMethod =
              io.grpc.MethodDescriptor.<io.mica.issuer.user.v2.UpdateUserRequest, io.mica.issuer.user.v2.UpdateUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.issuer.user.v2.UpdateUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.issuer.user.v2.UpdateUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IssuerToMicaServiceMethodDescriptorSupplier("UpdateUser"))
              .build();
        }
      }
    }
    return getUpdateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mica.issuer.user.v2.RemoveUserRequest,
      io.mica.issuer.user.v2.RemoveUserResponse> getRemoveUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveUser",
      requestType = io.mica.issuer.user.v2.RemoveUserRequest.class,
      responseType = io.mica.issuer.user.v2.RemoveUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mica.issuer.user.v2.RemoveUserRequest,
      io.mica.issuer.user.v2.RemoveUserResponse> getRemoveUserMethod() {
    io.grpc.MethodDescriptor<io.mica.issuer.user.v2.RemoveUserRequest, io.mica.issuer.user.v2.RemoveUserResponse> getRemoveUserMethod;
    if ((getRemoveUserMethod = IssuerToMicaServiceGrpc.getRemoveUserMethod) == null) {
      synchronized (IssuerToMicaServiceGrpc.class) {
        if ((getRemoveUserMethod = IssuerToMicaServiceGrpc.getRemoveUserMethod) == null) {
          IssuerToMicaServiceGrpc.getRemoveUserMethod = getRemoveUserMethod =
              io.grpc.MethodDescriptor.<io.mica.issuer.user.v2.RemoveUserRequest, io.mica.issuer.user.v2.RemoveUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.issuer.user.v2.RemoveUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.issuer.user.v2.RemoveUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IssuerToMicaServiceMethodDescriptorSupplier("RemoveUser"))
              .build();
        }
      }
    }
    return getRemoveUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mica.issuer.instrument.v2.RegisterInstrumentRequest,
      io.mica.issuer.instrument.v2.RegisterInstrumentResponse> getRegisterInstrumentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterInstrument",
      requestType = io.mica.issuer.instrument.v2.RegisterInstrumentRequest.class,
      responseType = io.mica.issuer.instrument.v2.RegisterInstrumentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mica.issuer.instrument.v2.RegisterInstrumentRequest,
      io.mica.issuer.instrument.v2.RegisterInstrumentResponse> getRegisterInstrumentMethod() {
    io.grpc.MethodDescriptor<io.mica.issuer.instrument.v2.RegisterInstrumentRequest, io.mica.issuer.instrument.v2.RegisterInstrumentResponse> getRegisterInstrumentMethod;
    if ((getRegisterInstrumentMethod = IssuerToMicaServiceGrpc.getRegisterInstrumentMethod) == null) {
      synchronized (IssuerToMicaServiceGrpc.class) {
        if ((getRegisterInstrumentMethod = IssuerToMicaServiceGrpc.getRegisterInstrumentMethod) == null) {
          IssuerToMicaServiceGrpc.getRegisterInstrumentMethod = getRegisterInstrumentMethod =
              io.grpc.MethodDescriptor.<io.mica.issuer.instrument.v2.RegisterInstrumentRequest, io.mica.issuer.instrument.v2.RegisterInstrumentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterInstrument"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.issuer.instrument.v2.RegisterInstrumentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.issuer.instrument.v2.RegisterInstrumentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IssuerToMicaServiceMethodDescriptorSupplier("RegisterInstrument"))
              .build();
        }
      }
    }
    return getRegisterInstrumentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mica.issuer.instrument.v2.GetInstrumentRequest,
      io.mica.issuer.instrument.v2.GetInstrumentResponse> getGetInstrumentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetInstrument",
      requestType = io.mica.issuer.instrument.v2.GetInstrumentRequest.class,
      responseType = io.mica.issuer.instrument.v2.GetInstrumentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mica.issuer.instrument.v2.GetInstrumentRequest,
      io.mica.issuer.instrument.v2.GetInstrumentResponse> getGetInstrumentMethod() {
    io.grpc.MethodDescriptor<io.mica.issuer.instrument.v2.GetInstrumentRequest, io.mica.issuer.instrument.v2.GetInstrumentResponse> getGetInstrumentMethod;
    if ((getGetInstrumentMethod = IssuerToMicaServiceGrpc.getGetInstrumentMethod) == null) {
      synchronized (IssuerToMicaServiceGrpc.class) {
        if ((getGetInstrumentMethod = IssuerToMicaServiceGrpc.getGetInstrumentMethod) == null) {
          IssuerToMicaServiceGrpc.getGetInstrumentMethod = getGetInstrumentMethod =
              io.grpc.MethodDescriptor.<io.mica.issuer.instrument.v2.GetInstrumentRequest, io.mica.issuer.instrument.v2.GetInstrumentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetInstrument"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.issuer.instrument.v2.GetInstrumentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.issuer.instrument.v2.GetInstrumentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IssuerToMicaServiceMethodDescriptorSupplier("GetInstrument"))
              .build();
        }
      }
    }
    return getGetInstrumentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mica.issuer.instrument.v2.RemoveInstrumentRequest,
      io.mica.issuer.instrument.v2.RemoveInstrumentResponse> getRemoveInstrumentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveInstrument",
      requestType = io.mica.issuer.instrument.v2.RemoveInstrumentRequest.class,
      responseType = io.mica.issuer.instrument.v2.RemoveInstrumentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mica.issuer.instrument.v2.RemoveInstrumentRequest,
      io.mica.issuer.instrument.v2.RemoveInstrumentResponse> getRemoveInstrumentMethod() {
    io.grpc.MethodDescriptor<io.mica.issuer.instrument.v2.RemoveInstrumentRequest, io.mica.issuer.instrument.v2.RemoveInstrumentResponse> getRemoveInstrumentMethod;
    if ((getRemoveInstrumentMethod = IssuerToMicaServiceGrpc.getRemoveInstrumentMethod) == null) {
      synchronized (IssuerToMicaServiceGrpc.class) {
        if ((getRemoveInstrumentMethod = IssuerToMicaServiceGrpc.getRemoveInstrumentMethod) == null) {
          IssuerToMicaServiceGrpc.getRemoveInstrumentMethod = getRemoveInstrumentMethod =
              io.grpc.MethodDescriptor.<io.mica.issuer.instrument.v2.RemoveInstrumentRequest, io.mica.issuer.instrument.v2.RemoveInstrumentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveInstrument"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.issuer.instrument.v2.RemoveInstrumentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.issuer.instrument.v2.RemoveInstrumentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IssuerToMicaServiceMethodDescriptorSupplier("RemoveInstrument"))
              .build();
        }
      }
    }
    return getRemoveInstrumentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mica.issuer.instrument.v2.SearchInstrumentRequest,
      io.mica.issuer.instrument.v2.SearchInstrumentResponse> getSearchInstrumentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchInstrument",
      requestType = io.mica.issuer.instrument.v2.SearchInstrumentRequest.class,
      responseType = io.mica.issuer.instrument.v2.SearchInstrumentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mica.issuer.instrument.v2.SearchInstrumentRequest,
      io.mica.issuer.instrument.v2.SearchInstrumentResponse> getSearchInstrumentMethod() {
    io.grpc.MethodDescriptor<io.mica.issuer.instrument.v2.SearchInstrumentRequest, io.mica.issuer.instrument.v2.SearchInstrumentResponse> getSearchInstrumentMethod;
    if ((getSearchInstrumentMethod = IssuerToMicaServiceGrpc.getSearchInstrumentMethod) == null) {
      synchronized (IssuerToMicaServiceGrpc.class) {
        if ((getSearchInstrumentMethod = IssuerToMicaServiceGrpc.getSearchInstrumentMethod) == null) {
          IssuerToMicaServiceGrpc.getSearchInstrumentMethod = getSearchInstrumentMethod =
              io.grpc.MethodDescriptor.<io.mica.issuer.instrument.v2.SearchInstrumentRequest, io.mica.issuer.instrument.v2.SearchInstrumentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchInstrument"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.issuer.instrument.v2.SearchInstrumentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.issuer.instrument.v2.SearchInstrumentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IssuerToMicaServiceMethodDescriptorSupplier("SearchInstrument"))
              .build();
        }
      }
    }
    return getSearchInstrumentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mica.issuer.uuek.v2.ProvisionIssuerUUEKRequest,
      io.mica.issuer.uuek.v2.ProvisionIssuerUUEKResponse> getProvisionIssuerUUEKMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProvisionIssuerUUEK",
      requestType = io.mica.issuer.uuek.v2.ProvisionIssuerUUEKRequest.class,
      responseType = io.mica.issuer.uuek.v2.ProvisionIssuerUUEKResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mica.issuer.uuek.v2.ProvisionIssuerUUEKRequest,
      io.mica.issuer.uuek.v2.ProvisionIssuerUUEKResponse> getProvisionIssuerUUEKMethod() {
    io.grpc.MethodDescriptor<io.mica.issuer.uuek.v2.ProvisionIssuerUUEKRequest, io.mica.issuer.uuek.v2.ProvisionIssuerUUEKResponse> getProvisionIssuerUUEKMethod;
    if ((getProvisionIssuerUUEKMethod = IssuerToMicaServiceGrpc.getProvisionIssuerUUEKMethod) == null) {
      synchronized (IssuerToMicaServiceGrpc.class) {
        if ((getProvisionIssuerUUEKMethod = IssuerToMicaServiceGrpc.getProvisionIssuerUUEKMethod) == null) {
          IssuerToMicaServiceGrpc.getProvisionIssuerUUEKMethod = getProvisionIssuerUUEKMethod =
              io.grpc.MethodDescriptor.<io.mica.issuer.uuek.v2.ProvisionIssuerUUEKRequest, io.mica.issuer.uuek.v2.ProvisionIssuerUUEKResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProvisionIssuerUUEK"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.issuer.uuek.v2.ProvisionIssuerUUEKRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.issuer.uuek.v2.ProvisionIssuerUUEKResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IssuerToMicaServiceMethodDescriptorSupplier("ProvisionIssuerUUEK"))
              .build();
        }
      }
    }
    return getProvisionIssuerUUEKMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mica.issuer.instrument.v2.ProvisionInstrumentLinkingCodeRequest,
      io.mica.issuer.instrument.v2.ProvisionInstrumentLinkingCodeResponse> getProvisionInstrumentLinkingCodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProvisionInstrumentLinkingCode",
      requestType = io.mica.issuer.instrument.v2.ProvisionInstrumentLinkingCodeRequest.class,
      responseType = io.mica.issuer.instrument.v2.ProvisionInstrumentLinkingCodeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mica.issuer.instrument.v2.ProvisionInstrumentLinkingCodeRequest,
      io.mica.issuer.instrument.v2.ProvisionInstrumentLinkingCodeResponse> getProvisionInstrumentLinkingCodeMethod() {
    io.grpc.MethodDescriptor<io.mica.issuer.instrument.v2.ProvisionInstrumentLinkingCodeRequest, io.mica.issuer.instrument.v2.ProvisionInstrumentLinkingCodeResponse> getProvisionInstrumentLinkingCodeMethod;
    if ((getProvisionInstrumentLinkingCodeMethod = IssuerToMicaServiceGrpc.getProvisionInstrumentLinkingCodeMethod) == null) {
      synchronized (IssuerToMicaServiceGrpc.class) {
        if ((getProvisionInstrumentLinkingCodeMethod = IssuerToMicaServiceGrpc.getProvisionInstrumentLinkingCodeMethod) == null) {
          IssuerToMicaServiceGrpc.getProvisionInstrumentLinkingCodeMethod = getProvisionInstrumentLinkingCodeMethod =
              io.grpc.MethodDescriptor.<io.mica.issuer.instrument.v2.ProvisionInstrumentLinkingCodeRequest, io.mica.issuer.instrument.v2.ProvisionInstrumentLinkingCodeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProvisionInstrumentLinkingCode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.issuer.instrument.v2.ProvisionInstrumentLinkingCodeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.issuer.instrument.v2.ProvisionInstrumentLinkingCodeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IssuerToMicaServiceMethodDescriptorSupplier("ProvisionInstrumentLinkingCode"))
              .build();
        }
      }
    }
    return getProvisionInstrumentLinkingCodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mica.issuer.instrument.v2.CompleteLinkingWithCodeRequest,
      io.mica.issuer.instrument.v2.CompleteLinkingWithCodeResponse> getCompleteLinkingWithCodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CompleteLinkingWithCode",
      requestType = io.mica.issuer.instrument.v2.CompleteLinkingWithCodeRequest.class,
      responseType = io.mica.issuer.instrument.v2.CompleteLinkingWithCodeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mica.issuer.instrument.v2.CompleteLinkingWithCodeRequest,
      io.mica.issuer.instrument.v2.CompleteLinkingWithCodeResponse> getCompleteLinkingWithCodeMethod() {
    io.grpc.MethodDescriptor<io.mica.issuer.instrument.v2.CompleteLinkingWithCodeRequest, io.mica.issuer.instrument.v2.CompleteLinkingWithCodeResponse> getCompleteLinkingWithCodeMethod;
    if ((getCompleteLinkingWithCodeMethod = IssuerToMicaServiceGrpc.getCompleteLinkingWithCodeMethod) == null) {
      synchronized (IssuerToMicaServiceGrpc.class) {
        if ((getCompleteLinkingWithCodeMethod = IssuerToMicaServiceGrpc.getCompleteLinkingWithCodeMethod) == null) {
          IssuerToMicaServiceGrpc.getCompleteLinkingWithCodeMethod = getCompleteLinkingWithCodeMethod =
              io.grpc.MethodDescriptor.<io.mica.issuer.instrument.v2.CompleteLinkingWithCodeRequest, io.mica.issuer.instrument.v2.CompleteLinkingWithCodeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CompleteLinkingWithCode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.issuer.instrument.v2.CompleteLinkingWithCodeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.issuer.instrument.v2.CompleteLinkingWithCodeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IssuerToMicaServiceMethodDescriptorSupplier("CompleteLinkingWithCode"))
              .build();
        }
      }
    }
    return getCompleteLinkingWithCodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mica.issuer.instrument.v2.GetInstrumentLinkRequest,
      io.mica.issuer.instrument.v2.GetInstrumentLinkResponse> getGetInstrumentLinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetInstrumentLink",
      requestType = io.mica.issuer.instrument.v2.GetInstrumentLinkRequest.class,
      responseType = io.mica.issuer.instrument.v2.GetInstrumentLinkResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mica.issuer.instrument.v2.GetInstrumentLinkRequest,
      io.mica.issuer.instrument.v2.GetInstrumentLinkResponse> getGetInstrumentLinkMethod() {
    io.grpc.MethodDescriptor<io.mica.issuer.instrument.v2.GetInstrumentLinkRequest, io.mica.issuer.instrument.v2.GetInstrumentLinkResponse> getGetInstrumentLinkMethod;
    if ((getGetInstrumentLinkMethod = IssuerToMicaServiceGrpc.getGetInstrumentLinkMethod) == null) {
      synchronized (IssuerToMicaServiceGrpc.class) {
        if ((getGetInstrumentLinkMethod = IssuerToMicaServiceGrpc.getGetInstrumentLinkMethod) == null) {
          IssuerToMicaServiceGrpc.getGetInstrumentLinkMethod = getGetInstrumentLinkMethod =
              io.grpc.MethodDescriptor.<io.mica.issuer.instrument.v2.GetInstrumentLinkRequest, io.mica.issuer.instrument.v2.GetInstrumentLinkResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetInstrumentLink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.issuer.instrument.v2.GetInstrumentLinkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.issuer.instrument.v2.GetInstrumentLinkResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IssuerToMicaServiceMethodDescriptorSupplier("GetInstrumentLink"))
              .build();
        }
      }
    }
    return getGetInstrumentLinkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mica.issuer.instrument.v2.SearchInstrumentLinksRequest,
      io.mica.issuer.instrument.v2.SearchInstrumentLinksResponse> getSearchInstrumentLinksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchInstrumentLinks",
      requestType = io.mica.issuer.instrument.v2.SearchInstrumentLinksRequest.class,
      responseType = io.mica.issuer.instrument.v2.SearchInstrumentLinksResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mica.issuer.instrument.v2.SearchInstrumentLinksRequest,
      io.mica.issuer.instrument.v2.SearchInstrumentLinksResponse> getSearchInstrumentLinksMethod() {
    io.grpc.MethodDescriptor<io.mica.issuer.instrument.v2.SearchInstrumentLinksRequest, io.mica.issuer.instrument.v2.SearchInstrumentLinksResponse> getSearchInstrumentLinksMethod;
    if ((getSearchInstrumentLinksMethod = IssuerToMicaServiceGrpc.getSearchInstrumentLinksMethod) == null) {
      synchronized (IssuerToMicaServiceGrpc.class) {
        if ((getSearchInstrumentLinksMethod = IssuerToMicaServiceGrpc.getSearchInstrumentLinksMethod) == null) {
          IssuerToMicaServiceGrpc.getSearchInstrumentLinksMethod = getSearchInstrumentLinksMethod =
              io.grpc.MethodDescriptor.<io.mica.issuer.instrument.v2.SearchInstrumentLinksRequest, io.mica.issuer.instrument.v2.SearchInstrumentLinksResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchInstrumentLinks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.issuer.instrument.v2.SearchInstrumentLinksRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.issuer.instrument.v2.SearchInstrumentLinksResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IssuerToMicaServiceMethodDescriptorSupplier("SearchInstrumentLinks"))
              .build();
        }
      }
    }
    return getSearchInstrumentLinksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mica.issuer.instrument.v2.RemoveInstrumentLinkRequest,
      io.mica.issuer.instrument.v2.RemoveInstrumentLinkResponse> getRemoveInstrumentLinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveInstrumentLink",
      requestType = io.mica.issuer.instrument.v2.RemoveInstrumentLinkRequest.class,
      responseType = io.mica.issuer.instrument.v2.RemoveInstrumentLinkResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mica.issuer.instrument.v2.RemoveInstrumentLinkRequest,
      io.mica.issuer.instrument.v2.RemoveInstrumentLinkResponse> getRemoveInstrumentLinkMethod() {
    io.grpc.MethodDescriptor<io.mica.issuer.instrument.v2.RemoveInstrumentLinkRequest, io.mica.issuer.instrument.v2.RemoveInstrumentLinkResponse> getRemoveInstrumentLinkMethod;
    if ((getRemoveInstrumentLinkMethod = IssuerToMicaServiceGrpc.getRemoveInstrumentLinkMethod) == null) {
      synchronized (IssuerToMicaServiceGrpc.class) {
        if ((getRemoveInstrumentLinkMethod = IssuerToMicaServiceGrpc.getRemoveInstrumentLinkMethod) == null) {
          IssuerToMicaServiceGrpc.getRemoveInstrumentLinkMethod = getRemoveInstrumentLinkMethod =
              io.grpc.MethodDescriptor.<io.mica.issuer.instrument.v2.RemoveInstrumentLinkRequest, io.mica.issuer.instrument.v2.RemoveInstrumentLinkResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveInstrumentLink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.issuer.instrument.v2.RemoveInstrumentLinkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.issuer.instrument.v2.RemoveInstrumentLinkResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IssuerToMicaServiceMethodDescriptorSupplier("RemoveInstrumentLink"))
              .build();
        }
      }
    }
    return getRemoveInstrumentLinkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mica.issuer.value.v2.GetValueRequest,
      io.mica.issuer.value.v2.GetValueResponse> getGetValueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetValue",
      requestType = io.mica.issuer.value.v2.GetValueRequest.class,
      responseType = io.mica.issuer.value.v2.GetValueResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mica.issuer.value.v2.GetValueRequest,
      io.mica.issuer.value.v2.GetValueResponse> getGetValueMethod() {
    io.grpc.MethodDescriptor<io.mica.issuer.value.v2.GetValueRequest, io.mica.issuer.value.v2.GetValueResponse> getGetValueMethod;
    if ((getGetValueMethod = IssuerToMicaServiceGrpc.getGetValueMethod) == null) {
      synchronized (IssuerToMicaServiceGrpc.class) {
        if ((getGetValueMethod = IssuerToMicaServiceGrpc.getGetValueMethod) == null) {
          IssuerToMicaServiceGrpc.getGetValueMethod = getGetValueMethod =
              io.grpc.MethodDescriptor.<io.mica.issuer.value.v2.GetValueRequest, io.mica.issuer.value.v2.GetValueResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetValue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.issuer.value.v2.GetValueRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.issuer.value.v2.GetValueResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IssuerToMicaServiceMethodDescriptorSupplier("GetValue"))
              .build();
        }
      }
    }
    return getGetValueMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static IssuerToMicaServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IssuerToMicaServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IssuerToMicaServiceStub>() {
        @java.lang.Override
        public IssuerToMicaServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IssuerToMicaServiceStub(channel, callOptions);
        }
      };
    return IssuerToMicaServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static IssuerToMicaServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IssuerToMicaServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IssuerToMicaServiceBlockingV2Stub>() {
        @java.lang.Override
        public IssuerToMicaServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IssuerToMicaServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return IssuerToMicaServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static IssuerToMicaServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IssuerToMicaServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IssuerToMicaServiceBlockingStub>() {
        @java.lang.Override
        public IssuerToMicaServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IssuerToMicaServiceBlockingStub(channel, callOptions);
        }
      };
    return IssuerToMicaServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static IssuerToMicaServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IssuerToMicaServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IssuerToMicaServiceFutureStub>() {
        @java.lang.Override
        public IssuerToMicaServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IssuerToMicaServiceFutureStub(channel, callOptions);
        }
      };
    return IssuerToMicaServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Operations the Issuer calls on Mica, authenticated with the Issuer's mTLS client certificate.
   * Before Mica can route payments to the Issuer, the Issuer registers each user with RegisterUser and each of that
   * user's instruments (accounts) with RegisterInstrument. Mica returns its own key for every record it creates
   * (`issuer_user_key`, `issuer_instrument_key`); most operations accept either that key or the Issuer's own reference
   * (`issuer_user_ref`, `issuer_instrument_ref`). The Issuer then provisions UUEKs for an instrument with
   * ProvisionIssuerUUEK and hands them to its users to pay at Acceptors.
   * The instrument link operations let a user connect one of their instruments to another member (for example, to save
   * a payment method at a merchant).
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Returns the Issuer's own member record at Mica.
     * </pre>
     */
    default void getIssuer(io.mica.issuer.issuer.v2.GetIssuerRequest request,
        io.grpc.stub.StreamObserver<io.mica.issuer.issuer.v2.GetIssuerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetIssuerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Registers one of the Issuer's users with Mica and returns Mica's key for the user. This registers the user only;
     * register each of the user's instruments separately with RegisterInstrument. Returns STATUS_DUPLICATE if
     * `issuer_user_ref` is already registered.
     * </pre>
     */
    default void registerUser(io.mica.issuer.user.v2.RegisterUserRequest request,
        io.grpc.stub.StreamObserver<io.mica.issuer.user.v2.RegisterUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns a registered user, looked up by Mica's user key or the Issuer's user reference.
     * </pre>
     */
    default void getUser(io.mica.issuer.user.v2.GetUserRequest request,
        io.grpc.stub.StreamObserver<io.mica.issuer.user.v2.GetUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the demographic data Mica holds for a user. Pass the `version` last returned for the user; a stale version
     * returns STATUS_VERSION_MISMATCH.
     * </pre>
     */
    default void updateUser(io.mica.issuer.user.v2.UpdateUserRequest request,
        io.grpc.stub.StreamObserver<io.mica.issuer.user.v2.UpdateUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * Removes a user from Mica, typically when the user ends their relationship with the Issuer (for example, closes
     * their account). Once removed, the user's `issuer_user_ref` can be registered again.
     * </pre>
     */
    default void removeUser(io.mica.issuer.user.v2.RemoveUserRequest request,
        io.grpc.stub.StreamObserver<io.mica.issuer.user.v2.RemoveUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * Registers one of a user's instruments (accounts) with Mica and returns Mica's key for the instrument. The user must
     * already be registered. Returns STATUS_DUPLICATE if the user already has an instrument with this
     * `issuer_instrument_ref`.
     * </pre>
     */
    default void registerInstrument(io.mica.issuer.instrument.v2.RegisterInstrumentRequest request,
        io.grpc.stub.StreamObserver<io.mica.issuer.instrument.v2.RegisterInstrumentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterInstrumentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns a registered instrument, looked up by Mica's instrument key or by the Issuer's user and instrument
     * references.
     * </pre>
     */
    default void getInstrument(io.mica.issuer.instrument.v2.GetInstrumentRequest request,
        io.grpc.stub.StreamObserver<io.mica.issuer.instrument.v2.GetInstrumentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetInstrumentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Removes an instrument from Mica. Once removed, its `issuer_instrument_ref` can be registered again.
     * </pre>
     */
    default void removeInstrument(io.mica.issuer.instrument.v2.RemoveInstrumentRequest request,
        io.grpc.stub.StreamObserver<io.mica.issuer.instrument.v2.RemoveInstrumentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveInstrumentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns all instruments registered for a user.
     * </pre>
     */
    default void searchInstrument(io.mica.issuer.instrument.v2.SearchInstrumentRequest request,
        io.grpc.stub.StreamObserver<io.mica.issuer.instrument.v2.SearchInstrumentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchInstrumentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a UUEK for one of the Issuer's instruments. The Issuer gives the UUEK to its user, who presents it to an
     * Acceptor to pay from that instrument. The request controls how long, how often and for how much the UUEK can be
     * used.
     * </pre>
     */
    default void provisionIssuerUUEK(io.mica.issuer.uuek.v2.ProvisionIssuerUUEKRequest request,
        io.grpc.stub.StreamObserver<io.mica.issuer.uuek.v2.ProvisionIssuerUUEKResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProvisionIssuerUUEKMethod(), responseObserver);
    }

    /**
     * <pre>
     * Starts linking one of a user's instruments to another member by returning a linking code. The user enters the code
     * at the other member (for example, a merchant) to save the instrument as a persistent payment method there.
     * </pre>
     */
    default void provisionInstrumentLinkingCode(io.mica.issuer.instrument.v2.ProvisionInstrumentLinkingCodeRequest request,
        io.grpc.stub.StreamObserver<io.mica.issuer.instrument.v2.ProvisionInstrumentLinkingCodeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProvisionInstrumentLinkingCodeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Completes a link that another member started: the user brings a linking code from the other member, and the
     * Issuer submits it here together with the user and instrument the link should attach to.
     * </pre>
     */
    default void completeLinkingWithCode(io.mica.issuer.instrument.v2.CompleteLinkingWithCodeRequest request,
        io.grpc.stub.StreamObserver<io.mica.issuer.instrument.v2.CompleteLinkingWithCodeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCompleteLinkingWithCodeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns one instrument link by its `link_key`.
     * </pre>
     */
    default void getInstrumentLink(io.mica.issuer.instrument.v2.GetInstrumentLinkRequest request,
        io.grpc.stub.StreamObserver<io.mica.issuer.instrument.v2.GetInstrumentLinkResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetInstrumentLinkMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the established instrument links for a user, an instrument, or both.
     * </pre>
     */
    default void searchInstrumentLinks(io.mica.issuer.instrument.v2.SearchInstrumentLinksRequest request,
        io.grpc.stub.StreamObserver<io.mica.issuer.instrument.v2.SearchInstrumentLinksResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchInstrumentLinksMethod(), responseObserver);
    }

    /**
     * <pre>
     * Removes an instrument link. Mica also notifies the member on the other side of the link so it is removed there.
     * </pre>
     */
    default void removeInstrumentLink(io.mica.issuer.instrument.v2.RemoveInstrumentLinkRequest request,
        io.grpc.stub.StreamObserver<io.mica.issuer.instrument.v2.RemoveInstrumentLinkResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveInstrumentLinkMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the records of a past transaction by Mica's global transaction id or the Issuer's transaction reference.
     * Intended for pre-production testing: Mica purges transactions from its operational store shortly after they
     * complete, and this call only reads that store. `oldest_transaction_time` in the response says how far back data is
     * still available.
     * </pre>
     */
    default void getValue(io.mica.issuer.value.v2.GetValueRequest request,
        io.grpc.stub.StreamObserver<io.mica.issuer.value.v2.GetValueResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetValueMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service IssuerToMicaService.
   * <pre>
   * Operations the Issuer calls on Mica, authenticated with the Issuer's mTLS client certificate.
   * Before Mica can route payments to the Issuer, the Issuer registers each user with RegisterUser and each of that
   * user's instruments (accounts) with RegisterInstrument. Mica returns its own key for every record it creates
   * (`issuer_user_key`, `issuer_instrument_key`); most operations accept either that key or the Issuer's own reference
   * (`issuer_user_ref`, `issuer_instrument_ref`). The Issuer then provisions UUEKs for an instrument with
   * ProvisionIssuerUUEK and hands them to its users to pay at Acceptors.
   * The instrument link operations let a user connect one of their instruments to another member (for example, to save
   * a payment method at a merchant).
   * </pre>
   */
  public static abstract class IssuerToMicaServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return IssuerToMicaServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service IssuerToMicaService.
   * <pre>
   * Operations the Issuer calls on Mica, authenticated with the Issuer's mTLS client certificate.
   * Before Mica can route payments to the Issuer, the Issuer registers each user with RegisterUser and each of that
   * user's instruments (accounts) with RegisterInstrument. Mica returns its own key for every record it creates
   * (`issuer_user_key`, `issuer_instrument_key`); most operations accept either that key or the Issuer's own reference
   * (`issuer_user_ref`, `issuer_instrument_ref`). The Issuer then provisions UUEKs for an instrument with
   * ProvisionIssuerUUEK and hands them to its users to pay at Acceptors.
   * The instrument link operations let a user connect one of their instruments to another member (for example, to save
   * a payment method at a merchant).
   * </pre>
   */
  public static final class IssuerToMicaServiceStub
      extends io.grpc.stub.AbstractAsyncStub<IssuerToMicaServiceStub> {
    private IssuerToMicaServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IssuerToMicaServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IssuerToMicaServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the Issuer's own member record at Mica.
     * </pre>
     */
    public void getIssuer(io.mica.issuer.issuer.v2.GetIssuerRequest request,
        io.grpc.stub.StreamObserver<io.mica.issuer.issuer.v2.GetIssuerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetIssuerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Registers one of the Issuer's users with Mica and returns Mica's key for the user. This registers the user only;
     * register each of the user's instruments separately with RegisterInstrument. Returns STATUS_DUPLICATE if
     * `issuer_user_ref` is already registered.
     * </pre>
     */
    public void registerUser(io.mica.issuer.user.v2.RegisterUserRequest request,
        io.grpc.stub.StreamObserver<io.mica.issuer.user.v2.RegisterUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns a registered user, looked up by Mica's user key or the Issuer's user reference.
     * </pre>
     */
    public void getUser(io.mica.issuer.user.v2.GetUserRequest request,
        io.grpc.stub.StreamObserver<io.mica.issuer.user.v2.GetUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the demographic data Mica holds for a user. Pass the `version` last returned for the user; a stale version
     * returns STATUS_VERSION_MISMATCH.
     * </pre>
     */
    public void updateUser(io.mica.issuer.user.v2.UpdateUserRequest request,
        io.grpc.stub.StreamObserver<io.mica.issuer.user.v2.UpdateUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Removes a user from Mica, typically when the user ends their relationship with the Issuer (for example, closes
     * their account). Once removed, the user's `issuer_user_ref` can be registered again.
     * </pre>
     */
    public void removeUser(io.mica.issuer.user.v2.RemoveUserRequest request,
        io.grpc.stub.StreamObserver<io.mica.issuer.user.v2.RemoveUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Registers one of a user's instruments (accounts) with Mica and returns Mica's key for the instrument. The user must
     * already be registered. Returns STATUS_DUPLICATE if the user already has an instrument with this
     * `issuer_instrument_ref`.
     * </pre>
     */
    public void registerInstrument(io.mica.issuer.instrument.v2.RegisterInstrumentRequest request,
        io.grpc.stub.StreamObserver<io.mica.issuer.instrument.v2.RegisterInstrumentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterInstrumentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns a registered instrument, looked up by Mica's instrument key or by the Issuer's user and instrument
     * references.
     * </pre>
     */
    public void getInstrument(io.mica.issuer.instrument.v2.GetInstrumentRequest request,
        io.grpc.stub.StreamObserver<io.mica.issuer.instrument.v2.GetInstrumentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetInstrumentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Removes an instrument from Mica. Once removed, its `issuer_instrument_ref` can be registered again.
     * </pre>
     */
    public void removeInstrument(io.mica.issuer.instrument.v2.RemoveInstrumentRequest request,
        io.grpc.stub.StreamObserver<io.mica.issuer.instrument.v2.RemoveInstrumentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveInstrumentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns all instruments registered for a user.
     * </pre>
     */
    public void searchInstrument(io.mica.issuer.instrument.v2.SearchInstrumentRequest request,
        io.grpc.stub.StreamObserver<io.mica.issuer.instrument.v2.SearchInstrumentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchInstrumentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a UUEK for one of the Issuer's instruments. The Issuer gives the UUEK to its user, who presents it to an
     * Acceptor to pay from that instrument. The request controls how long, how often and for how much the UUEK can be
     * used.
     * </pre>
     */
    public void provisionIssuerUUEK(io.mica.issuer.uuek.v2.ProvisionIssuerUUEKRequest request,
        io.grpc.stub.StreamObserver<io.mica.issuer.uuek.v2.ProvisionIssuerUUEKResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProvisionIssuerUUEKMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Starts linking one of a user's instruments to another member by returning a linking code. The user enters the code
     * at the other member (for example, a merchant) to save the instrument as a persistent payment method there.
     * </pre>
     */
    public void provisionInstrumentLinkingCode(io.mica.issuer.instrument.v2.ProvisionInstrumentLinkingCodeRequest request,
        io.grpc.stub.StreamObserver<io.mica.issuer.instrument.v2.ProvisionInstrumentLinkingCodeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProvisionInstrumentLinkingCodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Completes a link that another member started: the user brings a linking code from the other member, and the
     * Issuer submits it here together with the user and instrument the link should attach to.
     * </pre>
     */
    public void completeLinkingWithCode(io.mica.issuer.instrument.v2.CompleteLinkingWithCodeRequest request,
        io.grpc.stub.StreamObserver<io.mica.issuer.instrument.v2.CompleteLinkingWithCodeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCompleteLinkingWithCodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns one instrument link by its `link_key`.
     * </pre>
     */
    public void getInstrumentLink(io.mica.issuer.instrument.v2.GetInstrumentLinkRequest request,
        io.grpc.stub.StreamObserver<io.mica.issuer.instrument.v2.GetInstrumentLinkResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetInstrumentLinkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the established instrument links for a user, an instrument, or both.
     * </pre>
     */
    public void searchInstrumentLinks(io.mica.issuer.instrument.v2.SearchInstrumentLinksRequest request,
        io.grpc.stub.StreamObserver<io.mica.issuer.instrument.v2.SearchInstrumentLinksResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchInstrumentLinksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Removes an instrument link. Mica also notifies the member on the other side of the link so it is removed there.
     * </pre>
     */
    public void removeInstrumentLink(io.mica.issuer.instrument.v2.RemoveInstrumentLinkRequest request,
        io.grpc.stub.StreamObserver<io.mica.issuer.instrument.v2.RemoveInstrumentLinkResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveInstrumentLinkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the records of a past transaction by Mica's global transaction id or the Issuer's transaction reference.
     * Intended for pre-production testing: Mica purges transactions from its operational store shortly after they
     * complete, and this call only reads that store. `oldest_transaction_time` in the response says how far back data is
     * still available.
     * </pre>
     */
    public void getValue(io.mica.issuer.value.v2.GetValueRequest request,
        io.grpc.stub.StreamObserver<io.mica.issuer.value.v2.GetValueResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetValueMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service IssuerToMicaService.
   * <pre>
   * Operations the Issuer calls on Mica, authenticated with the Issuer's mTLS client certificate.
   * Before Mica can route payments to the Issuer, the Issuer registers each user with RegisterUser and each of that
   * user's instruments (accounts) with RegisterInstrument. Mica returns its own key for every record it creates
   * (`issuer_user_key`, `issuer_instrument_key`); most operations accept either that key or the Issuer's own reference
   * (`issuer_user_ref`, `issuer_instrument_ref`). The Issuer then provisions UUEKs for an instrument with
   * ProvisionIssuerUUEK and hands them to its users to pay at Acceptors.
   * The instrument link operations let a user connect one of their instruments to another member (for example, to save
   * a payment method at a merchant).
   * </pre>
   */
  public static final class IssuerToMicaServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<IssuerToMicaServiceBlockingV2Stub> {
    private IssuerToMicaServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IssuerToMicaServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IssuerToMicaServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the Issuer's own member record at Mica.
     * </pre>
     */
    public io.mica.issuer.issuer.v2.GetIssuerResponse getIssuer(io.mica.issuer.issuer.v2.GetIssuerRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetIssuerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Registers one of the Issuer's users with Mica and returns Mica's key for the user. This registers the user only;
     * register each of the user's instruments separately with RegisterInstrument. Returns STATUS_DUPLICATE if
     * `issuer_user_ref` is already registered.
     * </pre>
     */
    public io.mica.issuer.user.v2.RegisterUserResponse registerUser(io.mica.issuer.user.v2.RegisterUserRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getRegisterUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns a registered user, looked up by Mica's user key or the Issuer's user reference.
     * </pre>
     */
    public io.mica.issuer.user.v2.GetUserResponse getUser(io.mica.issuer.user.v2.GetUserRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the demographic data Mica holds for a user. Pass the `version` last returned for the user; a stale version
     * returns STATUS_VERSION_MISMATCH.
     * </pre>
     */
    public io.mica.issuer.user.v2.UpdateUserResponse updateUser(io.mica.issuer.user.v2.UpdateUserRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getUpdateUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Removes a user from Mica, typically when the user ends their relationship with the Issuer (for example, closes
     * their account). Once removed, the user's `issuer_user_ref` can be registered again.
     * </pre>
     */
    public io.mica.issuer.user.v2.RemoveUserResponse removeUser(io.mica.issuer.user.v2.RemoveUserRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getRemoveUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Registers one of a user's instruments (accounts) with Mica and returns Mica's key for the instrument. The user must
     * already be registered. Returns STATUS_DUPLICATE if the user already has an instrument with this
     * `issuer_instrument_ref`.
     * </pre>
     */
    public io.mica.issuer.instrument.v2.RegisterInstrumentResponse registerInstrument(io.mica.issuer.instrument.v2.RegisterInstrumentRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getRegisterInstrumentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns a registered instrument, looked up by Mica's instrument key or by the Issuer's user and instrument
     * references.
     * </pre>
     */
    public io.mica.issuer.instrument.v2.GetInstrumentResponse getInstrument(io.mica.issuer.instrument.v2.GetInstrumentRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetInstrumentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Removes an instrument from Mica. Once removed, its `issuer_instrument_ref` can be registered again.
     * </pre>
     */
    public io.mica.issuer.instrument.v2.RemoveInstrumentResponse removeInstrument(io.mica.issuer.instrument.v2.RemoveInstrumentRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getRemoveInstrumentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns all instruments registered for a user.
     * </pre>
     */
    public io.mica.issuer.instrument.v2.SearchInstrumentResponse searchInstrument(io.mica.issuer.instrument.v2.SearchInstrumentRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getSearchInstrumentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a UUEK for one of the Issuer's instruments. The Issuer gives the UUEK to its user, who presents it to an
     * Acceptor to pay from that instrument. The request controls how long, how often and for how much the UUEK can be
     * used.
     * </pre>
     */
    public io.mica.issuer.uuek.v2.ProvisionIssuerUUEKResponse provisionIssuerUUEK(io.mica.issuer.uuek.v2.ProvisionIssuerUUEKRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getProvisionIssuerUUEKMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Starts linking one of a user's instruments to another member by returning a linking code. The user enters the code
     * at the other member (for example, a merchant) to save the instrument as a persistent payment method there.
     * </pre>
     */
    public io.mica.issuer.instrument.v2.ProvisionInstrumentLinkingCodeResponse provisionInstrumentLinkingCode(io.mica.issuer.instrument.v2.ProvisionInstrumentLinkingCodeRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getProvisionInstrumentLinkingCodeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Completes a link that another member started: the user brings a linking code from the other member, and the
     * Issuer submits it here together with the user and instrument the link should attach to.
     * </pre>
     */
    public io.mica.issuer.instrument.v2.CompleteLinkingWithCodeResponse completeLinkingWithCode(io.mica.issuer.instrument.v2.CompleteLinkingWithCodeRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getCompleteLinkingWithCodeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns one instrument link by its `link_key`.
     * </pre>
     */
    public io.mica.issuer.instrument.v2.GetInstrumentLinkResponse getInstrumentLink(io.mica.issuer.instrument.v2.GetInstrumentLinkRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetInstrumentLinkMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the established instrument links for a user, an instrument, or both.
     * </pre>
     */
    public io.mica.issuer.instrument.v2.SearchInstrumentLinksResponse searchInstrumentLinks(io.mica.issuer.instrument.v2.SearchInstrumentLinksRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getSearchInstrumentLinksMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Removes an instrument link. Mica also notifies the member on the other side of the link so it is removed there.
     * </pre>
     */
    public io.mica.issuer.instrument.v2.RemoveInstrumentLinkResponse removeInstrumentLink(io.mica.issuer.instrument.v2.RemoveInstrumentLinkRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getRemoveInstrumentLinkMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the records of a past transaction by Mica's global transaction id or the Issuer's transaction reference.
     * Intended for pre-production testing: Mica purges transactions from its operational store shortly after they
     * complete, and this call only reads that store. `oldest_transaction_time` in the response says how far back data is
     * still available.
     * </pre>
     */
    public io.mica.issuer.value.v2.GetValueResponse getValue(io.mica.issuer.value.v2.GetValueRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetValueMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service IssuerToMicaService.
   * <pre>
   * Operations the Issuer calls on Mica, authenticated with the Issuer's mTLS client certificate.
   * Before Mica can route payments to the Issuer, the Issuer registers each user with RegisterUser and each of that
   * user's instruments (accounts) with RegisterInstrument. Mica returns its own key for every record it creates
   * (`issuer_user_key`, `issuer_instrument_key`); most operations accept either that key or the Issuer's own reference
   * (`issuer_user_ref`, `issuer_instrument_ref`). The Issuer then provisions UUEKs for an instrument with
   * ProvisionIssuerUUEK and hands them to its users to pay at Acceptors.
   * The instrument link operations let a user connect one of their instruments to another member (for example, to save
   * a payment method at a merchant).
   * </pre>
   */
  public static final class IssuerToMicaServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<IssuerToMicaServiceBlockingStub> {
    private IssuerToMicaServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IssuerToMicaServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IssuerToMicaServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the Issuer's own member record at Mica.
     * </pre>
     */
    public io.mica.issuer.issuer.v2.GetIssuerResponse getIssuer(io.mica.issuer.issuer.v2.GetIssuerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetIssuerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Registers one of the Issuer's users with Mica and returns Mica's key for the user. This registers the user only;
     * register each of the user's instruments separately with RegisterInstrument. Returns STATUS_DUPLICATE if
     * `issuer_user_ref` is already registered.
     * </pre>
     */
    public io.mica.issuer.user.v2.RegisterUserResponse registerUser(io.mica.issuer.user.v2.RegisterUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns a registered user, looked up by Mica's user key or the Issuer's user reference.
     * </pre>
     */
    public io.mica.issuer.user.v2.GetUserResponse getUser(io.mica.issuer.user.v2.GetUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the demographic data Mica holds for a user. Pass the `version` last returned for the user; a stale version
     * returns STATUS_VERSION_MISMATCH.
     * </pre>
     */
    public io.mica.issuer.user.v2.UpdateUserResponse updateUser(io.mica.issuer.user.v2.UpdateUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Removes a user from Mica, typically when the user ends their relationship with the Issuer (for example, closes
     * their account). Once removed, the user's `issuer_user_ref` can be registered again.
     * </pre>
     */
    public io.mica.issuer.user.v2.RemoveUserResponse removeUser(io.mica.issuer.user.v2.RemoveUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Registers one of a user's instruments (accounts) with Mica and returns Mica's key for the instrument. The user must
     * already be registered. Returns STATUS_DUPLICATE if the user already has an instrument with this
     * `issuer_instrument_ref`.
     * </pre>
     */
    public io.mica.issuer.instrument.v2.RegisterInstrumentResponse registerInstrument(io.mica.issuer.instrument.v2.RegisterInstrumentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterInstrumentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns a registered instrument, looked up by Mica's instrument key or by the Issuer's user and instrument
     * references.
     * </pre>
     */
    public io.mica.issuer.instrument.v2.GetInstrumentResponse getInstrument(io.mica.issuer.instrument.v2.GetInstrumentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetInstrumentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Removes an instrument from Mica. Once removed, its `issuer_instrument_ref` can be registered again.
     * </pre>
     */
    public io.mica.issuer.instrument.v2.RemoveInstrumentResponse removeInstrument(io.mica.issuer.instrument.v2.RemoveInstrumentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveInstrumentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns all instruments registered for a user.
     * </pre>
     */
    public io.mica.issuer.instrument.v2.SearchInstrumentResponse searchInstrument(io.mica.issuer.instrument.v2.SearchInstrumentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchInstrumentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a UUEK for one of the Issuer's instruments. The Issuer gives the UUEK to its user, who presents it to an
     * Acceptor to pay from that instrument. The request controls how long, how often and for how much the UUEK can be
     * used.
     * </pre>
     */
    public io.mica.issuer.uuek.v2.ProvisionIssuerUUEKResponse provisionIssuerUUEK(io.mica.issuer.uuek.v2.ProvisionIssuerUUEKRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProvisionIssuerUUEKMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Starts linking one of a user's instruments to another member by returning a linking code. The user enters the code
     * at the other member (for example, a merchant) to save the instrument as a persistent payment method there.
     * </pre>
     */
    public io.mica.issuer.instrument.v2.ProvisionInstrumentLinkingCodeResponse provisionInstrumentLinkingCode(io.mica.issuer.instrument.v2.ProvisionInstrumentLinkingCodeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProvisionInstrumentLinkingCodeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Completes a link that another member started: the user brings a linking code from the other member, and the
     * Issuer submits it here together with the user and instrument the link should attach to.
     * </pre>
     */
    public io.mica.issuer.instrument.v2.CompleteLinkingWithCodeResponse completeLinkingWithCode(io.mica.issuer.instrument.v2.CompleteLinkingWithCodeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCompleteLinkingWithCodeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns one instrument link by its `link_key`.
     * </pre>
     */
    public io.mica.issuer.instrument.v2.GetInstrumentLinkResponse getInstrumentLink(io.mica.issuer.instrument.v2.GetInstrumentLinkRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetInstrumentLinkMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the established instrument links for a user, an instrument, or both.
     * </pre>
     */
    public io.mica.issuer.instrument.v2.SearchInstrumentLinksResponse searchInstrumentLinks(io.mica.issuer.instrument.v2.SearchInstrumentLinksRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchInstrumentLinksMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Removes an instrument link. Mica also notifies the member on the other side of the link so it is removed there.
     * </pre>
     */
    public io.mica.issuer.instrument.v2.RemoveInstrumentLinkResponse removeInstrumentLink(io.mica.issuer.instrument.v2.RemoveInstrumentLinkRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveInstrumentLinkMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the records of a past transaction by Mica's global transaction id or the Issuer's transaction reference.
     * Intended for pre-production testing: Mica purges transactions from its operational store shortly after they
     * complete, and this call only reads that store. `oldest_transaction_time` in the response says how far back data is
     * still available.
     * </pre>
     */
    public io.mica.issuer.value.v2.GetValueResponse getValue(io.mica.issuer.value.v2.GetValueRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetValueMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service IssuerToMicaService.
   * <pre>
   * Operations the Issuer calls on Mica, authenticated with the Issuer's mTLS client certificate.
   * Before Mica can route payments to the Issuer, the Issuer registers each user with RegisterUser and each of that
   * user's instruments (accounts) with RegisterInstrument. Mica returns its own key for every record it creates
   * (`issuer_user_key`, `issuer_instrument_key`); most operations accept either that key or the Issuer's own reference
   * (`issuer_user_ref`, `issuer_instrument_ref`). The Issuer then provisions UUEKs for an instrument with
   * ProvisionIssuerUUEK and hands them to its users to pay at Acceptors.
   * The instrument link operations let a user connect one of their instruments to another member (for example, to save
   * a payment method at a merchant).
   * </pre>
   */
  public static final class IssuerToMicaServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<IssuerToMicaServiceFutureStub> {
    private IssuerToMicaServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IssuerToMicaServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IssuerToMicaServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the Issuer's own member record at Mica.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mica.issuer.issuer.v2.GetIssuerResponse> getIssuer(
        io.mica.issuer.issuer.v2.GetIssuerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetIssuerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Registers one of the Issuer's users with Mica and returns Mica's key for the user. This registers the user only;
     * register each of the user's instruments separately with RegisterInstrument. Returns STATUS_DUPLICATE if
     * `issuer_user_ref` is already registered.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mica.issuer.user.v2.RegisterUserResponse> registerUser(
        io.mica.issuer.user.v2.RegisterUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns a registered user, looked up by Mica's user key or the Issuer's user reference.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mica.issuer.user.v2.GetUserResponse> getUser(
        io.mica.issuer.user.v2.GetUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the demographic data Mica holds for a user. Pass the `version` last returned for the user; a stale version
     * returns STATUS_VERSION_MISMATCH.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mica.issuer.user.v2.UpdateUserResponse> updateUser(
        io.mica.issuer.user.v2.UpdateUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Removes a user from Mica, typically when the user ends their relationship with the Issuer (for example, closes
     * their account). Once removed, the user's `issuer_user_ref` can be registered again.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mica.issuer.user.v2.RemoveUserResponse> removeUser(
        io.mica.issuer.user.v2.RemoveUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Registers one of a user's instruments (accounts) with Mica and returns Mica's key for the instrument. The user must
     * already be registered. Returns STATUS_DUPLICATE if the user already has an instrument with this
     * `issuer_instrument_ref`.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mica.issuer.instrument.v2.RegisterInstrumentResponse> registerInstrument(
        io.mica.issuer.instrument.v2.RegisterInstrumentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterInstrumentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns a registered instrument, looked up by Mica's instrument key or by the Issuer's user and instrument
     * references.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mica.issuer.instrument.v2.GetInstrumentResponse> getInstrument(
        io.mica.issuer.instrument.v2.GetInstrumentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetInstrumentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Removes an instrument from Mica. Once removed, its `issuer_instrument_ref` can be registered again.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mica.issuer.instrument.v2.RemoveInstrumentResponse> removeInstrument(
        io.mica.issuer.instrument.v2.RemoveInstrumentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveInstrumentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns all instruments registered for a user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mica.issuer.instrument.v2.SearchInstrumentResponse> searchInstrument(
        io.mica.issuer.instrument.v2.SearchInstrumentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchInstrumentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a UUEK for one of the Issuer's instruments. The Issuer gives the UUEK to its user, who presents it to an
     * Acceptor to pay from that instrument. The request controls how long, how often and for how much the UUEK can be
     * used.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mica.issuer.uuek.v2.ProvisionIssuerUUEKResponse> provisionIssuerUUEK(
        io.mica.issuer.uuek.v2.ProvisionIssuerUUEKRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProvisionIssuerUUEKMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Starts linking one of a user's instruments to another member by returning a linking code. The user enters the code
     * at the other member (for example, a merchant) to save the instrument as a persistent payment method there.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mica.issuer.instrument.v2.ProvisionInstrumentLinkingCodeResponse> provisionInstrumentLinkingCode(
        io.mica.issuer.instrument.v2.ProvisionInstrumentLinkingCodeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProvisionInstrumentLinkingCodeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Completes a link that another member started: the user brings a linking code from the other member, and the
     * Issuer submits it here together with the user and instrument the link should attach to.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mica.issuer.instrument.v2.CompleteLinkingWithCodeResponse> completeLinkingWithCode(
        io.mica.issuer.instrument.v2.CompleteLinkingWithCodeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCompleteLinkingWithCodeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns one instrument link by its `link_key`.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mica.issuer.instrument.v2.GetInstrumentLinkResponse> getInstrumentLink(
        io.mica.issuer.instrument.v2.GetInstrumentLinkRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetInstrumentLinkMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the established instrument links for a user, an instrument, or both.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mica.issuer.instrument.v2.SearchInstrumentLinksResponse> searchInstrumentLinks(
        io.mica.issuer.instrument.v2.SearchInstrumentLinksRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchInstrumentLinksMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Removes an instrument link. Mica also notifies the member on the other side of the link so it is removed there.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mica.issuer.instrument.v2.RemoveInstrumentLinkResponse> removeInstrumentLink(
        io.mica.issuer.instrument.v2.RemoveInstrumentLinkRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveInstrumentLinkMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the records of a past transaction by Mica's global transaction id or the Issuer's transaction reference.
     * Intended for pre-production testing: Mica purges transactions from its operational store shortly after they
     * complete, and this call only reads that store. `oldest_transaction_time` in the response says how far back data is
     * still available.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mica.issuer.value.v2.GetValueResponse> getValue(
        io.mica.issuer.value.v2.GetValueRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetValueMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ISSUER = 0;
  private static final int METHODID_REGISTER_USER = 1;
  private static final int METHODID_GET_USER = 2;
  private static final int METHODID_UPDATE_USER = 3;
  private static final int METHODID_REMOVE_USER = 4;
  private static final int METHODID_REGISTER_INSTRUMENT = 5;
  private static final int METHODID_GET_INSTRUMENT = 6;
  private static final int METHODID_REMOVE_INSTRUMENT = 7;
  private static final int METHODID_SEARCH_INSTRUMENT = 8;
  private static final int METHODID_PROVISION_ISSUER_UUEK = 9;
  private static final int METHODID_PROVISION_INSTRUMENT_LINKING_CODE = 10;
  private static final int METHODID_COMPLETE_LINKING_WITH_CODE = 11;
  private static final int METHODID_GET_INSTRUMENT_LINK = 12;
  private static final int METHODID_SEARCH_INSTRUMENT_LINKS = 13;
  private static final int METHODID_REMOVE_INSTRUMENT_LINK = 14;
  private static final int METHODID_GET_VALUE = 15;

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
        case METHODID_GET_ISSUER:
          serviceImpl.getIssuer((io.mica.issuer.issuer.v2.GetIssuerRequest) request,
              (io.grpc.stub.StreamObserver<io.mica.issuer.issuer.v2.GetIssuerResponse>) responseObserver);
          break;
        case METHODID_REGISTER_USER:
          serviceImpl.registerUser((io.mica.issuer.user.v2.RegisterUserRequest) request,
              (io.grpc.stub.StreamObserver<io.mica.issuer.user.v2.RegisterUserResponse>) responseObserver);
          break;
        case METHODID_GET_USER:
          serviceImpl.getUser((io.mica.issuer.user.v2.GetUserRequest) request,
              (io.grpc.stub.StreamObserver<io.mica.issuer.user.v2.GetUserResponse>) responseObserver);
          break;
        case METHODID_UPDATE_USER:
          serviceImpl.updateUser((io.mica.issuer.user.v2.UpdateUserRequest) request,
              (io.grpc.stub.StreamObserver<io.mica.issuer.user.v2.UpdateUserResponse>) responseObserver);
          break;
        case METHODID_REMOVE_USER:
          serviceImpl.removeUser((io.mica.issuer.user.v2.RemoveUserRequest) request,
              (io.grpc.stub.StreamObserver<io.mica.issuer.user.v2.RemoveUserResponse>) responseObserver);
          break;
        case METHODID_REGISTER_INSTRUMENT:
          serviceImpl.registerInstrument((io.mica.issuer.instrument.v2.RegisterInstrumentRequest) request,
              (io.grpc.stub.StreamObserver<io.mica.issuer.instrument.v2.RegisterInstrumentResponse>) responseObserver);
          break;
        case METHODID_GET_INSTRUMENT:
          serviceImpl.getInstrument((io.mica.issuer.instrument.v2.GetInstrumentRequest) request,
              (io.grpc.stub.StreamObserver<io.mica.issuer.instrument.v2.GetInstrumentResponse>) responseObserver);
          break;
        case METHODID_REMOVE_INSTRUMENT:
          serviceImpl.removeInstrument((io.mica.issuer.instrument.v2.RemoveInstrumentRequest) request,
              (io.grpc.stub.StreamObserver<io.mica.issuer.instrument.v2.RemoveInstrumentResponse>) responseObserver);
          break;
        case METHODID_SEARCH_INSTRUMENT:
          serviceImpl.searchInstrument((io.mica.issuer.instrument.v2.SearchInstrumentRequest) request,
              (io.grpc.stub.StreamObserver<io.mica.issuer.instrument.v2.SearchInstrumentResponse>) responseObserver);
          break;
        case METHODID_PROVISION_ISSUER_UUEK:
          serviceImpl.provisionIssuerUUEK((io.mica.issuer.uuek.v2.ProvisionIssuerUUEKRequest) request,
              (io.grpc.stub.StreamObserver<io.mica.issuer.uuek.v2.ProvisionIssuerUUEKResponse>) responseObserver);
          break;
        case METHODID_PROVISION_INSTRUMENT_LINKING_CODE:
          serviceImpl.provisionInstrumentLinkingCode((io.mica.issuer.instrument.v2.ProvisionInstrumentLinkingCodeRequest) request,
              (io.grpc.stub.StreamObserver<io.mica.issuer.instrument.v2.ProvisionInstrumentLinkingCodeResponse>) responseObserver);
          break;
        case METHODID_COMPLETE_LINKING_WITH_CODE:
          serviceImpl.completeLinkingWithCode((io.mica.issuer.instrument.v2.CompleteLinkingWithCodeRequest) request,
              (io.grpc.stub.StreamObserver<io.mica.issuer.instrument.v2.CompleteLinkingWithCodeResponse>) responseObserver);
          break;
        case METHODID_GET_INSTRUMENT_LINK:
          serviceImpl.getInstrumentLink((io.mica.issuer.instrument.v2.GetInstrumentLinkRequest) request,
              (io.grpc.stub.StreamObserver<io.mica.issuer.instrument.v2.GetInstrumentLinkResponse>) responseObserver);
          break;
        case METHODID_SEARCH_INSTRUMENT_LINKS:
          serviceImpl.searchInstrumentLinks((io.mica.issuer.instrument.v2.SearchInstrumentLinksRequest) request,
              (io.grpc.stub.StreamObserver<io.mica.issuer.instrument.v2.SearchInstrumentLinksResponse>) responseObserver);
          break;
        case METHODID_REMOVE_INSTRUMENT_LINK:
          serviceImpl.removeInstrumentLink((io.mica.issuer.instrument.v2.RemoveInstrumentLinkRequest) request,
              (io.grpc.stub.StreamObserver<io.mica.issuer.instrument.v2.RemoveInstrumentLinkResponse>) responseObserver);
          break;
        case METHODID_GET_VALUE:
          serviceImpl.getValue((io.mica.issuer.value.v2.GetValueRequest) request,
              (io.grpc.stub.StreamObserver<io.mica.issuer.value.v2.GetValueResponse>) responseObserver);
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
          getGetIssuerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mica.issuer.issuer.v2.GetIssuerRequest,
              io.mica.issuer.issuer.v2.GetIssuerResponse>(
                service, METHODID_GET_ISSUER)))
        .addMethod(
          getRegisterUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mica.issuer.user.v2.RegisterUserRequest,
              io.mica.issuer.user.v2.RegisterUserResponse>(
                service, METHODID_REGISTER_USER)))
        .addMethod(
          getGetUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mica.issuer.user.v2.GetUserRequest,
              io.mica.issuer.user.v2.GetUserResponse>(
                service, METHODID_GET_USER)))
        .addMethod(
          getUpdateUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mica.issuer.user.v2.UpdateUserRequest,
              io.mica.issuer.user.v2.UpdateUserResponse>(
                service, METHODID_UPDATE_USER)))
        .addMethod(
          getRemoveUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mica.issuer.user.v2.RemoveUserRequest,
              io.mica.issuer.user.v2.RemoveUserResponse>(
                service, METHODID_REMOVE_USER)))
        .addMethod(
          getRegisterInstrumentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mica.issuer.instrument.v2.RegisterInstrumentRequest,
              io.mica.issuer.instrument.v2.RegisterInstrumentResponse>(
                service, METHODID_REGISTER_INSTRUMENT)))
        .addMethod(
          getGetInstrumentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mica.issuer.instrument.v2.GetInstrumentRequest,
              io.mica.issuer.instrument.v2.GetInstrumentResponse>(
                service, METHODID_GET_INSTRUMENT)))
        .addMethod(
          getRemoveInstrumentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mica.issuer.instrument.v2.RemoveInstrumentRequest,
              io.mica.issuer.instrument.v2.RemoveInstrumentResponse>(
                service, METHODID_REMOVE_INSTRUMENT)))
        .addMethod(
          getSearchInstrumentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mica.issuer.instrument.v2.SearchInstrumentRequest,
              io.mica.issuer.instrument.v2.SearchInstrumentResponse>(
                service, METHODID_SEARCH_INSTRUMENT)))
        .addMethod(
          getProvisionIssuerUUEKMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mica.issuer.uuek.v2.ProvisionIssuerUUEKRequest,
              io.mica.issuer.uuek.v2.ProvisionIssuerUUEKResponse>(
                service, METHODID_PROVISION_ISSUER_UUEK)))
        .addMethod(
          getProvisionInstrumentLinkingCodeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mica.issuer.instrument.v2.ProvisionInstrumentLinkingCodeRequest,
              io.mica.issuer.instrument.v2.ProvisionInstrumentLinkingCodeResponse>(
                service, METHODID_PROVISION_INSTRUMENT_LINKING_CODE)))
        .addMethod(
          getCompleteLinkingWithCodeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mica.issuer.instrument.v2.CompleteLinkingWithCodeRequest,
              io.mica.issuer.instrument.v2.CompleteLinkingWithCodeResponse>(
                service, METHODID_COMPLETE_LINKING_WITH_CODE)))
        .addMethod(
          getGetInstrumentLinkMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mica.issuer.instrument.v2.GetInstrumentLinkRequest,
              io.mica.issuer.instrument.v2.GetInstrumentLinkResponse>(
                service, METHODID_GET_INSTRUMENT_LINK)))
        .addMethod(
          getSearchInstrumentLinksMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mica.issuer.instrument.v2.SearchInstrumentLinksRequest,
              io.mica.issuer.instrument.v2.SearchInstrumentLinksResponse>(
                service, METHODID_SEARCH_INSTRUMENT_LINKS)))
        .addMethod(
          getRemoveInstrumentLinkMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mica.issuer.instrument.v2.RemoveInstrumentLinkRequest,
              io.mica.issuer.instrument.v2.RemoveInstrumentLinkResponse>(
                service, METHODID_REMOVE_INSTRUMENT_LINK)))
        .addMethod(
          getGetValueMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mica.issuer.value.v2.GetValueRequest,
              io.mica.issuer.value.v2.GetValueResponse>(
                service, METHODID_GET_VALUE)))
        .build();
  }

  private static abstract class IssuerToMicaServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    IssuerToMicaServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.mica.issuer.service.v2.IssuerToMicaServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("IssuerToMicaService");
    }
  }

  private static final class IssuerToMicaServiceFileDescriptorSupplier
      extends IssuerToMicaServiceBaseDescriptorSupplier {
    IssuerToMicaServiceFileDescriptorSupplier() {}
  }

  private static final class IssuerToMicaServiceMethodDescriptorSupplier
      extends IssuerToMicaServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    IssuerToMicaServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (IssuerToMicaServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new IssuerToMicaServiceFileDescriptorSupplier())
              .addMethod(getGetIssuerMethod())
              .addMethod(getRegisterUserMethod())
              .addMethod(getGetUserMethod())
              .addMethod(getUpdateUserMethod())
              .addMethod(getRemoveUserMethod())
              .addMethod(getRegisterInstrumentMethod())
              .addMethod(getGetInstrumentMethod())
              .addMethod(getRemoveInstrumentMethod())
              .addMethod(getSearchInstrumentMethod())
              .addMethod(getProvisionIssuerUUEKMethod())
              .addMethod(getProvisionInstrumentLinkingCodeMethod())
              .addMethod(getCompleteLinkingWithCodeMethod())
              .addMethod(getGetInstrumentLinkMethod())
              .addMethod(getSearchInstrumentLinksMethod())
              .addMethod(getRemoveInstrumentLinkMethod())
              .addMethod(getGetValueMethod())
              .build();
        }
      }
    }
    return result;
  }
}
