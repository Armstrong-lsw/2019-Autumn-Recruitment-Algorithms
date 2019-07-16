/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/7/16
 * Time: 14:08
 * Description:
 */
public class Solution {
    public int FindGreatestSumOfSubArray(int[] array) {

        if (array == null || array.length == 0) return -1;

        int[] dp = new int[array.length];
        dp[0] = array[0];
        int max = dp[0];
        for (int i = 1; i < dp.length; i++) {
            dp[i] = dp[i - 1] <= 0 ? array[i] : array[i] + dp[i - 1];
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
