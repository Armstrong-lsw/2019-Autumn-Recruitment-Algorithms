/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/6/24
 * Time: 20:48
 * Description:
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 */
public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int major = array[0];
        for (int i = 1,cnt = 1; i < array.length; i++) {
            cnt = array[i] == major ? cnt + 1 : cnt - 1;
            if (cnt == 0) {
                major = array[i];
                cnt = 1;
            }
        }
        int cnt = 0;
        for (int value : array) {
            if (value == major) {
                cnt++;
            }
        }
        return cnt > array.length / 2 ? major : 0;
    }
}
