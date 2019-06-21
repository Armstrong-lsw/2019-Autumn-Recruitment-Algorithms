import java.util.ArrayList;
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

    public static void main(String[] args) {
        ArrayList<String> res = new Solution().Permutation("abc");
        System.out.println("aa");
    }

    private ArrayList<String> res = new ArrayList<>();

    public ArrayList<String> Permutation(String str) {
        if (str == null || str.length() == 0) {
            return res;
        }
        permutationRE(new StringBuilder(str), str.length() - 1);
        return res;
    }

    private void permutationRE(StringBuilder sb,int index) {
        if (index == 0) {
            res.add(sb.toString());
        }
        for (int i = index; i >= 0; i--) {
            if (i == sb.length() - 1 || sb.charAt(i) != sb.charAt(i + 1)) {
                char c = sb.charAt(i);
                sb.deleteCharAt(i).append(c);
                permutationRE(new StringBuilder(sb), index - 1);
            }
        }
    }

}
