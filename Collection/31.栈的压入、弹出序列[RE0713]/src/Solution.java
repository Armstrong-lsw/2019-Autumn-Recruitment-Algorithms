import java.util.Stack;

/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/7/13
 * Time: 20:39
 * Description:
 */
public class Solution {

    public boolean IsPopOrder(int [] pushA,int [] popA) {

        if (pushA == null || popA == null || pushA.length != popA.length) return false;

        Stack<Integer> stack = new Stack<>();
        for (int pushIndex = 0, popIndex = 0; pushIndex < pushA.length; pushIndex++) {
            stack.push(pushA[pushIndex]);
            while (popIndex < popA.length && !stack.isEmpty() && stack.peek() == popA[popIndex]) {
                stack.pop();
                popIndex++;
            }
        }

        return stack.isEmpty();

    }

}
