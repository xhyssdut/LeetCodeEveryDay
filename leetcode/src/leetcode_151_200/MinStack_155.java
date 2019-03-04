package leetcode_151_200;

import java.util.LinkedList;

/**
 * 设计一个支持 push，pop，top 操作，并能在常数时间内检索到最小元素的栈。
 * push(x) -- 将元素 x 推入栈中。
 * pop() -- 删除栈顶的元素。
 * top() -- 获取栈顶元素。
 * getMin() -- 检索栈中的最小元素。
 *
 * 算法1：两个栈
 * 算法2：一个栈
 *
 * @author xin
 * @date 2019-03-01
 */
public class MinStack_155 {
    class MinStack1 {

        LinkedList<Integer> normal;
        LinkedList<Integer> min;

        /**
         * initialize your data structure here.
         */
        public MinStack1() {
            normal = new LinkedList<>();
            min = new LinkedList<>();
        }

        public void push(int x) {
            normal.push(x);
            if(!min.isEmpty()&&min.peek()<x){
                min.push(min.peek());
            }else {
                min.push(x);
            }
        }

        public void pop() {
            normal.pop();
            min.pop();
        }

        public int top() {
            return normal.peek();
        }

        public int getMin() {
            return min.peek();
        }
    }

    class MinStack {

        LinkedList<Integer> stack;
        int min;
        /**
         * initialize your data structure here.
         */
        public MinStack() {
            stack = new LinkedList<>();
            min = Integer.MAX_VALUE;
        }

        public void push(int x) {
            if(x<min){
                min = x;
            }
            stack.push(x);
            stack.push(min);
        }

        public void pop() {
            stack.pop();
            stack.pop();
            if(stack.isEmpty()){
                min = Integer.MAX_VALUE;
            }else {
                min =stack.peek();
            }
        }

        public int top() {
            int min = stack.pop();
            int x = stack.peek();
            stack.push(min);
            return x;
        }

        public int getMin() {
            return min;
        }
    }

}
