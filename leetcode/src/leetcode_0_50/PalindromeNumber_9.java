package leetcode_0_50;

/**
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 *
 *
 * 简单的方法就是把回文数输出为字符串，然后用栈去push一遍，然后反向pop，pop失败就不是回文
 * 不用字符串，就可以使用第7题的翻转int方法去处理，可以处理一半数字
 *
 * @author xin
 * @date 2018/12/17
 */
public class PalindromeNumber_9 {
    class Solution {
        public boolean isPalindrome(int x) {
            long origin = x;
            if(x<0 || x%10 == 0 && x!=0){
                return false;
            }
            long result = 0;
            while (x>result){
                long now = x % 10;
                result = result*10 + now;
                x = x/10;
            }
            return result == x || x == result/10;
        }
    }


    public static void main(String[] args) {
        Solution solution = new PalindromeNumber_9().new Solution();
        solution.isPalindrome(121);
    }
}
