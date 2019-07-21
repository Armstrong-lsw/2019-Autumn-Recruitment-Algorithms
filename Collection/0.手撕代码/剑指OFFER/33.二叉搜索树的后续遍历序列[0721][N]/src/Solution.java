/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/7/21
 * Time: 23:08
 * Description:
 */
public class Solution {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence == null || sequence.length == 0) return false;
        return isVerifySquenceOfBST(sequence,0,sequence.length - 1);
    }

    private boolean isVerifySquenceOfBST(int[] nums, int l, int r) {
        if (l >= r) return true;
        int i = l;
        int v = nums[r];
        for (; i <= r - 1 && nums[i] < v; i++);
        int mid = i;
        for (; i <= r - 1 && nums[i] > v; i++);
        return i == r ? isVerifySquenceOfBST(nums,l,mid-1) && isVerifySquenceOfBST(nums,mid,r - 1) : false;
    }
}
