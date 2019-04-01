package leetcode_0_50;

/**
 * leetcode
 *
 * @author xin
 * @date 2019-01-09
 */
public class StrStr_28 {
    class Solution {
        public int strStr(String haystack, String needle) {

            char[] hayCharArray = haystack.toCharArray();
            char[] needleArray = needle.toCharArray();
            int[] next = getNext(needleArray);
            int i = 0,j=0;
            while(i<hayCharArray.length&&j<needleArray.length){
                if(j==-1||hayCharArray[i]==needleArray[j]){
                    i++;
                    j++;
                }else {
                    j = next[j];
                }
            }
            if(j==needleArray.length){
                return i-j;
            }else {
                return -1;
            }
        }
        int[] getNext(char[] needle){
            int[] next = new int[needle.length];
            next[0] = -1;
            int i =0,j=-1;
            while (i<needle.length){
                if(j==-1||needle[i]==needle[j]){
                    i++;
                    j++;
                    next[i] = j;
                }else {
                    j = next[j];
                }
            }
            return next;
        }
    }
}
