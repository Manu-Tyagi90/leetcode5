![Climbing Stairs](https://github.com/user-attachments/assets/8f2c434d-c593-44a5-84ac-8bd35434abf6)


# Climbing Stairs Solution

This repository contains a solution to the [Climbing Stairs](https://leetcode.com/problems/climbing-stairs/) problem on LeetCode. The problem is to find the number of distinct ways to climb to the top of a staircase with `n` steps, where you can either climb 1 or 2 steps at a time.

## Problem Statement

You are climbing a staircase. It takes `n` steps to reach the top. Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

## Solution

The solution uses dynamic programming to efficiently calculate the number of ways to climb the stairs. The number of ways to reach the nth step is the sum of the ways to reach the (n-1)th step and the (n-2)th step. This can be represented by the Fibonacci sequence.

### Formula

\[ f(n) = f(n-1) + f(n-2) \]

Where:
- \( f(n) \) is the number of ways to reach the nth step.
- \( f(n-1) \) is the number of ways to reach the (n-1)th step.
- \( f(n-2) \) is the number of ways to reach the (n-2)th step.

### Base Cases

- \( f(1) = 1 \) (There is only one way to climb one step)
- \( f(2) = 2 \) (There are two ways to climb two steps: 1+1 or 2)

## Code

Here's the Java code to solve the problem:

```java
class Solution {
    public int climbStairs(int n) {
        if (n <= 2) return n;
        int first = 1, second = 2;
        for (int i = 3; i <= n; i++) {
            int third = first + second;
            first = second;
            second = third;
        }
        return second;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 21;
        System.out.println("Number of ways to climb " + n + " stairs: " + solution.climbStairs(n));
    }
}
```

## Example

```markdown
f(3) & = f(2) + f(1) = 2 + 1 = 3 
f(4) & = f(3) + f(2) = 3 + 2 = 5 
f(5) & = f(4) + f(3) = 5 + 3 = 8 
f(6) & = f(5) + f(4) = 8 + 5 = 13 
f(7) & = f(6) + f(5) = 13 + 8 = 21 
f(8) & = f(7) + f(6) = 21 + 13 = 34 
f(9) & = f(8) + f(7) = 34 + 21 = 55 
f(10) & = f(9) + f(8) = 55 + 34 = 89 
f(11) & = f(10) + f(9) = 89 + 55 = 144 
f(12) & = f(11) + f(10) = 144 + 89 = 233 
f(13) & = f(12) + f(11) = 233 + 144 = 377 
f(14) & = f(13) + f(12) = 377 + 233 = 610 
f(15) & = f(14) + f(13) = 610 + 377 = 987 
f(16) & = f(15) + f(14) = 987 + 610 = 1597
f(17) & = f(16) + f(15) = 1597 + 987 = 2584
f(18) & = f(17) + f(16) = 2584 + 1597 = 4181
f(19) & = f(18) + f(17) = 4181 + 2584 = 6765
f(20) & = f(19) + f(18) = 6765 + 4181 = 10946
f(21) & = f(20) + f(19) = 10946 + 6765 = 17711
```

So, there are **17,711** distinct ways to climb 21 stairs. If you have any other questions or need further assistance, feel free to ask!

## License

This project is licensed under the MIT License.

---

Feel free to customize this README to better fit your needs! If you have any other questions or need further assistance, feel free to ask!
