FROM openjdk:17
ARG JAR_FILE=target/*.jar
EXPOSE 8001
ADD target/login-microservices.jar login-microservices.jar
ENTRYPOINT ["java", "-jar", "/login-microservices.jar"]