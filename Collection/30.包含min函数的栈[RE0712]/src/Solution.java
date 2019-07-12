/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/7/12
 * Time: 18:26
 * Description:
 */
import java.util.Stack;

public class Solution {

    private Stack<Integer> dataStack = new Stack<>();
    private Stack<Integer> miniStack = new Stack<>();

    public void push(int node) {
        dataStack.push(node);
        miniStack.push(miniStack.isEmpty() ? node : Math.min(miniStack.peek(), node));
    }

    public void pop() {
        dataStack.pop();
        miniStack.pop();
    }

    public int top() {
        return dataStack.peek();
    }

    public int min() {
        return miniStack.peek();
    }
}
