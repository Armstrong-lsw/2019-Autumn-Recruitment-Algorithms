/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/7/3
 * Time: 17:40
 * Description:
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方
 */
public class Solution {
    public double Power(double base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        if (exponent == 1) {
            return base;
        }
        boolean isNegative = exponent < 0;
        if (isNegative) {
            exponent = -exponent;
        }
        double power = Power(base * base, exponent / 2);
        if (exponent % 2 == 1) {
            power *= base;
        }
        return isNegative ? 1 / power : power;
    }
}
