package leetcode_701_750;

import java.util.HashSet;

/**
 * leetcode_701_750
 *
 * @author xin
 * @date 2019-03-27
 */
public class JewelsAndStones_711 {
    class Solution {
        public int numJewelsInStones(String J, String S) {
            if(J == null||S == null){
                return 0;
            }
            HashSet<Character> set = new HashSet<>();
            for(char c: J.toCharArray()){
                set.add(c);
            }
            int count = 0;
            for(char c: S.toCharArray()){
                if (set.contains(c)){
                    count++;
                }
            }
            return count;
        }
    }
}
