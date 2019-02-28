package leetcode_51_100;

import java.util.Arrays;

/**
 * leetcode.leetcode_51_100
 *
 * 给定两个二进制字符串，返回他们的和（用二进制表示）。
 * 输入为非空字符串且只包含数字 1 和 0。
 *
 * @author xin
 * @date 2019-02-13
 */
public class AddBinary_67 {
    class Solution {
        public String addBinary(String a, String b) {
            boolean aBigger = a.length()>b.length();
            int max = a.length()>b.length()?a.length():b.length();
            char[] longStr = aBigger?a.toCharArray():b.toCharArray();
            char[] shortStr = new char[longStr.length];
            Arrays.fill(shortStr, '0');
            if(aBigger){
                System.arraycopy(b.toCharArray(), 0, shortStr, a.length()-b.length(), b.length());
            }else {
                System.arraycopy(a.toCharArray(), 0, shortStr, b.length()-a.length(), a.length());
            }
            int temp = 0;
            for(int i =longStr.length-1;i>=0;i--){
                if(shortStr[i]=='0'&&longStr[i]=='0'){
                    if(temp==1){
                        longStr[i] = '1';
                        temp=0;
                    }
                }else if(shortStr[i]=='1'&&longStr[i]=='1'){
                    if(temp==1){
                        longStr[i] = '1';
                    }else {
                        longStr[i] = '0';
                        temp=1;
                    }
                }else {
                    if(temp==1){
                        longStr[i] = '0';
                        temp=1;
                    }else {
                        longStr[i] = '1';
                    }
                }
            }
            if(temp ==1){
                char[] result = new char[longStr.length+1];
                System.arraycopy(longStr, 0, result, 1, longStr.length);
                result[0]='1';
                return String.valueOf(result);

            }else {
                return String.valueOf(longStr);
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new AddBinary_67().new Solution();
        solution.addBinary("100","110010");
    }
}
