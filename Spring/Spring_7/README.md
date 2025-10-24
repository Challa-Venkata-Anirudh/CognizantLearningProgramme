# 📘 Exercise 7: Constructor and Setter Injection using Spring XML Configuration

## ✅ Objective
Demonstrate how to implement both **constructor injection** and **setter injection** in a Spring-based Java application using `applicationContext.xml`. This exercise enhances control over bean initialization and demonstrates how multiple forms of dependency injection can coexist.

---

## 🏛️ Scenario
You are building a Library Management System where:
- The **library name** is provided at the time of bean creation using **constructor injection**.
- The **book repository** is injected using **setter injection**.

---

## 🛠️ Technologies Used
- Java 8+
- Spring Framework (Core Context - XML configuration)
- Maven (Dependency Management)
- IDE: IntelliJ / Eclipse / VS Code (optional)

---

## 📁 Project Structure
```
Spring_7/
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ └── com/library/
│ │ │ ├── Book.java
│ │ │ ├── BookRepository.java
│ │ │ ├── BookService.java
│ │ │ └── LibraryManagementApplication.java
│ │ └── resources/
│ │ └── applicationContext.xml
├── pom.xml
```

---

## 🔧 Setup Instructions

### 1. 📥 Clone or Download the Project

### 2. 📦 Add Dependencies
Make sure your `pom.xml` includes the following:
```xml
<dependency>
  <groupId>org.springframework</groupId>
  <artifactId>spring-context</artifactId>
  <version>5.3.34</version> <!-- or latest compatible version -->
</dependency>
```
3. 🛠️ Build the Project
```
mvn clean install
```
4. 🚀 Run the Application
Using IDE:
```
Run LibraryManagementApplication.java from your IDE.
```
Using Maven CLI:
```
mvn exec:java -Dexec.mainClass="com.library.LibraryManagementApplication"
```

✅ Expected Output
```
📚 Welcome to Central City Library!
📘 Book: The Alchemist
📘 Book: Clean Code
```
