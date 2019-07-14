import java.util.ArrayList;
import java.util.Arrays;

/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/7/14
 * Time: 12:41
 * Description:
 */
public class Solution {

    private ArrayList<String> list = new ArrayList<>();

    public ArrayList<String> Permutation(String str) {
        if (str == null || str.equals("")) return list;
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        Permutation(chars,new boolean[chars.length],new StringBuilder());
        return list;
    }

    private void Permutation(char[] chars, boolean[] hasUsed, StringBuilder s) {
        if (chars.length == s.length()) {
            list.add(s.toString());
            return;
        }
        for (int i = 0; i < chars.length; i++) {
            if (hasUsed[i]) continue;
            if (i != 0 && chars[i] == chars[i-1] && !hasUsed[i-1]) continue;
            s.append(chars[i]);
            hasUsed[i] = true;
            Permutation(chars, hasUsed, s);
            hasUsed[i] = false;
            s.deleteCharAt(s.length() - 1);
        }
    }


}
