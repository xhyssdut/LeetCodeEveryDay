package leetcode_0_50;


/**
 * leetcode 递归
 *
 * @author xin
 * @date 2019-01-14
 */
public class CountAndSay_38 {
    class Solution {
        public String countAndSay(int n) {
            return count(n);
        }
        public String count(int n){
            if(n <= 1){
                return "1";
            }else {
                return push(count(n-1));
            }
        }
        public String push(String str){
            StringBuilder sb = new StringBuilder();
            char number = str.charAt(0);
            int count = 0;
            for(int i = 0;i<str.length();i++){
                char now = str.charAt(i);
                if(now == number){
                    count++;
                }else {
                    sb.append(count).append(number);
                    number = now;
                    count = 1;
                }
            }
            sb.append(count).append(number);
            return sb.toString();

        }


    }
    public static void main(String[] args) {
        Solution solution = new CountAndSay_38().new Solution();
        System.out.println(        solution.countAndSay(3));

    }
}
