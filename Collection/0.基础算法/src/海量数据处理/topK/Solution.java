package 海量数据处理.topK;

/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/7/5
 * Time: 10:16
 * Description:
 */
public class Solution {

    public static void main(String[] args) {
        int[] topK = new Solution().getTopK(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1}, 5);
        for (int i : topK) {
            System.out.print(i);
        }
    }

    public int[] getTopK(int[] nums, int k) {
        int l = 0, r = nums.length - 1;
        while (true) {
            int pt = partition(nums, l, r);
            if (pt == k) {
                break;
            } else if (pt < k) {
                l = pt + 1;
            } else {
                r = pt - 1;
            }
        }
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = nums[i];
        }
        return res;
    }

    private int partition(int[] nums, int l, int r) {
        swap(nums, l, (int) (Math.random() * (r - l + 1) + l));
        int v = nums[l];
        int i = l, j = r + 1;
        while (true) {
            while (i < r && nums[++i] < v);
            while (j > l && nums[--j] > v);
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
