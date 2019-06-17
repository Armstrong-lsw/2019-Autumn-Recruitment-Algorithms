/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/6/17
 * Time: 16:09
 * Description:
 * 给定一个二维数组，其每一行从左到右递增排序，从上到下也是递增排序。给定一个数，判断这个数是否在该二维数组中。
 *
 * Consider the following matrix:
 * [
 *   [1,   4,  7, 11, 15],
 *   [2,   5,  8, 12, 19],
 *   [3,   6,  9, 16, 22],
 *   [10, 13, 14, 17, 24],
 *   [18, 21, 23, 26, 30]
 * ]
 *
 * Given target = 5, return true.
 * Given target = 20, return false.
 */
public class Solution {

    public boolean Find(int target, int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
    }

}
