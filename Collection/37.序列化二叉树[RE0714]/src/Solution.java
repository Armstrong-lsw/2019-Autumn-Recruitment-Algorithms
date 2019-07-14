/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/7/14
 * Time: 12:18
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

    private String serializeStr;

    String Serialize(TreeNode root) {
        if (root == null) return "#";
        return root.val + " " + Serialize(root.left) + " " + Serialize(root.right);
    }

    TreeNode Deserialize(String str) {
        serializeStr = str;
        return Deserialize();
    }

    TreeNode Deserialize() {
        if (serializeStr.length() == 0) return null;
        int index = serializeStr.indexOf(" ");
        String node = index == -1 ? serializeStr : serializeStr.substring(0, index);
        serializeStr = index == -1 ? "" : serializeStr.substring(index + 1);
        if (node.equals("#")) return null;
        int nodeVal = Integer.valueOf(node);
        TreeNode treeNode = new TreeNode(nodeVal);
        treeNode.left = Deserialize();
        treeNode.right = Deserialize();
        return treeNode;
    }
}
