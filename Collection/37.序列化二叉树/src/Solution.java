/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/6/21
 * Time: 22:01
 * Description:
 * 请实现两个函数，分别用来序列化和反序列化二叉树。
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

    private String treeStr;

    String Serialize(TreeNode root) {
        if (root == null) {
            return "#";
        }
        return root.val + "," + Serialize(root.left) + "," + Serialize(root.right);
    }

    TreeNode Deserialize(String str) {
        if (str.length() == 0) {
            return null;
        }
        int index = str.indexOf(",");
        String nodeStr = index == -1 ? str : str.substring(0, index);
        treeStr = index == -1 ? "" : str.substring(index + 1);
        if (nodeStr.equals("#")) {
            return null;
        }
        TreeNode node = new TreeNode(Integer.valueOf(nodeStr));
        node.left = Deserialize(treeStr);
        node.right = Deserialize(treeStr);
        return node;
    }
}
