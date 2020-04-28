package br.com.limaflucas.simple_grpc_pong;

import br.com.limaflucas.grpc.PongRequest;
import br.com.limaflucas.grpc.PongResponse;
import br.com.limaflucas.grpc.PongServiceGrpc;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;

import java.time.LocalDateTime;

@GRpcService
public class PongServerImpl extends PongServiceGrpc.PongServiceImplBase {

    @Override
    public void pong(PongRequest request, StreamObserver<PongResponse> responseObserver) {

        if (request.getRequestMessage().equalsIgnoreCase("ping"))
            responseObserver.onNext(PongResponse.newBuilder()
                    .setResponseMessage("PONG!")
                    .setResponseTime(LocalDateTime.now().toString())
                    .build());
        else
            responseObserver.onNext(PongResponse.newBuilder().setResponseMessage("Naaaaah! I c wyd...").build());

        responseObserver.onCompleted();
    }
}
