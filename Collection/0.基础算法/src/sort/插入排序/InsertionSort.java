package sort.插入排序;

import sort.Sort;

/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/7/3
 * Time: 20:58
 * Description:
 */
public class InsertionSort implements Sort {

    @Override
    public void sort(Integer[] nums) {
        for (int i = 1; i < nums.length; i++) {
            Integer temp = nums[i];
            int j = i;
            for (; j > 0 && nums[j-1] > temp; j--) {
                nums[j] = nums[j - 1];
            }
            nums[j] = temp;
        }
    }
}
