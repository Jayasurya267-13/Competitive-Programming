Problem 1: 
Find the First Non-Repeating Element

You are given an array of N integers. Find the first element that appears exactly once.

Input:
7
4 5 1 2 1 4 5

Output:
2

Explanation:
- 4 appears twice.
- 5 appears twice.
- 1 appears twice.
- 2 appears once.
Therefore, the first non-repeating element is 2.

Constraints:
- 1 ≤ N ≤ 100000
- -10⁹ ≤ array[i] ≤ 10⁹
Rules:
1. Use HashMap for frequency counting.
2. Maintain the original array order.
3. Try to solve it in O(n) average time.
4. Write your solution in Java.
5. If no non-repeating element exists, print -1.
---

Problem 2: 
Find the First Duplicate Element

You are given an array of N integers. Find the first element that occurs more than once while traversing the array from left to right.

Input:
7
1 2 3 4 2 5 3

Output:
2

Explanation:
- 1 appears for the first time.
- 2 appears for the first time.
- 3 appears for the first time.
- 4 appears for the first time.
- 2 appears again.
Therefore, 2 is the first duplicate element.

Constraints:
- 1 ≤ N ≤ 100000
- -10⁹ ≤ array[i] ≤ 10⁹
Rules:
1. Try using HashSet.
2. Traverse the array from left to right.
3. Do not use sorting.
4. Try to solve it in O(n) average time.
5. If no duplicate exists, print -1.
---

Problem 3: 
Two Sum

You are given an array of N integers and a target value. Find the indices of two distinct elements whose sum equals the target.

Input:
5
2 7 11 15 3
9

Output:
0 1

Explanation:
- Array element at index 0 = 2.
- Array element at index 1 = 7.
- Their sum = 2 + 7 = 9.
Therefore, the required indices are 0 and 1.

Constraints:
- 2 ≤ N ≤ 100000
- -10⁹ ≤ array[i] ≤ 10⁹
- -2 × 10⁹ ≤ target ≤ 2 × 10⁹
Rules:
1. Do not use the same element twice.
2. Try using HashMap.
3. Do not use sorting.
4. Try to solve it in O(n) average time.
5. If no valid pair exists, print -1.
---