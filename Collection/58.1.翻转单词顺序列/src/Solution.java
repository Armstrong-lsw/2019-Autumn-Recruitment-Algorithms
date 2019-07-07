/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/7/7
 * Time: 20:41
 * Description:
 */
public class Solution {

    public static void main(String[] args) {
        String s = new Solution().ReverseSentence("student. a am I");
        System.out.println(s);
    }

    public String ReverseSentence(String str) {
        if (str == null || str.length() == 0) return str;
        int l = 0, r = 0;
        int n = str.length();
        char[] chars = str.toCharArray();
        while (r <= n) {
            if (r == n || chars[r] == ' ') {
                reverse(chars, l, r - 1);
                l = r + 1;
            }
            r++;
        }
        reverse(chars, 0, str.length() - 1);
        return String.valueOf(chars);
    }

    private void reverse(char[] chars, int l, int r) {
        while (l < r) swap(chars, l++, r--);
    }

    private void swap(char[] chars, int i, int j) {
        char c = chars[i];
        chars[i] = chars[j];
        chars[j] = c;
    }

}
