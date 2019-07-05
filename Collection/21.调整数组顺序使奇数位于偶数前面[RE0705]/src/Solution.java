import java.util.Arrays;

/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/7/5
 * Time: 11:08
 * Description:输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变
 *
 * 解题思路：双指针
 */
public class Solution {
    public void reOrderArray(int [] array) {
        int p1 = 0;//指向偶数的指针
        int p2 = 0;//指向奇数的指针
        int[] res = Arrays.copyOfRange(array, 0, array.length);
        for (int i = 0; i < array.length; i++) {
            if (isOdd(array[i])) p1++;
        }
        for (int i = 0; i < res.length; i++) {
            if (isOdd(res[i])) {
                array[p2] = res[i];
                p2++;
            } else {
                array[p1] = res[i];
                p1++;
            }
        }
    }

    private boolean isOdd(int num) {
        return num % 2 == 1;
    }
}
