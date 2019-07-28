/**
 * @author 许清远
 * @date 2019/7/28
 */
public class Solution {

    public boolean isContinuous(int [] numbers) {

        if (numbers == null || numbers.length < 5) {
            return false;
        }

        quickSort(numbers, 0, numbers.length - 1);

        int cnt = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                cnt++;
            }
        }

        for (int i = cnt + 1; i < numbers.length; i++) {
            if (numbers[i] == numbers[i - 1]) {
                return false;
            }
            cnt -= numbers[i] - numbers[i-1] - 1;
        }

        return cnt >= 0;

    }

    private void quickSort(int[] nums, int l, int r) {
        if (l >= r) {
            return;
        }
        int mid = partition(nums, l, r);
        quickSort(nums, 0, mid - 1);
        quickSort(nums, mid + 1, r);
    }

    private int partition(int[] nums, int l, int r) {
        int v = nums[l];
        int i = l, j = r + 1;
        while (true) {
            while (i != r && nums[++i] < v){}
            while (j != l && nums[--j] > v){}
            if (i >= j) {
                break;
            }
            swap(nums, i, j);
        }
        swap(nums, l, j);
        return j;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}