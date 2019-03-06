package leetcode_101_150;

import java.util.LinkedList;

/**
 * leetcode_101_150
 *
 * @author xin
 * @date 2019-03-05
 */
public class EvaluateReversePolishNotation_150 {
    class Solution {
        public int evalRPN(String[] tokens) {
            LinkedList<String> stack = new LinkedList<>();
            for(String string:tokens){
                if("+".equals(string)){
                    int a = Integer.valueOf(stack.pop());
                    int b = Integer.valueOf(stack.pop());
                    stack.push(String.valueOf(a+b));
                }else if("-".equals(string)){
                    int a = Integer.valueOf(stack.pop());
                    int b = Integer.valueOf(stack.pop());
                    stack.push(String.valueOf(b-a));
                }else if("*".equals(string)){
                    int a = Integer.valueOf(stack.pop());
                    int b = Integer.valueOf(stack.pop());
                    stack.push(String.valueOf(b*a));
                }else if("/".equals(string)){
                    int a = Integer.valueOf(stack.pop());
                    int b = Integer.valueOf(stack.pop());
                    stack.push(String.valueOf(b/a));
                }else {
                    stack.push(string);
                }
            }
            return Integer.valueOf(stack.pop());
        }
    }
}
