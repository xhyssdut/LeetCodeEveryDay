package leetcode_201_250;

/**
 * leetcode_201_250
 *编写一个高效的算法来搜索 m x n 矩阵 matrix 中的一个目标值 target。该矩阵具有以下特性：
 *
 * 每行的元素从左到右升序排列。
 * 每列的元素从上到下升序排列。
 *
 *
 * 算法1，递归，如果找到了返回true，没有就继续往可以上升的方向递归，没找到返回false； TLE
 * 算法2，上面有很多重复的查询，因此记录一下是否查找过
 *
 * 算法3,左下角的元素是这一行中最小的元素，同时又是这一列中最大的元素。比较左下角元素和目标：
 * 若左下角元素等于目标，则找到
 * 若左下角元素大于目标，则目标不可能存在于当前矩阵的最后一行，问题规模可以减小为在去掉最后一行的子矩阵中寻找目标
 * 若左下角元素小于目标，则目标不可能存在于当前矩阵的第一列，问题规模可以减小为在去掉第一列的子矩阵中寻找目标
 * 若最后矩阵减小为空，则说明不存在
 * @author xin
 * @date 2019-02-27
 */
public class SearchA2dMatrixii_240 {
    class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            if(matrix.length==0||matrix[0].length==0){
                return false;
            }
            int line = matrix.length-1;
            int column = 0;

            while(line>=0&&column<matrix.length){
                if(matrix[line][column] == target){
                    return true;
                }else if(matrix[line][column]>target){
                    line--;
                }else {
                    column++;
                }
            }
            return false;
        }

    }
}
