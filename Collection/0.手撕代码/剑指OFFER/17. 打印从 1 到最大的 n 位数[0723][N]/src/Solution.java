/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/7/24
 * Time: 20:21
 * Description:
 */
public class Solution {

    public static void main(String[] args) {
        new Solution().print1ToMaxOfNDigits(10);
    }

    public void print1ToMaxOfNDigits(int n) {
        if (n <= 0) return;
        char[] nums = new char[n];
        print1ToMaxOfNDigits(nums, 0);
    }

    private void print1ToMaxOfNDigits(char[] nums,int index) {
        if (nums.length == index) {
            print(nums);
            return;
        }
        for (int i = 0; i <= 9; i++) {
            nums[index] = (char) (i + '0');
            print1ToMaxOfNDigits(nums, index + 1);
        }
    }

    private void print(char[] nums) {
        int index = 0;
        while (index < nums.length && nums[index] == '0') {
            index++;
        }
        while (index < nums.length) {
            System.out.print(nums[index]);
            index++;
        }
        System.out.println();
    }



}
