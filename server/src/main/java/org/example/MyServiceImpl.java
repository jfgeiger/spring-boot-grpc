package org.example;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class MyServiceImpl extends MyServiceGrpc.MyServiceImplBase {

  @Override
  public void sayHello(final HelloRequest request,
      final StreamObserver<HelloReply> responseObserver) {
    final var reply = HelloReply.newBuilder()
        .setMessage("Hello ==> " + request.getName())
        .build();
    responseObserver.onNext(reply);
    responseObserver.onCompleted();
  }
}