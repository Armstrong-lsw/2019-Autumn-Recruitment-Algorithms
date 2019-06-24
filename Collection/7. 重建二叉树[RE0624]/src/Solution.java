import java.util.HashMap;

/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/6/24
 * Time: 18:56
 * Description:
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Solution {

    private HashMap<Integer, Integer> inOrderMap = new HashMap<>();

    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        for (int i = 0; i < in.length; i++) {
            inOrderMap.put(in[i], i);
        }
        return reConstructBinaryTree(pre, 0, pre.length - 1, 0);

    }

    private TreeNode reConstructBinaryTree(int[] pre, int preL, int preR, int inL) {
        if (preL > preR) {
            return null;
        }

        TreeNode root = new TreeNode(pre[preL]);
        Integer index = inOrderMap.get(pre[preL]);
        int length = index - inL;
        root.left = reConstructBinaryTree(pre, preL + 1, preL + length, inL);
        root.right = reConstructBinaryTree(pre, preL + length + 1, preR, index + 1);

        return root;

    }

}
