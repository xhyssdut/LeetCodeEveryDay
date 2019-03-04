package leetcode_601_650;

/**
 * leetcode_601_650
 *
 * @author xin
 * @date 2019-03-04
 */
public class DesignCircularQueue_622 {


    class MyCircularQueue {
        int[] datas;
        int tail;
        int head;
        boolean full;
        boolean empty;

        /**
         * Initialize your data structure here. Set the size of the queue to be k.
         */
        public MyCircularQueue(int k) {
            datas = new int[k];
            empty = true;
        }

        /**
         * Insert an element into the circular queue. Return true if the operation is successful.
         */
        public boolean enQueue(int value) {
            if (full) {
                return false;
            }
            datas[tail] = value;
            tail = (tail + 1) % datas.length;
            empty = false;
            if (tail == head) {
                full = true;
            }
            return true;
        }

        /**
         * Delete an element from the circular queue. Return true if the operation is successful.
         */
        public boolean deQueue() {
            if (empty) {
                return false;
            }
            head = (head + 1) % (datas.length);
            full = false;
            if (head == tail) {
                empty = true;
            }
            return true;
        }

        /**
         * Get the front item from the queue.
         */
        public int Front() {
            if (empty) {
                return -1;
            }
            return datas[head];

        }

        /**
         * Get the last item from the queue.
         */
        public int Rear() {
            if (empty) {
                return -1;
            }
            return datas[(tail - 1 + datas.length) % datas.length];

        }

        /**
         * Checks whether the circular queue is empty or not.
         */
        public boolean isEmpty() {
            return empty;
        }

        /**
         * Checks whether the circular queue is full or not.
         */
        public boolean isFull() {
            return full;
        }
    }

    public static void main(String[] args) {
        MyCircularQueue queue = new DesignCircularQueue_622().new MyCircularQueue(3);
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);

    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */

