/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/6/17
 * Time: 22:23
 * Description:
 * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 */
public class Solution {

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if (root1 == null || root2 == null )return false;
        return HasSubtreeHandler(root1,root2)
                || HasSubtree(root1.left,root2)
                || HasSubtree(root1.right,root2);
    }

    private boolean HasSubtreeHandler(TreeNode root1,TreeNode root2) {
        if (root2 == null) return true;
        if (root1 == null) return false;
        if (root1.val != root2.val) return false;
        return HasSubtreeHandler(root1.left,root2.left) && HasSubtreeHandler(root1.right,root2.right);
    }
}
