package leetcode_0_50;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""
 *
 *
 * leetcode
 *
 * @author xin
 * @date 2018-12-18
 */
public class LongestCommonPrefix_14 {
    class Solution {
        public String longestCommonPrefix(String[] strs) {
            if (strs == null || strs.length == 0) {
                return "";
            }
            if(strs.length==1){
                return strs[0];
            }
            int minLength = strs[0].length();
            for (String str : strs) {
                if (str.length() < minLength) {
                    minLength = str.length();
                }
            }
            StringBuilder sb = new StringBuilder();
            for(int i =0;i<minLength;i++){
                char getOne = strs[0].charAt(i);
                for(int j =1;j<strs.length;j++){
                    if(strs[j].charAt(i) != getOne){
                        return sb.toString();
                    }
                }
                sb.append(getOne);
            }
            return sb.toString();
        }
    }
}
