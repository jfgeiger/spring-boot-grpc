package org.example;

import net.devh.boot.grpc.client.inject.GrpcClient;
import org.example.MyServiceGrpc.MyServiceBlockingStub;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @GrpcClient("myService")
  private MyServiceBlockingStub myServiceStub;

  @PostMapping
  public String greet(@RequestBody final String name) {
    final var request = HelloRequest.newBuilder()
        .setName(name)
        .build();
    final var helloReply = this.myServiceStub.sayHello(request);

    return helloReply.getMessage();
  }
}