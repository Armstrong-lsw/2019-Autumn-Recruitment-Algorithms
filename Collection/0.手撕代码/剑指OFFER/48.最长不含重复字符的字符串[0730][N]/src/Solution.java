import java.util.Arrays;

/**
 * @author 许清远
 * @date 2019/7/30
 */
public class Solution {

    public static void main(String[] args) {
        int res = new Solution().longestSubStringWithoutDuplication("arabcacfr");
        System.out.println(res);
    }

    public int longestSubStringWithoutDuplication(String str) {

        if (str == null || str.length() == 0) {
            return 0;
        }

        int curLength = 0,maxLength = 0;
        int[] arr = new int[26];
        Arrays.fill(arr, -1);

        int length = str.length();
        for (int i = 0; i < length; i++) {
            char c = str.charAt(i);
            int index = c - 'a';
            if (arr[index] == -1 || i - arr[index] > curLength) {
                curLength++;
            } else {
                maxLength = Math.max(maxLength, curLength);
                curLength = i - arr[index];
            }
            arr[index] = i;
        }

        return maxLength >= curLength ? maxLength : curLength;

    }

}
