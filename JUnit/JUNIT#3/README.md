# 🧪 JUnit Testing Exercises - Cognizant Java FSE Program

This project includes the implementation of Exercises **1, 3, and 4** from the **JUnit Basic Testing** module using **Maven** and **JUnit 4**.

---

## 📁 Project Structure

```
JUNIT_Project/
│
├── pom.xml                        # Maven configuration file with JUnit dependency
├── src/
│   ├── main/
│   │   └── java/
│   │       └── Calculator.java        # Core logic for arithmetic operations
│   └── test/
│       └── java/
│           ├── CalculatorTest.java    # Exercise 1: Basic JUnit test
│           ├── AssertionsTest.java    # Exercise 3: Demonstrating various assertions
│           └── CalculatorAAATest.java # Exercise 4: AAA pattern, setup, teardown
└── target/                        # Generated build and compiled class files
```

---

## 📦 Maven Setup Instructions

Ensure you have **Maven** installed on your system. Then follow these steps:

1. **Open terminal in project root**:
   ```bash
   cd JUNIT_Project
   ```

2. **Run all tests**:
   ```bash
   mvn clean test
   ```

3. **Expected output**:
   - All test cases should pass with a green bar or `BUILD SUCCESS`.

---

## ✅ Exercise Breakdown

### 📌 Exercise 1: Setting Up JUnit
- Configured `pom.xml` with:
  ```xml
  <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>4.13.2</version>
      <scope>test</scope>
  </dependency>
  ```
- Wrote `CalculatorTest.java` to test basic arithmetic logic.

### 📌 Exercise 3: Assertions in JUnit
- Implemented `AssertionsTest.java`
- Covered:
  - `assertEquals()`
  - `assertTrue()` / `assertFalse()`
  - `assertNull()` / `assertNotNull()`

### 📌 Exercise 4: AAA Pattern + Setup/Teardown
- Created `CalculatorAAATest.java`
- Followed Arrange-Act-Assert pattern
- Used:
  - `@Before` for setup
  - `@After` for cleanup
  - Exception testing for divide-by-zero

---

## 🛠 Requirements

- Java 8+
- Maven 3.6+
- IDE like IntelliJ IDEA or Eclipse (optional)

---



