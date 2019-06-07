/**
 * Create with 10.3 跳台阶
 * User: 许清远
 * Date: 2019/6/5
 * Time: 13:28
 * Description:一只青蛙一次可以跳上 1 级台阶，也可以跳上 2 级。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
 *
 * 解题思路：斐波拉契数列
 */
public class Solution {
    public int JumpFloor(int target) throws Exception {
        if (target < 0) {
            throw new Exception("Index is illegal");
        }
        if (target == 0) {
            return 0;
        }
        if (target == 1) {
            return 1;
        }
        if (target == 2) {
            return 2;
        }
        return JumpFloor(target - 1) + JumpFloor(target - 2);
    }
}
