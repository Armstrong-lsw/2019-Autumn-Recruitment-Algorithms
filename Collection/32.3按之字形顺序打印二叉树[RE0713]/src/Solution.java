import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/7/13
 * Time: 20:57
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

    public static void main(String[] args) {
        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(6);
        root.right = new TreeNode(10);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(7);
        root.right.left = new TreeNode(9);
        root.right.right = new TreeNode(11);
        ArrayList<ArrayList<Integer>> res = new Solution().Print(root);
        System.out.println("test");
    }

    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        if (pRoot == null) return list;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(pRoot);
        boolean left = true;

        while (!queue.isEmpty()) {
            int size = queue.size();
            ArrayList<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                level.add(node.val);
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            if (!left) Collections.reverse(level);
            list.add(level);
            left = !left;
        }
        return list;
    }

}
