package leetcode_201_250;

import java.util.LinkedList;

/**
 * leetcode_201_250
 *
 * @author xin
 * @date 2019-03-06
 */
public class ImplementQueueUsingStacks_232 {
    class MyQueue {
        LinkedList<Integer> leftStack;
        LinkedList<Integer> rightStack;

        /**
         * Initialize your data structure here.
         */
        public MyQueue() {
            leftStack = new LinkedList<>();
            rightStack = new LinkedList<>();
        }

        /**
         * Push element x to the back of queue.
         */
        public void push(int x) {
            while (!leftStack.isEmpty()) {
                rightStack.push(leftStack.pop());
            }
            leftStack.push(x);
            while (!rightStack.isEmpty()) {
                leftStack.push(rightStack.pop());
            }
        }

        /**
         * Removes the element from in front of queue and returns that element.
         */
        public int pop() {
            return leftStack.pop();
        }

        /**
         * Get the front element.
         */
        public int peek() {
            return leftStack.peek();
        }

        /**
         * Returns whether the queue is empty.
         */
        public boolean empty() {
            return leftStack.isEmpty();
        }
    }

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
}
