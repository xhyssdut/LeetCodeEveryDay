package leetcode_201_250;

import java.util.HashMap;
import java.util.Map;

/**
 * leetcode_201_250
 *
 * @author xin
 * @date 2019-03-26
 */
public class IsomorphicStrings_205 {
    class Solution {
        public boolean isIsomorphic(String s, String t) {
            Map<Character, Character> stmap = new HashMap<>();
            Map<Character, Character> tsmap = new HashMap<>();

            for (int i = 0; i < s.length(); i++) {
                if (stmap.containsKey(s.charAt(i))) {
                    if (!stmap.get(s.charAt(i)).equals(t.charAt(i))) {
                        return false;
                    }
                } else {
                    stmap.put(s.charAt(i), t.charAt(i));
                }
                if (tsmap.containsKey(t.charAt(i))) {
                    if (!tsmap.get(t.charAt(i)).equals(s.charAt(i))) {
                        return false;
                    }
                } else {
                    tsmap.put(t.charAt(i), s.charAt(i));
                }
            }

            return true;
        }
    }
}
