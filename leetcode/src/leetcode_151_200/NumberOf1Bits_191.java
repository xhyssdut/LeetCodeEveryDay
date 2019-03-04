package leetcode_151_200;

/**
 * 编写一个函数，输入是一个无符号整数，返回其二进制表达式中数字位数为 ‘1’ 的个数（也被称为汉明重量）。
 *
 * 算法：每次与自己减一进行且操作，直到为零，有一个1就操作几次
 *
 * @author xin
 * @date 2019-03-02
 */
public class NumberOf1Bits_191 {
    public class Solution {
        // you need to treat n as an unsigned value
        public int hammingWeight(int n) {
            int count = 0;
            while(n!=0){
                n = n & (n-1);
                count ++;
            }
            return count;
        }
    }
}
