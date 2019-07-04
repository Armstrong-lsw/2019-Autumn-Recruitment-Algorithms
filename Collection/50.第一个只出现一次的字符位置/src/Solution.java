import java.util.BitSet;

/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/7/4
 * Time: 18:39
 * Description:在一个字符串中找到第一个只出现一次的字符，并返回它的位置。
 */
public class Solution {
    public int FirstNotRepeatingChar(String str) {
        BitSet set1 = new BitSet(256);
        BitSet set2 = new BitSet(256);
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!set1.get(c) && !set2.get(c)) set1.set(c);
            else set2.set(c);
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (set1.get(c) && !set2.get(c))
                return i;
        }
        return -1;
    }
}
