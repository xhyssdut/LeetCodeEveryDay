package leetcode_301_350;

/**
 * leetcode_301_350
 *
 * @author xin
 * @date 2019-03-21
 */
public class CoinChange_322 {
    class Solution {
        public int coinChange(int[] coins, int amount) {
            int[][] dp = new int[coins.length][amount+1];
            for(int j = 0;j<amount+1;j++){
                if(j%coins[0]==0){
                    dp[0][j] = j/coins[0];
                }else {
                    dp[0][j] = Integer.MAX_VALUE;
                }
            }
            for(int i = 0;i<coins.length;i++){
                dp[i][0] = 0;
            }
            for(int i = 1;i<coins.length;i++){
                for(int j=1;j<amount+1;j++){
                    if(j-coins[i]<0){
                        dp[i][j] = dp[i-1][j];
                    }else {
                        dp[i][j] = Math.min(dp[i-1][j],dp[i][j-coins[i]]== Integer.MAX_VALUE?Integer.MAX_VALUE:dp[i][j-coins[i]]+1);
                    }
                }
            }
            return dp[coins.length-1][amount] == Integer.MAX_VALUE?-1:dp[coins.length-1][amount];
        }
    }

}
