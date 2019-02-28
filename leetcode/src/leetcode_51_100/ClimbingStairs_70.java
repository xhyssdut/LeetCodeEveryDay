package leetcode_51_100;

import java.util.Arrays;

/**
 * leetcode.leetcode_51_100
 * 斐波那契数列 添加记忆数据
 * @author xin
 * @date 2019-02-18
 */
public class ClimbingStairs_70 {
    class Solution {
        int[] temp;

        public int climbStairs(int n) {
            temp = new int[n+1];
            Arrays.fill(temp,-1);
            return coolClimbStairs(n);

        }

        public int coolClimbStairs(int n){
            if(n==1){
                return 1;
            }
            if(n==2){
                return 2;
            }
            if(temp[n] == -1){
                temp[n] = coolClimbStairs(n-1)+ coolClimbStairs(n-2);
            }
            return temp[n];
        }

    }
}
