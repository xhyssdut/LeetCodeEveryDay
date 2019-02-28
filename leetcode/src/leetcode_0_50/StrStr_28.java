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
            if(needle.length<=0){
                return new int[0];
            }
            int [] next = new int[needle.length];
            next[0] = -1;
            int k =-1,j=0;
            while(j<needle.length-1){
                if(k==-1||needle[j] == needle[k]){
                    j++;
                    k++;
                    if(needle[j]!=needle[k]){
                        next[j] = k;

                    }else {
                        next[j] = next[k];
                    }
                }else {
                    k =next[k];
                }
            }
            return next;
        }
    }
}
