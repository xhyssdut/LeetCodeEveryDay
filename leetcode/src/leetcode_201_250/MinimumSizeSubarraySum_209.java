package leetcode_201_250;

/**
 * 给定一个含有 n 个正整数的数组和一个正整数 s ，
 * 找出该数组中满足其和 ≥ s 的长度最小的连续子数组。如果不存在符合条件的连续子数组，返回 0。
 *
 * @author xin
 * @date 2019-03-08
 */
public class MinimumSizeSubarraySum_209 {
    /**
     * 两个指针构造一个滑动窗口
     */
    class Solution {
        public int minSubArrayLen(int s, int[] nums) {
            if(nums==null||nums.length==0){
                return 0;
            }
            int slow = 0;
            int count = 0;
            int min  = Integer.MAX_VALUE;
            for(int fast = 0;fast<nums.length;fast++){
                count+=nums[fast];
                if(count>=s){
                    min = Math.min(min,fast-slow+1);
                    while(count>=s&&slow<fast){
                        count -= nums[slow++];
                        if(count>=s){
                            min = Math.min(min,fast-slow+1);
                        }
                    }
                }
            }
            return min == Integer.MAX_VALUE?0:min;
        }
    }

    public static void main(String[] args) {
        Solution solution = new MinimumSizeSubarraySum_209().new Solution();
        solution.minSubArrayLen(7,new int[]{2,3,1,2,4,3});
    }
}
