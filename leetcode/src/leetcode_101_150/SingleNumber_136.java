package leetcode_101_150;


/**
 * leetcode_101_150
 *
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗
 *
 * 普通算法：使用set
 * 高级算法：使用异或，因为如果一个数被同一个数异或两次，相当于没有异或过。
 * @author xin
 * @date 2019-02-27
 */
public class SingleNumber_136 {
    class Solution {
        public int singleNumber(int[] nums) {
            int a =0;
            for(int i=0;i<nums.length;i++){
                a = a^nums[i];
            }
            return a;
        }
    }
}
