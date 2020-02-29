# sample-spring-boot
This project is an example of an implementation of a service in a microservices architecture using [spring-boot].
It also includes an example of a dockerfile for the service and the script that should be run in the container.
This project uses [Lombok] and [Swagger].

The swagger page is located at http://localhost:8080/sample/v1/swagger-ui.html

### Run:
```bash
mvn spring-boot:run
```

#### with profile:
```bash
mvn spring-boot:run -Dprofile=local
```

### To build:
```bash
mvn clean install
```

[//]: # (These are reference links)

[java]: <https://jdk.java.net/13/>
[Lombok]: <https://projectlombok.org/>
[spring-boot]: <https://spring.io/projects/spring-boot>
[Swagger]: <https://swagger.io/>

