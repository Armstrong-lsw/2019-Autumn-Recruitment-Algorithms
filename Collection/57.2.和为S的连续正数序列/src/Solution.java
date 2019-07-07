/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/7/7
 * Time: 20:26
 * Description:
 * 输出所有和为 S 的连续正数序列。
 *
 * 例如和为 100 的连续序列有：
 */
import java.util.ArrayList;
public class Solution {
    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
        int start = 1,end = 2;
        if (sum < 3) return new ArrayList<>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int curSum = 3;
        while (end < sum) {
            if (curSum < sum) {
                end++;
                curSum += end;
            } else if (curSum > sum) {
                curSum -= start;
                start++;
            } else {
                ArrayList<Integer> list = new ArrayList<>();
                for (int i = start; i <= end; i++) {
                    list.add(i);
                }
                res.add(list);
                end++;
                curSum += end;
            }
        }
        return res;
    }
}
