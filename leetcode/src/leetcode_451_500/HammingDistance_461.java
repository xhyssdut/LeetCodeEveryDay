package leetcode_451_500;

/**
 * leetcode_451_500
 *
 * @author xin
 * @date 2019-03-02
 * 1.用一个游标进行移动判断
 * 2.先异或，然后求1的个数
 *
 */
public class HammingDistance_461 {
    class Solution {
        public int hammingDistance(int x, int y) {
            int cursor = 1;
            int count =0;
            while(cursor!=-2147483648&&(x>=cursor||y>=cursor)){
                int tempx = x&cursor;
                int tempy = y&cursor;
                if(tempx!=tempy){
                    count++;
                }
                cursor*=2;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution solution = new HammingDistance_461().new Solution();
        solution.hammingDistance(1577962638, 1727613287);
    }
}
