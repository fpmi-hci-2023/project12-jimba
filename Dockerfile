FROM openjdk:11

WORKDIR /app

COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN ./mvnw dependency:resolve

FROM base as test
CMD ["./mvnw", "'-Dtest=by.bsu.jimba.*.*Tests' test"]

COPY src ./src
EXPOSE 8080
CMD ["./mvnw", "spring-boot:run"]