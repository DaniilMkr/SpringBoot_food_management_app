
# Spring Boot Products Management App

Spring Boot Products Management App is designed to keep track of your products in database by CRUD operations. App implement authentication, validation and role features.

https://github.com/DaniilMkr/SpringBoot_food_management_app/assets/125893775/28b59f68-bde0-4b9c-b6e3-c612c8a672f1




## What's inside
Project is based on the [Spring Boot](https://spring.io/projects/spring-boot) project and uses folowing packages :

- Spring Data (Hibernate & Postgresql)
- Spring Security
- Spring Validator
- Thymleaf
- Lombok
- Spring MVC (Tomcat)
- Maven
## Installation

As the project was created with Maven, you simply need to import it to your IDE and build it to resolve the dependencies

    
## Database configuration

Postgresql is selected for this project.

You will need to create a PostgreSQL database named food_management and add the credentials to /resources/application.properties.

The default credentials are :

```
server.PORT=8090
spring.datasource.url=jdbc:postgresql://localhost:5432/food_management

spring.datasource.username=postgres
spring.datasource.password=bestuser

spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.show_sql = true
spring.jpa.properties.hibernate.format_sql = true
```
## Usage

Run the project through the IDE or at the terminal by running the following command :

```
mvn spring-boot:run

```
