FROM openjdk:21-jdk

WORKDIR /app

COPY target/config-server.jar /app/config-server.jar

EXPOSE 8888

ENTRYPOINT ["java", "-jar", "/app/config-server.jar"]

