package leetcode_151_200;

/**
 * leetcode_151_200
 *
 * @author xin
 * @date 2019-03-27
 */
public class FindMinimumInRotatedSortedArray_153 {
    class Solution {
        public int findMin(int[] nums) {
            if(nums==null||nums.length==0){
                return -1;
            }
            if(nums.length == 1){
                return nums[0];
            }
            int low = 0,high = nums.length-1;
            while(low<high){
                int mid = low+(high-low)/2;
                if(nums[mid]>nums[mid+1]){
                    return nums[mid+1];
                }else {
                    low = mid;
                }
            }
            return -1;
        }
    }
}
