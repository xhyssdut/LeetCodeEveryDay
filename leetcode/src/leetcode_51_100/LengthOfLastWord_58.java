package leetcode_51_100;

/**
 * 给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。
 * 如果不存在最后一个单词，请返回 0 。
 * 说明：一个单词是指由字母组成，但不包含任何空格的字符串。
 *
 * 解答：倒序查找即可
 *
 * @author xin
 * @date 2019-02-13
 */
public class LengthOfLastWord_58 {
    class Solution {
        public int lengthOfLastWord(String s) {
            char[] str = s.toCharArray();
            int result =0;
            boolean enterword = false;
            for (int i = str.length - 1; i >= 0; i--) {
                if(str[i] == ' '){
                    if(enterword){
                        return result;
                    }
                }else {
                    enterword = true;
                    result++;
                }
            }
            return result;
        }
    }
}
