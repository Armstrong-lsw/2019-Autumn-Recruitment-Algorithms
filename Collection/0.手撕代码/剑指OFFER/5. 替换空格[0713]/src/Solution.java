/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/7/13
 * Time: 23:56
 * Description:
 */
public class Solution {
    public String replaceSpace(StringBuffer str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') str.append("  ");
        }
        int front = length - 1,tail = str.length() - 1;
        for (; front >= 0; front--) {
            if (str.charAt(front) == ' ') {
                str.setCharAt(tail,'0');
                str.setCharAt(tail - 1,'2');
                str.setCharAt(tail - 2,'%');
                tail -= 2;
            } else str.setCharAt(tail,str.charAt(front));
            tail--;
        }
        return str.toString();
    }
}
