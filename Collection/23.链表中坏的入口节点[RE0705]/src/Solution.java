/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/7/5
 * Time: 11:42
 * Description:给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。
 */
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Solution {

    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if (pHead == null) {
            return null;
        }
        ListNode fast = pHead;
        ListNode slow = pHead;
        do {
            if (fast == null) return null;
            fast = fast.next;
            if (fast == null) return null;
            fast = fast.next;
            slow = slow.next;
        } while (fast != slow);
        slow = pHead;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
    }

}
