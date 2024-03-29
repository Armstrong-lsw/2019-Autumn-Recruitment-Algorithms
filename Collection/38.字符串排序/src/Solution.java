import java.util.ArrayList;
import java.util.Arrays;

/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/6/21
 * Time: 22:36
 * Description:
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。
 * 例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 */
public class Solution {

    private ArrayList<String> list = new ArrayList<>();

    public ArrayList<String> Permutation(String str) {
        if (str == null || str.equals("")) return list;
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        PermutationHandler(chars, new boolean[chars.length], new StringBuilder());
        return list;
    }

    private void PermutationHandler(char[] chars, boolean[] hasUsed, StringBuilder s) {

        if (s.length() == chars.length) {
            list.add(s.toString());
            return;
        }

        for (int i = 0; i < chars.length; i++) {
            if (hasUsed[i]) continue;
            if (i != 0 && chars[i] == chars[i-1] && !hasUsed[i-1]) continue;
            s.append(chars[i]);
            hasUsed[i] = true;
            PermutationHandler(chars, hasUsed, s);
            s.deleteCharAt(s.length() - 1);
            hasUsed[i] = false;
        }

    }

}
