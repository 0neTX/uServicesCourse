FROM maven:openjdk as builder
RUN mkdir /app
COPY . /app
WORKDIR /app
RUN mvn package

FROM openjdk:18-jdk-alpine3.13
RUN mkdir /app
WORKDIR /app
COPY --from=builder /app/target/email-validation-uservice-0.0.1-SNAPSHOT.jar ./app.jar 
ENTRYPOINT java -jar app.jar

