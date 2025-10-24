# 🔍 Search Optimization in E-commerce – Java Implementation

This project is part of the **Cognizant Java Full Stack Engineer Deep Skilling Program (Exercise 3)**. It demonstrates the use of **Linear Search** and **Binary Search** algorithms to efficiently locate products in an e-commerce platform based on their `productId`.

---

## 📘 Problem Statement

> Working on the search functionality of an e-commerce platform. The search needs to be optimized for fast performance.

---

## 🧱 Scenario

- An array of products exists, each having:
  - `productId`
  - `productName`
  - `category`
- Implement two search strategies:
  - **Linear Search** on an unsorted array
  - **Binary Search** on a sorted array

---

## 🧠 Concepts Used

- Asymptotic Notation (Big O)
- Linear Search: O(n)
- Binary Search: O(log n)
- Interface-based object design (`Product` class)
- Algorithm analysis & performance comparison

---

## 🚀 Technologies

- Java 17
- Object-Oriented Programming
- Array manipulation and sorting

---


---

## 📄 Classes & Responsibilities

| Class Name        | Responsibility                                    |
|------------------|----------------------------------------------------|
| `Product`         | Data class holding product info                   |
| `SearchUtility`   | Contains `linearSearch` and `binarySearch` methods |
| `Main`            | Demonstrates both search methods on product data   |

---

## ⚙️ How to Run

> 💡 Make sure all `.java` files are in the same folder.

### 🔹 Compile:
```bash
- javac Product.java SearchUtility.java Main.java
- java Main.java
```
📈 Analysis: Linear vs Binary Search
Both search techniques solve the same problem — locating a product by ID — but perform differently based on the size and nature of the dataset.

🧮 Time Complexity Comparison
|Algorithm	   | Best Case |	Average Case |	Worst Case |	Requires Sorting |
|--------------|-----------|---------------|-------------|-------------------|
|Linear Search |	O(1)	   |     O(n)	     |  O(n)	     |     No            |
|Binary Search |	O(1)	   |    O(log n)	 |  O(log n)   |     Yes           |

💡 Insights
- Linear Search is straightforward and works on unsorted arrays. But performance drops linearly as the dataset grows.
- Binary Search is much faster for large datasets, but it only works when the array is sorted.
- In real-world applications like an e-commerce search:
- If products are indexed and sorted by ID (like in a DB), binary search or tree-based structures should be used.
- For quick one-off searches or unsorted data, linear search still has value.

✅ Recommendation
Use binary search when:
- The product list is large
- The array is already sorted or indexing is maintained
- Fast, frequent searches are needed

Use linear search when:
- The dataset is small or unsorted
- There's no sorting guarantee
- Simplicity or flexibility in searching by other attributes is required

