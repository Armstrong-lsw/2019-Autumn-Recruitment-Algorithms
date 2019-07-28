/**
 * @author 许清远
 * @date 2019/7/28
 */
public class Solution {
    public int Sum_Solution(int n) {
        int sum = n;
        boolean b = (sum > 0) && (sum += Sum_Solution(sum - 1)) > 0;
        return sum;
    }
}
