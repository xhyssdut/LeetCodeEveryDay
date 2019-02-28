package leetcode_0_50;


/**
 * leetcode_0_50
 *
 *  请你来实现一个 atoi 函数，使其能将字符串转换成整数。
 * 首先，该函数会根据需要丢弃无用的开头空格字符，直到寻找到第一个非空格的字符为止。
 * 当我们寻找到的第一个非空字符为正或者负号时，则将该符号与之后面尽可能多的连续数字组合起来，作为该整数的正负号；假如第一个非空字符是数字，则直接将其与之后连续的数字字符组合起来，形成整数。
 * 该字符串除了有效的整数部分之后也可能会存在多余的字符，这些字符可以被忽略，它们对于函数不应该造成影响。
 * 注意：假如该字符串中的第一个非空格字符不是一个有效整数字符、字符串为空或字符串仅包含空白字符时，则你的函数不需要进行转换。
 * 在任何情况下，若函数不能进行有效的转换时，请返回 0。
 *
 * @author xin
 * @date 2019-02-27
 */
public class StringToIntegerAtoi_8 {
    class Solution {
        public int myAtoi(String str) {
            boolean isNumber = false;
            boolean minus = false;
            long num = 0L;
            for(int i = 0;i<str.length();i++){
                char now = str.charAt(i);
                if(isNumber){
                    if(now<='9'&&now>='0'){
                        num =num*10+now-'0';
                        if(num>Integer.MAX_VALUE){
                            break;
                        }
                    }else {
                        break;
                    }
                }else {
                    if(now<='9'&&now>='0'){
                        isNumber=true;
                        num =num*10+now-'0';
                    } else if(now=='-'){
                        isNumber=true;
                        minus =true;
                    }else if(now=='+'){
                        isNumber=true;
                    }else if(!Character.isSpace(now)){
                        break;
                    }
                }
            }
            if(num>(long)Integer.MAX_VALUE){

                return minus?Integer.MIN_VALUE:Integer.MAX_VALUE;
            }else {
                return (int)num * (minus?-1:1);
            }
        }
    }

    public static void main(String[] args) {
        StringToIntegerAtoi_8.Solution solution = new StringToIntegerAtoi_8().new Solution();
        System.out.println(solution.myAtoi("9223372036854775808"));

    }
}
