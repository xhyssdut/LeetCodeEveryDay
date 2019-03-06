package leetcode_351_400;

import java.util.Collections;
import java.util.LinkedList;

/**
 * leetcode_351_400
 *
 * @author xin
 * @date 2019-03-06
 */
public class DecodeString_394 {
    class Solution {
        public String decodeString(String s) {
            LinkedList<Character> stack = new LinkedList<>();
            for(int i = 0;i<s.length();i++){
                if(s.charAt(i)!=']'){
                    stack.push(s.charAt(i));
                }else {
                    String round = "";
                    while(stack.peek()!='['){
                        round = stack.pop()+round;
                    }
                    stack.pop();
                    int time = 0;
                    int help = 0;
                    while(!stack.isEmpty()&&Character.isDigit(stack.peek())){
                        time +=(stack.pop()-'0')*Math.pow(10,help++);
                    }
                    String finalStr = String.join("", Collections.nCopies(time, round));
                    for(int j=0;j<finalStr.length();j++){
                        stack.push(finalStr.charAt(j));
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            while(!stack.isEmpty()){
                sb.append(stack.removeLast());
            }
            return sb.toString();
        }
    }
}
