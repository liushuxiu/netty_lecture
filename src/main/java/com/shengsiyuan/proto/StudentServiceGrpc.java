package com.shengsiyuan.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.13.1)",
    comments = "Source: Student.proto")
public final class StudentServiceGrpc {

  private StudentServiceGrpc() {}

  public static final String SERVICE_NAME = "com.shengsiyuan.proto.StudentService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.shengsiyuan.proto.MyRequest,
      com.shengsiyuan.proto.MyResponse> getGetRealNameByUsernameMethod;

  public static io.grpc.MethodDescriptor<com.shengsiyuan.proto.MyRequest,
      com.shengsiyuan.proto.MyResponse> getGetRealNameByUsernameMethod() {
    io.grpc.MethodDescriptor<com.shengsiyuan.proto.MyRequest, com.shengsiyuan.proto.MyResponse> getGetRealNameByUsernameMethod;
    if ((getGetRealNameByUsernameMethod = StudentServiceGrpc.getGetRealNameByUsernameMethod) == null) {
      synchronized (StudentServiceGrpc.class) {
        if ((getGetRealNameByUsernameMethod = StudentServiceGrpc.getGetRealNameByUsernameMethod) == null) {
          StudentServiceGrpc.getGetRealNameByUsernameMethod = getGetRealNameByUsernameMethod = 
              io.grpc.MethodDescriptor.<com.shengsiyuan.proto.MyRequest, com.shengsiyuan.proto.MyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.shengsiyuan.proto.StudentService", "GetRealNameByUsername"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shengsiyuan.proto.MyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shengsiyuan.proto.MyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new StudentServiceMethodDescriptorSupplier("GetRealNameByUsername"))
                  .build();
          }
        }
     }
     return getGetRealNameByUsernameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.shengsiyuan.proto.StudentRequest,
      com.shengsiyuan.proto.StudentResponse> getGetStudentsByAgeMethod;

  public static io.grpc.MethodDescriptor<com.shengsiyuan.proto.StudentRequest,
      com.shengsiyuan.proto.StudentResponse> getGetStudentsByAgeMethod() {
    io.grpc.MethodDescriptor<com.shengsiyuan.proto.StudentRequest, com.shengsiyuan.proto.StudentResponse> getGetStudentsByAgeMethod;
    if ((getGetStudentsByAgeMethod = StudentServiceGrpc.getGetStudentsByAgeMethod) == null) {
      synchronized (StudentServiceGrpc.class) {
        if ((getGetStudentsByAgeMethod = StudentServiceGrpc.getGetStudentsByAgeMethod) == null) {
          StudentServiceGrpc.getGetStudentsByAgeMethod = getGetStudentsByAgeMethod = 
              io.grpc.MethodDescriptor.<com.shengsiyuan.proto.StudentRequest, com.shengsiyuan.proto.StudentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "com.shengsiyuan.proto.StudentService", "GetStudentsByAge"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shengsiyuan.proto.StudentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shengsiyuan.proto.StudentResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new StudentServiceMethodDescriptorSupplier("GetStudentsByAge"))
                  .build();
          }
        }
     }
     return getGetStudentsByAgeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.shengsiyuan.proto.StudentRequest,
      com.shengsiyuan.proto.StudentResponseList> getGetStudentsWrapperByAgesMethod;

  public static io.grpc.MethodDescriptor<com.shengsiyuan.proto.StudentRequest,
      com.shengsiyuan.proto.StudentResponseList> getGetStudentsWrapperByAgesMethod() {
    io.grpc.MethodDescriptor<com.shengsiyuan.proto.StudentRequest, com.shengsiyuan.proto.StudentResponseList> getGetStudentsWrapperByAgesMethod;
    if ((getGetStudentsWrapperByAgesMethod = StudentServiceGrpc.getGetStudentsWrapperByAgesMethod) == null) {
      synchronized (StudentServiceGrpc.class) {
        if ((getGetStudentsWrapperByAgesMethod = StudentServiceGrpc.getGetStudentsWrapperByAgesMethod) == null) {
          StudentServiceGrpc.getGetStudentsWrapperByAgesMethod = getGetStudentsWrapperByAgesMethod = 
              io.grpc.MethodDescriptor.<com.shengsiyuan.proto.StudentRequest, com.shengsiyuan.proto.StudentResponseList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "com.shengsiyuan.proto.StudentService", "GetStudentsWrapperByAges"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shengsiyuan.proto.StudentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shengsiyuan.proto.StudentResponseList.getDefaultInstance()))
                  .setSchemaDescriptor(new StudentServiceMethodDescriptorSupplier("GetStudentsWrapperByAges"))
                  .build();
          }
        }
     }
     return getGetStudentsWrapperByAgesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.shengsiyuan.proto.StreamRequest,
      com.shengsiyuan.proto.StreamResponse> getBiTalkMethod;

  public static io.grpc.MethodDescriptor<com.shengsiyuan.proto.StreamRequest,
      com.shengsiyuan.proto.StreamResponse> getBiTalkMethod() {
    io.grpc.MethodDescriptor<com.shengsiyuan.proto.StreamRequest, com.shengsiyuan.proto.StreamResponse> getBiTalkMethod;
    if ((getBiTalkMethod = StudentServiceGrpc.getBiTalkMethod) == null) {
      synchronized (StudentServiceGrpc.class) {
        if ((getBiTalkMethod = StudentServiceGrpc.getBiTalkMethod) == null) {
          StudentServiceGrpc.getBiTalkMethod = getBiTalkMethod = 
              io.grpc.MethodDescriptor.<com.shengsiyuan.proto.StreamRequest, com.shengsiyuan.proto.StreamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "com.shengsiyuan.proto.StudentService", "BiTalk"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shengsiyuan.proto.StreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shengsiyuan.proto.StreamResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new StudentServiceMethodDescriptorSupplier("BiTalk"))
                  .build();
          }
        }
     }
     return getBiTalkMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StudentServiceStub newStub(io.grpc.Channel channel) {
    return new StudentServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StudentServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new StudentServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StudentServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new StudentServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class StudentServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getRealNameByUsername(com.shengsiyuan.proto.MyRequest request,
        io.grpc.stub.StreamObserver<com.shengsiyuan.proto.MyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetRealNameByUsernameMethod(), responseObserver);
    }

    /**
     */
    public void getStudentsByAge(com.shengsiyuan.proto.StudentRequest request,
        io.grpc.stub.StreamObserver<com.shengsiyuan.proto.StudentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetStudentsByAgeMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.shengsiyuan.proto.StudentRequest> getStudentsWrapperByAges(
        io.grpc.stub.StreamObserver<com.shengsiyuan.proto.StudentResponseList> responseObserver) {
      return asyncUnimplementedStreamingCall(getGetStudentsWrapperByAgesMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.shengsiyuan.proto.StreamRequest> biTalk(
        io.grpc.stub.StreamObserver<com.shengsiyuan.proto.StreamResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getBiTalkMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetRealNameByUsernameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.shengsiyuan.proto.MyRequest,
                com.shengsiyuan.proto.MyResponse>(
                  this, METHODID_GET_REAL_NAME_BY_USERNAME)))
          .addMethod(
            getGetStudentsByAgeMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.shengsiyuan.proto.StudentRequest,
                com.shengsiyuan.proto.StudentResponse>(
                  this, METHODID_GET_STUDENTS_BY_AGE)))
          .addMethod(
            getGetStudentsWrapperByAgesMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.shengsiyuan.proto.StudentRequest,
                com.shengsiyuan.proto.StudentResponseList>(
                  this, METHODID_GET_STUDENTS_WRAPPER_BY_AGES)))
          .addMethod(
            getBiTalkMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.shengsiyuan.proto.StreamRequest,
                com.shengsiyuan.proto.StreamResponse>(
                  this, METHODID_BI_TALK)))
          .build();
    }
  }

  /**
   */
  public static final class StudentServiceStub extends io.grpc.stub.AbstractStub<StudentServiceStub> {
    private StudentServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StudentServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StudentServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StudentServiceStub(channel, callOptions);
    }

    /**
     */
    public void getRealNameByUsername(com.shengsiyuan.proto.MyRequest request,
        io.grpc.stub.StreamObserver<com.shengsiyuan.proto.MyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetRealNameByUsernameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getStudentsByAge(com.shengsiyuan.proto.StudentRequest request,
        io.grpc.stub.StreamObserver<com.shengsiyuan.proto.StudentResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetStudentsByAgeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.shengsiyuan.proto.StudentRequest> getStudentsWrapperByAges(
        io.grpc.stub.StreamObserver<com.shengsiyuan.proto.StudentResponseList> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getGetStudentsWrapperByAgesMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.shengsiyuan.proto.StreamRequest> biTalk(
        io.grpc.stub.StreamObserver<com.shengsiyuan.proto.StreamResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getBiTalkMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class StudentServiceBlockingStub extends io.grpc.stub.AbstractStub<StudentServiceBlockingStub> {
    private StudentServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StudentServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StudentServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StudentServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.shengsiyuan.proto.MyResponse getRealNameByUsername(com.shengsiyuan.proto.MyRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetRealNameByUsernameMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.shengsiyuan.proto.StudentResponse> getStudentsByAge(
        com.shengsiyuan.proto.StudentRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetStudentsByAgeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class StudentServiceFutureStub extends io.grpc.stub.AbstractStub<StudentServiceFutureStub> {
    private StudentServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StudentServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StudentServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StudentServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shengsiyuan.proto.MyResponse> getRealNameByUsername(
        com.shengsiyuan.proto.MyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetRealNameByUsernameMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_REAL_NAME_BY_USERNAME = 0;
  private static final int METHODID_GET_STUDENTS_BY_AGE = 1;
  private static final int METHODID_GET_STUDENTS_WRAPPER_BY_AGES = 2;
  private static final int METHODID_BI_TALK = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final StudentServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(StudentServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_REAL_NAME_BY_USERNAME:
          serviceImpl.getRealNameByUsername((com.shengsiyuan.proto.MyRequest) request,
              (io.grpc.stub.StreamObserver<com.shengsiyuan.proto.MyResponse>) responseObserver);
          break;
        case METHODID_GET_STUDENTS_BY_AGE:
          serviceImpl.getStudentsByAge((com.shengsiyuan.proto.StudentRequest) request,
              (io.grpc.stub.StreamObserver<com.shengsiyuan.proto.StudentResponse>) responseObserver);
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
        case METHODID_GET_STUDENTS_WRAPPER_BY_AGES:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.getStudentsWrapperByAges(
              (io.grpc.stub.StreamObserver<com.shengsiyuan.proto.StudentResponseList>) responseObserver);
        case METHODID_BI_TALK:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.biTalk(
              (io.grpc.stub.StreamObserver<com.shengsiyuan.proto.StreamResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class StudentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StudentServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.shengsiyuan.proto.StudentProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StudentService");
    }
  }

  private static final class StudentServiceFileDescriptorSupplier
      extends StudentServiceBaseDescriptorSupplier {
    StudentServiceFileDescriptorSupplier() {}
  }

  private static final class StudentServiceMethodDescriptorSupplier
      extends StudentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    StudentServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (StudentServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StudentServiceFileDescriptorSupplier())
              .addMethod(getGetRealNameByUsernameMethod())
              .addMethod(getGetStudentsByAgeMethod())
              .addMethod(getGetStudentsWrapperByAgesMethod())
              .addMethod(getBiTalkMethod())
              .build();
        }
      }
    }
    return result;
  }
}
