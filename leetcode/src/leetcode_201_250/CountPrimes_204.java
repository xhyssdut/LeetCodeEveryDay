package leetcode_201_250;

import java.util.Arrays;

/**
 * leetcode_201_250
 *
 * @author xin
 * @date 2019-03-01
 */
public class CountPrimes_204 {
    class Solution {
        public int countPrimes(int n) {
            boolean[] isPrimes = new boolean[n];
            for(int i =2;i<n;i++){
                isPrimes[i] = true;
            }
            for(int i =2;i*i<n;i++){
                if(isPrimes[i]){
                    for(int j = i*i;j<n;j+=i){
                        isPrimes[j] = false;
                    }
                }
            }
            int count = 0;
            for(int i = 2;i<n;i++){
                if(isPrimes[i]){
                    count++;
                }
            }
            return count;
        }
    }
}
