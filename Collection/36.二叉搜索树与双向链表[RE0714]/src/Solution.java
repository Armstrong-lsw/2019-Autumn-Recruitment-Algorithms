/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/7/14
 * Time: 11:59
 * Description:
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

    private TreeNode head;
    private TreeNode pre;

    public TreeNode Convert(TreeNode pRootOfTree) {
        inOrder(pRootOfTree);
        return head;
    }

    private void inOrder(TreeNode treeNode) {
        if (treeNode == null) return;
        inOrder(treeNode.left);
        if (pre != null) pre.right = treeNode;
        treeNode.left = pre;
        pre = treeNode;
        if (head == null) head = treeNode;
        inOrder(treeNode.right);
    }


}
