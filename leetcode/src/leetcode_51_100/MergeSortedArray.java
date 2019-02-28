package leetcode_51_100;

/**
 * leetcode.leetcode_51_100
 * <p>
 * 给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
 * 说明:
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
 * 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
 *
 *
 * 倒序归并，这样可以进行原地的归并
 *
 * @author xin
 * @date 2019-02-18
 */
public class MergeSortedArray {
    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int i = m-1, j = n-1,k=m+n-1;
            while (i >= 0 || j >= 0) {
                if (j<0){
                    k--;
                    i--;
                }else if (i<0){
                    nums1[k--] = nums2[j--];
                }else if(nums1[i]<nums2[j]){
                    nums1[k--] = nums2[j--];
                }else {
                    nums1[k--] = nums1[i--];
                }
            }
        }
    }
}
