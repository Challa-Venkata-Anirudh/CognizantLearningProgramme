CREATE TABLE Accounts (
    AccountID NUMBER PRIMARY KEY,
    CustomerName VARCHAR2(100),
    AccountType VARCHAR2(20), -- e.g., 'Savings', 'Current'
    Balance NUMBER
);
CREATE TABLE Employees (
    EmpID NUMBER PRIMARY KEY,
    EmpName VARCHAR2(100),
    Department VARCHAR2(50),
    Salary NUMBER
);
INSERT INTO Accounts VALUES (101, 'Mouleendra', 'Savings', 10000);
INSERT INTO Accounts VALUES (102, 'Rohan', 'Current', 15000);
INSERT INTO Accounts VALUES (103, 'Suneel', 'Savings', 20000);
INSERT INTO Accounts VALUES (104, 'Bhargavi', 'Savings', 8000);

INSERT INTO Employees VALUES (1, 'Mrudula', 'Sales', 50000);
INSERT INTO Employees VALUES (2, 'Lalasa', 'IT', 60000);
INSERT INTO Employees VALUES (3, 'Eesha', 'Sales', 55000);

COMMIT;
