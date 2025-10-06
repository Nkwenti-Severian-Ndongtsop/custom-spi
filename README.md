# Greeting SPI Keycloak Project

## Project Structure Overview

**Main Directories:**
- `src/`: Contains Java source code for the Keycloak SPI implementation
- `build/`: Generated build artifacts (classes, JARs, reports)
- `gradle/`: Gradle wrapper and configuration
- `custom-provider/`: Contains the built SPI JAR

**Key Files:**
- `WelcomeEventListenerProvider.java`: Main SPI implementation
- `build.gradle`: Project build configuration
- `application.properties`: Configuration file
- `README.md`: This file

## Unused Files (Suggested for Removal)
- `adorsys-tm-01/`: Unused asset directory (SVGs, CSS, JS)
- `docker-compose.yaml`: Not used in current setup
- `postgres-data/`: Database data directory (not part of code)
- `spi-data/`: SPI data directory