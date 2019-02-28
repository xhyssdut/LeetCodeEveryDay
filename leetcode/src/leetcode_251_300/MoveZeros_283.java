package leetcode_251_300;

/**
 * leetcode_251_300
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * 思路：稳定的排序算法
 * <p>
 * 算法1：冒号排序，只排大于零的
 * 算法2：双指针法进行排序
 *
 * @author xin
 * @date 2019-02-28
 */
public class MoveZeros_283 {
    class Solution1 {
        public void moveZeroes(int[] nums) {
            //i停在0在的位置，j停在非零站的位置，当i在j后面时，进行交换
            int j = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    if (i != j) {
                        swap(nums, i, j++);
                    } else {
                        j++;
                    }
                }
            }
        }

        public void swap(int[] nums, int i, int j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }

    class Solution {
        public void moveZeroes(int[] nums) {
            int zeroCount = 0;
            int j = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[j] != 0) {
                    j++;
                } else if (nums[i] != 0) {
                    nums[j++] =nums[i];
                    nums[i] = 0;
                }
            }
        }

        public void swap(int[] nums, int i, int j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
}
