package sort.归并排序;

import sort.Sort;

import java.util.Arrays;

/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/7/3
 * Time: 21:59
 * Description:
 */
public class MergeSort implements Sort {

    @Override
    public void sort(Integer[] nums) {
        sort(nums, 0, nums.length - 1);
    }

    private void sort(Integer[] nums, int l, int r) {
        if (l >= r) {
            return;
        }
        int mid = (l + r) / 2;
        sort(nums, l, mid);
        sort(nums, mid + 1, r);
        if (nums[mid] > nums[mid + 1]) {
            merge(nums, l, mid, r);
        }
    }

    private void merge(Integer[] nums, int l, int mid, int r) {
        Integer[] arr = Arrays.copyOfRange(nums, l, r + 1);
        int pl = 0, pr = mid + 1 - l;
        for (int i = l; i <= r; i++) {
            if (pl > mid - l) {
                nums[i] = arr[pr];
                pr++;
            } else if (pr > r - l) {
                nums[i] = arr[pl];
                pl++;
            } else if (arr[pl] < arr[pr]) {
                nums[i] = arr[pl];
                pl++;
            } else {
                nums[i] = arr[pr];
                pr++;
            }
        }
    }
}
