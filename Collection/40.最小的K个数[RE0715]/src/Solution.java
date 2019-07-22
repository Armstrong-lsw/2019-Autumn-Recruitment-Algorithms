import java.util.ArrayList;

/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/7/15
 * Time: 11:04
 * Description:
 */
public class Solution {

    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list = new ArrayList<>();

        // k <= 0 这个判断条件必须要！！！！！！！！！！！！！
        if (input == null || input.length < k || k <= 0) {
            return list;
        }
        findKthSmallest(input, k - 1);
        for (int i = 0; i < k; i++) {
            list.add(input[i]);
        }
        return list;
    }

    private void findKthSmallest(int[] nums, int k) {
        int l = 0, r = nums.length - 1;
        while (true){
            int p = partition(nums, l, r);
            if (p == k) {
                break;
            } else if (p < k) {
                l = p + 1;
            } else {
                r = p - 1;          //这里注意！！！不能直接等于p
            }
        }
    }

    private int partition(int[] nums, int l, int r) {
        int v = nums[l];
        int i = l, j = r + 1;
        while (true){
            while (i != r && nums[++i] < v);
            while (j != l && nums[--j] > v);
            if (i >= j) {
                break;
            }
            swap(nums, i, j);
        }
        swap(nums, l, j);
        return j;
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

}
