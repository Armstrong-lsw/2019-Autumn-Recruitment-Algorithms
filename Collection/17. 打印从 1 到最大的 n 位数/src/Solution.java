/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/6/7
 * Time: 10:06
 * Description:输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。比如输入 3，则打印出 1、2、3 一直到最大的 3 位数即 999。
 *
 * 解题思路：因为没有限制输入的 n 的大小，所以无法确定数字的大小，int 或者 long 均可能出现越界的情况，所以需要使用字符数组的类型来存放数字。
 * print1ToMaxOfNDigits(int n) 即为被调用的函数，在其中会创建一个大小为 n 的字符数组来存放“数字”
 * print1ToMaxOfNDigits(char[] num, int index) 为递归函数，用来输出在 index 索引的位置，从1~9所组成的所有数字，递归结束的条件为 index 的大小等于数组的长度
 * printNumber(char[] num) 为输出函数，在函数体中，首先找到第一个不为 '0' 的字符的位置，然后依次输出字符，结尾换行
 */
public class Solution {

    public static void main(String[] args) {
        new Solution().print1ToMaxOfNDigits(2);
    }

    public void print1ToMaxOfNDigits(int n) {
        if (n <= 0) {
            return;
        }
        char[] num = new char[n];
        print1ToMaxOfNDigits(num, 0);
    }

    private void print1ToMaxOfNDigits(char[] num, int index) {
        if (index == num.length) {
            printNumber(num);
            return;
        }
        for (int i = 0; i < 10; i++) {
            num[index] = (char)(i + '0');
            print1ToMaxOfNDigits(num, index + 1);
        }
    }

    private void printNumber(char[] num) {
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
