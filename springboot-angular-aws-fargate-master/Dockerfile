FROM adoptopenjdk/openjdk11:alpine-jre
ADD target/springboot-crud-api.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]