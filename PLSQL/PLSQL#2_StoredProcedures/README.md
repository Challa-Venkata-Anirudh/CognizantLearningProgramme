# 🏦 Exercise 3: Stored Procedures – Bank Operations Automation

This project includes stored procedures that automate key banking operations using PL/SQL. The tasks simulate real-world banking scenarios for account management, salary bonuses, and fund transfers.

---

## 📌 Scenarios Implemented

1. **Process Monthly Interest**
   - Calculates and updates the balance for all savings accounts by applying a 1% interest rate.

2. **Update Employee Bonus**
   - Adds a bonus to employee salaries based on a given department and percentage input.

3. **Transfer Funds**
   - Transfers a specified amount between two accounts, ensuring the source has sufficient balance before proceeding.

---

## 🧪 Testing and Setup

- Required tables: `Accounts`, `Employees`
- All table creation and sample data scripts are included in `Banks.sql`
- Each stored procedure is defined in the `Procedures.sql` file.
- You can test the procedures using `EXEC` statements in SQL Developer or Oracle Live SQL.

---

## 📂 Files Included

- `Banks.sql` – Creates tables and inserts sample data
- `Procedures.sql` – Procedure for applying savings interest, Procedure for updating employee bonuses, Procedure for transferring account funds.
- `README.md` – Overview and instructions

---

## 📝 Notes

- Always use `COMMIT;` to persist changes to the database.
- Use `SET SERVEROUTPUT ON;` if you modify procedures to include debug output.
- All scripts are Oracle-compatible and tested in Oracle SQL Developer.

---

