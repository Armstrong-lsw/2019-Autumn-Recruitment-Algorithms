/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/7/17
 * Time: 18:39
 * Description:
 */
public class Solution {
    public double Power(double base, int exponent) {
        if (exponent == 0) return 1;
        boolean flag = false;
        if (exponent < 0) {
            flag = !flag;
            exponent = -exponent;
        }
        double tmp;
        if(exponent %2 == 1) tmp = Power(base*base,exponent/2)*base;
        else tmp = Power(base*base,exponent/2);
        return flag ? 1.0/tmp : tmp;
    }
}
