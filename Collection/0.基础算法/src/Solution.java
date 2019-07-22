/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/7/22
 * Time: 16:36
 * Description:
 */
import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) {
        new Solution().GetLeastNumbers_Solution(new int[]{1,2,3,6,3,7,1,76,223,55,4},4);
        System.out.println(res);
    }

    private static ArrayList<Integer> res = new ArrayList<>();

    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        if (input == null || input.length == 0 || input.length < k) return res;
        findKthSmallestNum(input,k-1);
        return res;
    }

    private void findKthSmallestNum(int[] nums,int k) {
        int l = 0,r = nums.length - 1;
        for(;;) {
            int index = partition(nums,l,r);
            if (index == k) {
                for (int i = 0; i <= k; i++) res.add(nums[i]);
                break;
            } else if (index < k) {
                l = index + 1;
            } else {
                r = index - 1;
            }
        }
    }

    private int partition(int[]nums,int l,int r) {
        int v = nums[l];
        int i = l,j = r + 1;
        for(;;) {
            while (i != r && nums[++i] < v);
            while (j != l && nums[--j] > v);
            if (i >= j) break;
            swap(nums,i,j);
        }
        swap(nums,l,j);
        return j;
    }

    private void swap(int[] nums,int i,int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

}
