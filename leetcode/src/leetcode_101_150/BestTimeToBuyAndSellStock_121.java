package leetcode_101_150;

/**
 * leetcode_101_150
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 * 如果你最多只允许完成一笔交易（即买入和卖出一支股票），设计一个算法来计算你所能获取的最大利润。
 * 注意你不能在买入股票前卖出股票。
 *
 * @author xin
 * @date 2019-03-01
 */
public class BestTimeToBuyAndSellStock_121 {
    class Solution {
        public int maxProfit(int[] prices) {
            int max = 0;
            int now = 0;
            for(int i=0;i<prices.length-1;i++){
                if(now>0){
                    now+= prices[i+1]-prices[i];
                }else {
                    now = prices[i+1]-prices[i];
                }
                max = Math.max(now,max);
            }
            return max;
        }
    }
}
