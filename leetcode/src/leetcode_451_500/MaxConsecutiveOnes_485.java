package leetcode_451_500;

/**
 * 给定一个二进制数组， 计算其中最大连续1的个数。
 *
 * @author xin
 * @date 2019-03-07
 */
public class MaxConsecutiveOnes_485 {
    /**
     * 双指针法。
     */
    class Solution {
        public int findMaxConsecutiveOnes(int[] nums) {
            if(nums==null||nums.length==0){
                return 0;
            }
            //停在最后一个不为0的位置
            int slow = -1;
            int count = 0;
            for(int fast =0;fast<nums.length;fast++){
                if(nums[fast]!=1){
                    slow = fast;
                }else {
                    count = Math.max(count,fast-slow);
                }
            }
            return count;
        }
    }
}
