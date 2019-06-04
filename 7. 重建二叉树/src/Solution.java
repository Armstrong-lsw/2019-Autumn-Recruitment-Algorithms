import java.util.HashMap;

/**
 * Create with 7. 重建二叉树
 * User: 许清远
 * Date: 2019/6/4
 * Time: 12:23
 * Description:
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 *
 * 解题思路：利用递归
 */


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Solution {

    private HashMap<Integer, Integer> indexMap = new HashMap<>();

    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {

        if (pre.length == 0 || in.length == 0) {
            return null;
        }

        for (int i = 0; i < in.length; i++) {
            indexMap.put(in[i], i);
        }

        return reConstructBinaryTree(pre, 0, pre.length - 1, 0);

    }

    /**
     *
     * @param pre 前序遍历数组
     * @param preL 前序遍历数组左边界值
     * @param preR 前序遍历数组右边界
     * @param inL 中序遍历左边界值
     * @return
     */
    private TreeNode reConstructBinaryTree(int[] pre, int preL, int preR, int inL) {

        if (preL > preR) {
            return null;
        }

        TreeNode root = new TreeNode(pre[preL]);
        Integer inIndex = indexMap.get(root.val);
        int length = inIndex - inL;


        root.left = reConstructBinaryTree(pre, preL + 1, preL + length, inL);
        root.right = reConstructBinaryTree(pre, preL + length + 1, preR, inIndex + 1);

        return root;

    }
}

