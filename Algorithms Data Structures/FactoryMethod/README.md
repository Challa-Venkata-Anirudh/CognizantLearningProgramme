# 🏗️ Factory Method Pattern – Java Implementation

This project is part of the **Cognizant Java Full Stack Engineer Deep Skilling Program (Exercise 2)**. It demonstrates the use of the **Factory Method Design Pattern** to create and manage different document types (Word, PDF, Excel) in a modular and scalable way.

---

## 📘 Problem Statement

> You are developing a document management system that needs to create different types of documents (e.g., Word, PDF, Excel). Use the Factory Method Pattern to achieve this.

---

## 🧠 Concepts Used

- **Factory Method Design Pattern**
- **Abstraction and Interface-based Design**
- **Polymorphism**
- **Separation of Concerns (SoC)**
- **Modular Design and Extensibility**
- **User-Driven Input via Console (Bonus)**

---

## 💡 Why We Solved It This Way

We used the **Factory Method Pattern** because it allows us to:

- Delegate the creation of objects (documents) to dedicated factory classes.
- Avoid using `new` keyword directly across the application.
- Add new document types in the future without changing the client code.
- Cleanly separate concerns: document creation logic stays with factories, and document behavior stays with document classes.
- Improve testability and flexibility for real-world enterprise scenarios.

We also extended the assignment by:
- Adding realistic behaviors (`open()`, `save()`, `close()` methods).
- Making the application menu-driven to allow user interaction.

This approach is not only **aligned with design principles** but also **scalable and production-friendly**.

---

## 🧪 How It Works

- `Document` is a base **interface** that all document types implement.
- `WordDocument`, `PdfDocument`, and `ExcelDocument` are **concrete classes** implementing the `Document` interface.
- `DocumentFactory` is an **abstract class** with an abstract method `createDocument()`.
- Each document type has a **dedicated factory**:
  - `WordDocumentFactory`
  - `PdfDocumentFactory`
  - `ExcelDocumentFactory`
- The `Main.java` file:
  - Displays a **menu**
  - Takes input from the user
  - Uses the correct factory to **create a document**
  - Calls `open()`, `save()`, and `close()` to simulate document behavior

---

## 🖥️ Commands to Compile and Run

> 📝 Make sure you have all `.java` files in the same folder.

### 🔹 To Compile:
```bash
- javac Document.java DocumentFactory.java ExcelDocument.java ExcelDocumentFactory.java PdfDocument.java PdfDocumentFactory.java WordDocument.java WordDocumentFactory.java Main.java
- java Main
