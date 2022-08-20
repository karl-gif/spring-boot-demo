FROM maven:3.6-jdk-8-slim
#FROM alpine:latest


WORKDIR /spring-boot-demo

ADD . .



CMD ["sh", "-c", "ls /spring-boot-demo -la && ls /.m2 -la && ls /repository -la && ls /root -la && pwd && mvn clean verify test"]