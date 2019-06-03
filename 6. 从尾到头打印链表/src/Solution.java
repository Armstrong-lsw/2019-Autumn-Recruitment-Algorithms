import java.util.ArrayList;

/**
 * Create with 6. 从尾到头打印链表
 * User: 许清远
 * Date: 2019/6/3
 * Time: 18:38
 * Description:
 * 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
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

        if (listNode == null) {
            return new ArrayList<>();
        }

        if (listNode.next == null) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(listNode.val);
            return list;
        }

        ArrayList<Integer> list = printListFromTailToHead(listNode.next);
        list.add(listNode.val);

        return list;

    }

    //--------------------------------------官方解答------------------------------------------------

    //使用递归
//    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
//        ArrayList<Integer> ret = new ArrayList<>();
//        if (listNode != null) {
//            ret.addAll(printListFromTailToHead(listNode.next));
//            ret.add(listNode.val);
//        }
//        return ret;
//    }

    //使用头插法
//    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
//        // 头插法构建逆序链表
//        ListNode head = new ListNode(-1);
//        while (listNode != null) {
//            ListNode memo = listNode.next;
//            listNode.next = head.next;
//            head.next = listNode;
//            listNode = memo;
//        }
//        // 构建 ArrayList
//        ArrayList<Integer> ret = new ArrayList<>();
//        head = head.next;
//        while (head != null) {
//            ret.add(head.val);
//            head = head.next;
//        }
//        return ret;
//    }

    //使用栈
//    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
//        Stack<Integer> stack = new Stack<>();
//        while (listNode != null) {
//            stack.add(listNode.val);
//            listNode = listNode.next;
//        }
//        ArrayList<Integer> ret = new ArrayList<>();
//        while (!stack.isEmpty())
//            ret.add(stack.pop());
//        return ret;
//    }



}
