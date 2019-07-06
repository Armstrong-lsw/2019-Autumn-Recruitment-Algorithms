/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/7/5
 * Time: 2:10
 * Description:
 * 在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。
 * 输入一个数组,求出这个数组中的逆序对的总数P。并将P对1000000007取模的结果输出。 即输出P%1000000007
 *
 * 输入描述:
 * 题目保证输入的数组中没有的相同的数字
 *
 * 数据范围：
 *
 * 	对于%50的数据,size<=10^4
 *
 * 	对于%75的数据,size<=10^5
 *
 * 	对于%100的数据,size<=2*10^5
 *
 * 示例1
 * 输入
 * 1,2,3,4,5,6,7,0
 * 输出
 * 7
 */
public class Solution {

    //注意 long 值
    private long cnt = 0;
    private int[] tmp;

    public int InversePairs(int [] array) {

        if (array == null || array.length == 1) {
            return 0;
        }
        tmp = new int[array.length];
        sort(array, 0, array.length - 1);
        return (int) (cnt % 1000000007);   //注意题目要求
    }

    private void sort(int[] arr, int l, int r) {
        if (l >= r) {
            return;
        }
        int mid = l + (r - l) / 2;
        sort(arr, l, mid);
        sort(arr,mid + 1, r);
        merge(arr, l, mid, r);
    }

    private void merge(int[] arr, int l, int mid, int r) {
        int i = l, j = mid + 1;
        for (int k = l; k <= r; k++) {
            if (i > mid) tmp[k] = arr[j++];
            else if (j > r) tmp[k] = arr[i++];
            else if (arr[i] < arr[j]) tmp[k] = arr[i++];
            else {
                tmp[k] = arr[j++];
                cnt += mid - i + 1;
            }
        }
        System.arraycopy(tmp, l, arr, l, r - l + 1);
    }
}
