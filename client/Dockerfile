FROM openjdk:11-jdk-slim

COPY target/client-1.0-SNAPSHOT.jar client.jar

ENTRYPOINT [ "sh", "-c", "java -jar client.jar" ]