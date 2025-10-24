# 📚 Library Management - Spring Core Example (Exercise 2)

This project demonstrates **Dependency Injection (DI)** using Spring Framework's **Inversion of Control (IoC)** with **XML-based configuration**. It builds upon Exercise 1 by injecting dependencies between `BookService` and `BookRepository` using a setter method and Spring's IoC container.

---

## 🧩 Project Structure

```
LibraryManagement/
├── pom.xml
├── README.md
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ └── com/
│ │ │ └── library/
│ │ │ ├── MainApp.java
│ │ │ ├── service/
│ │ │ │ └── BookService.java
│ │ │ └── repository/
│ │ │ └── BookRepository.java
│ │ └── resources/
│ │ └── applicationContext.xml
```

---

## ⚙️ Technologies Used

- Java 8+
- Spring Framework (Core)
- Maven
- Setter-based Dependency Injection

---

## 🚀 How to Run the Application

### 1. Ensure `exec-maven-plugin` is in your `pom.xml`

```
<build>
  <plugins>
    <plugin>
      <groupId>org.codehaus.mojo</groupId>
      <artifactId>exec-maven-plugin</artifactId>
      <version>3.1.0</version>
      <configuration>
        <mainClass>com.library.MainApp</mainClass>
      </configuration>
    </plugin>
  </plugins>
</build>
```
2. Use the following command to run the app:
```
mvn clean compile exec:java
```
---
✅ Expected Output
```
Book from Repository: Java: The Complete Reference
```
---
📌 Key Concepts Practiced
- Spring IoC Container
- XML-based Dependency Injection
- Loose Coupling between Service and Repository
- Testable and Maintainable Java Code


