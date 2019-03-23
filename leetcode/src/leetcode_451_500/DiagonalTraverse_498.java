package leetcode_451_500;

/**
 * 给定一个含有 M x N 个元素的矩阵（M 行，N 列），请以对角线遍历的顺序返回这个矩阵中的所有元素，对角线遍历如下图所示。
 *
 * @author xin
 * @date 2019-03-07
 */
public class DiagonalTraverse_498 {
    class Solution {
        public int[] findDiagonalOrder(int[][] matrix) {
            if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
                return null;
            }
            int[] result = new int[matrix.length * matrix[0].length];
            int cursor = 0;
            int x = 0;
            int y = 0;
            while (cursor < result.length) {
                result[cursor++] = matrix[x][y];
                if((x+y)%2==0){
                    if(y == matrix[0].length-1){
                        x++;
                    }else if(x==0){
                        y--;
                    }else {
                        x--;
                        y++;
                    }
                }else {
                    if(x == matrix.length-1){
                        x--;
                    }else if(y==0){
                        y++;
                    }else {
                        x++;
                        y--;
                    }
                }
            }
            return result;
        }
    }

    public static void main(String[] args) {
        Solution solution = new DiagonalTraverse_498().new Solution();
        solution.findDiagonalOrder(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
    }
}
