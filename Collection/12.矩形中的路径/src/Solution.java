/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/7/25
 * Time: 9:25
 * Description:
 */
public class Solution {

    private boolean[][] hasUsed;
    private int[][] next = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    private int rows;
    private int cols;

    public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        if (matrix == null || matrix.length == 0 || matrix.length != rows * cols) return false;
        char[][] arr = new char[rows][cols];
        buildMatrix(matrix, arr, rows, cols);
        hasUsed = new boolean[rows][cols];
        this.rows = rows;
        this.cols = cols;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (backtracking(arr, str, 0, i, j)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean backtracking(char[][] arr, char[] str, int pathLen, int r, int c) {
        if (pathLen == str.length) return true;
        if (r < 0 || r >= rows || c < 0 || c >= cols || hasUsed[r][c] || str[pathLen] != arr[r][c]) return false;
        hasUsed[r][c] = true;
        for (int[] route : next) {
            if (backtracking(arr, str, pathLen + 1, r + route[0], c + route[1])) {
                return true;
            }
        }
        hasUsed[r][c] = false;
        return false;
    }

    private void buildMatrix(char[] matrix, char[][] arr, int rows, int cols) {
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = matrix[index++];
            }
        }
    }

}
