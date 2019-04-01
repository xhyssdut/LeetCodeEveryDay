package leetcode_151_200;

/**
 * leetcode_151_200
 *
 * @author xin
 * @date 2019-03-27
 */
public class FindPeakElement_162 {
    class Solution {
        public int findPeakElement(int[] nums) {
                if(nums.length == 1){
                    return 0;
                }
                if(nums[1] < nums[0]){
                    return 0;
                }
                if(nums[nums.length-2] < nums[nums.length-1]){
                    return nums.length-1;
                }
                int start = 0;
                int end = nums.length - 1;
                while(start <= end){
                    int middle = (start+end)/2;
                    if(nums[middle] > nums[middle-1] && nums[middle] > nums[middle+1]){
                        return middle;
                    }
                    if(nums[middle] > nums[middle-1]){
                        start = middle + 1;
                    }else{
                        end = middle;
                    }
                }
                return -1;
            }

        }



    public static void main(String[] args) {
        Solution solution = new FindPeakElement_162().new Solution();
        solution.findPeakElement(new int[]{1,2});
    }
}
