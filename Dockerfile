FROM maven:3.6-jdk-8-slim
#FROM alpine:latest

WORKDIR /spring-boot-demo

ADD . .

CMD ["sh", "-c", "ls -la && pwd && mvn clean verify test"]