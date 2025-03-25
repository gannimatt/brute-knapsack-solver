# Java Knapsack Brute Force

## Overview

This project implements a **Brute Force algorithm** to solve the **0/1 Knapsack Problem** in Java. It evaluates every possible combination of items to determine the optimal set that maximizes total value without exceeding the knapsack's capacity.

## Problem Background

The 0/1 Knapsack Problem involves selecting a subset of items, each with a given weight and value, to pack into a knapsack with a weight limit. The objective is to maximize the total value of the items included without exceeding the capacity. In this brute force approach, all \(2^n\) combinations (where *n* is the number of items) are evaluated to find the optimal one.

## Features

- Reads input data from a file
- Iterates through all possible item combinations
- Determines and displays the optimal value, weight, and selection vector
- Simple and clear implementation for educational purposes

## How to Run

1. **Ensure Java is installed.**
2. **Place your input data in `src/knapsack` with the following format:**
   ```
   <capacity>
   <weight1> <value1>
   <weight2> <value2>
   ...
   ```

   **Example:**
   ```
   50
   10 60
   20 100
   30 120
   ```

3. **Compile and run the program:**
   ```bash
   javac bruteForce.java
   java bruteForce
   ```

## Output

The program will print:
- The optimal total value
- The total weight of selected items
- The binary vector representing which items were included (1 = included, 0 = excluded)

Example output:
```
Optimal Value: 220
Optimal Weight: 50
Optimal Characteristic Vector: 0 1 1 
```

## License

This project is licensed under the [MIT License](LICENSE).

## Contributing

Contributions are welcome! Feel free to fork this repository and open a pull request with your improvements or suggestions.
