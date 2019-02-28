package leetcode_301_350;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * PACKAGE_NAME
 * 给定两个数组，编写一个函数来计算它们的交集。
 *
 * 算法1：未排序的情况下，进行暴力破解
 * 算法2：在排序的情况下，
 *
 * @author xin
 * @date 2019-02-28
 */
public class IntersectionOfTwoArraysII_350 {
    class Solution1 {
        public int[] intersect(int[] nums1, int[] nums2) {
            //固定nums1小于nums2
            if(nums1.length>nums2.length){
                int[] temp = nums2;
                nums2 = nums1;
                nums1 = temp;
            }
            int [] tempResult = new int[nums1.length];
            int resultCursor = 0;
            int nums2length = nums2.length;
            for(int i = 0;i<nums1.length;i++){
                for(int j =0;j<nums2length;j++){
                    if(nums1[i] == nums2[j]){
                        tempResult[resultCursor++] = nums1[i];
                        nums2[j] = nums2[nums2length-1];
                        nums2length--;
                        break;
                    }
                }
            }
            int[] result = new int[resultCursor];
            for(int i = 0;i<resultCursor;i++){
                result[i] = tempResult[i];
            }
            return result;
        }
    }

    class Solution {
        public int[] intersect(int[] nums1, int[] nums2) {
            Arrays.sort(nums1);
            Arrays.sort(nums2);
            List<Integer> list = new ArrayList<>();
            int i =nums1.length-1,j=nums2.length-1;
            while(i>=0&&j>=0){
                if(nums1[i]==nums2[j]){
                    list.add(nums1[i]);
                    i--;
                    j--;
                }else if(nums1[i]>nums2[j]){
                    i--;
                }else {
                    j--;
                }
            }
            int[] result = new int[list.size()];
            int flag = 0;
            for(int cursor :list){
                result [flag++] = cursor;
            }
            return result;
        }
    }
}
