package leetcode_351_400;

/**
 * leetcode_351_400
 *  给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 *  注意事项：您可以假定该字符串只包含小写字母。
 *
 *
 *  开辟26个空间去进行保存
 * @author xin
 * @date 2019-02-28
 */
public class FirstUniqueCharacterInAString_387 {
    class Solution {
        int[] pos = new int[26];
        public int firstUniqChar(String s) {
            for(int i =0;i<s.length();i++){
                if(pos[s.charAt(i)-'a']==-2){
                    continue;
                }
                if(pos[s.charAt(i)-'a']>=1){
                    pos[s.charAt(i)-'a'] = -2;
                }else {
                    pos[s.charAt(i)-'a'] = i+1;
                }
            }
            int min = -1;
            for(int i =0;i<26;i++){
                if(pos[i]>=1){
                    if(min<0){
                        min = pos[i]-1;
                    }else {
                        min = Math.min(pos[i]-1,min);
                    }
                }
            }
            return min;
        }
    }
    public static void main(String[] args) {
        Solution solution = new FirstUniqueCharacterInAString_387().new Solution();
        System.out.println(        solution.firstUniqChar("aadadaad"));

    }
}
