package leetcode_301_350;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * leetcode_301_350
 *
 * @author xin
 * @date 2019-03-26
 */
public class IntersectionOfTwoArrays_349 {
    class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            if(nums1==null||nums2==null){
                return null;
            }
            HashSet<Integer> set1 = new HashSet<>();
            HashSet<Integer> set2 = new HashSet<>();
            List<Integer> result = new ArrayList<>();
            for(int i : nums1){
                set1.add(i);
            }
            for(int i : nums2){
                set2.add(i);
            }
            for(Integer i : set1){
                if(set2.contains(i)){
                    result.add(i);
                }
            }
            int[] trueResult = new int[result.size()];
            for(int i = 0;i<result.size();i++){
                trueResult[i] = result.get(i);
            }
            return trueResult;
        }
    }
}
