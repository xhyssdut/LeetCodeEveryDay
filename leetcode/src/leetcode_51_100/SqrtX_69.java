package leetcode_51_100;

/**
 * leetcode.leetcode_51_100
 * 两种方法，一种是二分搜索，一种是牛顿迭代法
 * @author xin
 * @date 2019-02-14
 */
public class SqrtX_69 {

    class Solution {
        public int mySqrt(int x) {
            if(x == 0 || x == 1 ){
                return x;
            }
            long lo = 0L;
            long hi = x;
            long mid = (hi+lo)/2;
            while(lo<=hi){
                if(mid*mid == x){
                    return (int)mid;
                }else if((mid+1)*(mid+1)>x&&mid*mid<x){
                    return (int)mid;
                }else if(mid*mid>x){
                    hi = mid-1;
                }else {
                    lo = mid+1;
                }
                mid = (hi+lo)/2;
            }
            return 0;
        }
    }

    public static void main(String[] args) {
        Solution solution = new SqrtX_69().new Solution();
        solution.mySqrt(2147395599);
    }
}
