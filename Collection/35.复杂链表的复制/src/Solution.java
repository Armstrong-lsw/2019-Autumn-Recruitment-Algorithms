/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/6/21
 * Time: 21:03
 * Description:
 */
public class Solution {

    public static void main(String[] args) {
        RandomListNode node1 = new RandomListNode(1);
        RandomListNode node2 = new RandomListNode(2);
        RandomListNode node3 = new RandomListNode(3);

        node1.next = node2;
        node2.next = node3;
        node1.random = node3;
        node2.random = node1;
        node3.random = node1;

        RandomListNode res = new Solution().Clone(node1);
        System.out.println("test");
    }

    public static class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }
    }

    public RandomListNode Clone(RandomListNode pHead) {

        if (pHead == null) {
            return null;
        }

        RandomListNode p = pHead;
        while (p != null) {
            RandomListNode node = new RandomListNode(p.label);
            node.next = p.next;
            p.next = node;
            p = node.next;
        }

        RandomListNode front = pHead;
        while (front != null) {
            RandomListNode back = front.next;
            if (front.random != null) {
                back.random = front.random.next;
            }
            front = back.next;
        }

        RandomListNode cur = pHead;
        RandomListNode res = cur.next;
        while (cur.next != null) {
            RandomListNode node = cur.next;
            cur.next = node.next;
            cur = node;
        }

        return res;

    }

}
