/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/7/20
 * Time: 20:54
 * Description:
 */
public class Solution {

    public static void main(String[] args) {
        new Solution().print1ToMaxOfNDigits(2);
    }

    public void print1ToMaxOfNDigits(int n) {

        if (n <= 0) return;
        char[] num = new char[n];
        print1ToMaxOfNDigits(num, 0);
    }

    private void print1ToMaxOfNDigits(char[] num, int index) {
        if (index == num.length) {
            printNum(num);
            return;
        }
        for (int i = 0; i < 10; i++) {
            num[index] = (char) (i + '0');
            print1ToMaxOfNDigits(num, index + 1);
        }
    }

    private void printNum(char[] num) {
        int i = 0;
        while (i < num.length && num[i] == '0') {
            i++;
        }
        while (i < num.length) {
            System.out.print(num[i]);
            i++;
        }
        System.out.println();
    }

}
