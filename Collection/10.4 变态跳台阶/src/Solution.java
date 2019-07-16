import java.util.Arrays;

/**
 * Create with 10.4 变态跳台阶
 * User: 许清远
 * Date: 2019/6/5
 * Time: 13:34
 * Description:一只青蛙一次可以跳上 1 级台阶，也可以跳上 2 级...
 * 它也可以跳上 n 级。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
 *
 * 解题思路：https://github.com/CyC2018/CS-Notes/blob/master/notes/%E5%89%91%E6%8C%87%20Offer%20%E9%A2%98%E8%A7%A3%20-%2010~19.md
 */
public class Solution {
    public int JumpFloorII(int target) {
        if (target <= 1) return target;
        int[] dp = new int[target + 1];
        Arrays.fill(dp, 1);
        for (int i = 1; i <= target; i++) {
            for (int j = 1; j < i; j++) {
                dp[i] += dp[j];
            }
        }
        return dp[target];
    }
}
