/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/7/13
 * Time: 23:48
 * Description:
 */
public class Solution {
    public boolean Find(int target, int [][] array) {
        if(array == null || array.length == 0 || array[0].length == 0) return false;
        int h = 0,l = array[0].length - 1;
        while (h < array.length && l >= 0) {
            if(target == array[h][l]) return true;
            else if (target > array[h][l]) h++;
            else l--;
        }
        return false;
    }
}
