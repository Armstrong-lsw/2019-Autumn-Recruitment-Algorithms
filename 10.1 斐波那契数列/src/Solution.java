/**
 * Create with 10.1 斐波那契数列
 * User: 许清远
 * Date: 2019/6/5
 * Time: 13:00
 * Description:斐波那契数列的第 n 项，n <= 39。
 *
 * 解题思路：递归
 */
public class Solution {

    public int Fibonacci(int n) {

        if (n == 1) {
            return 1;
        }

        if (n == 0) {
            return 0;
        }

        return Fibonacci(n - 1) + Fibonacci(n - 2);

    }
}
