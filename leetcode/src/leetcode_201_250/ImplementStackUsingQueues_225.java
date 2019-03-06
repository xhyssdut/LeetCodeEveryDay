package leetcode_201_250;

import java.util.LinkedList;

/**
 * leetcode_201_250
 *
 * @author xin
 * @date 2019-03-06
 */
public class ImplementStackUsingQueues_225 {
    class MyStack {
        boolean left;
        LinkedList<Integer> leftStack;
        LinkedList<Integer> rightStack;

        /**
         * Initialize your data structure here.
         */
        public MyStack() {
            left = true;
            leftStack = new LinkedList<>();
            rightStack = new LinkedList<>();
        }

        /**
         * Push element x onto stack.
         */
        public void push(int x) {
            if(left){
                leftStack.addLast(x);
            }else {
                rightStack.addLast(x);
            }
        }

        /**
         * Removes the element on top of the stack and returns that element.
         */
        public int pop() {
            if(left){
                while(leftStack.size()>1){
                    rightStack.addLast(leftStack.removeFirst());
                }
                left = !left;
                return leftStack.removeFirst();
            }else {
                while(rightStack.size()>1){
                    leftStack.addLast(rightStack.removeFirst());
                }
                left = !left;
                return rightStack.removeFirst();
            }
        }

        /**
         * Get the top element.
         */
        public int top() {
            int result = -1;
            if(left){
                while(leftStack.size()>1){
                    rightStack.addLast(leftStack.removeFirst());
                }
                left = !left;
                result = leftStack.getFirst();
                rightStack.addLast(leftStack.removeFirst());
            }else {
                while(rightStack.size()>1){
                    leftStack.addLast(rightStack.removeFirst());
                }
                left = !left;
                result = rightStack.getFirst();
                leftStack.addLast(rightStack.removeFirst());
            }
            return result;
        }

        /**
         * Returns whether the stack is empty.
         */
        public boolean empty() {
            if(left){
                return leftStack.isEmpty();
            }else {
                return rightStack.isEmpty();
            }
        }
    }

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
}
