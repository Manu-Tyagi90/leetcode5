public class Solution {
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
} //output = 17711
