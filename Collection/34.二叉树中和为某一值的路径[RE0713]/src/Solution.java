import java.util.ArrayList;

/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/7/13
 * Time: 23:17
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

    private ArrayList<ArrayList<Integer>> res = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) return res;
        FindPath(root, target, list);
        return res;
    }

    private void FindPath(TreeNode node, int target, ArrayList<Integer> list) {

        list.add(node.val);
        if (node.left == null && node.right == null) {
            if (node.val == target) res.add(list);
            return;
        }

        target -= node.val;

        if (node.left != null) FindPath(node.left, target, new ArrayList<>(list));
        if (node.right != null) FindPath(node.right, target, new ArrayList<>(list));

    }
}