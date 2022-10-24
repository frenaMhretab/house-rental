FROM openjdk:8-jdk-alpine
ARG JAR_FILE=Bank-Account-main/target/*.jar
EXPOSE 8081
COPY ${JAR_FILE} Bank-account-docker.jar
ENTRYPOINT ["java","-jar","/bank-account-docker.jar"]




