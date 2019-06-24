import java.util.ArrayList;

/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/6/24
 * Time: 18:49
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

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {

        ArrayList<Integer> list = new ArrayList<>();
        if (listNode == null) {
            return list;
        }

        ListNode next = listNode.next;
        list.addAll(printListFromTailToHead(next));
        list.add(listNode.val);
        return list;

    }

}
