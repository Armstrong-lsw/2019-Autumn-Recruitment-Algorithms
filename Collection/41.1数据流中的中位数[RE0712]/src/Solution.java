import java.util.PriorityQueue;

/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/7/12
 * Time: 13:46
 * Description:
 * 解题思路：cnt表示当前添加的元素是第几个元素，如果是奇数，则往 left 里面添加right里面最小的元素，left为最大堆
 * 偶数的时候往 right 里面添加left里面最大的元素，right为最小堆
 * 模型：........left.peek(),right.peek()..............
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.Insert(1);
        solution.Insert(2);
        solution.Insert(3);
        solution.Insert(4);
        solution.Insert(5);
        solution.Insert(6);
        solution.Insert(7);
        solution.Insert(8);
        System.out.println(solution.GetMedian());
    }

    private PriorityQueue<Integer> left = new PriorityQueue<>((o1, o2) -> o2 - o1);
    private PriorityQueue<Integer> right = new PriorityQueue<>();
    private int cnt = 1;

    public void Insert(Integer num) {
        if (cnt % 2 == 1) {
            right.add(num);
            left.add(right.poll());
        } else {
            left.add(num);
            right.add(left.poll());
        }
        cnt++;
    }

    public Double GetMedian() {
        if ((cnt - 1) % 2 != 0) return left.peek() / 1.0;
        else return (left.peek() + right.peek()) / 2.0;
    }


}
