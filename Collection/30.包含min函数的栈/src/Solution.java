/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/6/18
 * Time: 21:38
 * Description:
 * 题目描述
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
 */
import java.util.Stack;

public class Solution {

    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> miniStack = new Stack<>();

    public void push(int node) {
        stack.push(node);
        miniStack.push(miniStack.isEmpty() ? node:Math.min(node, miniStack.peek()));
    }

    public void pop() {
        stack.pop();
        miniStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return miniStack.peek();
    }
}
