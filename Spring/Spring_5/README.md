# Exercise 5: Configuring Spring IoC Container using XML

## Description
This exercise demonstrates how to configure the Spring IoC container using an `applicationContext.xml` file in a library management application.

## Features
- XML-based bean definitions
- Setter-based dependency injection
- Demonstrates usage of `ApplicationContext`

## Steps to Run
1. Ensure Maven dependencies are installed (`spring-context`).
2. Build the project.
3. Run the `LibraryApp` class.
4. You should see a list of books printed to the console.

## File Structure
- `Book.java`: Model class for books.
- `BookRepository.java`: Simulates book data access.
- `BookService.java`: Business logic with a setter for repository.
- `applicationContext.xml`: Spring XML configuration.
- `LibraryApp.java`: Entry point to test the Spring context.

## Output
```
📚 Book: The Alchemist
📚 Book: Clean Code
