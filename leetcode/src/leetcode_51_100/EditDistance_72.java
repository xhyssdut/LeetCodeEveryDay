package leetcode_51_100;

/**
 * leetcode_51_100
 *
 * @author xin
 * @date 2019-03-21
 */
public class EditDistance_72 {
    class Solution {
        public int minDistance(String word1, String word2) {
            int[][] dp = new int[word2.length()+1][word1.length()+1];
            for(int i =0;i<word2.length()+1;i++){
                dp[i][0] = i;
            }
            for(int j =0;j<word1.length()+1;j++){
                dp[0][j]= j;
            }
            for(int i = 1;i<word2.length()+1;i++){
                for(int j=1;j<word1.length()+1;j++){
                    int max = Integer.MAX_VALUE;
                    if(word1.charAt(j-1)==word2.charAt(i-1)){
                        max = Math.min(max,dp[i-1][j-1]);
                    }
                    max = Math.min(max,dp[i-1][j]+1);
                    max = Math.min(max,dp[i][j-1]+1);
                    max = Math.min(max,dp[i-1][j-1]+1);
                    dp[i][j] = max;

                }
            }
            return dp[word2.length()][word1.length()];
        }
    }
    public static void main(String[] args) {
        Solution solution = new EditDistance_72().new Solution();
        solution.minDistance("horse","ros");
    }
}
