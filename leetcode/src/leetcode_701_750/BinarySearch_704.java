package leetcode_701_750;

/**
 * leetcode_701_750
 *
 * @author xin
 * @date 2019-03-27
 */
public class BinarySearch_704 {
    class Solution {
        public int search(int[] nums, int target) {
            if(nums == null){
                return -1;
            }
            int low = 0;
            int high = nums.length-1;
            while(low<=high){
                int mid = low+(high-low)/2;
                if(nums[mid]>target){
                    low = mid+1;
                }else if(nums[mid]<target){
                    high = mid-1;
                }else {
                    return mid;
                }
            }
            return -1;
        }
    }
}
