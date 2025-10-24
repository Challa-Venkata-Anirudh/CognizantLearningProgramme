# Exercise 2: Verifying Interactions

This project demonstrates how to verify method interactions using Mockito in a unit test with JUnit 5.

## Objective

Ensure that a specific method is called with expected arguments using `verify()`.

## How to Run

```bash
mvn test
```

## Files

- `ExternalApi.java`: Mocked API interface.
- `MyService.java`: Service class that calls the external API.
- `MyServiceTest.java`: Test case to verify method interaction using Mockito.
