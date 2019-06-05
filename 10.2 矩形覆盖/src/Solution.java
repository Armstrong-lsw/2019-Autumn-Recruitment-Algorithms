/**
 * Create with 10.2 矩形覆盖
 * User: 许清远
 * Date: 2019/6/5
 * Time: 13:16
 * Description:我们可以用 2*1 的小矩形横着或者竖着去覆盖更大的矩形。
 * 请问用 n 个 2*1 的小矩形无重叠地覆盖一个 2*n 的大矩形，总共有多少种方法？
 *
 * 解题思路：https://github.com/CyC2018/CS-Notes/blob/master/notes/%E5%89%91%E6%8C%87%20Offer%20%E9%A2%98%E8%A7%A3%20-%2010~19.md
 */

public class Solution {

    public static void main(String[] args) throws Exception {

        Solution solution = new Solution();
        System.out.println(solution.RectCover(4));

    }

    public int RectCover(int target) throws Exception {

//        注意检查数组越界
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

        return RectCover(target - 1) + RectCover(target - 2);

    }
}
