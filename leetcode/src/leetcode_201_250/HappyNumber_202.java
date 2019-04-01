package leetcode_201_250;

import java.util.HashSet;

/**
 * leetcode_201_250
 *
 * @author xin
 * @date 2019-03-26
 */
public class HappyNumber_202 {
    class Solution {
        public boolean isHappy(int n) {
            HashSet<Integer> integers = new HashSet<>();
            while(n!=1){
                int count = 0;
                while(n!=0){
                    count += (n%10) * (n%10);
                    n/=10;
                }
                n = count;
                if(integers.contains(n)){
                    return false;
                }
                integers.add(n);
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Solution solution = new HappyNumber_202().new Solution();
        solution.isHappy(19);
    }
}
