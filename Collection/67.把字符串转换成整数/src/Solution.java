/**
 * @author 许清远
 * @date 2019/7/28
 */
public class Solution {

    public int StrToInt(String str) {

        int length;
        if (str == null || (length = str.length()) == 0) {
            return 0;
        }

        boolean flag = str.charAt(0) == '-';

        int res = 0;
        for (int i = 0; i < length; i++) {
            char c = str.charAt(i);
            if (i == 0 && (c == '+' || c == '-')) {
                continue;
            }
            if (c < '0' || c > '9') {
                return 0;
            }
            res = res * 10 + c - '0';
        }

        return flag ? -res : res;

    }


}
