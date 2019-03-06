package leetcode_451_500;

/**
 * 给定一个非负整数数组，a1, a2, ..., an, 和一个目标数，S。现在你有两个符号 + 和 -。对于数组中的任意一个整数，你都可以从 + 或 -中选择一个符号添加在前面。
 * 返回可以使最终数组和为目标数 S 的所有添加符号的方法数。
 *
 * @author xin
 * @date 2019-03-05
 */
public class TargetSum_494 {
    class Solution {
        public int findTargetSumWays(int[] nums, int S) {
            int data = 0;
            return find(nums,0,data,S);

        }
        public int find(int[]nums,int now,int sum,int S){
            int count = 0;
            if(now == nums.length-1){
                if(sum+nums[now]==S){
                    count++;
                }
                if(sum-nums[now]==S){
                    count++;
                }
                return count;
            }
            return find(nums,now+1,sum+nums[now],S)+find(nums,now+1,sum-nums[now],S);
        }
    }

    public static void main(String[] args) {
        Solution solution = new TargetSum_494().new Solution();
        solution.findTargetSumWays(new int[]{1,1,1,1,1},3);
    }
}
