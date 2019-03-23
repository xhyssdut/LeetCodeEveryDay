package leetcode_701_750;

/**
 * 给定一个整数类型的数组 nums，请编写一个能够返回数组“中心索引”的方法。
 * 我们是这样定义数组中心索引的：数组中心索引的左侧所有元素相加的和等于右侧所有元素相加的和。
 * 如果数组不存在中心索引，那么我们应该返回 -1。如果数组有多个中心索引，那么我们应该返回最靠近左边的那一个。
 *
 * @author xin
 * @date 2019-03-07
 */
public class FindPivotIndex_724 {

    /**
     * 两趟遍历，第一趟算出所有数的和，第二趟寻找答案。
     */
    class Solution {
        public int pivotIndex(int[] nums) {
            if (nums == null || nums.length == 0) {
                return -1;
            }
            int sum = 0;
            for(int i :nums){
                sum+=i;
            }
            int leftCount=0;
            for(int i =0;i<nums.length;i++){
                if(sum-leftCount-nums[i]==leftCount){
                    return i;
                }
                leftCount+=nums[i];
            }
            return -1;
        }
    }


    public static void main(String[] args) {
        Solution solution =new FindPivotIndex_724().new Solution();
        solution.pivotIndex(new int[]{1,2,3});
    }
}
