# Use Java 17 with Maven preinstalled
FROM maven:3.9.4-eclipse-temurin-17-alpine AS build

# Set workdir and copy everything
WORKDIR /app
COPY . .

# Build the Spring Boot application (skip tests if needed)
RUN mvn clean package -DskipTests

# Create final image with only JRE
FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

# Copy the JAR from the previous build stage
COPY --from=build /app/target/*.jar app.jar

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
