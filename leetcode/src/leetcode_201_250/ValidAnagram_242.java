package leetcode_201_250;

import java.util.HashMap;

/**
 * leetcode_201_250
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的一个字母异位词。
 * 说明:
 * 你可以假设字符串只包含小写字母。
 * 进阶:
 * 如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？
 *
 * 算法1，开辟两个26大小的数组来存计数
 * 算法2，两个hashmap
 *
 * @author xin
 * @date 2019-02-28
 */
public class ValidAnagram_242 {
    class Solution {
        public boolean isAnagram(String s, String t) {
            if (s.length() != t.length()) {
                return false;
            }
            HashMap<Character,Integer> sMap = new HashMap<>();
            HashMap<Character,Integer> tMap = new HashMap<>();

            for(int i = 0;i<s.length();i++){
                char sc = s.charAt(i);
                char tc = t.charAt(i);
                if(sMap.containsKey(sc)){
                    sMap.put(sc, 1);
                }else {
                    sMap.put(sc,sMap.get(sc)+1);
                }
                if(tMap.containsKey(tc)){
                    tMap.put(tc, 1);
                }else {
                    tMap.put(tc,sMap.get(tc)+1);
                }
            }
            return sMap.equals(tMap);
        }
    }
}
