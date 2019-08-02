import java.util.Arrays;

/**
 * @author 许清远
 * @date 2019/8/2
 */
public class Solution {

    int[] arr = new int[26];

    public int longestSubStringWithoutDuplication(String str) {
        if (str == null || "".equals(str)) {
            return -1;
        }
        Arrays.fill(arr, -1);
        int maxLength = 0;
        int curLength = 0;
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char c = str.charAt(i);
            int pre = arr[c - 'a'];
            if (pre == -1 || i - pre > curLength) {
                curLength++;
            } else {
                maxLength = Math.max(maxLength, curLength);
                curLength = i - pre;
            }
            arr[c - 'a'] = i;
        }
        return Math.max(maxLength, curLength);

    }

}
