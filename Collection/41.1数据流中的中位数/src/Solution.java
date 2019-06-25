/**
 * 如何得到一个数据流中的中位数？
 * 如果从数据流中读出奇数个数值，那么中位数就是所有数值排序之后位于中间的数值。
 * 如果从数据流中读出偶数个数值，那么中位数就是所有数值排序之后中间两个数的平均值。
 */

import java.util.PriorityQueue;

public class Solution {

    private PriorityQueue<Integer> left = new PriorityQueue<>(((o1, o2) -> o2 - o1));
    private PriorityQueue<Integer> right = new PriorityQueue<>();
    private int cnt = 0;

    public void Insert(Integer num) {
        if (cnt % 2 == 0) {
            right.add(num);
            left.add(right.poll());
        } else {
            left.add(num);
            right.add(left.poll());
        }
        cnt++;
    }

    public Double GetMedian() {
        if (cnt % 2 == 0) {
            return (left.peek() + right.peek()) / 2.0;
        } else {
            return left.peek() / 1.0;
        }
    }


}
