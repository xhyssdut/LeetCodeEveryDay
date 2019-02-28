package leetcode_151_200;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * leetcode_151_200
 * 给定一个大小为 n 的数组，找到其中的众数。众数是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
 * 你可以假设数组是非空的，并且给定的数组总是存在众数。
 *
 * 算法一：排序，找到最中间的数字 Onlogn
 * 算法二：HashMap，获取，然后遍历
 * 算法三：摩尔选举法
 * @author xin
 * @date 2019-02-27
 */
public class MajorityElement_169 {
    class Solution1 {
        public int majorityElement(int[] nums) {
            Arrays.sort(nums);
            return nums[nums.length/2];
        }
    }

    class Solution2 {
        public int majorityElement(int[] nums) {
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int i:nums){
                if(map.containsKey(i)){
                    map.put(i,map.get(i)+1);
                }else {
                    map.put(i, 1);
                }
            }
            for(Map.Entry<Integer,Integer>entry:map.entrySet()){
                if(entry.getValue()>nums.length/2){
                    return entry.getKey();
                }
            }
            return -1;
        }
    }

    class Solution {
        public int majorityElement(int[] nums) {
            int count=1;
            int maj = nums[0];
            for(int i=1;i<nums.length;i++){
                if(nums[i]==maj){
                    count++;
                }else {
                    count--;
                }
                if(count==0){
                    maj = nums[i+1];
                }
            }
            return maj;
        }
    }
}
