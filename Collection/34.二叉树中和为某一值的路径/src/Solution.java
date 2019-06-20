import java.util.ArrayList;
/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/6/20
 * Time: 12:32
 * Description:
 * 输入一颗二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 *
 * 下图的二叉树有两条和为 22 的路径：10, 5, 7 和 10, 12
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

    private ArrayList<ArrayList<Integer>> res = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        if (root == null) {
            return res;
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            FindPath(root,target,list);
            return res;
        }
    }

    private void FindPath(
            TreeNode root, int target, ArrayList<Integer> tempList) {
        if (root == null) {
            return;
        }
        target -= root.val;
        tempList.add(root.val);
        if (target == 0 && root.left == null && root.right == null) {
            res.add(new ArrayList<>(tempList));
        } else {
            FindPath(root.left, target, tempList);
            FindPath(root.right, target, tempList);
        }
        tempList.remove(tempList.size() - 1);
    }

}
