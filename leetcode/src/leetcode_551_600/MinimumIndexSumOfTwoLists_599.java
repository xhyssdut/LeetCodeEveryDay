package leetcode_551_600;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * leetcode_551_600
 *
 * @author xin
 * @date 2019-03-26
 */
public class MinimumIndexSumOfTwoLists_599 {
    class Solution {
        public String[] findRestaurant(String[] list1, String[] list2) {
            if(list1 == null||list2 == null){
                return null;
            }
            HashMap<String,Integer> map1 = new HashMap<>();
            HashMap<String,Integer> map2 = new HashMap<>();
            for(int i =0;i<list1.length;i++){
                map1.put(list1[i],i);
            }
            int min = Integer.MAX_VALUE;
            for(int j =0;j<list2.length;j++){
                if(map1.containsKey(list2[j])){
                    min = Math.min(j+map1.get(list2[j]),min);
                    map2.put(list2[j],j+map1.get(list2[j]));
                }
            }
            List<String> result = new ArrayList<>();
            for(Map.Entry<String,Integer> entry:map2.entrySet()){
                if(entry.getValue().equals(min)){
                    result.add(entry.getKey());
                }
            }
            return result.toArray(new String[0]);
        }
    }
}
