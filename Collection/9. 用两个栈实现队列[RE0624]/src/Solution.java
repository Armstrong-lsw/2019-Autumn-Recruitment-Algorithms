import java.util.Stack;

/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/6/24
 * Time: 20:31
 * Description:
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 */
public class Solution {

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (!stack2.isEmpty()) {
            return stack2.pop();
        }
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        if (!stack2.isEmpty()) {
            return stack2.pop();
        } else {
            throw new IllegalArgumentException("ERROR");
        }
    }

}
