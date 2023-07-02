FROM eclipse-temurin:17
LABEL maintainer="daniilmkr"
WORKDIR /app
COPY target/Food-Management-App-0.0.1-SNAPSHOT.jar /app/springboot-foodmanagement-demo.jar
EXPOSE 8091
ENTRYPOINT ["java", "-jar", "springboot-foodmanagement-demo.jar"]