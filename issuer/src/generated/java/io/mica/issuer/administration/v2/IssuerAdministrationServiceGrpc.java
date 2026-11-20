package io.mica.issuer.administration.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Administration of an Issuer's Mica instance: the client certificates and callback address Mica uses to call the
 * Issuer's IssuerFromMicaService, connectivity tests, and data extraction statistics.
 * To set up the connection from Mica to the Issuer: call GenerateFromMicaClientCertificate to have Mica create a key
 * pair and certificate signing request (CSR), sign the CSR with a CA the Issuer's server trusts, upload the signed
 * certificate with UpdateFromMicaClientCertificate, set the callback address with
 * UpdateFromMicaClientCallbackAddress, then call EnableFromMicaClientCertificate.
 * </pre>
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class IssuerAdministrationServiceGrpc {

  private IssuerAdministrationServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "mica.issuer.administration.v2.IssuerAdministrationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.mica.issuer.administration.v2.GenerateFromMicaClientCertificateRequest,
      io.mica.issuer.administration.v2.GenerateFromMicaClientCertificateResponse> getGenerateFromMicaClientCertificateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateFromMicaClientCertificate",
      requestType = io.mica.issuer.administration.v2.GenerateFromMicaClientCertificateRequest.class,
      responseType = io.mica.issuer.administration.v2.GenerateFromMicaClientCertificateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mica.issuer.administration.v2.GenerateFromMicaClientCertificateRequest,
      io.mica.issuer.administration.v2.GenerateFromMicaClientCertificateResponse> getGenerateFromMicaClientCertificateMethod() {
    io.grpc.MethodDescriptor<io.mica.issuer.administration.v2.GenerateFromMicaClientCertificateRequest, io.mica.issuer.administration.v2.GenerateFromMicaClientCertificateResponse> getGenerateFromMicaClientCertificateMethod;
    if ((getGenerateFromMicaClientCertificateMethod = IssuerAdministrationServiceGrpc.getGenerateFromMicaClientCertificateMethod) == null) {
      synchronized (IssuerAdministrationServiceGrpc.class) {
        if ((getGenerateFromMicaClientCertificateMethod = IssuerAdministrationServiceGrpc.getGenerateFromMicaClientCertificateMethod) == null) {
          IssuerAdministrationServiceGrpc.getGenerateFromMicaClientCertificateMethod = getGenerateFromMicaClientCertificateMethod =
              io.grpc.MethodDescriptor.<io.mica.issuer.administration.v2.GenerateFromMicaClientCertificateRequest, io.mica.issuer.administration.v2.GenerateFromMicaClientCertificateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenerateFromMicaClientCertificate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.issuer.administration.v2.GenerateFromMicaClientCertificateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.issuer.administration.v2.GenerateFromMicaClientCertificateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IssuerAdministrationServiceMethodDescriptorSupplier("GenerateFromMicaClientCertificate"))
              .build();
        }
      }
    }
    return getGenerateFromMicaClientCertificateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mica.issuer.administration.v2.UpdateFromMicaClientCertificateRequest,
      io.mica.issuer.administration.v2.UpdateFromMicaClientCertificateResponse> getUpdateFromMicaClientCertificateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateFromMicaClientCertificate",
      requestType = io.mica.issuer.administration.v2.UpdateFromMicaClientCertificateRequest.class,
      responseType = io.mica.issuer.administration.v2.UpdateFromMicaClientCertificateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mica.issuer.administration.v2.UpdateFromMicaClientCertificateRequest,
      io.mica.issuer.administration.v2.UpdateFromMicaClientCertificateResponse> getUpdateFromMicaClientCertificateMethod() {
    io.grpc.MethodDescriptor<io.mica.issuer.administration.v2.UpdateFromMicaClientCertificateRequest, io.mica.issuer.administration.v2.UpdateFromMicaClientCertificateResponse> getUpdateFromMicaClientCertificateMethod;
    if ((getUpdateFromMicaClientCertificateMethod = IssuerAdministrationServiceGrpc.getUpdateFromMicaClientCertificateMethod) == null) {
      synchronized (IssuerAdministrationServiceGrpc.class) {
        if ((getUpdateFromMicaClientCertificateMethod = IssuerAdministrationServiceGrpc.getUpdateFromMicaClientCertificateMethod) == null) {
          IssuerAdministrationServiceGrpc.getUpdateFromMicaClientCertificateMethod = getUpdateFromMicaClientCertificateMethod =
              io.grpc.MethodDescriptor.<io.mica.issuer.administration.v2.UpdateFromMicaClientCertificateRequest, io.mica.issuer.administration.v2.UpdateFromMicaClientCertificateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateFromMicaClientCertificate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.issuer.administration.v2.UpdateFromMicaClientCertificateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.issuer.administration.v2.UpdateFromMicaClientCertificateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IssuerAdministrationServiceMethodDescriptorSupplier("UpdateFromMicaClientCertificate"))
              .build();
        }
      }
    }
    return getUpdateFromMicaClientCertificateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mica.issuer.administration.v2.EnableFromMicaClientCertificateRequest,
      io.mica.issuer.administration.v2.EnableFromMicaClientCertificateResponse> getEnableFromMicaClientCertificateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnableFromMicaClientCertificate",
      requestType = io.mica.issuer.administration.v2.EnableFromMicaClientCertificateRequest.class,
      responseType = io.mica.issuer.administration.v2.EnableFromMicaClientCertificateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mica.issuer.administration.v2.EnableFromMicaClientCertificateRequest,
      io.mica.issuer.administration.v2.EnableFromMicaClientCertificateResponse> getEnableFromMicaClientCertificateMethod() {
    io.grpc.MethodDescriptor<io.mica.issuer.administration.v2.EnableFromMicaClientCertificateRequest, io.mica.issuer.administration.v2.EnableFromMicaClientCertificateResponse> getEnableFromMicaClientCertificateMethod;
    if ((getEnableFromMicaClientCertificateMethod = IssuerAdministrationServiceGrpc.getEnableFromMicaClientCertificateMethod) == null) {
      synchronized (IssuerAdministrationServiceGrpc.class) {
        if ((getEnableFromMicaClientCertificateMethod = IssuerAdministrationServiceGrpc.getEnableFromMicaClientCertificateMethod) == null) {
          IssuerAdministrationServiceGrpc.getEnableFromMicaClientCertificateMethod = getEnableFromMicaClientCertificateMethod =
              io.grpc.MethodDescriptor.<io.mica.issuer.administration.v2.EnableFromMicaClientCertificateRequest, io.mica.issuer.administration.v2.EnableFromMicaClientCertificateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EnableFromMicaClientCertificate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.issuer.administration.v2.EnableFromMicaClientCertificateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.issuer.administration.v2.EnableFromMicaClientCertificateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IssuerAdministrationServiceMethodDescriptorSupplier("EnableFromMicaClientCertificate"))
              .build();
        }
      }
    }
    return getEnableFromMicaClientCertificateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mica.issuer.administration.v2.SearchFromMicaClientCertificateRequest,
      io.mica.issuer.administration.v2.SearchFromMicaClientCertificateResponse> getSearchFromMicaClientCertificateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchFromMicaClientCertificate",
      requestType = io.mica.issuer.administration.v2.SearchFromMicaClientCertificateRequest.class,
      responseType = io.mica.issuer.administration.v2.SearchFromMicaClientCertificateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mica.issuer.administration.v2.SearchFromMicaClientCertificateRequest,
      io.mica.issuer.administration.v2.SearchFromMicaClientCertificateResponse> getSearchFromMicaClientCertificateMethod() {
    io.grpc.MethodDescriptor<io.mica.issuer.administration.v2.SearchFromMicaClientCertificateRequest, io.mica.issuer.administration.v2.SearchFromMicaClientCertificateResponse> getSearchFromMicaClientCertificateMethod;
    if ((getSearchFromMicaClientCertificateMethod = IssuerAdministrationServiceGrpc.getSearchFromMicaClientCertificateMethod) == null) {
      synchronized (IssuerAdministrationServiceGrpc.class) {
        if ((getSearchFromMicaClientCertificateMethod = IssuerAdministrationServiceGrpc.getSearchFromMicaClientCertificateMethod) == null) {
          IssuerAdministrationServiceGrpc.getSearchFromMicaClientCertificateMethod = getSearchFromMicaClientCertificateMethod =
              io.grpc.MethodDescriptor.<io.mica.issuer.administration.v2.SearchFromMicaClientCertificateRequest, io.mica.issuer.administration.v2.SearchFromMicaClientCertificateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchFromMicaClientCertificate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.issuer.administration.v2.SearchFromMicaClientCertificateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.issuer.administration.v2.SearchFromMicaClientCertificateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IssuerAdministrationServiceMethodDescriptorSupplier("SearchFromMicaClientCertificate"))
              .build();
        }
      }
    }
    return getSearchFromMicaClientCertificateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mica.issuer.administration.v2.GetFromMicaClientSettingsRequest,
      io.mica.issuer.administration.v2.GetFromMicaClientSettingsResponse> getGetFromMicaClientSettingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFromMicaClientSettings",
      requestType = io.mica.issuer.administration.v2.GetFromMicaClientSettingsRequest.class,
      responseType = io.mica.issuer.administration.v2.GetFromMicaClientSettingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mica.issuer.administration.v2.GetFromMicaClientSettingsRequest,
      io.mica.issuer.administration.v2.GetFromMicaClientSettingsResponse> getGetFromMicaClientSettingsMethod() {
    io.grpc.MethodDescriptor<io.mica.issuer.administration.v2.GetFromMicaClientSettingsRequest, io.mica.issuer.administration.v2.GetFromMicaClientSettingsResponse> getGetFromMicaClientSettingsMethod;
    if ((getGetFromMicaClientSettingsMethod = IssuerAdministrationServiceGrpc.getGetFromMicaClientSettingsMethod) == null) {
      synchronized (IssuerAdministrationServiceGrpc.class) {
        if ((getGetFromMicaClientSettingsMethod = IssuerAdministrationServiceGrpc.getGetFromMicaClientSettingsMethod) == null) {
          IssuerAdministrationServiceGrpc.getGetFromMicaClientSettingsMethod = getGetFromMicaClientSettingsMethod =
              io.grpc.MethodDescriptor.<io.mica.issuer.administration.v2.GetFromMicaClientSettingsRequest, io.mica.issuer.administration.v2.GetFromMicaClientSettingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFromMicaClientSettings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.issuer.administration.v2.GetFromMicaClientSettingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.issuer.administration.v2.GetFromMicaClientSettingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IssuerAdministrationServiceMethodDescriptorSupplier("GetFromMicaClientSettings"))
              .build();
        }
      }
    }
    return getGetFromMicaClientSettingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mica.issuer.administration.v2.UpdateFromMicaClientCallbackAddressRequest,
      io.mica.issuer.administration.v2.UpdateFromMicaClientCallbackAddressResponse> getUpdateFromMicaClientCallbackAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateFromMicaClientCallbackAddress",
      requestType = io.mica.issuer.administration.v2.UpdateFromMicaClientCallbackAddressRequest.class,
      responseType = io.mica.issuer.administration.v2.UpdateFromMicaClientCallbackAddressResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mica.issuer.administration.v2.UpdateFromMicaClientCallbackAddressRequest,
      io.mica.issuer.administration.v2.UpdateFromMicaClientCallbackAddressResponse> getUpdateFromMicaClientCallbackAddressMethod() {
    io.grpc.MethodDescriptor<io.mica.issuer.administration.v2.UpdateFromMicaClientCallbackAddressRequest, io.mica.issuer.administration.v2.UpdateFromMicaClientCallbackAddressResponse> getUpdateFromMicaClientCallbackAddressMethod;
    if ((getUpdateFromMicaClientCallbackAddressMethod = IssuerAdministrationServiceGrpc.getUpdateFromMicaClientCallbackAddressMethod) == null) {
      synchronized (IssuerAdministrationServiceGrpc.class) {
        if ((getUpdateFromMicaClientCallbackAddressMethod = IssuerAdministrationServiceGrpc.getUpdateFromMicaClientCallbackAddressMethod) == null) {
          IssuerAdministrationServiceGrpc.getUpdateFromMicaClientCallbackAddressMethod = getUpdateFromMicaClientCallbackAddressMethod =
              io.grpc.MethodDescriptor.<io.mica.issuer.administration.v2.UpdateFromMicaClientCallbackAddressRequest, io.mica.issuer.administration.v2.UpdateFromMicaClientCallbackAddressResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateFromMicaClientCallbackAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.issuer.administration.v2.UpdateFromMicaClientCallbackAddressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.issuer.administration.v2.UpdateFromMicaClientCallbackAddressResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IssuerAdministrationServiceMethodDescriptorSupplier("UpdateFromMicaClientCallbackAddress"))
              .build();
        }
      }
    }
    return getUpdateFromMicaClientCallbackAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mica.issuer.administration.v2.SearchDataExtractionStatisticsRequest,
      io.mica.issuer.administration.v2.SearchDataExtractionStatisticsResponse> getSearchDataExtractionStatisticsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchDataExtractionStatistics",
      requestType = io.mica.issuer.administration.v2.SearchDataExtractionStatisticsRequest.class,
      responseType = io.mica.issuer.administration.v2.SearchDataExtractionStatisticsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mica.issuer.administration.v2.SearchDataExtractionStatisticsRequest,
      io.mica.issuer.administration.v2.SearchDataExtractionStatisticsResponse> getSearchDataExtractionStatisticsMethod() {
    io.grpc.MethodDescriptor<io.mica.issuer.administration.v2.SearchDataExtractionStatisticsRequest, io.mica.issuer.administration.v2.SearchDataExtractionStatisticsResponse> getSearchDataExtractionStatisticsMethod;
    if ((getSearchDataExtractionStatisticsMethod = IssuerAdministrationServiceGrpc.getSearchDataExtractionStatisticsMethod) == null) {
      synchronized (IssuerAdministrationServiceGrpc.class) {
        if ((getSearchDataExtractionStatisticsMethod = IssuerAdministrationServiceGrpc.getSearchDataExtractionStatisticsMethod) == null) {
          IssuerAdministrationServiceGrpc.getSearchDataExtractionStatisticsMethod = getSearchDataExtractionStatisticsMethod =
              io.grpc.MethodDescriptor.<io.mica.issuer.administration.v2.SearchDataExtractionStatisticsRequest, io.mica.issuer.administration.v2.SearchDataExtractionStatisticsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchDataExtractionStatistics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.issuer.administration.v2.SearchDataExtractionStatisticsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.issuer.administration.v2.SearchDataExtractionStatisticsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IssuerAdministrationServiceMethodDescriptorSupplier("SearchDataExtractionStatistics"))
              .build();
        }
      }
    }
    return getSearchDataExtractionStatisticsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mica.issuer.administration.v2.GetDataExtractionStatisticsRequest,
      io.mica.issuer.administration.v2.GetDataExtractionStatisticsResponse> getGetDataExtractionStatisticsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDataExtractionStatistics",
      requestType = io.mica.issuer.administration.v2.GetDataExtractionStatisticsRequest.class,
      responseType = io.mica.issuer.administration.v2.GetDataExtractionStatisticsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mica.issuer.administration.v2.GetDataExtractionStatisticsRequest,
      io.mica.issuer.administration.v2.GetDataExtractionStatisticsResponse> getGetDataExtractionStatisticsMethod() {
    io.grpc.MethodDescriptor<io.mica.issuer.administration.v2.GetDataExtractionStatisticsRequest, io.mica.issuer.administration.v2.GetDataExtractionStatisticsResponse> getGetDataExtractionStatisticsMethod;
    if ((getGetDataExtractionStatisticsMethod = IssuerAdministrationServiceGrpc.getGetDataExtractionStatisticsMethod) == null) {
      synchronized (IssuerAdministrationServiceGrpc.class) {
        if ((getGetDataExtractionStatisticsMethod = IssuerAdministrationServiceGrpc.getGetDataExtractionStatisticsMethod) == null) {
          IssuerAdministrationServiceGrpc.getGetDataExtractionStatisticsMethod = getGetDataExtractionStatisticsMethod =
              io.grpc.MethodDescriptor.<io.mica.issuer.administration.v2.GetDataExtractionStatisticsRequest, io.mica.issuer.administration.v2.GetDataExtractionStatisticsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDataExtractionStatistics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.issuer.administration.v2.GetDataExtractionStatisticsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.issuer.administration.v2.GetDataExtractionStatisticsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IssuerAdministrationServiceMethodDescriptorSupplier("GetDataExtractionStatistics"))
              .build();
        }
      }
    }
    return getGetDataExtractionStatisticsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mica.issuer.administration.v2.PingExternalRequest,
      io.mica.issuer.administration.v2.PingExternalResponse> getPingExternalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PingExternal",
      requestType = io.mica.issuer.administration.v2.PingExternalRequest.class,
      responseType = io.mica.issuer.administration.v2.PingExternalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mica.issuer.administration.v2.PingExternalRequest,
      io.mica.issuer.administration.v2.PingExternalResponse> getPingExternalMethod() {
    io.grpc.MethodDescriptor<io.mica.issuer.administration.v2.PingExternalRequest, io.mica.issuer.administration.v2.PingExternalResponse> getPingExternalMethod;
    if ((getPingExternalMethod = IssuerAdministrationServiceGrpc.getPingExternalMethod) == null) {
      synchronized (IssuerAdministrationServiceGrpc.class) {
        if ((getPingExternalMethod = IssuerAdministrationServiceGrpc.getPingExternalMethod) == null) {
          IssuerAdministrationServiceGrpc.getPingExternalMethod = getPingExternalMethod =
              io.grpc.MethodDescriptor.<io.mica.issuer.administration.v2.PingExternalRequest, io.mica.issuer.administration.v2.PingExternalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PingExternal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.issuer.administration.v2.PingExternalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.issuer.administration.v2.PingExternalResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IssuerAdministrationServiceMethodDescriptorSupplier("PingExternal"))
              .build();
        }
      }
    }
    return getPingExternalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mica.issuer.administration.v2.PingExternalWithCertificateRequest,
      io.mica.issuer.administration.v2.PingExternalWithCertificateResponse> getPingExternalWithCertificateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PingExternalWithCertificate",
      requestType = io.mica.issuer.administration.v2.PingExternalWithCertificateRequest.class,
      responseType = io.mica.issuer.administration.v2.PingExternalWithCertificateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mica.issuer.administration.v2.PingExternalWithCertificateRequest,
      io.mica.issuer.administration.v2.PingExternalWithCertificateResponse> getPingExternalWithCertificateMethod() {
    io.grpc.MethodDescriptor<io.mica.issuer.administration.v2.PingExternalWithCertificateRequest, io.mica.issuer.administration.v2.PingExternalWithCertificateResponse> getPingExternalWithCertificateMethod;
    if ((getPingExternalWithCertificateMethod = IssuerAdministrationServiceGrpc.getPingExternalWithCertificateMethod) == null) {
      synchronized (IssuerAdministrationServiceGrpc.class) {
        if ((getPingExternalWithCertificateMethod = IssuerAdministrationServiceGrpc.getPingExternalWithCertificateMethod) == null) {
          IssuerAdministrationServiceGrpc.getPingExternalWithCertificateMethod = getPingExternalWithCertificateMethod =
              io.grpc.MethodDescriptor.<io.mica.issuer.administration.v2.PingExternalWithCertificateRequest, io.mica.issuer.administration.v2.PingExternalWithCertificateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PingExternalWithCertificate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.issuer.administration.v2.PingExternalWithCertificateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.mica.issuer.administration.v2.PingExternalWithCertificateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IssuerAdministrationServiceMethodDescriptorSupplier("PingExternalWithCertificate"))
              .build();
        }
      }
    }
    return getPingExternalWithCertificateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static IssuerAdministrationServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IssuerAdministrationServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IssuerAdministrationServiceStub>() {
        @java.lang.Override
        public IssuerAdministrationServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IssuerAdministrationServiceStub(channel, callOptions);
        }
      };
    return IssuerAdministrationServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static IssuerAdministrationServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IssuerAdministrationServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IssuerAdministrationServiceBlockingV2Stub>() {
        @java.lang.Override
        public IssuerAdministrationServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IssuerAdministrationServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return IssuerAdministrationServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static IssuerAdministrationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IssuerAdministrationServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IssuerAdministrationServiceBlockingStub>() {
        @java.lang.Override
        public IssuerAdministrationServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IssuerAdministrationServiceBlockingStub(channel, callOptions);
        }
      };
    return IssuerAdministrationServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static IssuerAdministrationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IssuerAdministrationServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IssuerAdministrationServiceFutureStub>() {
        @java.lang.Override
        public IssuerAdministrationServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IssuerAdministrationServiceFutureStub(channel, callOptions);
        }
      };
    return IssuerAdministrationServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Administration of an Issuer's Mica instance: the client certificates and callback address Mica uses to call the
   * Issuer's IssuerFromMicaService, connectivity tests, and data extraction statistics.
   * To set up the connection from Mica to the Issuer: call GenerateFromMicaClientCertificate to have Mica create a key
   * pair and certificate signing request (CSR), sign the CSR with a CA the Issuer's server trusts, upload the signed
   * certificate with UpdateFromMicaClientCertificate, set the callback address with
   * UpdateFromMicaClientCallbackAddress, then call EnableFromMicaClientCertificate.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Creates a new client key pair and certificate signing request (CSR) that Mica will use to authenticate when it
     * calls the Issuer. The private key stays with Mica; the response carries the CSR for the Issuer to sign.
     * </pre>
     */
    default void generateFromMicaClientCertificate(io.mica.issuer.administration.v2.GenerateFromMicaClientCertificateRequest request,
        io.grpc.stub.StreamObserver<io.mica.issuer.administration.v2.GenerateFromMicaClientCertificateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenerateFromMicaClientCertificateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Uploads the certificate the Issuer signed from the CSR, together with the root CA bundle Mica should trust for the
     * Issuer's server. Can also update the display name.
     * </pre>
     */
    default void updateFromMicaClientCertificate(io.mica.issuer.administration.v2.UpdateFromMicaClientCertificateRequest request,
        io.grpc.stub.StreamObserver<io.mica.issuer.administration.v2.UpdateFromMicaClientCertificateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateFromMicaClientCertificateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Makes a certificate the one Mica uses to call the Issuer. Mica first pings the Issuer with it and fails the call if
     * the ping fails. Only one certificate is enabled at a time, so enabling one disables the previous one.
     * </pre>
     */
    default void enableFromMicaClientCertificate(io.mica.issuer.administration.v2.EnableFromMicaClientCertificateRequest request,
        io.grpc.stub.StreamObserver<io.mica.issuer.administration.v2.EnableFromMicaClientCertificateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEnableFromMicaClientCertificateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns all client certificates Mica holds for calling the Issuer.
     * </pre>
     */
    default void searchFromMicaClientCertificate(io.mica.issuer.administration.v2.SearchFromMicaClientCertificateRequest request,
        io.grpc.stub.StreamObserver<io.mica.issuer.administration.v2.SearchFromMicaClientCertificateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchFromMicaClientCertificateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the settings Mica uses to call the Issuer: the callback address and how Mica authenticates.
     * </pre>
     */
    default void getFromMicaClientSettings(io.mica.issuer.administration.v2.GetFromMicaClientSettingsRequest request,
        io.grpc.stub.StreamObserver<io.mica.issuer.administration.v2.GetFromMicaClientSettingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFromMicaClientSettingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sets the address at which Mica calls the Issuer's IssuerFromMicaService.
     * </pre>
     */
    default void updateFromMicaClientCallbackAddress(io.mica.issuer.administration.v2.UpdateFromMicaClientCallbackAddressRequest request,
        io.grpc.stub.StreamObserver<io.mica.issuer.administration.v2.UpdateFromMicaClientCallbackAddressResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateFromMicaClientCallbackAddressMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns statistics for every data extraction job on the Issuer's instance.
     * </pre>
     */
    default void searchDataExtractionStatistics(io.mica.issuer.administration.v2.SearchDataExtractionStatisticsRequest request,
        io.grpc.stub.StreamObserver<io.mica.issuer.administration.v2.SearchDataExtractionStatisticsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchDataExtractionStatisticsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns statistics for one data extraction job, by name.
     * </pre>
     */
    default void getDataExtractionStatistics(io.mica.issuer.administration.v2.GetDataExtractionStatisticsRequest request,
        io.grpc.stub.StreamObserver<io.mica.issuer.administration.v2.GetDataExtractionStatisticsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDataExtractionStatisticsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Tests that Mica can reach the Issuer: Mica calls the Issuer's Ping operation with the currently enabled
     * certificate. The call fails with a gRPC error if the ping fails.
     * </pre>
     */
    default void pingExternal(io.mica.issuer.administration.v2.PingExternalRequest request,
        io.grpc.stub.StreamObserver<io.mica.issuer.administration.v2.PingExternalResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPingExternalMethod(), responseObserver);
    }

    /**
     * <pre>
     * Tests that Mica can reach the Issuer using a specific certificate, whether or not it is enabled. Use it to check a
     * new certificate before enabling it. The call fails with a gRPC error if the ping fails.
     * </pre>
     */
    default void pingExternalWithCertificate(io.mica.issuer.administration.v2.PingExternalWithCertificateRequest request,
        io.grpc.stub.StreamObserver<io.mica.issuer.administration.v2.PingExternalWithCertificateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPingExternalWithCertificateMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service IssuerAdministrationService.
   * <pre>
   * Administration of an Issuer's Mica instance: the client certificates and callback address Mica uses to call the
   * Issuer's IssuerFromMicaService, connectivity tests, and data extraction statistics.
   * To set up the connection from Mica to the Issuer: call GenerateFromMicaClientCertificate to have Mica create a key
   * pair and certificate signing request (CSR), sign the CSR with a CA the Issuer's server trusts, upload the signed
   * certificate with UpdateFromMicaClientCertificate, set the callback address with
   * UpdateFromMicaClientCallbackAddress, then call EnableFromMicaClientCertificate.
   * </pre>
   */
  public static abstract class IssuerAdministrationServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return IssuerAdministrationServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service IssuerAdministrationService.
   * <pre>
   * Administration of an Issuer's Mica instance: the client certificates and callback address Mica uses to call the
   * Issuer's IssuerFromMicaService, connectivity tests, and data extraction statistics.
   * To set up the connection from Mica to the Issuer: call GenerateFromMicaClientCertificate to have Mica create a key
   * pair and certificate signing request (CSR), sign the CSR with a CA the Issuer's server trusts, upload the signed
   * certificate with UpdateFromMicaClientCertificate, set the callback address with
   * UpdateFromMicaClientCallbackAddress, then call EnableFromMicaClientCertificate.
   * </pre>
   */
  public static final class IssuerAdministrationServiceStub
      extends io.grpc.stub.AbstractAsyncStub<IssuerAdministrationServiceStub> {
    private IssuerAdministrationServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IssuerAdministrationServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IssuerAdministrationServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a new client key pair and certificate signing request (CSR) that Mica will use to authenticate when it
     * calls the Issuer. The private key stays with Mica; the response carries the CSR for the Issuer to sign.
     * </pre>
     */
    public void generateFromMicaClientCertificate(io.mica.issuer.administration.v2.GenerateFromMicaClientCertificateRequest request,
        io.grpc.stub.StreamObserver<io.mica.issuer.administration.v2.GenerateFromMicaClientCertificateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGenerateFromMicaClientCertificateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Uploads the certificate the Issuer signed from the CSR, together with the root CA bundle Mica should trust for the
     * Issuer's server. Can also update the display name.
     * </pre>
     */
    public void updateFromMicaClientCertificate(io.mica.issuer.administration.v2.UpdateFromMicaClientCertificateRequest request,
        io.grpc.stub.StreamObserver<io.mica.issuer.administration.v2.UpdateFromMicaClientCertificateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateFromMicaClientCertificateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Makes a certificate the one Mica uses to call the Issuer. Mica first pings the Issuer with it and fails the call if
     * the ping fails. Only one certificate is enabled at a time, so enabling one disables the previous one.
     * </pre>
     */
    public void enableFromMicaClientCertificate(io.mica.issuer.administration.v2.EnableFromMicaClientCertificateRequest request,
        io.grpc.stub.StreamObserver<io.mica.issuer.administration.v2.EnableFromMicaClientCertificateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEnableFromMicaClientCertificateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns all client certificates Mica holds for calling the Issuer.
     * </pre>
     */
    public void searchFromMicaClientCertificate(io.mica.issuer.administration.v2.SearchFromMicaClientCertificateRequest request,
        io.grpc.stub.StreamObserver<io.mica.issuer.administration.v2.SearchFromMicaClientCertificateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchFromMicaClientCertificateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the settings Mica uses to call the Issuer: the callback address and how Mica authenticates.
     * </pre>
     */
    public void getFromMicaClientSettings(io.mica.issuer.administration.v2.GetFromMicaClientSettingsRequest request,
        io.grpc.stub.StreamObserver<io.mica.issuer.administration.v2.GetFromMicaClientSettingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetFromMicaClientSettingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sets the address at which Mica calls the Issuer's IssuerFromMicaService.
     * </pre>
     */
    public void updateFromMicaClientCallbackAddress(io.mica.issuer.administration.v2.UpdateFromMicaClientCallbackAddressRequest request,
        io.grpc.stub.StreamObserver<io.mica.issuer.administration.v2.UpdateFromMicaClientCallbackAddressResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateFromMicaClientCallbackAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns statistics for every data extraction job on the Issuer's instance.
     * </pre>
     */
    public void searchDataExtractionStatistics(io.mica.issuer.administration.v2.SearchDataExtractionStatisticsRequest request,
        io.grpc.stub.StreamObserver<io.mica.issuer.administration.v2.SearchDataExtractionStatisticsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchDataExtractionStatisticsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns statistics for one data extraction job, by name.
     * </pre>
     */
    public void getDataExtractionStatistics(io.mica.issuer.administration.v2.GetDataExtractionStatisticsRequest request,
        io.grpc.stub.StreamObserver<io.mica.issuer.administration.v2.GetDataExtractionStatisticsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDataExtractionStatisticsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Tests that Mica can reach the Issuer: Mica calls the Issuer's Ping operation with the currently enabled
     * certificate. The call fails with a gRPC error if the ping fails.
     * </pre>
     */
    public void pingExternal(io.mica.issuer.administration.v2.PingExternalRequest request,
        io.grpc.stub.StreamObserver<io.mica.issuer.administration.v2.PingExternalResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPingExternalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Tests that Mica can reach the Issuer using a specific certificate, whether or not it is enabled. Use it to check a
     * new certificate before enabling it. The call fails with a gRPC error if the ping fails.
     * </pre>
     */
    public void pingExternalWithCertificate(io.mica.issuer.administration.v2.PingExternalWithCertificateRequest request,
        io.grpc.stub.StreamObserver<io.mica.issuer.administration.v2.PingExternalWithCertificateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPingExternalWithCertificateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service IssuerAdministrationService.
   * <pre>
   * Administration of an Issuer's Mica instance: the client certificates and callback address Mica uses to call the
   * Issuer's IssuerFromMicaService, connectivity tests, and data extraction statistics.
   * To set up the connection from Mica to the Issuer: call GenerateFromMicaClientCertificate to have Mica create a key
   * pair and certificate signing request (CSR), sign the CSR with a CA the Issuer's server trusts, upload the signed
   * certificate with UpdateFromMicaClientCertificate, set the callback address with
   * UpdateFromMicaClientCallbackAddress, then call EnableFromMicaClientCertificate.
   * </pre>
   */
  public static final class IssuerAdministrationServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<IssuerAdministrationServiceBlockingV2Stub> {
    private IssuerAdministrationServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IssuerAdministrationServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IssuerAdministrationServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a new client key pair and certificate signing request (CSR) that Mica will use to authenticate when it
     * calls the Issuer. The private key stays with Mica; the response carries the CSR for the Issuer to sign.
     * </pre>
     */
    public io.mica.issuer.administration.v2.GenerateFromMicaClientCertificateResponse generateFromMicaClientCertificate(io.mica.issuer.administration.v2.GenerateFromMicaClientCertificateRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGenerateFromMicaClientCertificateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Uploads the certificate the Issuer signed from the CSR, together with the root CA bundle Mica should trust for the
     * Issuer's server. Can also update the display name.
     * </pre>
     */
    public io.mica.issuer.administration.v2.UpdateFromMicaClientCertificateResponse updateFromMicaClientCertificate(io.mica.issuer.administration.v2.UpdateFromMicaClientCertificateRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getUpdateFromMicaClientCertificateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Makes a certificate the one Mica uses to call the Issuer. Mica first pings the Issuer with it and fails the call if
     * the ping fails. Only one certificate is enabled at a time, so enabling one disables the previous one.
     * </pre>
     */
    public io.mica.issuer.administration.v2.EnableFromMicaClientCertificateResponse enableFromMicaClientCertificate(io.mica.issuer.administration.v2.EnableFromMicaClientCertificateRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getEnableFromMicaClientCertificateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns all client certificates Mica holds for calling the Issuer.
     * </pre>
     */
    public io.mica.issuer.administration.v2.SearchFromMicaClientCertificateResponse searchFromMicaClientCertificate(io.mica.issuer.administration.v2.SearchFromMicaClientCertificateRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getSearchFromMicaClientCertificateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the settings Mica uses to call the Issuer: the callback address and how Mica authenticates.
     * </pre>
     */
    public io.mica.issuer.administration.v2.GetFromMicaClientSettingsResponse getFromMicaClientSettings(io.mica.issuer.administration.v2.GetFromMicaClientSettingsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetFromMicaClientSettingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sets the address at which Mica calls the Issuer's IssuerFromMicaService.
     * </pre>
     */
    public io.mica.issuer.administration.v2.UpdateFromMicaClientCallbackAddressResponse updateFromMicaClientCallbackAddress(io.mica.issuer.administration.v2.UpdateFromMicaClientCallbackAddressRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getUpdateFromMicaClientCallbackAddressMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns statistics for every data extraction job on the Issuer's instance.
     * </pre>
     */
    public io.mica.issuer.administration.v2.SearchDataExtractionStatisticsResponse searchDataExtractionStatistics(io.mica.issuer.administration.v2.SearchDataExtractionStatisticsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getSearchDataExtractionStatisticsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns statistics for one data extraction job, by name.
     * </pre>
     */
    public io.mica.issuer.administration.v2.GetDataExtractionStatisticsResponse getDataExtractionStatistics(io.mica.issuer.administration.v2.GetDataExtractionStatisticsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetDataExtractionStatisticsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Tests that Mica can reach the Issuer: Mica calls the Issuer's Ping operation with the currently enabled
     * certificate. The call fails with a gRPC error if the ping fails.
     * </pre>
     */
    public io.mica.issuer.administration.v2.PingExternalResponse pingExternal(io.mica.issuer.administration.v2.PingExternalRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getPingExternalMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Tests that Mica can reach the Issuer using a specific certificate, whether or not it is enabled. Use it to check a
     * new certificate before enabling it. The call fails with a gRPC error if the ping fails.
     * </pre>
     */
    public io.mica.issuer.administration.v2.PingExternalWithCertificateResponse pingExternalWithCertificate(io.mica.issuer.administration.v2.PingExternalWithCertificateRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getPingExternalWithCertificateMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service IssuerAdministrationService.
   * <pre>
   * Administration of an Issuer's Mica instance: the client certificates and callback address Mica uses to call the
   * Issuer's IssuerFromMicaService, connectivity tests, and data extraction statistics.
   * To set up the connection from Mica to the Issuer: call GenerateFromMicaClientCertificate to have Mica create a key
   * pair and certificate signing request (CSR), sign the CSR with a CA the Issuer's server trusts, upload the signed
   * certificate with UpdateFromMicaClientCertificate, set the callback address with
   * UpdateFromMicaClientCallbackAddress, then call EnableFromMicaClientCertificate.
   * </pre>
   */
  public static final class IssuerAdministrationServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<IssuerAdministrationServiceBlockingStub> {
    private IssuerAdministrationServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IssuerAdministrationServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IssuerAdministrationServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a new client key pair and certificate signing request (CSR) that Mica will use to authenticate when it
     * calls the Issuer. The private key stays with Mica; the response carries the CSR for the Issuer to sign.
     * </pre>
     */
    public io.mica.issuer.administration.v2.GenerateFromMicaClientCertificateResponse generateFromMicaClientCertificate(io.mica.issuer.administration.v2.GenerateFromMicaClientCertificateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateFromMicaClientCertificateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Uploads the certificate the Issuer signed from the CSR, together with the root CA bundle Mica should trust for the
     * Issuer's server. Can also update the display name.
     * </pre>
     */
    public io.mica.issuer.administration.v2.UpdateFromMicaClientCertificateResponse updateFromMicaClientCertificate(io.mica.issuer.administration.v2.UpdateFromMicaClientCertificateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateFromMicaClientCertificateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Makes a certificate the one Mica uses to call the Issuer. Mica first pings the Issuer with it and fails the call if
     * the ping fails. Only one certificate is enabled at a time, so enabling one disables the previous one.
     * </pre>
     */
    public io.mica.issuer.administration.v2.EnableFromMicaClientCertificateResponse enableFromMicaClientCertificate(io.mica.issuer.administration.v2.EnableFromMicaClientCertificateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEnableFromMicaClientCertificateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns all client certificates Mica holds for calling the Issuer.
     * </pre>
     */
    public io.mica.issuer.administration.v2.SearchFromMicaClientCertificateResponse searchFromMicaClientCertificate(io.mica.issuer.administration.v2.SearchFromMicaClientCertificateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchFromMicaClientCertificateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the settings Mica uses to call the Issuer: the callback address and how Mica authenticates.
     * </pre>
     */
    public io.mica.issuer.administration.v2.GetFromMicaClientSettingsResponse getFromMicaClientSettings(io.mica.issuer.administration.v2.GetFromMicaClientSettingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetFromMicaClientSettingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sets the address at which Mica calls the Issuer's IssuerFromMicaService.
     * </pre>
     */
    public io.mica.issuer.administration.v2.UpdateFromMicaClientCallbackAddressResponse updateFromMicaClientCallbackAddress(io.mica.issuer.administration.v2.UpdateFromMicaClientCallbackAddressRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateFromMicaClientCallbackAddressMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns statistics for every data extraction job on the Issuer's instance.
     * </pre>
     */
    public io.mica.issuer.administration.v2.SearchDataExtractionStatisticsResponse searchDataExtractionStatistics(io.mica.issuer.administration.v2.SearchDataExtractionStatisticsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchDataExtractionStatisticsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns statistics for one data extraction job, by name.
     * </pre>
     */
    public io.mica.issuer.administration.v2.GetDataExtractionStatisticsResponse getDataExtractionStatistics(io.mica.issuer.administration.v2.GetDataExtractionStatisticsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDataExtractionStatisticsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Tests that Mica can reach the Issuer: Mica calls the Issuer's Ping operation with the currently enabled
     * certificate. The call fails with a gRPC error if the ping fails.
     * </pre>
     */
    public io.mica.issuer.administration.v2.PingExternalResponse pingExternal(io.mica.issuer.administration.v2.PingExternalRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPingExternalMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Tests that Mica can reach the Issuer using a specific certificate, whether or not it is enabled. Use it to check a
     * new certificate before enabling it. The call fails with a gRPC error if the ping fails.
     * </pre>
     */
    public io.mica.issuer.administration.v2.PingExternalWithCertificateResponse pingExternalWithCertificate(io.mica.issuer.administration.v2.PingExternalWithCertificateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPingExternalWithCertificateMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service IssuerAdministrationService.
   * <pre>
   * Administration of an Issuer's Mica instance: the client certificates and callback address Mica uses to call the
   * Issuer's IssuerFromMicaService, connectivity tests, and data extraction statistics.
   * To set up the connection from Mica to the Issuer: call GenerateFromMicaClientCertificate to have Mica create a key
   * pair and certificate signing request (CSR), sign the CSR with a CA the Issuer's server trusts, upload the signed
   * certificate with UpdateFromMicaClientCertificate, set the callback address with
   * UpdateFromMicaClientCallbackAddress, then call EnableFromMicaClientCertificate.
   * </pre>
   */
  public static final class IssuerAdministrationServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<IssuerAdministrationServiceFutureStub> {
    private IssuerAdministrationServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IssuerAdministrationServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IssuerAdministrationServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a new client key pair and certificate signing request (CSR) that Mica will use to authenticate when it
     * calls the Issuer. The private key stays with Mica; the response carries the CSR for the Issuer to sign.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mica.issuer.administration.v2.GenerateFromMicaClientCertificateResponse> generateFromMicaClientCertificate(
        io.mica.issuer.administration.v2.GenerateFromMicaClientCertificateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenerateFromMicaClientCertificateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Uploads the certificate the Issuer signed from the CSR, together with the root CA bundle Mica should trust for the
     * Issuer's server. Can also update the display name.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mica.issuer.administration.v2.UpdateFromMicaClientCertificateResponse> updateFromMicaClientCertificate(
        io.mica.issuer.administration.v2.UpdateFromMicaClientCertificateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateFromMicaClientCertificateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Makes a certificate the one Mica uses to call the Issuer. Mica first pings the Issuer with it and fails the call if
     * the ping fails. Only one certificate is enabled at a time, so enabling one disables the previous one.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mica.issuer.administration.v2.EnableFromMicaClientCertificateResponse> enableFromMicaClientCertificate(
        io.mica.issuer.administration.v2.EnableFromMicaClientCertificateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEnableFromMicaClientCertificateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns all client certificates Mica holds for calling the Issuer.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mica.issuer.administration.v2.SearchFromMicaClientCertificateResponse> searchFromMicaClientCertificate(
        io.mica.issuer.administration.v2.SearchFromMicaClientCertificateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchFromMicaClientCertificateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the settings Mica uses to call the Issuer: the callback address and how Mica authenticates.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mica.issuer.administration.v2.GetFromMicaClientSettingsResponse> getFromMicaClientSettings(
        io.mica.issuer.administration.v2.GetFromMicaClientSettingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetFromMicaClientSettingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sets the address at which Mica calls the Issuer's IssuerFromMicaService.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mica.issuer.administration.v2.UpdateFromMicaClientCallbackAddressResponse> updateFromMicaClientCallbackAddress(
        io.mica.issuer.administration.v2.UpdateFromMicaClientCallbackAddressRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateFromMicaClientCallbackAddressMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns statistics for every data extraction job on the Issuer's instance.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mica.issuer.administration.v2.SearchDataExtractionStatisticsResponse> searchDataExtractionStatistics(
        io.mica.issuer.administration.v2.SearchDataExtractionStatisticsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchDataExtractionStatisticsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns statistics for one data extraction job, by name.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mica.issuer.administration.v2.GetDataExtractionStatisticsResponse> getDataExtractionStatistics(
        io.mica.issuer.administration.v2.GetDataExtractionStatisticsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDataExtractionStatisticsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Tests that Mica can reach the Issuer: Mica calls the Issuer's Ping operation with the currently enabled
     * certificate. The call fails with a gRPC error if the ping fails.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mica.issuer.administration.v2.PingExternalResponse> pingExternal(
        io.mica.issuer.administration.v2.PingExternalRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPingExternalMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Tests that Mica can reach the Issuer using a specific certificate, whether or not it is enabled. Use it to check a
     * new certificate before enabling it. The call fails with a gRPC error if the ping fails.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mica.issuer.administration.v2.PingExternalWithCertificateResponse> pingExternalWithCertificate(
        io.mica.issuer.administration.v2.PingExternalWithCertificateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPingExternalWithCertificateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GENERATE_FROM_MICA_CLIENT_CERTIFICATE = 0;
  private static final int METHODID_UPDATE_FROM_MICA_CLIENT_CERTIFICATE = 1;
  private static final int METHODID_ENABLE_FROM_MICA_CLIENT_CERTIFICATE = 2;
  private static final int METHODID_SEARCH_FROM_MICA_CLIENT_CERTIFICATE = 3;
  private static final int METHODID_GET_FROM_MICA_CLIENT_SETTINGS = 4;
  private static final int METHODID_UPDATE_FROM_MICA_CLIENT_CALLBACK_ADDRESS = 5;
  private static final int METHODID_SEARCH_DATA_EXTRACTION_STATISTICS = 6;
  private static final int METHODID_GET_DATA_EXTRACTION_STATISTICS = 7;
  private static final int METHODID_PING_EXTERNAL = 8;
  private static final int METHODID_PING_EXTERNAL_WITH_CERTIFICATE = 9;

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
        case METHODID_GENERATE_FROM_MICA_CLIENT_CERTIFICATE:
          serviceImpl.generateFromMicaClientCertificate((io.mica.issuer.administration.v2.GenerateFromMicaClientCertificateRequest) request,
              (io.grpc.stub.StreamObserver<io.mica.issuer.administration.v2.GenerateFromMicaClientCertificateResponse>) responseObserver);
          break;
        case METHODID_UPDATE_FROM_MICA_CLIENT_CERTIFICATE:
          serviceImpl.updateFromMicaClientCertificate((io.mica.issuer.administration.v2.UpdateFromMicaClientCertificateRequest) request,
              (io.grpc.stub.StreamObserver<io.mica.issuer.administration.v2.UpdateFromMicaClientCertificateResponse>) responseObserver);
          break;
        case METHODID_ENABLE_FROM_MICA_CLIENT_CERTIFICATE:
          serviceImpl.enableFromMicaClientCertificate((io.mica.issuer.administration.v2.EnableFromMicaClientCertificateRequest) request,
              (io.grpc.stub.StreamObserver<io.mica.issuer.administration.v2.EnableFromMicaClientCertificateResponse>) responseObserver);
          break;
        case METHODID_SEARCH_FROM_MICA_CLIENT_CERTIFICATE:
          serviceImpl.searchFromMicaClientCertificate((io.mica.issuer.administration.v2.SearchFromMicaClientCertificateRequest) request,
              (io.grpc.stub.StreamObserver<io.mica.issuer.administration.v2.SearchFromMicaClientCertificateResponse>) responseObserver);
          break;
        case METHODID_GET_FROM_MICA_CLIENT_SETTINGS:
          serviceImpl.getFromMicaClientSettings((io.mica.issuer.administration.v2.GetFromMicaClientSettingsRequest) request,
              (io.grpc.stub.StreamObserver<io.mica.issuer.administration.v2.GetFromMicaClientSettingsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_FROM_MICA_CLIENT_CALLBACK_ADDRESS:
          serviceImpl.updateFromMicaClientCallbackAddress((io.mica.issuer.administration.v2.UpdateFromMicaClientCallbackAddressRequest) request,
              (io.grpc.stub.StreamObserver<io.mica.issuer.administration.v2.UpdateFromMicaClientCallbackAddressResponse>) responseObserver);
          break;
        case METHODID_SEARCH_DATA_EXTRACTION_STATISTICS:
          serviceImpl.searchDataExtractionStatistics((io.mica.issuer.administration.v2.SearchDataExtractionStatisticsRequest) request,
              (io.grpc.stub.StreamObserver<io.mica.issuer.administration.v2.SearchDataExtractionStatisticsResponse>) responseObserver);
          break;
        case METHODID_GET_DATA_EXTRACTION_STATISTICS:
          serviceImpl.getDataExtractionStatistics((io.mica.issuer.administration.v2.GetDataExtractionStatisticsRequest) request,
              (io.grpc.stub.StreamObserver<io.mica.issuer.administration.v2.GetDataExtractionStatisticsResponse>) responseObserver);
          break;
        case METHODID_PING_EXTERNAL:
          serviceImpl.pingExternal((io.mica.issuer.administration.v2.PingExternalRequest) request,
              (io.grpc.stub.StreamObserver<io.mica.issuer.administration.v2.PingExternalResponse>) responseObserver);
          break;
        case METHODID_PING_EXTERNAL_WITH_CERTIFICATE:
          serviceImpl.pingExternalWithCertificate((io.mica.issuer.administration.v2.PingExternalWithCertificateRequest) request,
              (io.grpc.stub.StreamObserver<io.mica.issuer.administration.v2.PingExternalWithCertificateResponse>) responseObserver);
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
          getGenerateFromMicaClientCertificateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mica.issuer.administration.v2.GenerateFromMicaClientCertificateRequest,
              io.mica.issuer.administration.v2.GenerateFromMicaClientCertificateResponse>(
                service, METHODID_GENERATE_FROM_MICA_CLIENT_CERTIFICATE)))
        .addMethod(
          getUpdateFromMicaClientCertificateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mica.issuer.administration.v2.UpdateFromMicaClientCertificateRequest,
              io.mica.issuer.administration.v2.UpdateFromMicaClientCertificateResponse>(
                service, METHODID_UPDATE_FROM_MICA_CLIENT_CERTIFICATE)))
        .addMethod(
          getEnableFromMicaClientCertificateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mica.issuer.administration.v2.EnableFromMicaClientCertificateRequest,
              io.mica.issuer.administration.v2.EnableFromMicaClientCertificateResponse>(
                service, METHODID_ENABLE_FROM_MICA_CLIENT_CERTIFICATE)))
        .addMethod(
          getSearchFromMicaClientCertificateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mica.issuer.administration.v2.SearchFromMicaClientCertificateRequest,
              io.mica.issuer.administration.v2.SearchFromMicaClientCertificateResponse>(
                service, METHODID_SEARCH_FROM_MICA_CLIENT_CERTIFICATE)))
        .addMethod(
          getGetFromMicaClientSettingsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mica.issuer.administration.v2.GetFromMicaClientSettingsRequest,
              io.mica.issuer.administration.v2.GetFromMicaClientSettingsResponse>(
                service, METHODID_GET_FROM_MICA_CLIENT_SETTINGS)))
        .addMethod(
          getUpdateFromMicaClientCallbackAddressMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mica.issuer.administration.v2.UpdateFromMicaClientCallbackAddressRequest,
              io.mica.issuer.administration.v2.UpdateFromMicaClientCallbackAddressResponse>(
                service, METHODID_UPDATE_FROM_MICA_CLIENT_CALLBACK_ADDRESS)))
        .addMethod(
          getSearchDataExtractionStatisticsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mica.issuer.administration.v2.SearchDataExtractionStatisticsRequest,
              io.mica.issuer.administration.v2.SearchDataExtractionStatisticsResponse>(
                service, METHODID_SEARCH_DATA_EXTRACTION_STATISTICS)))
        .addMethod(
          getGetDataExtractionStatisticsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mica.issuer.administration.v2.GetDataExtractionStatisticsRequest,
              io.mica.issuer.administration.v2.GetDataExtractionStatisticsResponse>(
                service, METHODID_GET_DATA_EXTRACTION_STATISTICS)))
        .addMethod(
          getPingExternalMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mica.issuer.administration.v2.PingExternalRequest,
              io.mica.issuer.administration.v2.PingExternalResponse>(
                service, METHODID_PING_EXTERNAL)))
        .addMethod(
          getPingExternalWithCertificateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mica.issuer.administration.v2.PingExternalWithCertificateRequest,
              io.mica.issuer.administration.v2.PingExternalWithCertificateResponse>(
                service, METHODID_PING_EXTERNAL_WITH_CERTIFICATE)))
        .build();
  }

  private static abstract class IssuerAdministrationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    IssuerAdministrationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.mica.issuer.administration.v2.AdminServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("IssuerAdministrationService");
    }
  }

  private static final class IssuerAdministrationServiceFileDescriptorSupplier
      extends IssuerAdministrationServiceBaseDescriptorSupplier {
    IssuerAdministrationServiceFileDescriptorSupplier() {}
  }

  private static final class IssuerAdministrationServiceMethodDescriptorSupplier
      extends IssuerAdministrationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    IssuerAdministrationServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (IssuerAdministrationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new IssuerAdministrationServiceFileDescriptorSupplier())
              .addMethod(getGenerateFromMicaClientCertificateMethod())
              .addMethod(getUpdateFromMicaClientCertificateMethod())
              .addMethod(getEnableFromMicaClientCertificateMethod())
              .addMethod(getSearchFromMicaClientCertificateMethod())
              .addMethod(getGetFromMicaClientSettingsMethod())
              .addMethod(getUpdateFromMicaClientCallbackAddressMethod())
              .addMethod(getSearchDataExtractionStatisticsMethod())
              .addMethod(getGetDataExtractionStatisticsMethod())
              .addMethod(getPingExternalMethod())
              .addMethod(getPingExternalWithCertificateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
