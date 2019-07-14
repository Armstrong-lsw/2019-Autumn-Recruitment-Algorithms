/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/7/14
 * Time: 11:39
 * Description:
 */

class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}

public class Solution {

    public RandomListNode Clone(RandomListNode pHead) {
        if (pHead == null) return null;
        RandomListNode cur = pHead;
        while (cur != null) {
            RandomListNode next = new RandomListNode(cur.label);
            next.next = cur.next;
            cur.next = next;
            cur = next.next;
        }
        cur = pHead;
        while (cur != null) {
            RandomListNode next = cur.next;
            if (cur.random != null) next.random = cur.random.next;
            cur = next.next;
        }
        RandomListNode source = pHead,tmp = pHead.next,res = pHead.next;
        while (source != null) {
            source.next = tmp.next;
            if (source.next != null) tmp.next = source.next.next;
            source = source.next;
            tmp = tmp.next;
        }
        return res;
    }

}
