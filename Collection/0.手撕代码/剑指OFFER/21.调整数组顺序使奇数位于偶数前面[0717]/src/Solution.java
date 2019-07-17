/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/7/17
 * Time: 18:41
 * Description:
 */
public class Solution {
    public void reOrderArray(int [] array) {

        if (array == null || array.length == 0) return;

        int[] nums = new int[array.length];
        System.arraycopy(array,0,nums,0,array.length);

        int front = 0, tail = 0;
        for (int i = 0; i < array.length; i++)
            if (array[i] %2 == 1) tail++;

        for (int i = 0; i < array.length; i++) {
            if (nums[i] % 2 == 0) array[tail++] = nums[i];
            else array[front++] = nums[i];
        }
    }
}
