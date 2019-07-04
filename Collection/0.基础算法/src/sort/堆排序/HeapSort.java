package sort.堆排序;

import sort.Sort;

/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/7/4
 * Time: 12:14
 * Description:
 */
public class HeapSort implements Sort {

    @Override
    public void sort(Integer[] nums) {
        for (int i = nums.length / 2 - 1; i >= 0; i--) {
            siftDown(nums, i, nums.length);
        }
        int size = nums.length;
        while (size > 0) {
            swap(nums, size - 1, 0);
            size--;
            siftDown(nums, 0, size);
        }
    }

    private void siftDown(Comparable[] data,int index,int size) {
        while (getLeftChild(index) < size) {
            int j = getLeftChild(index);
            if (j + 1 < size
                    && data[j + 1].compareTo(data[j]) > 0)
                j++;
            if (data[index].compareTo(data[j]) >= 0)
                break;
            swap(data,index, j);
            index = j;
        }
    }

    private int getLeftChild(int index) {
        return 2 * index + 1;
    }

    private int getRightChild(int index) {
        return 2 * index + 2;
    }

    private void swap(Comparable[] data,int i, int j) {
        Comparable temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }


}
