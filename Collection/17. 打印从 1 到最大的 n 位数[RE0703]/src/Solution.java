/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/7/3
 * Time: 17:49
 * Description:
 */
public class Solution {

    public static void main(String[] args) {
        new Solution().print1ToMaxOfNDigits(5);
    }

    public void print1ToMaxOfNDigits(int n) {
        if (n <= 0) {
            return;
        }
        char[] number = new char[n];
        print1ToMaxOfNDigits(number, 0);
    }

    private void print1ToMaxOfNDigits(char[] number, int index) {
        if (index == number.length) {
            printNumber(number);
            return;
        }
        for (int i = 0; i < 10; i++) {
            number[index] = (char) (i + '0');
            print1ToMaxOfNDigits(number, index + 1);
        }
    }

    private void printNumber(char[] number) {
        int index = 0;
        //注意判断的顺序
        while (index < number.length && number[index] == '0') {
            index++;
        }
        while (index < number.length) {
            System.out.print(number[index++]);
        }
        System.out.println();
    }

}
