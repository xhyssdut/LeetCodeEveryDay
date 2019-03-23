package leetcode_251_300;

/**
 * leetcode_251_300
 *
 * @author xin
 * @date 2019-03-20
 */
public class LongestIncreasingSubsequence_300 {
    class Solution {
        public int lengthOfLIS(int[] nums) {
            int dp[] = new int[nums.length];
            if(nums==null||nums.length==0){
                return 0;
            }
            dp[0] = 1;
            for(int i =1;i<nums.length;i++){
                dp[i] =1;
                for(int j = i-1;j>=0;j--){
                    if(nums[i]<=nums[j]){
                    }else {
                        dp[i] = Math.max(dp[j]+1,dp[i]);
                    }
                }
            }
            int result =dp[0];
            for(int i =1;i<dp.length;i++){
                result = Math.max(result,dp[i]);
            }
            return result;
        }
    }

    class Solution1{
        public int lengthOfLIS(int[] nums) {
            int[] tails = new int[nums.length];
            int size = 0;
            for (int x : nums) {
                int i = 0, j = size;
                while (i != j) {
                    int m = (i + j) / 2;
                    if (tails[m] < x)
                        i = m + 1;
                    else
                        j = m;
                }
                tails[i] = x;
                if (i == size) ++size;
            }
            return size;
        }
    }

    public static void main(String[] args) {
        Solution1 solution = new LongestIncreasingSubsequence_300().new Solution1();
        System.out.println(solution.lengthOfLIS(new int[]{1,3,6,7,9,4,10,5,6}));
    }

}
