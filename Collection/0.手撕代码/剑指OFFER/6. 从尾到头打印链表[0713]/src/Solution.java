/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/7/14
 * Time: 0:20
 * Description:
 */
import java.util.ArrayList;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class Solution {

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if(listNode == null) return new ArrayList<Integer>();
        ArrayList list = printListFromTailToHead(listNode.next);
        list.add(listNode.val);
        return list;
    }
}
