FROM maven:3.6-jdk-8-slim
#FROM alpine:latest


WORKDIR /spring-boot-demo

ADD . .

USER root
RUN chmod 777 /spring-boot-demo/src/target

CMD ["sh", "-c", "ls /spring-boot-demo -la && ls /.m2 -la && ls /.m2/repository -la && pwd && mvn clean verify test"]