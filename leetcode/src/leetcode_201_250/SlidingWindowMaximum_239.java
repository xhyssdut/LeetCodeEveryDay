package leetcode_201_250;

import java.util.LinkedList;

/**
 * leetcode_201_250
 * 给定一个数组 nums，有一个大小为 k 的滑动窗口从数组的最左侧移动到数组的最右侧。你只可以看到在滑动窗口 k 内的数字。滑动窗口每次只向右移动一位。
 * 返回滑动窗口最大值。
 *
 * 输入: nums = [1,3,-1,-3,5,3,6,7], 和 k = 3
 * 输出: [3,3,5,5,6,7]
 * 解释:
 *   滑动窗口的位置                最大值
 * ---------------               -----
 * [1  3  -1] -3  5  3  6  7       3
 *  1 [3  -1  -3] 5  3  6  7       3
 *  1  3 [-1  -3  5] 3  6  7       5
 *  1  3  -1 [-3  5  3] 6  7       5
 *  1  3  -1  -3 [5  3  6] 7       6
 *  1  3  -1  -3  5 [3  6  7]      7
 */
public class SlidingWindowMaximum_239 {
    class Solution {
        public int[] maxSlidingWindow(int[] nums, int k) {
            if(nums==null||nums.length ==0){
                return new int[0];
            }
            int [] result = new int[nums.length-k+1];
            LinkedList<Integer> stack = new LinkedList<>();
            for(int i =0;i<nums.length;i++){
                if(stack.isEmpty()){
                    stack.addLast(i);
                }else {
                    if(i-k==stack.getFirst()){
                        stack.removeFirst();
                    }
                    if(stack.isEmpty()){
                        stack.addLast(i);
                    }else {
                        if(nums[stack.getLast()]>=nums[i]){
                            stack.addLast(i);
                        }else {
                            while(!stack.isEmpty()&&nums[stack.getLast()]<nums[i]){
                                stack.removeLast();
                            }
                            stack.addLast(i);
                        }
                    }
                }
                if(i-k+1>=0){
                    result[i-k+1] = nums[stack.peek()];
                }
            }
            return result;
        }
    }

    public static void main(String[] args) {
        Solution solution = new SlidingWindowMaximum_239().new Solution();
        solution.maxSlidingWindow(new int[]{1,3,1,2,0,5},3);
    }
}
