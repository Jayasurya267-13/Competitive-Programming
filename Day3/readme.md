Problem 1 – 
Check Whether Two Numbers Have a Given Sum

You are given an array of N integers and a target value. Determine whether there are two distinct elements whose sum equals the target.

Input:
6
2 7 11 15 3 8
10

Output:
YES

Explanation:
- 2 + 8 = 10.
- Therefore, a valid pair exists.
Constraints:
- 2 ≤ N ≤ 100000
- -10⁹ ≤ array[i] ≤ 10⁹
- -2 × 10⁹ ≤ target ≤ 2 × 10⁹
Rules:
1. Use sorting and the Two Pointers technique.
2. Do not use nested loops.
3. Try to solve it in O(n log n) time.
4. Write your solution in Java.
5. Print YES if a pair exists; otherwise print NO.
---

Problem 2 – 
Binary Search

You are given a sorted array of N integers and a target value. Find the index of the target element using Binary Search.

Input:
7
10 20 30 40 50 60 70
50

Output:
4

Explanation:
- Middle element = 40 (index 3).
- Target 50 is greater than 40.
- Search the right half.
- 50 is found at index 4.
Constraints:
- 1 ≤ N ≤ 100000
- -10⁹ ≤ array[i] ≤ 10⁹
- Array elements are sorted in ascending order.
Rules:
1. Implement Binary Search manually.
2. Do not use Arrays.binarySearch().
3. Try to solve it in O(log n) time.
4. Write your solution in Java.
5. Print the zero-based index or -1.
---