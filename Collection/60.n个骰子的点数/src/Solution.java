import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/7/8
 * Time: 16:19
 * Description:把 n 个骰子仍在地上，求点数和为 s 的概率。
 */
public class Solution {
    /**
     * @param n an integer
     * @return a list of Map.Entry<sum, probability>
     */
    public List<Map.Entry<Integer, Double>> dicesSum(int n) {
        List<Map.Entry<Integer, Double>> res = new ArrayList<>();
        if (n < 1) {
            return res;
        }
        int faces = 6;
        int maxNum = faces * n;
        long[][] dp = new long[n + 1][maxNum + 1];
        for (int i = 1; i <= faces; i++) {
            dp[1][i] = 1;
        }
        for (int i = 2; i <= n; i++) {
            for (int j = i; j <= maxNum; j++) {
                for (int k = 1; k <= faces && k <= j; k++) {
                    dp[i][j] += dp[i-1][j - k];
                }
            }
        }
        double totalNum = Math.pow(6, n);
        for (int i = n; i <= maxNum; i++) {
            res.add(new AbstractMap.SimpleEntry<>(i, dp[n][i] / totalNum));
        }
        return res;
    }
}
