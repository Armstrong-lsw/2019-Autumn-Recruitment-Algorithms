/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/7/7
 * Time: 19:53
 * Description:输入一个递增排序的数组和一个数字 S，在数组中查找两个数，使得他们的和正好是 S。
 * 如果有多对数字的和等于 S，输出两个数的乘积最小的。
 */

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        if (array == null || array.length <= 1) {
            return new ArrayList<>();
        }
        int l = 0, r = array.length - 1;
        while (l < r) {
            if (array[l] + array[r] == sum)
                return new ArrayList<>(Arrays.asList(array[l], array[r]));
            else if (array[l] + array[r] < sum) l++;
            else r--;
        }
        return new ArrayList<>();
    }
}
