FROM maven:3.6-jdk-8-slim
#FROM alpine:latest


WORKDIR /spring-boot-demo

ADD . .

USER root
RUN chmod 777 /spring-boot-demo

RUN mvn clean verify test

#CMD ["sh", "-c", "ls / -la && ls /spring-boot-demo -la && ls /.m2 -la && ls /.m2/repository -la && pwd && mvn clean verify test"]