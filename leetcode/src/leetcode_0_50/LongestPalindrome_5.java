package leetcode_0_50;

/**
 * leetcode.leetcode_0_50
 *给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 * @author xin
 * @date 2019-02-26
 */
public class LongestPalindrome_5 {
    class Solution {
        public String longestPalindrome(String s) {
            if(s.length()<=1){
                return s;
            }
            int start =0;int end =0;
            String maxString = "";
            for(int i =0;i<s.length();i++){
                int exact = getPalindromeLength(s,i,i);
                int middle = getPalindromeLength(s,i,i+1);
                int max = Math.max(exact,middle);
                if(max>end-start){
                    start = i-(max-1)/2;
                    end = i+(max/2);
                }
            }
            return s.substring(start,end+1);
        }
        public int getPalindromeLength(String s,int leftPos,int rightPos){
            while(leftPos>=0&&rightPos<s.length()){
                if(s.charAt(leftPos)==s.charAt(rightPos)){
                    leftPos--;
                    rightPos++;
                }else {
                    return rightPos-leftPos-1;
                }
            }
            return rightPos-leftPos-1;
        }
    }
    public static void main(String[] args) {
        Solution solution = new LongestPalindrome_5().new Solution();
        System.out.println(        solution.longestPalindrome("babad"));

    }
}
