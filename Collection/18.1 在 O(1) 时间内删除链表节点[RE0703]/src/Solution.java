/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/7/3
 * Time: 18:08
 * Description:
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
        if (head == null || tobeDelete == null || head == tobeDelete) {
            return null;
        }
        if (tobeDelete.next != null) {
            tobeDelete.val = tobeDelete.next.val;
            tobeDelete.next = tobeDelete.next.next;
        } else {
            ListNode p = head;
            while (p.next != tobeDelete)
                p = p.next;
            p.next = null;
        }
        return head;
    }

}
