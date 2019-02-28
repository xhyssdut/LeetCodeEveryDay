package leetcode_0_50;

/**
 * leetcode 二分法
 *
 * @author xin
 * @date 2019-01-14
 */
public class SearchInsertPosition_35 {
    class Solution {
        public int searchInsert(int[] nums, int target) {
            int low = 0;
            int high = nums.length;
            int mid;
            while (low<high){
                mid = low+(high-low)/2;
                if(target == nums[mid]){
                    return mid;
                }else if(target<nums[mid]){
                    high = mid;
                }else {
                    low = mid+1;
                }
            }
            return low;
        }
    }

    public static void main(String[] args) {
        Solution solution = new SearchInsertPosition_35().new Solution();
        int [] a  = new int[]{1,3};
        solution.searchInsert(a, 2);
    }
}
