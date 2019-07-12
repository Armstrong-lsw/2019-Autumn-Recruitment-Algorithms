package 左边奇数右边偶数;

/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/7/12
 * Time: 14:34
 * Description: 相对位置可以改变，仅遍历一遍
 */
public class Solution {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        new Solution().reOrderArray(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public void reOrderArray(int [] array) {
        if (array == null || array.length == 1) return;
        int[] tmp = new int[array.length];
        System.arraycopy(array, 0, tmp, 0, array.length);
        int l = 0, r = array.length - 1;
        for (int i = 0; i < tmp.length; i++) {
            if (tmp[i] % 2 == 1) {
                array[l] = tmp[i];
                l++;
            } else {
                array[r] = tmp[i];
                r--;
            }
        }
    }
}
