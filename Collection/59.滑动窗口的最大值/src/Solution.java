import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/7/7
 * Time: 21:33
 * Description:
 * 给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。
 * 例如，如果输入数组 {2, 3, 4, 2, 6, 2, 5, 1} 及滑动窗口的大小 3，
 * 那么一共存在 6 个滑动窗口，他们的最大值分别为 {4, 4, 6, 6, 6, 5}。
 */
public class Solution {
    public ArrayList<Integer> maxInWindows(int [] num, int size) {
        ArrayList<Integer> res = new ArrayList<>();
        if (num == null || num.length == 0 || size > num.length || size == 0) return res;
        PriorityQueue<Integer> queue = new PriorityQueue<>(((o1, o2) -> o2 - o1));
        for (int i = 0; i < size; i++) {
            queue.add(num[i]);
        }
        res.add(queue.peek());
        for (int i = 0, j = size; j < num.length; i++, j++) {
            queue.remove(num[i]);
            queue.add(num[j]);
            res.add(queue.peek());
        }
        return res;
    }
}
