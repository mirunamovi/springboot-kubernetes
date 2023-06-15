FROM openjdk:17
ARG JAR_FILE=target/*.jar
EXPOSE 8001
ADD target/product-microservices.jar product-microservices.jar
ENTRYPOINT ["java", "-jar", "/product-microservices.jar"]

