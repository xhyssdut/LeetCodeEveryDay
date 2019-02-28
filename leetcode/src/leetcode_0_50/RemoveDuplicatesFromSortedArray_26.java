package leetcode_0_50;

/**
 * leetcode
 * 方法1：两轮遍历，每次找出最小值，并将最小值记录下来，直到最小值为数组最大值 O(n^2)
 * 方法2：一轮遍历，每当找到一个比最小值大的，放在最小值后面，这个值变成最小值
 * 方法3：双指针法，每当发现有不同，就复制一下位置，然后将慢指针后移
 * @author xin
 * @date 2019-01-08
 */
public class RemoveDuplicatesFromSortedArray_26 {
    class Solution {
        public int removeDuplicates(int[] nums) {
            if(nums == null||nums.length==0){
                return 0;
            }
            //计算一共有多少个数字
            int now = nums[0];
            int temp = 1;
            int count = 1;
            for(int i = 1;i<nums.length;i++){
                if(nums[i]>now){
                    count++;
                    now = nums[i];
                    nums[temp++] = nums[i];
                }
            }
            return count;
        }
    }

}
