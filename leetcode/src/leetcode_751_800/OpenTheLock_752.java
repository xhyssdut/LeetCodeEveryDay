package leetcode_751_800;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * leetcode_751_800
 *
 * @author xin
 * @date 2019-03-04
 */
public class OpenTheLock_752 {
    class Solution {
        public int openLock(String[] deadends, String target) {
            List<String> deadStrs = Arrays.asList(deadends);
            LinkedList<String> queue = new LinkedList<>();
            int count =0;
            queue.addLast("0000");
            if(deadStrs.contains("0000")){
                return -1;
            }
            while(!queue.isEmpty()){
                int length = queue.size();
                for(int i =0;i<length;i++){
                    String now = queue.getFirst();
                    if(deadStrs.contains(now)){
                        continue;
                    }
                    if(now.equals(target)){
                        return count;
                    }
                    List<String> nexts =tryUnlock(now);
                    for(String s:nexts){
                        queue.addLast(s);
                    }
                }
                count++;
            }
            return -1;
        }

        public List<String> tryUnlock(String now){
            List<String> results = new ArrayList<>();
            char[] chars = now.toCharArray();
            for(int i =0;i<chars.length;i++){
                int bit = chars[i]-'0';
                chars[i] = (char)((bit+1)%10+'0');
                results.add(String.valueOf(chars));
                chars[i] = (char)((bit+9)%10+'0');
                results.add(String.valueOf(chars));
                chars[i] = (char)(bit+'0');
            }
            return results;
        }


    }
    public static void main(String[] args) {
        Solution solution = new OpenTheLock_752().new Solution();
        solution.openLock(new String[]{"0201","0101","0102","1212","2002"},"0202");
    }
}
