package leetcode_201_250;

import java.util.Arrays;

/**
 * leetcode_201_250
 *
 * @author xin
 * @date 2019-02-28
 */
public class ContainsDuplicate_217 {
    class Solution {
        public boolean containsDuplicate(int[] nums) {
            Arrays.sort(nums);
            for(int i=1;i<nums.length;i++){
                if(nums[i]==nums[i-1]){
                    return false;
                }
            }
            return true;
        }
    }
}
