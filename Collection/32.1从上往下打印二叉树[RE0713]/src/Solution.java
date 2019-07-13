import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/7/13
 * Time: 20:47
 * Description:从上往下打印出二叉树的每个节点，同层节点从左至右打印。
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
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) return list;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            list.add(node.val);
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }
        return list;
    }
}
