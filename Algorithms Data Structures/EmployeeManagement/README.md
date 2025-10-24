# 👨‍💼 Employee Management System Using Arrays

## 📌 Project Overview
This project implements a simple employee management system using **arrays in Java**. It supports core operations like:
- Adding a new employee
- Searching for an employee
- Displaying all employee records
- Deleting an employee

---

## 🔢 1. Understanding Array Representation

### ✅ How Arrays Work in Memory:
- Arrays are **contiguous blocks of memory**.
- Every element is stored at a fixed offset from the base address.
- For example:  
  `arr[0]` is at base address `x`,  
  `arr[1]` is at `x + sizeof(type)`, etc.

### 🔍 Advantages of Arrays:
- Fast random access: `O(1)` time to access any index.
- Simple and memory-efficient for fixed-size collections.

---

## 🏗️ 2. System Setup

### Employee Class:
Contains:
- `employeeId`: Unique identifier
- `name`: Employee name
- `position`: Job role
- `salary`: Compensation

### Array:
- A fixed-size `Employee[] employees` array is used to store employee records.

---

## ⚙️ 3. Functionality Implemented

### ✅ Add Employee
Adds employee at next available index.
addEmployee(new Employee(1, "Alice", "Manager", 80000));
🔍 Search Employee
Linear search by employeeId.
searchEmployee(2);

🔁 Traverse / Display All
Prints all employees using a simple loop.
displayAllEmployees();

❌ Delete Employee
Finds employee and shifts the remaining elements left.
deleteEmployee(1);


⏱️ 4. Time Complexity Analysis
|    Operation	   | Time Complexity |	           Explanation                   |
|------------------|-----------------|-------------------------------------------|
|  Add Employee    |	    O(1)	     |  Adds to the end of the array.            |
| Search Employee	 |      O(n)	     |  Linear search required (unsorted array). |
|Traverse	         |      O(n)	     |  Visit each element once.                 |
| Delete Employee	 |      O(n)	     |  Shift elements after deletion.           |

⚠️ Limitations of Arrays
🚫 Limitations:
- Fixed size: Cannot grow dynamically.
- Inefficient deletion: Requires shifting elements.
- Linear search: No built-in indexing unless sorted.

✅ When to Use:
- When number of employees is known and small.
- When random access is required.
- When memory overhead of dynamic structures (like ArrayList) is unnecessary.
