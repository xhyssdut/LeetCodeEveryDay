package leetcode_0_50;

/**
 * 直接模拟一个乘法栈的操作，按位进行处理，防止溢出是使用的long型进行接收，最后比较一下
 *
 * @author xin
 * @date 2018/12/17
 */
public class IntegerReverse_7 {
    class Solution {
        public int reverse(int x) {
            boolean plus = x>0;
            if(x == 0){
                return 0;
            }
            x = Math.abs(x);
            long result = 0;
            while (x>0){
                long now = x % 10;
                result = result*10 + now;
                x = x/10;
            }
            if(result>0 && result<=Integer.MAX_VALUE){
                return (int)result * (plus?1:-1);
            }else {
                return 0;
            }
        }
    }
}
