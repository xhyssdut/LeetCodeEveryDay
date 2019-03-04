package leetcode_151_200;

/**
 * leetcode_151_200
 * 颠倒给定的 32 位无符号整数的二进制位。
 * @author xin
 * @date 2019-03-04
 */
public class ReverseBits_190 {
    public class Solution {
        int answer = 0;
        // you need treat n as an unsigned value
        public int reverseBits(int n) {
            for(int i =0;i<32;i++){
                answer = answer<<1;
                answer = answer|(n&1);
                n = n >>1;
            }
           return answer;
        }

    }
}
