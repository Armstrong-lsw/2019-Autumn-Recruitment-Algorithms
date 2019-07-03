/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/6/7
 * Time: 12:14
 * Description:删除列表中重复节点
 *
 * 解题思路：利用递归，首先判断传入的节点是否为 null 或者其下一个节点为 null，如果是的话直接返回该节点，
 * 如果不是，则判断该节点与其下一个节点的值是否相等.
 * 如果相等，继续向后遍历，直至获得第一个与其值不相等的节点，并继续调用函数删除重复节点并返回，
 * 如果不相等，继续删除与传入节点下一个节点的值相等的节点
 */
public class Solution {

    private class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

//    {1,2,3,3,4,4,5}
    public ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null || pHead.next == null) {
            return pHead;
        }
        if (pHead.val == pHead.next.val) {
            ListNode next = pHead.next;
            while (next != null && pHead.val == next.val) {
                next = next.next;
            }
            return deleteDuplication(next);
//            return next;
        } else {
            pHead.next = deleteDuplication(pHead.next);
            return pHead;
        }
    }
}
