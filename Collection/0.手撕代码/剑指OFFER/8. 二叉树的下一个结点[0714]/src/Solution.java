/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/7/14
 * Time: 14:30
 * Description:
 */

class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}

public class Solution {
    public TreeLinkNode GetNext(TreeLinkNode pNode){
        if (pNode.right != null) {
            TreeLinkNode node = pNode.right;
            while (node.left != null) node = node.left;
            return node;
        } else {
            while (pNode.next != null) {
                TreeLinkNode p = pNode.next;
                if (p.left == pNode) return p;
                pNode = p;
            }
        }
        return null;
    }
}
