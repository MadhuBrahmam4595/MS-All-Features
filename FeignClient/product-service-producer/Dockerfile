FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} product-service.jar
ENTRYPOINT ["java", "-jar", "/product-service.jar"]