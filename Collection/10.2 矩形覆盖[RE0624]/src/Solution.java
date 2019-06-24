/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/6/24
 * Time: 20:42
 * Description:
 */
public class Solution {

    public int RectCover(int target) {
        if (target == 0) {
            return 0;
        }
        if (target == 1) {
            return 1;
        }
        if (target == 2) {
            return 2;
        }
        int pre1 = 1, pre2 = 2, res = 0;
        for (int i = 3; i <= target ; i++) {
            res = pre1 + pre2;
            pre1 = pre2;
            pre2 = res;
        }
        return res;
    }

}
