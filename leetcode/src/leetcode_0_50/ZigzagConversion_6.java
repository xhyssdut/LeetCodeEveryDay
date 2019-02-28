package leetcode_0_50;

import java.util.Arrays;

/**
 * leetcode.leetcode_0_50
 *
 * @author xin
 * @date 2019-02-27
 */
public class ZigzagConversion_6 {
    class Solution {
        public String convert(String s, int numRows) {
            if(s.length()<=1||numRows==1){
                return s;
            }
            String[] strs = new String[numRows];
            Arrays.fill(strs, "");
            int flag = numRows * 2 - 2;
            int line = 0;
            for (int i = 0; i < s.length(); i++) {
                if (i % flag == 0) {
                    line = 0;
                }
                if(i%flag == numRows){
                    line--;
                }
                if (i % flag < numRows) {
                    strs[line++] += s.charAt(i);
                } else {
                    strs[--line] += s.charAt(i);
                }
            }
            String result = "";
            for (String str : strs) {
                result += str;
            }
            return result;
        }
    }

    public static void main(String[] args) {
        Solution solution = new ZigzagConversion_6().new Solution();
        System.out.println(solution.convert("PAYPALISHIRING", 3));

    }
}
