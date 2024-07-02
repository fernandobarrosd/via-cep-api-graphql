FROM maven:3.8.8-eclipse-temurin-21 as build

COPY . .

RUN mvn clean package

FROM openjdk:21-slim

COPY --from=build target/via-cep-api-graphql-0.0.1-SNAPSHOT.jar via-cep-api-graphql.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "via-cep-api-graphql.jar"]