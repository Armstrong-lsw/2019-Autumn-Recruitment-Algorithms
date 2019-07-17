/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/7/17
 * Time: 18:43
 * Description:
 */

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class Solution {
    public ListNode ReverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode next = head.next;
        ListNode res =  ReverseList(next);
        next.next = head;
        head.next = null;
        return res;
    }
}
