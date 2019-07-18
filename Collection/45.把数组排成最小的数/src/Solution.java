import java.util.Arrays;

/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/6/29
 * Time: 20:22
 * Description:
 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
 * 例如输入数组 {3，32，321}，则打印出这三个数字能排成的最小数字为 321323。
 */
public class Solution {

    public String PrintMinNumber(int [] numbers) {
        String[] nums = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            nums[i] = numbers[i] + "";
        }
        Arrays.sort(nums, (o1, o2) -> (o1 + o2).compareTo(o2 + o1));
        StringBuilder res = new StringBuilder();
        for (String num : nums) {
            res.append(num);
        }
        return res.toString();
    }

}
