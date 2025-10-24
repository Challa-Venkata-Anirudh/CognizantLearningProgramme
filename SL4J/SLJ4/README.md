# LoggingWithSLF4J

## Overview
This is a simple Java project using SLF4J with Logback to demonstrate logging of error and warning messages.

## Requirements
- Java 8 or higher
- Maven

## Setup Instructions

1. **Clone or unzip the project**

2. **Navigate to the project folder**
```sh
cd LoggingWithSLF4J
```

3. **Build the project using Maven**
```sh
mvn clean install
```

4. **Run the application**
```sh
mvn exec:java -Dexec.mainClass="LoggingExample"
```

## Output Example
```
2025-06-28 18:35:10 [main] ERROR LoggingExample - This is an error message
2025-06-28 18:35:10 [main] WARN  LoggingExample - This is a warning message
```

## File Structure
```
LoggingWithSLF4J/
├── pom.xml
├── README.md
└── src/
    └── main/
        ├── java/
        │   └── LoggingExample.java
        └── resources/
            └── logback.xml
```
