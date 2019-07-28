/**
 * @author 许清远
 * @date 2019/7/28
 */
class Solution {
    public int maxProfit(int[] prices) {

        if (prices == null || prices.length <= 1) {
            return 0;
        }

        int min = prices[0];
        int max = -1;

        for (int i = 1; i < prices.length; i++) {
            min = Math.min(prices[i], min);
            max = Math.max(max, prices[i] - min);
        }

        return max;

    }
}
