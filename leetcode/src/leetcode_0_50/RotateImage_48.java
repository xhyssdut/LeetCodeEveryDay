package leetcode_0_50;

/**
 * leetcode_0_50
 * 给定一个 n × n 的二维矩阵表示一个图像。
 * 将图像顺时针旋转 90 度。
 * <p>
 * 算法1，对矩阵做转置，然后左右交换
 * 算法2，沿着对角线交换，然后上下翻转
 *
 * @author xin
 * @date 2019-02-28
 */
public class RotateImage_48 {
    class Solution1 {
        public void rotate(int[][] matrix) {
            int n = matrix.length;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
            for(int i=0;i<n/2;i++){
                for(int j=0;j<n;j++){
                    int temp = matrix[j][i];
                    matrix[j][i] = matrix[j][n-i-1];
                    matrix[j][n-i-1] = temp;
                }
            }
        }
    }

    class Solution {
        public void rotate(int[][] matrix) {
            int n = matrix.length;
            for (int i = 0; i < n; i++) {
                for (int j = i ; j < n; j++) {
                    int temp = matrix[n-i-1][n-j];
                    matrix[n-i-1][j] = matrix[n-j][n-i-1];
                    matrix[n-j][n-i-1] = temp;
                }
            }
            for(int i=0;i<n/2;i++){
                for(int j=0;j<n;j++){
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[n-i-1][j];
                    matrix[n-i-1][j] = temp;
                }
            }
        }
    }
}
