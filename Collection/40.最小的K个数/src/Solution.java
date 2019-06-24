import java.util.ArrayList;

/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/6/24
 * Time: 21:06
 * Description:
 * 输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
 */
public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list = new ArrayList<>();
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
        int l = 0, h = nums.length - 1;
        while (true) {
            int index = partition(nums, l, h);
            if (index == k) {
                break;
            } else if (index < k) {
                l = index + 1;
            } else {
                h = index - 1;
            }
        }
    }

    private int partition(int[] nums, int l, int h) {
        int p = nums[l];
        int i = l, j = h + 1;
        while (true) {
            while (i != h && nums[++i] < p);
            while (j != l && nums[--j] > p);
            if (i >= j) {
                break;
            }
            swap(nums, i, j);
        }
        swap(nums, l, j);
        return j;
    }

    private void swap(int[] nums,int i,int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
