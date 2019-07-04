import java.util.Arrays;

/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/7/3
 * Time: 19:36
 * Description:
 * 输入一个字符串（只包含 a~z 的字符），求其最长不含重复字符的子字符串的长度。
 * 例如对于 arabcacfr，最长不含重复字符的子字符串为 acfr，长度为 4。
 *
 * 解题思路：https://blog.csdn.net/m0_37862405/article/details/80369128
 */
public class Solution {

    public int longestSubStringWithoutDuplication(String str) {

        if (str == null || str.equals("")) {
            return 0;
        }

        int[] positions = new int[26];
        Arrays.fill(positions, -1);
        int curLength = 0, maxLength = 0;

        for (int i = 0; i < str.length(); i++) {
            int index = str.charAt(i) - 'a';
            int pos = positions[index];
            if (pos == -1 || i - pos > curLength) {
                curLength++;
            } else {
                maxLength = Math.max(maxLength, curLength);
                curLength = i - pos;
            }
            positions[index] = i;
        }
        maxLength = Math.max(maxLength, curLength);

        return maxLength;

    }

}
