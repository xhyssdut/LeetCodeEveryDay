package leetcode_351_400;

import java.util.*;

/**
 * leetcode_351_400
 *
 * @author xin
 * @date 2019-03-27
 */
public class TopKFrequentElements_347 {
    class Solution {


        public List<Integer> topKFrequent(int[] nums, int k) {

            TreeMap<Integer, Integer> map = new TreeMap<>();
            //用map统计各个元素都有多少个
            for (int num : nums) {
                if (map.containsKey(num)) {
                    map.put(num, map.get(num) + 1);
                } else {
                    map.put(num, 1);
                }
            }
            //用优先队列获得最多的前K个
            PriorityQueue<Integer> pq = new PriorityQueue<>(
                    (a,b)->map.get(a)-map.get(b)
            );
            for (int key:map.keySet()) {
                if(pq.size()<k){
                    pq.add(key);
                }else if(map.get(key)>map.get(pq.peek())){
                    pq.remove();
                    pq.add(key);
                }

            }
            LinkedList<Integer> res = new LinkedList<>();
            while (!pq.isEmpty()){
                res.add(pq.remove());
            }

            return res;

        }

    }
}
