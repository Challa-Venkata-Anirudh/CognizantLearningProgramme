# 📚 Library Management - Spring Core Example (Exercise 2 - Multi-book Version)

This project enhances the original Spring Core example by demonstrating **Dependency Injection (DI)** using XML configuration and managing a **list of books**. It introduces a new `Book` model and prints book details via `BookService`.

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
│ │ │ ├── model/
│ │ │ │ └── Book.java
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
---
2. Run using Maven:
```
mvn clean compile exec:java
```
✅ Expected Output
```
Title: 1984, Author: George Orwell
Title: To Kill a Mockingbird, Author: Harper Lee
```
