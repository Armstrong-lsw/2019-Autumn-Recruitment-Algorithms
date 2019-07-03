/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/7/3
 * Time: 18:16
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

    public ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null || pHead.next == null) {
            return pHead;
        }
        if (pHead.val == pHead.next.val) {
            ListNode cur = pHead.next;
            //注意这里的判断条件
            while (cur != null
                    && cur.val == pHead.val) {
                cur = cur.next;
            }
            return deleteDuplication(cur);
        } else {
            pHead.next = deleteDuplication(pHead.next);
            return pHead;
        }
    }

}
