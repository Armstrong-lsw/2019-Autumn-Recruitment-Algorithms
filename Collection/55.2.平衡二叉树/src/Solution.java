/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/7/6
 * Time: 19:54
 * Description: 输入一棵二叉树，判断该二叉树是否是平衡二叉树。
 */
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
public class Solution {

    private boolean isBalanced = true;

    public boolean IsBalanced_Solution(TreeNode root) {
        height(root);
        return isBalanced;
    }

    private int height(TreeNode node) {
        if (node == null || !isBalanced) {
            return 0;
        }
        int l = height(node.left);
        int r = height(node.right);
        if (Math.abs(l - r) > 1) isBalanced = false;
        return 1 + Math.max(l, r);
    }
}
