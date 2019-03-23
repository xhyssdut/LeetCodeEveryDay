package leetcode_151_200;

/**
 * 给定一个已按照升序排列 的有序数组，找到两个数使得它们相加之和等于目标数。
 * 函数应该返回这两个下标值 index1 和 index2，其中 index1 必须小于 index2。
 * 说明:
 * 返回的下标值（index1 和 index2）不是从零开始的。
 * 你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素。
 *
 * @author xin
 * @date 2019-03-07
 */
public class TwoSumIIInputArrayIsSorted_167 {
    class Solution {
        public int[] twoSum(int[] numbers, int target) {
            if(numbers==null||numbers.length<=1){
                return new int[0];
            }
            int i=0,j=numbers.length-1;
            while(i<j){
                if(numbers[i]+numbers[j]==target){
                    return new int[]{i+1,j+1};
                }else if(numbers[i]+numbers[j]>target){
                    j--;
                }else {
                    i++;
                }

            }
            return new int[0];
        }
    }
}
