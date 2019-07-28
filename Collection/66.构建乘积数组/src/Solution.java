/**
 * @author 许清远
 * @date 2019/7/28
 */
public class Solution {
    public int[] multiply(int[] A) {

        int length;
        if (A == null || (length = A.length) == 0) {
            return null;
        }

        int[] res = new int[length];
        int product = 1;

        for (int i = 0; i < length; product *= A[i],i++) {
            res[i] = product;
        }

        product = 1;
        for (int i = length - 1; i >= 0 ; product *= A[i], i--) {
            res[i] *= product;
        }

        return res;

    }
}
