FROM openjdk:11-jdk-slim

COPY target/server-1.0-SNAPSHOT.jar server.jar

ENTRYPOINT [ "sh", "-c", "java -jar server.jar" ]