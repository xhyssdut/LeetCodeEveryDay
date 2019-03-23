package leetcode_701_750;

/**
 * 在一个给定的数组nums中，总是存在一个最大元素 。
 * 查找数组中的最大元素是否至少是数组中每个其他数字的两倍。
 * 如果是，则返回最大元素的索引，否则返回-1。
 *
 * @author xin
 * @date 2019-03-07
 */
public class LargestNumberAtLeastTwiceOfOthers_747 {
    /**
     * 一次遍历，记录最大的两个值，只要最大的是第二大的两倍以上，就成功，否则失败
     */
    class Solution {
        public int dominantIndex(int[] nums) {
            if (nums == null || nums.length == 0) {
                return -1;
            }
            if (nums.length == 1) {
                return 0;
            }
            int max = -1;
            int second = -1;
            if (nums[0] > nums[1]) {
                max = 0;
                second = 1;
            } else {
                max = 1;
                second = 0;
            }
            for (int i = 2; i < nums.length; i++) {
                if (nums[i] > nums[max]) {
                    second = max;
                    max = i;
                } else if (nums[i] > nums[second]) {
                    second = i;
                }
            }
            if (nums[max] >= nums[second] * 2) {
                return max;
            } else {
                return -1;
            }
        }
    }
}
