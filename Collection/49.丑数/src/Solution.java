/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/7/4
 * Time: 18:22
 * Description:把只包含质因子2、3和5的数称作丑数（Ugly Number）。
 * 例如6、8都是丑数，但14不是，因为它包含质因子7。 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
 */
public class Solution {
    public int GetUglyNumber_Solution(int index) {
        if (index < 7) {
            return index;
        }
        int[] dp = new int[index];
        dp[0] = 1;
        int index2 = 0;
        int index3 = 0;
        int index5 = 0;
        for (int i = 1; i < index; i++) {
            dp[i] = Math.min(dp[index2] * 2, Math.min(dp[index3] * 3, dp[index5] * 5));
            if (dp[i] == dp[index2]*2) index2++;
            if (dp[i] == dp[index3]*3) index3++;
            if (dp[i] == dp[index5]*5) index5++;
        }
        return dp[index - 1];
    }
}
