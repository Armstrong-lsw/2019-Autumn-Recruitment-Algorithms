/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/7/16
 * Time: 14:21
 * Description:
 */
public class Solution {
    public int NumberOf1Between1AndN_Solution(int n) {
        int cnt = 0;
        for (int i = 1; i <= n; i *= 10) {
            int a = n / i, b = n % i;
            cnt += (a + 8) / 10 * i + (a % 10 == 1 ? b + 1 : 0);
        }
        return cnt;
    }
}
