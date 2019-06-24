/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/6/24
 * Time: 19:51
 * Description:
 * 给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。
 * 注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
 *
 * 解题思路：如果给定节点右子树不为null，则下一个节点就是右子树的左节点，若右子树的左节点为null，则右节点就是下一个节点；
 * 如果给定节点的右子树为null，则下一个节点一定在其上面，且为中间的节点，所以向上遍历，找到那个左节点为当前节点的节点
 */
public class Solution {

    class TreeLinkNode {
        int val;
        TreeLinkNode left = null;
        TreeLinkNode right = null;
        TreeLinkNode next = null;

        TreeLinkNode(int val) {
            this.val = val;
        }
    }

    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        TreeLinkNode right = pNode.right;
        if (right != null) {
            if (right.left == null) {
                return right;
            } else {
                return right.left;
            }
        } else {
            while (pNode.next != null) {
                if (pNode.next.left == pNode) {
                    return pNode.next;
                }
                pNode = pNode.next;
            }
            return null;
        }
    }

}
