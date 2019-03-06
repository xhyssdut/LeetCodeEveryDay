package leetcode_251_300;

import java.util.HashSet;
import java.util.LinkedList;

/**
 * leetcode_251_300
 *
 * @author xin
 * @date 2019-03-04
 */
public class PerfectSquares_279 {
    class Solution {
        public int numSquares(int n) {
            if(n==0){
                return 0;
            }
            int count =0;
            LinkedList<Integer> list = new LinkedList<>();
            list.addLast(n);
            HashSet<Integer> set = new HashSet<>();
            while(!list.isEmpty()){
                int size = list.size();
                for(int i=0;i<size;i++){
                    int remain = list.removeFirst();
                    set.add(remain);
                    for(int j = 1;j<=(int)(Math.sqrt(remain));j++){
                        if(set.contains(remain-j*j)){
                            continue;
                        }
                        if(remain-j*j==0){
                            return count+1;
                        }
                        list.addLast(remain - j*j);
                    }
                }
                count++;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution solution =new PerfectSquares_279().new Solution();
        solution.numSquares(12);
    }
}
