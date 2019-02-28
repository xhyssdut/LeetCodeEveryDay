package leetcode_151_200;


/**
 * leetcode_151_200
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 * <p>
 * 1.暴力法
 * 2.递归法，把大块分为一个等于k，一个不为k的。
 * 3.翻转数组法
 * @author xin
 * @date 2019-02-27
 */
public class RotateArray_189 {
    class Solution1 {
        public void rotate(int[] nums, int k) {
            for (int i = 0; i < k; i++) {
                int temp = nums[nums.length - 1];
                for (int j = nums.length - 2; j >= 0; j--) {
                    nums[j + 1] = nums[j];
                }
                nums[0] = temp;
            }
        }
    }


    class Solution2 {
        public void rotate(int[] nums, int k) {
            // 原理同上
            recursiveSwap(nums, k, 0, nums.length);
        }

        public void recursiveSwap(int[]nums,int k,int start,int length){
            k%=length;
            if(k!=0){
                for(int i = 0;i<k;i++){
                    swap(nums,start+i,nums.length-k+i);
                }
                recursiveSwap(nums,k,start+k,length-k);
            }
        }

        private void swap(int[] nums, int i, int j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }

    class Solution {
        public void rotate(int[] nums, int k) {
            k%=nums.length;
            // 原理同上
            reverse(nums,0,nums.length-k);
            reverse(nums,nums.length-k+1,nums.length-1);
            reverse(nums,0,nums.length-1);
        }

        public void reverse(int[]nums,int start,int end){
            while(start<end){
                swap(nums,start++,end--);
            }
        }

        private void swap(int[] nums, int i, int j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }



    public static void main(String[] args) {
        RotateArray_189.Solution solution = new RotateArray_189().new Solution();
       solution.rotate(new int[]{1,2,3,4,5,6}, 3);

    }
}
