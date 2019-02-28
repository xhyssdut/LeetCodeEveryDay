package leetcode_0_50;

import java.util.HashMap;
import java.util.Map;

/**
 * 把需要的数字放在hashmap中，然后继续遍历，如果找到了可以搭配的直接返回，没有就放在待匹配的map中
 *
 * @author xin
 * @date 2018/12/17
 */
public class TwoSum_1 {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer,Integer> map = new HashMap<>();
            for(int i =0;i<nums.length;i++){
                if(map.containsKey(nums[i])){
                    return new int[]{map.get(nums[i]),i};
                }
                map.put(target-nums[i],i);
            }
            throw new RuntimeException("error");
        }
    }
}
