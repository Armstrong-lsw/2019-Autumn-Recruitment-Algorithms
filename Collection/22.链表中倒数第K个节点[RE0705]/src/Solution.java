/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/7/5
 * Time: 11:22
 * Description:输入一个链表，输出该链表中倒数第k个结点
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

        if (head == null || k == 0) {
            return null;
        }

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