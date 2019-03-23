package leetcode_501_550;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * 给定一个由 0 和 1 组成的矩阵，找出每个元素到最近的 0 的距离。
 * 两个相邻元素间的距离为 1 。
 *
 * @author xin
 * @date 2019-03-06
 */
public class A_01_matrix_542 {
    class Solution {
        private int[][] vector = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

        public int[][] updateMatrix(int[][] matrix) {
            if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
                return null;
            }
            LinkedList<Integer[]> queue = new LinkedList<>();
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    if (matrix[i][j] == 0) {
                        queue.push(new Integer[]{i, j});
                    }
                }
            }
            while (!queue.isEmpty()) {
                Integer[] s = queue.pop();
                // 搜索上下左右四个方向
                for (int[] v : vector) {
                    int r = s[0] + v[0], c = s[1] + v[1];
                    if (r >= 0 && r < matrix.length
                            && c >= 0 && c < matrix[0].length
                            && matrix[r][c] > matrix[s[0]][s[1]] + 1) {
                        matrix[r][c] = matrix[s[0]][s[1]] + 1;
                        queue.add(new Integer[]{r, c});
                    }
                }
            }
            return matrix;
        }

    }

    public static void main(String[] args) {
        Solution solution = new A_01_matrix_542().new Solution();
        solution.updateMatrix(new int[][]{{0, 0, 0}, {0, 1, 0}, {1, 1, 1}});
    }
}
