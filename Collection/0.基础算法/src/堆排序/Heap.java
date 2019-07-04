package 堆排序;

import java.lang.reflect.Array;

/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/7/4
 * Time: 12:15
 * Description:
 */
public class Heap<E extends Comparable<E>> {

    private E[] data;

    public Heap(E[] data) {
        this.data = data;
        for (int i = getParent(data.length-1); i >= 0 ; i--) {
            siftDown(i);
        }
    }

    private int getParent(int index) {
        if (index <= 0) {
            throw new IllegalArgumentException("Index is Illegal");
        }
        return (index - 1) / 2;
    }

    private int getLeftChild(int index) {
        return 2 * index + 1;
    }

    private int getRightChild(int index) {
        return 2 * index + 2;
    }

    private void siftDown(int index) {
        while (getLeftChild(index) < data.length) {
            int j = getLeftChild(index);
            if (j + 1 < data.length
                    && data[j + 1].compareTo(data[j]) < 0)
                j++;
            if (data[index].compareTo(data[j]) <= 0)
                break;
            swap(index, j);
            index = j;
        }
    }

    private void siftUp(int index) {

    }

    private void swap(int i, int j) {
        Comparable temp = data[i];
        data[i] = data[j];
        data[j] = (E) temp;
    }



}
