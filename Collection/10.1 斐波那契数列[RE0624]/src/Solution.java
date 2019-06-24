/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/6/24
 * Time: 20:36
 * Description:
 */
public class Solution {
    public int Fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int pre1 = 0,pre2 = 1,res = 1;
        for (int i = 2; i <= n ; i++) {
            res = pre1 + pre2;
            pre1 = pre2;
            pre2 = res;
        }
        return res;
    }
}
