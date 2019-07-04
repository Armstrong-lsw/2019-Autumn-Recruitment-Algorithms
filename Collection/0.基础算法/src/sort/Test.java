package sort;

import 冒泡排序.BubbleSort;
import 堆排序.HeapSort;
import 希尔排序.ShellSort;
import 归并排序.MergeSort;
import 快速排序.QuickSort;
import 插入排序.InsertionSort;
import 选择排序.SelectionSort;

/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/7/3
 * Time: 20:49
 * Description:
 */
public class Test {

    public static void main(String[] args) {
//        SortTestHelper.isFinish(new SelectionSort());
//        SortTestHelper.isFinish(new BubbleSort());
//        SortTestHelper.isFinish(new InsertionSort());
//        SortTestHelper.isFinish(new MergeSort());
//        SortTestHelper.isFinish(new HeapSort());
        SortTestHelper.isFinish(new QuickSort());
    }


}
