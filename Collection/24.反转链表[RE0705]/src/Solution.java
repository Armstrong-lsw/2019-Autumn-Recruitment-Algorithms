/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/7/5
 * Time: 11:52
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
        if (head == null || head.next == null) {
            return head;
        }
        return ReverseListRE(head);
    }

    private ListNode ReverseListRE(ListNode node) {
        if (node.next.next == null) {
            ListNode next = node.next;
            next.next = node;
            node.next = null;   //注意这句！很重要！！！
            return next;
        }
        ListNode next = node.next;
        ListNode res = ReverseListRE(next);
        next.next = node;
        node.next = null;   //注意这句！很重要！！！
        return res;
    }
}
