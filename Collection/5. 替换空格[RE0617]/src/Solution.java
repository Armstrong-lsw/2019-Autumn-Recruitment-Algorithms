/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/6/17
 * Time: 16:57
 * Description:
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.
 * 则经过替换之后的字符串为We%20Are%20Happy
 */
public class Solution {

    public static void main(String[] args) {

        Solution solution = new Solution();
        StringBuffer stringBuffer = new StringBuffer("We Are Happy");
        String res = solution.replaceSpace(stringBuffer);
        System.out.println(res);

    }

    public String replaceSpace(StringBuffer str) {
        StringBuilder res = new StringBuilder(str);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                res.append("  ");   //这里是加两个空格，因为原来的空格也算是一个字符
            }
        }
        int i = str.length() - 1;
        int j = res.length() - 1;
        for (; i >= 0; i--) {
            if (str.charAt(i) == ' ') {
                res.setCharAt(j, '0');
                res.setCharAt(j - 1, '2');
                res.setCharAt(j - 2, '%');
                j -= 3;
            } else {
                res.setCharAt(j, str.charAt(i));
                j--;
            }
        }
        return res.toString();
    }

}
