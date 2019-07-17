/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/7/17
 * Time: 18:42
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
    public ListNode FindKthToTail(ListNode head,int k) {

        if (head == null || k <= 0) return null;

        ListNode front = head;
        for (int i = 1; i < k; i++) {
            if (front.next == null) return null;
            front = front.next;
        }

        ListNode tail = head;
        while (front.next != null) {
            front = front.next;
            tail = tail.next;
        }

        return tail;

    }
}
