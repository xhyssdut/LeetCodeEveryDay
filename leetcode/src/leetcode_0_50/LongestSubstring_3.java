package leetcode_0_50;

import com.sun.org.apache.bcel.internal.generic.RETURN;
import com.sun.org.apache.regexp.internal.RE;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * leetcode.leetcode_0_50
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 * 解答：滑动窗口
 *
 * @author xin
 * @date 2019-02-26
 */
public class LongestSubstring_3 {
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            HashMap<Character,Integer> map =new HashMap<>();
            int max = 0;
            int temp = 0;
            char[] chars = s.toCharArray();
            if(chars.length<=0){
                return 0;
            }
            for(int i = 0;i<chars.length;i++){
                if(!map.containsKey(chars[i])){
                    map.put(chars[i],i);
                    temp++;
                }else{
                    int last = map.get(chars[i]);
                    for(int j = last;j>=0;j--){
                        if(map.containsKey(chars[j])&&map.get(chars[j])==j){
                            map.remove(chars[j]);
                        }
                    }
                    map.put(chars[i],i);
                    max = Math.max(max,temp);
                    temp =i-last;
                }
            }
            return Math.max(max,temp);
        }
    }

    public class Solution1 {
        public int lengthOfLongestSubstring(String s) {
            int n = s.length(), ans = 0;
            Map<Character, Integer> map = new HashMap<>();
            for(int i =0,j=0;j<s.length();j++){
                if(map.containsKey(s.charAt(j))){
                    i = Math.max(map.get(s.charAt(j))+1, i);
                }
                ans  = Math.max(ans,j-i+1);
                map.put(s.charAt(j), j);
            }
            return ans;
        }

    }

    public static void main(String[] args) {
        Solution solution = new LongestSubstring_3().new Solution();
        System.out.println(        solution.lengthOfLongestSubstring("abcabcbb"));

    }
}
