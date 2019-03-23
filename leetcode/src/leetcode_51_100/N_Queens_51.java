package leetcode_51_100;

import java.util.ArrayList;
import java.util.List;

/**
 * leetcode_51_100
 *
 * @author xin
 * @date 2019-03-21
 */
public class N_Queens_51 {
    class Solution {
        public List<List<String>> solveNQueens(int n) {
            List<List<String>> result = new ArrayList<>();
            int[] lines = new int[n];
            wander(0,lines,n,result);
            return result;
        }

        public void wander(int currentLine,int[]lines,int n,List<List<String>> result){
            if(currentLine == n){
                result.add(new ArrayList<>());
                for(int i =0;i<n;i++){
                    StringBuilder sb = new StringBuilder();
                    for(int j =0;j<n;j++){
                        if(lines[i]!=j){
                            sb.append('.');
                        }else {
                            sb.append('Q');
                        }
                    }
                    result.get(result.size()-1).add(sb.toString());
                }
            }
            for(int i =0;i<n;i++){
                if(check(currentLine,i,lines,n)){
                    lines[currentLine] = i;
                    wander(currentLine+1,lines,n,result);
                }
            }
        }
        public boolean check(int currentLine,int col,int[]lines,int n){
            for(int i = currentLine-1;i>=0;i--){
                if(lines[i] == col){
                    return false;
                }
                if(Math.abs(i-currentLine)==Math.abs(lines[i]-col)){
                    return false;
                }
            }
            return true;
        }
    }
}
