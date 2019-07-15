/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/7/15
 * Time: 10:54
 * Description:
 */
public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {

        if (array == null || array.length == 0) return 0;

        int cnt = 0;
        int num = array[0];

        for (int i = 0; i < array.length; i++) {
            cnt =  array[i] == num ? cnt + 1 : cnt - 1;
            if (cnt == 0) {
                num = array[i];
                cnt = 1;
            }
        }

        cnt = 0;
        for (int i = 0; i < array.length; i++) {
            if (num == array[i]) cnt ++;
        }

        if (cnt > array.length /2 ) return num;
        else return 0;

    }
}
