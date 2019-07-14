import java.util.HashMap;

/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/7/14
 * Time: 14:29
 * Description:
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Solution {

    private HashMap<Integer,Integer> inMap = new HashMap<>();

    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if (pre == null || in == null || in.length != pre.length) return null;
        for (int i = 0; i < in.length; i ++) inMap.put(in[i],i);
        return reConstructBinaryTree(pre,0,pre.length - 1,0);
    }

    private TreeNode reConstructBinaryTree(int [] pre, int preL, int preR, int inL) {
        if (preL > preR) return null;
        TreeNode root = new TreeNode(pre[preL]);
        int index =  inMap.get(root.val);
        root.left = reConstructBinaryTree(pre,preL + 1,preL + index - inL,inL);
        root.right = reConstructBinaryTree(pre,preL + index - inL + 1,preR,index+1);
        return root;
    }
}
