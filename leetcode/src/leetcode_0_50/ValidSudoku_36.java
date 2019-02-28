package leetcode_0_50;

import java.util.HashSet;
import java.util.Set;

/**
 * 判断一个 9x9 的数独是否有效。只需要根据以下规则，验证已经填入的数字是否有效即可。
 * 数字 1-9 在每一行只能出现一次。
 * 数字 1-9 在每一列只能出现一次。
 * 数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。
 *
 *
 * 算法1：使用三个二维数组进行保存状态
 * 算法2：使用三个一维数组进行保存状态，就是每个int取前十位，每次校验的时候就进行且的比较，为0就是没存过，不为0 就是存过。
 * @author xin
 * @date 2019-02-28
 */
public class ValidSudoku_36 {
    class Solution {
        public boolean isValidSudoku(char[][] board) {
            //按行按列按宫进行解决
            boolean[][] line = new boolean[9][9];
            boolean[][] column = new boolean[9][9];
            boolean[][] palace = new boolean[9][9];
            for(int i =0;i<9;i++){
                for(int j =0;j<9;j++){
                    if(board[i][j]=='.'){
                        continue;
                    }
                    if(line[i][board[i][j]-'0'-1]||column[j][board[i][j]-'0'-1]||palace[i/3*3+j/3][board[i][j]-'0'-1]){
                        return false;
                    }else {
                        line[i][board[i][j]-'0'-1] = true;
                        column[j][board[i][j]-'0'-1]= true;
                        palace[i/3*3+j/3][board[i][j]-'0'-1] = true;
                    }

                }
            }
            return true;
        }
    }
}
