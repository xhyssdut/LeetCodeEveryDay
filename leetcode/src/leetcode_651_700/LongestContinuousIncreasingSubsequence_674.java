package leetcode_651_700;

/**
 * leetcode_651_700
 *
 * @author xin
 * @date 2019-03-20
 */
public class LongestContinuousIncreasingSubsequence_674 {
    class Solution {
        public int findLengthOfLCIS(int[] nums) {
            if(nums==null||nums.length==0){
                return 0;
            }
            int count =1;
            int result = 0;
            for(int i=1;i<nums.length;i++){
                if(nums[i]>nums[i-1]){
                    count++;
                }else {
                    count = 1;
                }
                result = Math.max(count,result);
            }
            return Math.max(count,result);
        }
    }
}
