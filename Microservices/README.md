# Microservices: Account and Loan Services

This project contains two independent Spring Boot microservices for a banking application:
- **Account Microservice** – Handles account-related operations
- **Loan Microservice** – Handles loan-related operations

Each microservice is a standalone Maven project and runs on its own port.

---

## Folder Structure
```
C:
└── <employee_id>
└── microservices
├── account
└── loan
```

---

## Technologies Used

- Java 17
- Spring Boot (3.x)
- Spring Web
- Spring Boot DevTools
- Maven
- IntelliJ IDEA

---

## Microservices Overview

1. Account Microservice

* Endpoint: `GET /accounts/{number}`
* Port: `8080`
* Sample Response:
  ```json
  {
    "number": "00987987973432",
    "type": "savings",
    "balance": 234343
  }
  ```
2. Loan Microservice
* Endpoint: GET /loans/{number}
* Port: 8081 (configured in application.properties)
* Sample Response:
```
{
  "number": "H00987987972342",
  "type": "car",
  "loan": 400000,
  "emi": 3258,
  "tenure": 18
}
```
---
## How to Run
Prerequisites:
* Java 17 
* Maven installed
* IntelliJ IDEA

## Steps
Account Microservice
1. Navigate to the account folder:
```
cd C:\<employee_id>\microservices\account
```
2. Build the project:
```
mvn clean package
```
3. Open in IntelliJ IDEA and run AccountApplication.java
4. Access in browser
```
http://localhost:8080/accounts/00987987973432
```
---
## Loan Microservice
1. Navigate to the loan folder:
```
cd C:\<employee_id>\microservices\loan
```
2. Build the project:
```
mvn clean package
```
3. Add the following to application.properties:
```
server.port=8081
```
4. Open in IntelliJ IDEA and run LoanApplication.java
5. Access in browser
```
http://localhost:8081/loans/H00987987972342
```
Notes
* Both services are stateless and do not connect to a database.
* Services are exposed via REST APIs with mock JSON responses.
* Ensure ports are not conflicting when running both services simultaneously.
