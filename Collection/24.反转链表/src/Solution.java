/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/6/17
 * Time: 18:51
 * Description:
 * 输入一个链表，反转链表后，输出新链表的表头。
 */
public class Solution {

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode ReverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        return ReverseListRE(head);
    }

    private ListNode ReverseListRE(ListNode head) {

        if (head.next.next == null) {
            ListNode ret = head.next;
            head.next = null;
            ret.next = head;
            return ret;
        }

        ListNode next = head.next;
        ListNode newHead = ReverseListRE(head.next);
        next.next = head;
        head.next = null;
        return newHead;

    }

}
