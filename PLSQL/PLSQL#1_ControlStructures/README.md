# 🏦 Exercise 1: Control Structures – PL/SQL Bank Scenarios

This project contains PL/SQL scripts designed as part of **Cognizant's Java FSE Deep Skilling Program**. The exercise demonstrates the use of **control structures (loops and conditionals)** in real-world banking scenarios.

---

## 📌 Scenarios Implemented

1. **Senior Citizen Interest Discount**
   - Applies a 1% discount to the loan interest rate for customers aged above 60.

2. **VIP Customer Promotion**
   - Flags customers as VIP if their account balance exceeds $10,000.

3. **Loan Due Reminders**
   - Identifies loans due within the next 30 days and prints reminder messages for the respective customers.

---

## 🧪 Testing and Setup

- Required tables: `Customers`, `Loans`.
- Sample data is included in a separate setup script (`Banks.sql`) to help you populate the database.
- Each scenario is implemented in the PL/SQL script file.
- Make sure to enable output with `SET SERVEROUTPUT ON;` before running scripts.

---

## 📂 Files Included

- `Banks.sql` – Creates required tables and inserts sample data.
- `PLSQL.sql` – Logic for applying senior citizen interest discount, Logic for identifying VIP customers, Logic for generating loan due reminders.
- `README.md` – Overview and instructions.

---

## 🧾 Notes

- All scripts are compatible with Oracle SQL environments like **SQL Developer** or **Oracle Live SQL**.
- Ensure that you `COMMIT` after running DML operations to persist changes.
- This exercise helps strengthen skills in using loops, conditionals, and PL/SQL block structures effectively.


