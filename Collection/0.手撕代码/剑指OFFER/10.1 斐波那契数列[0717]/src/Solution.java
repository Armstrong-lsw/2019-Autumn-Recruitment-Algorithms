/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/7/17
 * Time: 18:55
 * Description:
 */
public class Solution {
    public int Fibonacci(int n) {

        if (n <= 1) return n;

        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) dp[i] = dp[i-1] + dp[i-2];

        return dp[n];
    }
}