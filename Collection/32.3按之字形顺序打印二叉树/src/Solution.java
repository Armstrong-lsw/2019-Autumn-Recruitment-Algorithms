import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/6/19
 * Time: 22:52
 * Description:
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

    public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (pRoot == null) {
            return res;
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(pRoot);
        boolean leftFlag = true;
        while (!queue.isEmpty()) {
            int size = queue.size();
            ArrayList<Integer> list = new ArrayList<>();
            while (size-- > 0) {
                TreeNode node = queue.poll();
                list.add(node.val);
                if (leftFlag) {
                    if (node.left != null)
                        queue.add(node.left);
                    if (node.right != null)
                        queue.add(node.right);
                } else {
                    if (node.right != null)
                        queue.add(node.right);
                    if (node.left != null)
                        queue.add(node.left);
                }
            }
            Collections.reverse(list);
            res.add(list);
            leftFlag = !leftFlag;
        }
        return res;
    }
}
