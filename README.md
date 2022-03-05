# Prerequisite

* A docker registry runs under `localhost:5000`.
* The Kubernetes namespace `spring-boot-grpc` does not exist yet.
 
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

# Cleanup

```
helm uninstall spring-boot-grpc
kubectl delete namespace spring-boot-grpc
```