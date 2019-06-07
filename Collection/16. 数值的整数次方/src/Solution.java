/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/6/7
 * Time: 9:55
 * Description:给定一个 double 类型的浮点数 base 和 int 类型的整数 exponent，求 base 的 exponent 次方。
 *
 * 解题思路：https://github.com/CyC2018/CS-Notes/blob/master/notes/%E5%89%91%E6%8C%87%20Offer%20%E9%A2%98%E8%A7%A3%20-%2010~19.md
 */
public class Solution {

    public double Power(double base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent == 1) {
            return base;
        }
        boolean isNegative = false;
        if (exponent < 0) {
            isNegative = true;
            exponent = -exponent;
        }
        double power = Power(base * base, exponent / 2);
        if (exponent / 2 == 1) {
            power = base * power;
        }
        return isNegative ? 1 / power : power;
    }

}