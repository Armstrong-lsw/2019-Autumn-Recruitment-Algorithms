/**
 * Create with 15. 二进制中 1 的个数
 * User: 许清远
 * Date: 2019/6/7
 * Time: 9:24
 * Description:输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 *
 * 解题思路：每次把 n 与 n-1 相与，去掉最低位的 1
 */
public class Solution {

//    public int NumberOf1(int n) {
//        int res = 0;
//        while (n != 0) {
//            res++;
//            n &= n - 1;
//        }
//        return res;
//    }

    public int NumberOf1(int n) {
        return Integer.bitCount(n);
    }
}
