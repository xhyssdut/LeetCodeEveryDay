package leetcode_551_600;

import java.util.Arrays;

/**
 * 给定长度为 2n 的数组, 你的任务是将这些数分成 n 对, 例如 (a1, b1), (a2, b2), ..., (an, bn) ，使得从1 到 n 的 min(ai, bi) 总和最大。
 * 示例 1:
 * 输入: [1,4,3,2]
 * 输出: 4
 * 解释: n 等于 2, 最大总和为 4 = min(1, 2) + min(3, 4).
 *
 *
 *
 * @author xin
 * @date 2019-03-07
 */
public class ArrayPartitionI_561 {
    /**
     * 先排序 然后两两配对
     */
    class Solution {
        public int arrayPairSum(int[] nums) {
            if(nums==null||nums.length==0){
                return 0;
            }
            Arrays.sort(nums);
            int count = 0;
            for(int i = 0;i<nums.length;i+=2){
                count += nums[i];
            }
            return count;
        }
    }
}
