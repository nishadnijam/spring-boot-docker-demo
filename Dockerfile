FROM openjdk:21-jdk
ARG JAR_FILE=target/spring-boot-docker-demo-*.jar
COPY ${JAR_FILE} spring-boot-docker-api.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "spring-boot-docker-api.jar"]