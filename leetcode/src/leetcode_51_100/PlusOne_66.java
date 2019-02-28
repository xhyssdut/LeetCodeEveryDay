package leetcode_51_100;

/**
 * leetcode.leetcode_51_100
 *
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 * 最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 *
 * 解决：倒序加，注意进位即可
 *
 * @author xin
 * @date 2019-02-13
 */
public class PlusOne_66 {
    class Solution {
        public int[] plusOne(int[] digits) {
            digits[digits.length-1] +=1;
            int temp = 0;
            for(int i = digits.length-1;i>=0;i--){
                digits[i]+=temp;
                temp = 0;
                if(digits[i]>9){
                    digits[i] = 0;
                    temp = 1;
                }
            }
            if(temp == 1){
                int[] result = new int[digits.length+1];
                System.arraycopy(digits,0,result,1, digits.length);
                result[0] = 1;
                return result;
            }
            return digits;
        }
    }
}
