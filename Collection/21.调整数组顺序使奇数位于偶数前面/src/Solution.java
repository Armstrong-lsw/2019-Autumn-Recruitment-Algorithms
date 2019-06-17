import java.util.Arrays;

/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/6/17
 * Time: 17:13
 * Description:输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
 * 所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class Solution {

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7};
        new Solution().reOrderArray(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }

    public void reOrderArray(int [] array) {
        int[] res = Arrays.copyOfRange(array, 0, array.length);
        int oddTotal = 0; //指向偶数的的指针
        for (int i = 0; i < array.length; i++) {
            if (isOdd(array[i])) {
                oddTotal++;
            }
        }
        int p = 0; //指向奇数的指针
        for (int i = 0; i < res.length; i++) {
            if (isOdd(res[i])) {
                array[p] = res[i];
                p++;
            } else {
                array[oddTotal] = res[i];
                oddTotal++;
            }
        }
    }

    private boolean isOdd(int num) {
        return num % 2 == 1;
    }

}
