/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/7/13
 * Time: 22:57
 * Description:
 */
public class Solution {

    public boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence == null || sequence.length == 0) return false;
        return verify(sequence, 0, sequence.length - 1);
    }

    private boolean verify(int[] nums, int first, int last) {

        if (first >= last) return true;

        int rootVal = nums[last];
        int leftNum = first;
        for (int i = first; i < last - 1; i++) {
            if (nums[i] < rootVal) leftNum++;
        }
        for (int i = leftNum; i < last - 1; i++) {
            if (nums[i] < rootVal) return false;
        }
        return verify(nums, first, leftNum - 1) && verify(nums, leftNum, last - 1);
    }

}
