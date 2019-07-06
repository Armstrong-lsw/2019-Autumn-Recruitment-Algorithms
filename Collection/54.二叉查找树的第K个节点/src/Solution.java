/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/7/6
 * Time: 19:40
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

    private int cnt = 0;
    private TreeNode res;

    TreeNode KthNode(TreeNode pRoot, int k) {
        inOrder(pRoot, k);
        return res;
    }

    private void inOrder(TreeNode node, int k) {
        if (node == null || cnt >= k) {
            return;
        }
        inOrder(node.left, k);
        cnt++;
        if (cnt == k) res = node;
        inOrder(node.right, k);
    }

}
