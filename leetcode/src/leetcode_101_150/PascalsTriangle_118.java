package leetcode_101_150;

import java.util.*;

/**
 * leetcode_101_150
 * 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 *
 * @author xin
 * @date 2019-03-04
 */
public class PascalsTriangle_118 {
    class Solution {
        public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> result = new ArrayList<>();
            if(numRows ==0){
                return result;
            }
            result.add(Collections.singletonList(1));
            if(numRows ==1){
                return result;
            }
            List<Integer> two = new ArrayList<>();
            two.add(1);
            two.add(1);
            result.add(two);
            for (int i = 2; i < numRows; i++) {
                int left = 1, right = i - 1;
                Integer[] nums = new Integer[i + 1];
                nums[0] = 1;
                nums[i] = 1;
                while (left <= right) {
                    nums[left] = result.get(i - 1).get(left - 1) + result.get(i - 1).get(left);
                    nums[right] = result.get(i - 1).get(left - 1) + result.get(i - 1).get(left);
                    left++;
                    right--;

                }
                result.add(Arrays.asList(nums));
            }
            return result;
        }
    }

}
