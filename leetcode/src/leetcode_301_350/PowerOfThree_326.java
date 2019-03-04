package leetcode_301_350;

/**
 * leetcode_301_350
 * 给定一个整数，写一个函数来判断它是否是 3 的幂次方。
 * 3的幂次的质因子只有3，而所给出的n如果也是3的幂次，故而题目中所给整数范围内最大的3的幂次的因子只能是3的幂次，1162261467是3的19次幂，是整数范围内最大的3的幂次
 * @author xin
 * @date 2019-03-02
 */
public class PowerOfThree_326 {
    class Solution {
        public boolean isPowerOfThree(int n) {
            return n>0 && 1162261467%n==0;
        }
    }
}
