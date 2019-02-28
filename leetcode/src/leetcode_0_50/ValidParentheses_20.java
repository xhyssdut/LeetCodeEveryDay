package leetcode_0_50;

import java.util.LinkedList;

/**
 * 使用栈
 *
 * @author xin
 * @date 2018-12-19
 */
public class ValidParentheses_20 {
    class Solution {
        public boolean isValid(String s) {
            LinkedList<Character> list = new LinkedList<>();
            for(char c:s.toCharArray()){
                if(c == ')'){
                    if(!list.isEmpty()&&'(' == list.peekFirst()){
                        list.removeFirst();
                    }else {
                        return false;
                    }
                }else if(c == ']'){
                    if(!list.isEmpty()&&'[' == list.peekFirst()){
                        list.removeFirst();
                    }else {
                        return false;
                    }
                }else if(c == '}'){
                    if(!list.isEmpty()&&'{' == list.peekFirst()){
                        list.removeFirst();
                    }else {
                        return false;
                    }
                }else{
                    list.addFirst(c);
                }
            }
            return list.isEmpty();
        }
    }
}
