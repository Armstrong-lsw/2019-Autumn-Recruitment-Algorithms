/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/7/17
 * Time: 19:21
 * Description:
 */
public class Solution {
    public int RectCover(int target) {

        if (target <= 1) return target;

        int[] dp = new int[target + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= target; i++) dp[i] = dp[i-1] + dp[i-2];

        return dp[target];
    }
}
