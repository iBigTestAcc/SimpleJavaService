# Use a base image with Java 17
FROM eclipse-temurin:17-jdk-alpine

# Create app directory
WORKDIR /app

# Copy the JAR from local build
COPY target/simplejaveservice-0.0.1-SNAPSHOT.jar app.jar

# Run the JAR
ENTRYPOINT ["java", "-jar", "app.jar"]
