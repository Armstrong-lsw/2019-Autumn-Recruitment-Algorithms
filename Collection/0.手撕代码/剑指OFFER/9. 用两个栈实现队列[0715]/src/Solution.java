/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/7/15
 * Time: 11:56
 * Description:
 */
import java.util.Stack;

public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (!stack2.isEmpty()) return stack2.pop();
        while(!stack1.isEmpty()) stack2.push(stack1.pop());
        return stack2.pop();
    }
}
