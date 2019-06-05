/**
 * Create with 9. 用两个栈实现队列
 * User: 许清远
 * Date: 2019/6/5
 * Time: 12:52
 * Description:用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 */
import java.util.Stack;

public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() throws Exception {

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        if (stack2.isEmpty()) {
            throw new Exception("queue is empty");
        }

        return stack2.pop();

    }
}
