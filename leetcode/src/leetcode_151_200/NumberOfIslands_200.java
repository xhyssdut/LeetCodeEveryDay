package leetcode_151_200;

/**
 * leetcode_151_200
 * 给定一个由 '1'（陆地）和 '0'（水）组成的的二维网格，计算岛屿的数量。一个岛被水包围，并且它是通过水平方向或垂直方向上相邻的陆地连接而成的。你可以假设网格的四个边均被水包围。
 * <p>
 * <p>
 * 算法：广度优先遍历，维持一个二维数组，判断是否访问过
 *
 * @author xin
 * @date 2019-03-04
 */
public class NumberOfIslands_200 {
    class Solution {
        public int numIslands(char[][] grid) {
            if (grid == null || grid.length == 0 || grid[0] == null || grid[0].length == 0) {
                return 0;
            }
            boolean[][] visited = new boolean[grid.length][grid[0].length];
            int count = 0;
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    if(visited(i,j,visited,grid)){
                        count++;
                    }
                }
            }
            return count;
        }
        public boolean visited(int i,int j,boolean[][] visited,char[][] grid){
            if(grid[i][j]=='0'){
                return false;
            }
            if(visited[i][j]){
                return false;
            }
            visited[i][j] =true;
            if(i-1>=0&&grid[i-1][j]=='1'){
                visited(i-1,j,visited,grid);
            }
            if(i+1<grid.length&&grid[i+1][j]=='1'){
                visited(i+1,j,visited,grid);
            }
            if(j+1<grid[0].length&&grid[i][j+1]=='1'){
                visited(i,j+1,visited,grid);
            }
            if(j-1>=0&&grid[i][j-1]=='1'){
                visited(i,j-1,visited,grid);
            }
            return true;
        }
    }
}
