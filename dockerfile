# syntax=docker/dockerfile:1

# Stage di build: usa Maven con Temurin JDK 21 per compilare il progetto
FROM maven:3.9.6-eclipse-temurin-21 AS build
WORKDIR /workspace

# Copia il pom prima per sfruttare la cache dei layer per le dipendenze
COPY pom.xml ./
# Copia il sorgente
COPY src ./src

# Compila il progetto (skip tests per velocità)
RUN mvn -B -DskipTests package

# Stage runtime: immagine più leggera con JRE 21
FROM eclipse-temurin:21-jre
WORKDIR /app

# Copia il jar prodotto nello stage di build
COPY --from=build /workspace/target/*.jar app.jar

# Porta usata dall'app Spring Boot
EXPOSE 9090

# Avvio dell'app
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
