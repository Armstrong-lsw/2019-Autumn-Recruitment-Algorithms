/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/7/3
 * Time: 17:36
 * Description:
 */
public class Solution {

    public int NumberOf1(int n) {
        int res = 0;
        while (n != 0) {
            res++;
            n &= n - 1;
        }
        return res;
    }

}
