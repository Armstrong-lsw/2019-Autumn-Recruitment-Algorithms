/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/7/16
 * Time: 15:54
 * Description:把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 */
public class Solution {

    public int minNumberInRotateArray(int [] array) {

        if (array == null || array.length == 0) return 0;

        int l = 0, r = array.length - 1;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (array[l] == array[mid] && array[mid] == array[r]) r = r - 1;
            else if (array[mid] <= array[r]) r = mid;
            else l = mid + 1;
        }

        return array[l];

    }

}
