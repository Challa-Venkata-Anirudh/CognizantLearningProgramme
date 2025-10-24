# 📚 LibraryManagement - Spring Boot Application

This is a simple **Spring Boot application** for managing a library system using REST APIs. It includes functionality to create, read, update, and delete book records.

---

## 🚀 Features

- RESTful CRUD operations on books
- In-memory H2 Database
- Spring Data JPA integration
- Lightweight Spring Boot setup for easy deployment

---

## 🛠️ Tech Stack

- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database

---

## 🧩 Project Structure

```
LibraryManagement/
├── src/
│ ├── main/
│ │ ├── java/com/library/
│ │ │ ├── LibraryManagementApplication.java
│ │ │ ├── controller/BookController.java
│ │ │ ├── model/Book.java
│ │ │ └── repository/BookRepository.java
│ │ └── resources/application.properties
│ │    └── data.sql (optional for pre-loading data)
└── pom.xml
```

---

## ⚙️ Configuration (application.properties)

```properties
spring.datasource.url=jdbc:h2:mem:librarydb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true
spring.jpa.hibernate.ddl-auto=update
```
🧪 Test the API
Use Postman or curl to test:
* GET /books
* GET /books/{id}
* POST /books
* PUT /books/{id}
* DELETE /books/{id}
```
H2 Console:
Visit http://localhost:8080/h2-console
JDBC URL: jdbc:h2:mem:librarydb
```
📚 Sample JSON for POST/PUT
```
{
  "title": "Spring in Action",
  "author": "Craig Walls",
  "isbn": "9781617294945"
}
```

