FROM openjdk:21-jdk

WORKDIR /app

COPY target/api-gateway.jar /app/api-gateway.jar

EXPOSE 8081

ENTRYPOINT ["java", "-jar", "/app/api-gateway.jar"]

