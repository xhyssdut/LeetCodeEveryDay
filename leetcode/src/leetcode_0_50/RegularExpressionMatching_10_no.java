package leetcode_0_50;

import java.util.LinkedList;

/**
 * leetcode_0_50
 * 给定一个字符串 (s) 和一个字符模式 (p)。实现支持 '.' 和 '*' 的正则表达式匹配。
 *
 * @author xin
 * @date 2019-02-27
 */
public class RegularExpressionMatching_10_no {
    class Solution {
        public boolean isMatch(String s, String p) {
            int sLen = s.length(), pLen = p.length();
            boolean[][] memory = new boolean[sLen+1][pLen+1];
            memory[0][0] = true;
            for(int i = 0; i <= sLen; i++) {
                for(int j = 1; j <= pLen; j++) {
                    if(p.charAt(j-1) == '*') {
                        memory[i][j] = memory[i][j-2] || (i > 0 && (s.charAt(i-1) == p.charAt(j-2) ||
                                p.charAt(j-2) == '.') && memory[i-1][j]);
                    }else {
                        memory[i][j] = i > 0 && (s.charAt(i-1) == p.charAt(j-1) || p.charAt(j-1) == '.')
                                && memory[i-1][j-1];
                    }
                }
            }
            return memory[sLen][pLen];
        }
    }
    public static void main(String[] args) {
        RegularExpressionMatching_10_no.Solution solution = new RegularExpressionMatching_10_no().new Solution();
        System.out.println(solution.isMatch("aaa","ab*a*c*a"));

    }
}
