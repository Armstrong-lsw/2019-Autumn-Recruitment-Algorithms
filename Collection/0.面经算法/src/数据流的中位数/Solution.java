package 数据流的中位数;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/7/12
 * Time: 14:19
 * Description:
 */
public class Solution {

    private int cnt = 0;
    private PriorityQueue<Integer> left = new PriorityQueue<>((o1, o2) -> o2 - o1);
    private PriorityQueue<Integer> right = new PriorityQueue<>();

    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("-------------------------------------");
            System.out.print("请输入下一个数：");
            int num = scanner.nextInt();
            solution.insert(num);
            solution.midNum();
        }

    }

    public void insert(int num) {
        if (cnt % 2 == 0) {
            right.add(num);
            left.add(right.poll());
        } else {
            left.add(num);
            right.add(left.poll());
        }
        cnt++;
        System.out.println(String.format("添加元素：%d", num));
    }

    public void midNum() {
        double num;
        if (cnt % 2 == 1) num = left.peek() / 1.0;
        else num = (left.peek() + right.peek()) / 2.0;
        System.out.println(String.format("当前中位数：%f", num));
        System.out.println("-------------------------------------------");
    }

}
