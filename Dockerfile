FROM openjdk:11

COPY /gradlew ./
COPY /settings.gradle ./
COPY /gradle ./gradle
COPY /src ./src/

COPY . .

RUN /gradlew clean build

COPY /build/libs/spring-app-*.jar app.jar

EXPOSE 8080

CMD ["java","-jar","/app.jar"]
