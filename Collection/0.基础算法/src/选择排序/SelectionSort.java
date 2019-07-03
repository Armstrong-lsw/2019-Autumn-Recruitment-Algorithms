package 选择排序;

import sort.Sort;

/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/7/3
 * Time: 20:31
 * Description:选择排序
 */
public class SelectionSort implements Sort {

    @Override
    public void sort(Integer[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int k = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[k]) k = j;
            }
            swap(nums, i, k);
        }
    }

    private void swap(Integer[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
