package leetcode_0_50;


/**
 * 双指针法-前后两个指针遍历 类似快排的partition步骤
 *
 * @author xin
 * @date 2019-01-08
 */
public class RemoveElement_27 {
    class Solution {
        public int removeElement(int[] nums, int val) {
            if(nums==null||nums.length==0){
                return 0;
            }
            int i = 0;
            int j = nums.length-1;
            while(i<=j){
                if(nums[i]!=val){
                    i++;
                    continue;
                }
                if(nums[j]==val){
                    j--;
                    continue;
                }
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
            return i;
        }
    }

    public int removeElement2(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

}
