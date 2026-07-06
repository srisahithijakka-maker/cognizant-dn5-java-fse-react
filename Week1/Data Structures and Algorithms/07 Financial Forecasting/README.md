# Exercise 7: Financial Forecasting

## Objective

Develop a financial forecasting tool using recursion to calculate the future value of an investment based on a fixed annual growth rate.

## Implementation

A recursive method is used to calculate the future value. The recursion continues until the number of years becomes zero (base case). In each recursive call, the investment amount is increased according to the annual growth rate.

## Time Complexity

- **Time Complexity:** O(n)
- **Space Complexity:** O(n)

## Optimization

Since the algorithm makes one recursive call per year, its time complexity is linear. For very large values of `years`, an iterative solution can be used to eliminate recursion overhead and avoid stack overflow.
