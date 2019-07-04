package sort.快速排序;

import sort.Sort;

/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/7/4
 * Time: 15:25
 * Description:
 */
public class QuickSort implements Sort {

    @Override
    public void sort(Integer[] nums) {
        sort(nums, 0, nums.length - 1);
    }

    private void sort(Integer[] nums, int l, int r) {
        if (l >= r) {
            return;
        }
        int mid = partition(nums, l, r);
        sort(nums, l, mid - 1);
        sort(nums, mid + 1, r);
    }

    private int partition(Integer[] nums, int l, int r) {
        swap(nums, l, (int) (Math.random() * (r - l + 1) + l));
        Integer v = nums[l];
        int i = l, j = r + 1;
        while (true) {
            while (i != r && nums[++i] < v);
            while (j != l && nums[--j] > v);
            if (i < j) {
                swap(nums, i, j);
            } else {
                break;
            }
        }
        swap(nums, l, j);
        return j;
    }

    private void swap(Integer[] nums, int i, int j) {
        Integer temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
