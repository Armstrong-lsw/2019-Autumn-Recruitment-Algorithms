/**
 * Create with 5. 替换空格
 * User: 许清远
 * Date: 2019/6/3
 * Time: 18:16
 * Description:
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy
 *
 * 解题思路：先声明一个指针 p1 指向原字符串的最后一位，然后把字符串变为结果所需要的长度，之后创建一个指针p2，
 * 指向现在字符串的末尾，p1和p2同时从后往前移动，当p1指向的位置不是空格的时候，将p2指向的字符变为现在p1指向的字符，同时把p2的指针向前移动一个单位
 * 当p1指向空格时，将p2指向的字符变为'0'，p2 - 1索引处的位置变为'2'，将p2 - 2索引处的字符变化为'%'(注意是倒序)，同时把p2的指针向前移动三个单位
 */
public class Solution {

    public static void main(String[] args) {

        Solution solution = new Solution();
        StringBuffer stringBuffer = new StringBuffer("We Are Happy");
        String res = solution.replaceSpace(stringBuffer);
        System.out.println(res);

    }

    public String replaceSpace(StringBuffer str) {

        int p1 = str.length() - 1;
        for (int i = 0; i <= p1 ; i++) {
            if (str.charAt(i) == ' ') {
                str.append("  ");
            }
        }

        int p2 = str.length() - 1;
        for (; p1 >= 0 ; p1--) {
            if (str.charAt(p1) == ' ') {
                str.setCharAt(p2, '0');
                str.setCharAt(p2 - 1, '2');
                str.setCharAt(p2 - 2, '%');
                p2 -= 3;
            } else {
                str.setCharAt(p2, str.charAt(p1));
                p2--;
            }
        }

        return str.toString();

    }
}