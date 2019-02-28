package leetcode_0_50;



/**
 *
 *
 * 一路if下去就行了
 *
 * @author xin
 * @date 2018/12/17
 */
public class RomanToInteger_13 {
    class Solution {
        public int romanToInt(String s) {
            int result = 0;
            char[] chars = s.toCharArray();
            for (int i = chars.length - 1; i >= 0; i--) {
                if (chars[i] == 'I') {
                    result += 1;
                } else if (chars[i] == 'V') {
                    if (i > 0) {
                        if (chars[i - 1] == 'I') {
                            result += 4;
                            i--;
                            continue;
                        }
                    }
                    result += 5;
                } else if (chars[i] == 'X'){
                    if (i > 0) {
                        if (chars[i - 1] == 'I') {
                            result += 9;
                            i--;
                            continue;
                        }
                    }
                    result += 10;
                } else if (chars[i] == 'L'){
                    if (i > 0) {
                        if (chars[i - 1] == 'X') {
                            result += 40;
                            i--;
                            continue;
                        }
                    }
                    result += 50;
                } else if (chars[i] == 'C'){
                    if (i > 0) {
                        if (chars[i - 1] == 'X') {
                            result += 90;
                            i--;
                            continue;
                        }
                    }
                    result += 100;
                } else if (chars[i] == 'D'){
                    if (i > 0) {
                        if (chars[i - 1] == 'C') {
                            result += 400;
                            i--;
                            continue;
                        }
                    }
                    result += 500;
                } else if (chars[i] == 'M'){
                    if (i > 0) {
                        if (chars[i - 1] == 'C') {
                            result += 900;
                            i--;
                            continue;
                        }
                    }
                    result += 1000;
                }

            }
            return result;
        }
    }
}
