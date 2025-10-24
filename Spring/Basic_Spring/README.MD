# 📚 Library Management - Spring Core Example

This is a simple Java application using the **Spring Framework (Core)** to demonstrate dependency injection using XML-based configuration. It simulates a basic library backend system.

---

## 🧩 Project Structure

```
LibraryManagement/
├── pom.xml
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── library/
│   │   │           ├── MainApp.java
│   │   │           ├── service/
│   │   │           │   └── BookService.java
│   │   │           └── repository/
│   │   │               └── BookRepository.java
│   │   └── resources/
│   │       └── applicationContext.xml
```

---

## ⚙️ Technologies Used

- Java 8+
- Spring Framework (Core)
- Maven

---

## 🚀 How to Run

### 1. Clone or Download the Repository

```bash
git clone https://github.com/yourusername/LibraryManagement.git
cd LibraryManagement
```

### 2. Build and Run the Project

Make sure your terminal is in the project root folder, then run:

```bash
mvn clean compile exec:java
```

> ☑️ Make sure you have Maven installed and configured.

---

## 📂 File Descriptions

### ✅ `BookRepository.java`

A simple class that returns book information:
```java
return "Java: The Complete Reference";
```

### ✅ `BookService.java`

Calls the repository and prints book details to the console. Spring injects the repository bean here.

### ✅ `MainApp.java`

The entry point of the app. Loads the Spring application context and triggers the logic.

### ✅ `applicationContext.xml`

Spring configuration file that defines and wires the beans using XML.

```xml
<bean id="bookRepository" class="com.library.repository.BookRepository" />
<bean id="bookService" class="com.library.service.BookService">
    <property name="bookRepository" ref="bookRepository" />
</bean>
```

---

## ✅ Expected Output

```text
Book from Repository: Java: The Complete Reference
```


