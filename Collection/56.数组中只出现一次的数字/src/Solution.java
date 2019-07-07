/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/7/7
 * Time: 19:28
 * Description:一个整型数组里除了两个数字之外，其他的数字都出现了两次，找出这两个数。
 */

//num1,num2分别为长度为1的数组。传出参数
//将num1[0],num2[0]设置为返回结果
public class Solution {

    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        int diff = 0;

        //根据 a^a = 0,0^a = a可以知道，最后的结果就是两个只出现一次的数异或的结果
        for (int num : array) diff ^= num;

        // 这一步可以求出 diff 最右边的那一个不为 1 的数
        // 因为存在两个只出现一次的数，所以两个数的异或结果肯定不为0
        // 而最右边不为 0 的那一个数肯定是由于这两个数一个对应位为 0 产生的，一个对应位为 1 产生的
        // 根据这个性质可以把 array 再次分成两组，分别包含一个只出现一个的数，再次异或，得出结果
        diff &= -diff;

        for (int num : array) {
            if ((num & diff) == 0) num1[0] ^= num;
            else num2[0] ^= num;
        }
    }
}
