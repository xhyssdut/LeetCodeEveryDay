package leetcode_0_50;

/**
 * leetcode_0_50
 *
 * @author xin
 * @date 2019-03-27
 */
public class SearchInRotatedSortedArray_33 {
    class Solution {
        public int search(int[] nums, int target) {
            if(nums == null){
                return -1;
            }else if(nums.length == 1 && nums[0] == target){
                return 0;
            }
            int trueMid = nums.length-1;
            //先二分找最大值
            int low = 0,high = nums.length-1;
            while(low<high){
                int mid = low+(high-low)/2;
                if(nums[mid]>nums[mid+1]){
                    trueMid = mid;
                    break;
                }else if(nums[mid]>nums[0]){
                    high = mid-1;
                }else {
                    low = mid+1;
                }
            }
            if(target<nums[nums.length-1]){
                low = trueMid +1;
                high = nums.length-1;
            }else {
                low = 0;
                high = trueMid;
            }
            while(low<=high){
                int mid = low+(high-low)/2;
                if(nums[mid]>target){
                    high = mid-1;
                }else if(nums[mid]<target){
                    low = mid+1;
                }else {
                    return mid;
                }
            }
            return -1;

        }

    }
    public static void main(String[] args) {
        Solution solution = new SearchInRotatedSortedArray_33().new Solution();
        solution.search(new int[]{1,3},0);
    }
}
