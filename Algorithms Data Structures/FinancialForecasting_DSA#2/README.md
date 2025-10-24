# 💰 Financial Forecasting – Java Implementation

This project is part of the **Cognizant Java Full Stack Engineer Deep Skilling Program (Exercise 7)**. It demonstrates the use of **recursive algorithms** to forecast future financial values based on an initial value and a constant growth rate.

---

## 📘 Problem Statement

> You are developing a financial forecasting tool that predicts future values based on past data. Implement a recursive algorithm to simulate future growth and discuss performance and optimization strategies.

---

## 🧠 Concepts Used

- **Recursive Algorithms**
- **Memoization (Caching)**
- **Time Complexity Analysis**
- **Modular Design**
- **Financial Projections**

---
## 🔄 How Forecasting Works

Forecasting future value:
futureValue(years) = initialValue * (1 + growthRate) ^ years

Using recursion:
futureValue(n) = futureValue(n - 1) * (1 + growthRate)

---

## 🧾 Classes & Responsibilities

| Class Name           | Description                                          |
|----------------------|------------------------------------------------------|
| `FinancialForecast`  | Implements recursive algorithm for value prediction  |
| `OptimizedForecast`  | Uses memoization to improve recursive efficiency     |
| `Main`               | Demonstrates both forecast methods with test data    |

---

## ⚙️ How to Run

> 📝 Ensure all `.java` files are in the same directory.

### 🔹 Compile:
```bash
javac FinancialForecast.java Main.java OptimizedForecast.java
java Main
```

🧮 Time Complexity Analysis
|Method	   | Time Complexity |	           Description                 |
|----------|-----------------|-----------------------------------------|
|Recursive |	     O(n)	     |  Each call computes for one year        |
|Optimized |	     O(n)      |  Avoids repeated calls with memoization |

While both methods are O(n), the optimized version performs significantly better for large values due to reduced recomputation.

✅ Optimization Insights
- Recursive solutions are easy to write but may be inefficient.
- Memoization stores already computed values, reducing the number of recursive calls.
- For production-grade systems, consider iterative or dynamic programming approaches for even better performance.


