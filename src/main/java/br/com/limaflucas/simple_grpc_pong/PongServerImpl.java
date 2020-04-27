package br.com.limaflucas.simple_grpc_pong;

import br.com.limaflucas.grpc.PingRequest;
import br.com.limaflucas.grpc.PingResponse;
import br.com.limaflucas.grpc.PingServiceGrpc;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;

import java.time.LocalDateTime;

@GRpcService
public class PingServerImpl extends PingServiceGrpc.PingServiceImplBase {

    @Override
    public void ping(PingRequest request, StreamObserver<PingResponse> responseObserver) {
        if (request.getRequestMessage().equalsIgnoreCase("ping")) {
            responseObserver.onNext(PingResponse.newBuilder()
                    .setResponseMessage("PONG!")
                    .setResponseTime(LocalDateTime.now().toString())
                    .build());
            responseObserver.onCompleted();
        }
        else
            responseObserver.onError(new Exception("Invalid request"));

    }
}
