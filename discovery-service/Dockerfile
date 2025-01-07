FROM openjdk:21-jdk

WORKDIR /app

COPY target/discovery-service.jar /app/discovery-service.jar

EXPOSE 8761

ENTRYPOINT ["java", "-jar", "/app/discovery-service.jar"]

