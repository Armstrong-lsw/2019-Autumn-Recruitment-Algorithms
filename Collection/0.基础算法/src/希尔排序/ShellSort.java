package 希尔排序;

import sort.Sort;

/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/7/3
 * Time: 21:38
 * Description:
 */
public class ShellSort implements Sort {

    @Override
    public void sort(Integer[] nums) {

        int n = nums.length;

        int h = 1;
        while (h < n/3) h = 3 * h + 1;

        while (h >= 1) {
            for (int i = h; i < n; i++) {
                int temp = nums[i];
                int j = i;
                for (; j >= h && nums[j-h] > temp;j -= h)
                    nums[j] = nums[j-h];
                nums[j] = temp;
            }
            h /= 3;
        }

    }
}
