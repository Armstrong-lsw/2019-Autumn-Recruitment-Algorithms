/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/6/7
 * Time: 11:42
 * Description:在 O(1) 时间内删除链表节点
 *
 * 解题思路：首先判断要删除的节点是不是尾节点，如果不是，则把要删除的节点复制到被删除的节点上，即把下一个节点的 val 赋值给要删除的节点，
 * 且让要删除的节点指向下下个节点；如果被删除的节点是尾节点，则先判断它是否为头节点，如果是头节点则直接将其指向 null 即可，
 * 如果不是头结点，则需要从头遍历一遍链表，找到尾节点的前一个节点，并将其指向 null
 */
public class Solution {

   private class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode deleteNode(ListNode head, ListNode tobeDelete) {
        if (head == null || tobeDelete == null)
            return null;
        if (tobeDelete.next != null) {
            // 要删除的节点不是尾节点
            ListNode next = tobeDelete.next;
            tobeDelete.val = next.val;
            tobeDelete.next = next.next;
        } else {
            if (head == tobeDelete)
                // 只有一个节点
                head = null;
            else {
                ListNode cur = head;
                while (cur.next != tobeDelete)
                    cur = cur.next;
                cur.next = null;
            }
        }
        return head;
    }

}
