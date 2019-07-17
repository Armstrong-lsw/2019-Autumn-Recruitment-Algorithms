/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/7/17
 * Time: 23:03
 * Description:
 */
public class Solution {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {

        if (array == null || array.length == 0) return;
        int diff = 0;

        for (int i = 0; i < array.length; i++) diff ^=array[i];
        diff &= -diff;

        for (int num : array) {
            //注意这个位置，括号不能少
            if ((diff & num) == 0) num1[0] ^= num;
            else num2[0] ^= num;
        }

    }
}
