# Prerequisite

A docker registry runs under `localhost:5000`.
 
# Build

```
(cd interface && mvn clean install)
(cd client && mvn clean install && docker build . -t localhost:5000/grpc-client && docker push localhost:5000/grpc-client)
(cd server && mvn clean install && docker build . -t localhost:5000/grpc-server && docker push localhost:5000/grpc-server)
```

# Run

```
kubectl create namespace spring-boot-grpc
helm install spring-boot-grpc spring-boot-grpc
```

# Demo

```
curl -H "Content-Type: text/plain" -d "Hello from cURL!" localhost
```
