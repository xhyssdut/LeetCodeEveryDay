package leetcode_351_400;

import java.util.Random;

/**
 * 打乱一个没有重复元素的数组。
 *
 * @author xin
 * @date 2019-03-01
 */
public class ShuffleAnArray_384 {
    class Solution {
        int[] origin;

        public Solution(int[] nums) {
            origin = new int[nums.length];
            System.arraycopy(nums,0,origin,0, nums.length);
        }

        /** Resets the array to its original configuration and return it. */
        public int[] reset() {
            return origin;
        }

        /** Returns a random shuffling of the array. */
        public int[] shuffle() {
            if(origin.length==0){
                return origin;
            }
            int[] random = new int[origin.length];
            int[] temp = new int[origin.length];
            System.arraycopy(origin,0,temp,0, origin.length);
            int n = origin.length;
            for(int i=0;i<temp.length;i++){
                int pos = Math.abs(new Random().nextInt()%n);
                random[i] = temp[pos];
                temp[pos] = temp[n-1];
                n--;
            }
            return random;
        }
    }


}
