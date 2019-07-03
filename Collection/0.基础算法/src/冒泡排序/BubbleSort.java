package 冒泡排序;

import sort.Sort;

/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/7/3
 * Time: 20:55
 * Description:
 */
public class BubbleSort implements Sort {

    @Override
    public void sort(Integer[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    swap(nums, j, j + 1);
                }
            }
        }
    }

    private void swap(Integer[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
