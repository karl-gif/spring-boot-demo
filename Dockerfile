FROM maven:3.6-jdk-8-slim
#FROM alpine:latest

WORKDIR /spring-boot-demo

ADD . .

CMD ["sh", "-c", "mvn clean verify test"]