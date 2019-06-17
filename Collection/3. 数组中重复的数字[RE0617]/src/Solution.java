/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/6/17
 * Time: 15:58
 * Description:
 * 在一个长度为 n 的数组里的所有数字都在 0 到 n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字是重复的，
 * 也不知道每个数字重复几次。请找出数组中任意一个重复的数字。
 *
 * Input:
 * {2, 3, 1, 0, 2, 5}
 *
 * Output:
 * 2
 */
public class Solution {

    public static void main(String[] args) {

        Solution solution = new Solution();
        int[] nums = new int[]{2, 3, 1, 0, 2, 5};
        int[] duplication = new int[1];
        boolean duplicate = solution.duplicate(nums, nums.length, duplication);
        if (duplicate) {
            System.out.println(duplication[0]);
        } else {
            System.out.println(duplicate);
        }

    }

    public boolean duplicate(int[] nums, int length, int[] duplication) {

        if (length <= 1) {
            return false;
        }

        for (int i = 0; i < length; i++) {
            while (nums[i] != i) {
                if (nums[i] == nums[nums[i]]) {
                    duplication[0] = nums[i];
                    return true;
                }
                swap(nums,i,nums[i]);
            }
        }
        return false;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
