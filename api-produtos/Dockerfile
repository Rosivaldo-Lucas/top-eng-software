#
# Build stage
#
FROM maven:3.9.2-amazoncorretto-17 as build
COPY . .
RUN mvn clean package -DskipTests

#
# Package stage
#
FROM openjdk:17-jdk-slim
COPY --from=build /target/api-produtos-0.0.1-SNAPSHOT.jar api-produtos.jar
# ENV PORT=8080
EXPOSE 8080
ENTRYPOINT ["java","-jar","api-produtos.jar"]