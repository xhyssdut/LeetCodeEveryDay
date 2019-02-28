package leetcode_301_350;

/**
 * leetcode_301_350
 *
 * @author xin
 * @date 2019-02-28
 */
public class ReverseString_344 {
    class Solution {
        public void reverseString(char[] s) {
            if(s==null||s.length<=1){
                return;
            }
            int i =0,j=s.length-1;
            while(i<j) {
                char temp = s[i];
                s[i++] = s[j];
                s[j--] = temp;
            }
        }
    }
}
