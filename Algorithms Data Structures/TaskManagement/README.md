# ✅ Task Management System Using Singly Linked List

## 📌 Project Overview
This Java project demonstrates a basic **task management system** using a **singly linked list**. It allows adding, searching, traversing, and deleting tasks dynamically without worrying about memory limits like in arrays.

---

## 🧠 1. Understanding Linked Lists

### 🔁 Singly Linked List
- Each node stores:
  - A reference to the task (`Task` object)
  - A pointer to the **next** node
- Last node points to `null`
- Unidirectional traversal only (forward)

### 🔄 Doubly Linked List (Not used in this project)
- Each node stores references to both:
  - The **next** node
  - The **previous** node
- Allows **forward and backward** traversal
- Requires more memory than singly linked list

---

## 🏗️ 2. System Setup

### Task Class
Contains:
- `taskId`: Unique identifier
- `taskName`: Description
- `status`: Status (e.g., Pending, In Progress, Done)

### Linked List Structure
- Implemented using a custom `TaskNode` class that holds a `Task` and a reference to the next node.
- `TaskManagementSystem` manages operations on the list via a `head` pointer.

---

## ⚙️ 3. Functionality Implemented

### ➕ Add Task
Adds a task at the end of the linked list.
- **Time Complexity:** O(n)  
- Requires traversing to the end to insert.

### 🔍 Search Task
Searches for a task by its `taskId` using linear traversal.
- **Time Complexity:** O(n)

### ❌ Delete Task
Finds a task by ID and removes it from the list, adjusting pointers.
- **Time Complexity:** O(n)

### 🔁 Traverse Tasks
Iterates through the list and displays all tasks.
- **Time Complexity:** O(n)

---

## 📊 4. Time Complexity Summary

| Operation     | Time Complexity |
|---------------|------------------|
| Add Task      | O(n)             |
| Search Task   | O(n)             |
| Delete Task   | O(n)             |
| Traverse      | O(n)             |

---

## 💡 Advantages of Linked Lists over Arrays

| Feature                  | Linked List                     | Array                          |
|--------------------------|----------------------------------|--------------------------------|
| Dynamic Size             | ✅ Grows as needed               | ❌ Fixed at declaration        |
| Insertion/Deletion       | ✅ Efficient at any position     | ❌ Costly (requires shifting)  |
| Memory Allocation        | ✅ No need for contiguous blocks | ❌ Needs contiguous memory     |
| Random Access            | ❌ Not allowed (must traverse)  | ✅ O(1) direct index access     |

### 🔁 When to Use Linked Lists
- When dynamic growth/shrinkage is needed.
- When frequent insertions/deletions are expected.
- When memory fragmentation is a concern.

---
