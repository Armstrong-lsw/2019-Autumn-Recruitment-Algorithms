/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/6/17
 * Time: 17:56
 * Description:
 * 给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null
 *
 * PS:此种解答默认除了开始节点为 null 以及仅有一个节点的情况返回为 null 以外，其他的情况均成环
 */
public class Solution {


    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if (pHead == null || pHead.next == null) {
            return null;
        }
        ListNode fast = pHead;
        ListNode slow = pHead;
        do {
            fast = fast.next.next;
            slow = slow.next;
        } while (fast != slow);
        fast = pHead;
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }

}
