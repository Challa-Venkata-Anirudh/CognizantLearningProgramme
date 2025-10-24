# 💻 Builder Pattern Example – Computer Configuration System

## 🧩 Project Overview

This project demonstrates the **Builder Design Pattern** by simulating a real-world use case: building a `Computer` with optional and required components.

Instead of having telescoping constructors or inconsistent object states, the **Builder Pattern** offers a clean, modular, and readable way to build complex objects with many optional fields.

---

## 🔧 Design Goals

- Avoid constructor overloading for complex objects
- Use method chaining for readable and maintainable code
- Ensure immutability of the final built object

---

## 🛠️ Implementation Breakdown

### 1. `Computer` Class (Product)
- Represents the final object with required and optional fields.
- Has a **private constructor** that accepts a `Builder` instance.

#### Fields:
- **Required:** `CPU`, `RAM`
- **Optional:** `Storage`, `Graphics Card`, `Operating System`

### 2. `Computer.Builder` Class (Static Nested Builder)
- Used to set required fields via constructor.
- Sets optional fields via individual `setX()` methods.
- Builds and returns the `Computer` instance via `build()` method.
- Enables **method chaining** for clean construction.

### Example:
```java
Computer gamingPC = new Computer.Builder("Intel i9", "32GB")
    .setGraphicsCard("RTX 4090")
    .setStorage("2TB SSD")
    .setOperatingSystem("Windows 11")
    .build();
```

⚙️ How to Run
Compile:
```
javac Computer.java BuilderPatternTest.java
java BuilderPatternTest
```
🧠 Why Use the Builder Pattern?
- Problem	Builder Pattern Solution
- Too many constructor arguments	Splits into readable setter methods
- Optional and required field confusion	Required fields enforced in Builder constructor
- Object immutability	Fields can be final and set only once
- Code readability	Fluent API (method chaining)

🏁 Benefits
- Supports step-by-step construction of objects
- Encourages cleaner code and better readability
- Helps enforce required fields
- Avoids large constructors with many arguments
- Makes the codebase scalable for future fields or configurations

🔚 When to Use the Builder Pattern
- When an object has a mix of required and optional fields.
- When constructors with too many parameters become hard to manage.
- When you want to make object creation declarative and readable.
- When object construction involves multiple steps or conditions.
