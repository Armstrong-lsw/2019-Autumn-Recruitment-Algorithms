package 打印二叉树的左边界;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/7/12
 * Time: 14:06
 * Description:打印二叉树的左边界
 * 层序遍历，输出每层的第一个
 */

class TreeNode {
    Integer val;
    TreeNode left;
    TreeNode right;

    TreeNode(Integer val) {
        this.val = val;
    }
}

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(1);
        TreeNode l21 = new TreeNode(2);
        root.left = l21;
        root.right = new TreeNode(21);
        solution.getLeft(root)
                .forEach(num -> System.out.print(num + " "));
    }

    public List<Integer> getLeft(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (i == 0) res.add(node.val);
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
        }
        return res;
    }

}
