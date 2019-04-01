package leetcode_451_500;

import java.util.HashMap;
import java.util.Map;

/**
 * leetcode_451_500
 *
 * @author xin
 * @date 2019-03-27
 */
public class FourSumII_454 {
    class Solution {
        public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
            int result = 0;
            Map<Integer,Integer> map = new HashMap<>();
            for(int a:A){
                for(int b:B){
                    int count = map.getOrDefault(a+b,0);
                    map.put(a+b,count+1);
                }
            }
            for(int c:C){
                for(int d:D){
                    if(map.containsKey(-1*(c+d))){
                        result+=map.get(-1*(c+d));
                    }
                }
            }
            return result;
        }
    }
}
