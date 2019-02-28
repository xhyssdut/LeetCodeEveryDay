package leetcode_101_150;

/**
 * leetcode_101_150
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 *
 * @author xin
 * @date 2019-02-28
 */
public class ValidPalindrome_125 {
    class Solution {
        public boolean isPalindrome(String s) {
            s = s.toLowerCase();
            int i = 0, j = s.length() - 1;
            while (i < j) {
                char p = s.charAt(i);
                char l = s.charAt(j);
                if (!Character.isLetterOrDigit(p)) {
                    i++;
                    continue;
                }
                if (!Character.isLetterOrDigit(l)) {
                    j--;
                    continue;
                }
                if (p != l) {
                    return false;
                }else {
                    i++;
                    j--;
                }
            }
            return true;
        }
    }
}
