/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/6/18
 * Time: 20:55
 * Description:
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
 * 例如，如果输入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
 * 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 *
 * 注意点：
 * 1.当横坐标或者纵坐标的两个指针相等的时候，需要考虑去重的问题，
 * 即当横坐标相等，对于纵坐标的向上遍历不能进行，纵坐标相等，横坐标的向左遍历不能进行
 * 2.最后一步循环的时候，第一个值不能取
 */
import java.util.ArrayList;

public class Solution {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        if (matrix.length == 0) {
            return null;
        }
        ArrayList<Integer> res = new ArrayList<>();
        int i1 = 0, i2 = matrix.length - 1, j1 = 0, j2 = matrix[0].length - 1;
        while (i1 <= i2 && j1 <= j2) {
            for (int j = j1; j <= j2 ; j++) {
                res.add(matrix[i1][j]);
            }
            for (int i = i1 + 1; i <= i2 ; i++) {
                res.add(matrix[i][j2]);
            }
            if (i1 != i2) {
                for (int j = j2 - 1; j >= j1; j--) {
                    res.add(matrix[i2][j]);
                }
            }
            if (j1 != j2) {
                for (int i = i2 - 1; i > i1 ; i--) {
                    res.add(matrix[i][j1]);
                }
            }
            i1++;i2--;j1++;j2--;
        }
        return res;
    }
}
