import java.util.List;

/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/6/17
 * Time: 17:30
 * Description:
 * 输入一个链表，输出该链表中倒数第k个结点。
 */
public class Solution {

    class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }

    }

    public ListNode FindKthToTail(ListNode head,int k) {

        if (head == null) {
            return null;
        }

        ListNode p = new ListNode(-1);
        p.next = head;
        for (int i = 0; i < k; i++) {
            if (p.next != null) {
                p = p.next;
            } else {
                return null;
            }
        }
        ListNode res = head;
        while (p.next != null) {
            p = p.next;
            res = res.next;
        }
        return res;
    }

}
