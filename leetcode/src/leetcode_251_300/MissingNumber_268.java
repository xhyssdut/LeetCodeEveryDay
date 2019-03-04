package leetcode_251_300;

/**
 * leetcode_251_300
 * 给定一个包含 0, 1, 2, ..., n 中 n 个数的序列，找出 0 .. n 中没有出现在序列中的那个数。
 *
 * 求出来和，然后挨个减，最后剩下的数字就是缺少的数字。
 * @author xin
 * @date 2019-03-04
 */
public class MissingNumber_268 {
    public int missingNumber(int[] nums) {
        int count = (nums.length+1)*nums.length/2;
        for(int i :nums){
            count -= i;
        }
        return count;
    }
}
