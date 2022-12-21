FROM maven:3-eclipse-temurin-17 AS build
WORKDIR /app
COPY pom.xml .
RUN mvn dependency:copy-dependencies
COPY . .
RUN mvn compile
RUN mvn verify

FROM openjdk:17-jdk
MAINTAINER EAS Barbosa <easbarba@outlook.com>
ARG ZAE_VERSION
ENV ZAE_VERSION=$ZAE_VERSION
COPY --from=build /app/target/zae-${ZAE_VERSION}.jar /opt/zae-${ZAE_VERSION}.jar
COPY examples /root/.config/zae
CMD "java" "-jar" "/opt/zae-${ZAE_VERSION}.jar"
