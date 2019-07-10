package normal;

/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/7/10
 * Time: 18:52
 * Description:
 */
public class BinarySearch {

    public int search(int[] arr, int k) {
        int l = 0,h = arr.length - 1,mid;
        while (l <= h) {
            mid = l + (h - l) / 2;
            if (arr[mid] == k) return mid + 1;
            else if (arr[mid] < k) l = mid + 1;
            else h = mid - 1;
        }
        return -1;
    }

}
