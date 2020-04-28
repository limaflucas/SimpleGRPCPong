package br.com.limaflucas.grpc;

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
    value = "by gRPC proto compiler (version 1.29.0)",
    comments = "Source: PongService.proto")
public final class PongServiceGrpc {

  private PongServiceGrpc() {}

  public static final String SERVICE_NAME = "br.com.limaflucas.grpc.PongService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<br.com.limaflucas.grpc.PongRequest,
      br.com.limaflucas.grpc.PongResponse> getPongMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "pong",
      requestType = br.com.limaflucas.grpc.PongRequest.class,
      responseType = br.com.limaflucas.grpc.PongResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<br.com.limaflucas.grpc.PongRequest,
      br.com.limaflucas.grpc.PongResponse> getPongMethod() {
    io.grpc.MethodDescriptor<br.com.limaflucas.grpc.PongRequest, br.com.limaflucas.grpc.PongResponse> getPongMethod;
    if ((getPongMethod = PongServiceGrpc.getPongMethod) == null) {
      synchronized (PongServiceGrpc.class) {
        if ((getPongMethod = PongServiceGrpc.getPongMethod) == null) {
          PongServiceGrpc.getPongMethod = getPongMethod =
              io.grpc.MethodDescriptor.<br.com.limaflucas.grpc.PongRequest, br.com.limaflucas.grpc.PongResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "pong"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.limaflucas.grpc.PongRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.limaflucas.grpc.PongResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PongServiceMethodDescriptorSupplier("pong"))
              .build();
        }
      }
    }
    return getPongMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PongServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PongServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PongServiceStub>() {
        @java.lang.Override
        public PongServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PongServiceStub(channel, callOptions);
        }
      };
    return PongServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PongServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PongServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PongServiceBlockingStub>() {
        @java.lang.Override
        public PongServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PongServiceBlockingStub(channel, callOptions);
        }
      };
    return PongServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PongServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PongServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PongServiceFutureStub>() {
        @java.lang.Override
        public PongServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PongServiceFutureStub(channel, callOptions);
        }
      };
    return PongServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class PongServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void pong(br.com.limaflucas.grpc.PongRequest request,
        io.grpc.stub.StreamObserver<br.com.limaflucas.grpc.PongResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPongMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPongMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                br.com.limaflucas.grpc.PongRequest,
                br.com.limaflucas.grpc.PongResponse>(
                  this, METHODID_PONG)))
          .build();
    }
  }

  /**
   */
  public static final class PongServiceStub extends io.grpc.stub.AbstractAsyncStub<PongServiceStub> {
    private PongServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PongServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PongServiceStub(channel, callOptions);
    }

    /**
     */
    public void pong(br.com.limaflucas.grpc.PongRequest request,
        io.grpc.stub.StreamObserver<br.com.limaflucas.grpc.PongResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPongMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PongServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<PongServiceBlockingStub> {
    private PongServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PongServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PongServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public br.com.limaflucas.grpc.PongResponse pong(br.com.limaflucas.grpc.PongRequest request) {
      return blockingUnaryCall(
          getChannel(), getPongMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PongServiceFutureStub extends io.grpc.stub.AbstractFutureStub<PongServiceFutureStub> {
    private PongServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PongServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PongServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<br.com.limaflucas.grpc.PongResponse> pong(
        br.com.limaflucas.grpc.PongRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPongMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PONG = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PongServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PongServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PONG:
          serviceImpl.pong((br.com.limaflucas.grpc.PongRequest) request,
              (io.grpc.stub.StreamObserver<br.com.limaflucas.grpc.PongResponse>) responseObserver);
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

  private static abstract class PongServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PongServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return br.com.limaflucas.grpc.PongServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PongService");
    }
  }

  private static final class PongServiceFileDescriptorSupplier
      extends PongServiceBaseDescriptorSupplier {
    PongServiceFileDescriptorSupplier() {}
  }

  private static final class PongServiceMethodDescriptorSupplier
      extends PongServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PongServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PongServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PongServiceFileDescriptorSupplier())
              .addMethod(getPongMethod())
              .build();
        }
      }
    }
    return result;
  }
}
