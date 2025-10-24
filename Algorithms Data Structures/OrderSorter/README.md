# 🛒 Order Sorting System in Java

## 📌 Project Overview
This Java project sorts customer orders by their **total price** using two sorting algorithms: **Bubble Sort** and **Quick Sort**. This can help an e-commerce platform prioritize high-value orders for shipping and customer attention.

---

## ❓ Problem Statement
You are tasked with sorting an array of customer orders using sorting algorithms based on their `totalPrice`. Orders with higher value should be prioritized. The goal is to understand how different sorting algorithms perform in such real-world use cases.

---

## 🧠 Understanding Sorting Algorithms

### 🔁 1. Bubble Sort
- Repeatedly compares adjacent elements and swaps them if they are in the wrong order.
- **Time Complexity:**
  - Best: O(n) (when already sorted)
  - Average/Worst: O(n²)
- **Space Complexity:** O(1)
- **Use Case:** Educational, rarely used in real-world applications due to poor performance.

### 🪓 2. Quick Sort
- Uses a divide-and-conquer approach. Picks a pivot and partitions the array around the pivot.
- **Time Complexity:**
  - Best/Average: O(n log n)
  - Worst: O(n²) (when pivot selection is poor)
- **Space Complexity:** O(log n) due to recursion stack.
- **Use Case:** Efficient and widely used in production systems and standard libraries.

---

## 📦 Setup

### ➕ Order Class
The `Order` class has:
- `int orderId`
- `String customerName`
- `double totalPrice`

### 📄 Files
- `OrderSorter.java` — contains all class definitions and sorting logic.
- `README.md` - contains all the details

---

## 🛠️ How to Run
1. Compile the program:
   ```bash
   javac OrderSorter.java
   java OrderSorter
   ```

📈 Performance Analysis
|Algorithm  | Best Case |	Average Case |	Worst Case |	Space Complexity|
|-----------|-----------|--------------|-------------|------------------|
|Bubble Sort|   O(n)    |	    O(n²)	   |    O(n²)	   |      O(1)        |
|Quick Sort	| O(n log n)|	  O(n log n) |	  O(n²)	   |    O(log n)      |

💬 Why Quick Sort is Preferred Over Bubble Sort
Quick Sort is:
- Significantly faster for large datasets.
- Based on a recursive divide-and-conquer strategy.
- Commonly used in Java's built-in Arrays.sort() for primitives.

Bubble Sort:
- Simple to understand but inefficient.
- Poor time complexity for larger data sets.
- Mainly used for learning purposes.
