/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/7/6
 * Time: 19:17
 * Description: 统计一个数字在排序数组中出现的次数。
 * Input:
 * nums = 1, 2, 3, 3, 3, 3, 4, 6
 * K = 3
 *
 * Output:
 * 4
 */
public class Solution {

    public int GetNumberOfK(int [] array , int k) {
        int l = binarySearch(array, k);
        int r = binarySearch(array, k + 1);
        return (l == array.length || array[l] != k) ? 0 : r - l;
    }

    private int binarySearch(int[] arr, int k) {
        int l = 0, h = arr.length;
        while (l < h) {
            int m = l + (h - l) / 2;
            if (arr[m] >= k) h = m;
            else l = m + 1;
        }
        return l;
    }

}
