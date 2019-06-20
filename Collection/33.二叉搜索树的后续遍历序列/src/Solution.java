/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/6/20
 * Time: 11:59
 * Description:
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。假设输入的数组的任意两个数字都互不相同。
 *
 * 例如，下图是后序遍历序列 1,3,2 所对应的二叉搜索树。
 */
public class Solution {

    public boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence == null || sequence.length == 0) {
            return false;
        }
        return verify(sequence, 0, sequence.length - 1);
    }

    private boolean verify(int[] sequence, int first, int last) {
        if (last <= first) {
            return true;
        }
        int root = sequence[last];
        int i = 0;
        while (sequence[i] < root) {
            i++;
        }
        int mid = i;
        for (; i < last; i++) {
            if (sequence[i] < root)
                return false;
        }
        return verify(sequence, first, mid - 1) && verify(sequence, mid, last - 1);
    }
}
