import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/6/19
 * Time: 22:31
 * Description:
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印
 *
 * 解题思路：即利用队列进行层序遍历
 * 注意：LinkedList 的入队、出队的函数是 add(E e)，poll()，不是push(E e),pop()!!!!!!!!!!!
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

    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            res.add(node.val);
            if (node.left != null)
                queue.add(node.left);
            if (node.right != null)
                queue.add(node.right);
        }
        return res;
    }
}
