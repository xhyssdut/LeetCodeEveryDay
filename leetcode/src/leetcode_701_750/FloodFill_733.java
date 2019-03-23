package leetcode_701_750;

/**
 * leetcode_701_750
 *
 * @author xin
 * @date 2019-03-06
 */
public class FloodFill_733 {
    class Solution {
        public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
            if(image==null||image.length==0||image[0].length==0){
                return image;
            }
            boolean [][] visited = new boolean[image.length][image[0].length];
            fill(image,sr,sc,image[sr][sc],newColor,visited);
            return image;

        }
        public void fill(int[][] image,int sr,int sc,int oldColor,int newColor,boolean[][]visited){
            if(visited[sr][sc]){
                return;
            }
            visited[sr][sc] = true;
            if(image[sr][sc] == oldColor){
                image[sr][sc] = newColor;
                if(sr>0){
                    fill(image,sr-1, sc,oldColor,newColor,visited);
                }
                if(sr<image.length-1){
                    fill(image,sr+1,sc,oldColor,newColor,visited);
                }
                if(sc>0){
                    fill(image,sr,sc-1,oldColor,newColor,visited);
                }
                if(sc<image[0].length-1){
                    fill(image,sr,sc+1,oldColor,newColor,visited);
                }
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new FloodFill_733().new Solution();
        solution.floodFill(new int[][]{{0,0,0},{0,0,0}},0,0,2);
    }
}
