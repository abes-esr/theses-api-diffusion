###
# Image pour la compilation
FROM maven:3-eclipse-temurin-11 as build-image
WORKDIR /build/
# Installation et configuration de la locale FR
RUN apt update && DEBIAN_FRONTEND=noninteractive apt -y install locales
RUN sed -i '/fr_FR.UTF-8/s/^# //g' /etc/locale.gen && \
    locale-gen
ENV LANG fr_FR.UTF-8
ENV LANGUAGE fr_FR:fr
ENV LC_ALL fr_FR.UTF-8


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

FROM eclipse-temurin:11-jre as api-diffusion-image
WORKDIR /app/
COPY --from=build-image /build/target/*.jar /app/theses-api-diffusion.jar
COPY --from=build-image /74979_GERARDIN_2018_archivage.pdf /
ENTRYPOINT exec java $JAVA_OPTS -jar /app/theses-api-diffusion.jar
