/**
 * Create with 10.1 斐波那契数列[非递归]
 * User: 许清远
 * Date: 2019/6/17
 * Time: 15:41
 * Description:
 */
public class Solution {
    public int Fibonacci(int n) {

        if (n <= 1) {
            return n;
        }

        int pre1 = 0,pre2 = 1;
        int res = 0;
        for (int i = 2; i <= n ; i++) {
            res = pre1 + pre2;
            pre1 = pre2;
            pre2 = res;
        }

        return res;

    }
}