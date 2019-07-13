/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/7/13
 * Time: 23:38
 * Description:
 */
public class Solution {
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        if(numbers == null || numbers.length == 0) return false;
        for (int i = 0; i < length; i++) {
            while(numbers[i] != i) {
                if(numbers[i] == numbers[numbers[i]]) {
                    duplication[0] = numbers[i];
                    return true;
                }
                swap(numbers,i,numbers[i]);
            }
        }
        return false;
    }

    private void swap(int[] nums,int i,int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
