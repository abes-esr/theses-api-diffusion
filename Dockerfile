###
# Image pour la compilation
FROM maven:3-eclipse-temurin-11 AS build-image
WORKDIR /build/

# Téléchargement de l'agent OpenTelemetry
ADD https://github.com/open-telemetry/opentelemetry-java-instrumentation/releases/download/v2.3.0/opentelemetry-javaagent.jar /build/opentelemetry-javaagent.jar


# On lance la compilation Java
# On débute par une mise en cache docker des dépendances Java
# cf https://www.baeldung.com/ops/docker-cache-maven-dependencies
COPY ./pom.xml /build/pom.xml
COPY ./src/main/resources/74979_GERARDIN_2018_archivage.pdf /
RUN mvn verify --fail-never
# et la compilation du code Java
COPY ./src/   /build/src/
RUN mvn --batch-mode -e \
    -Dmaven.test.skip=false \
    -Duser.timezone=Europe/Paris \
    -Duser.language=fr \
    package

###
# Image pour le module theses-diffusion

FROM eclipse-temurin:11-jre AS api-diffusion-image
WORKDIR /app/
COPY --from=build-image /build/target/*.jar /app/theses-api-diffusion.jar
COPY --from=build-image /74979_GERARDIN_2018_archivage.pdf /

# Copie de l'agent OpenTelemetry depuis l'image de build
COPY --from=build-image /build/opentelemetry-javaagent.jar /app/opentelemetry-javaagent.jar

ENTRYPOINT ["java", "-javaagent:/app/opentelemetry-javaagent.jar", "-jar", "/app/theses-api-diffusion.jar"]