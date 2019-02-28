package leetcode_201_250;

import com.sun.java.swing.action.NextAction;

/**
 * leetcode_201_250
 * 反转一个单链表
 * 你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
 * <p>
 * 迭代：三个指针来进行迭代
 * 递归：https://blog.csdn.net/u013132035/article/details/80589657
 *
 * @author xin
 * @date 2019-02-28
 */
public class ReverseLinkedList_206 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    class Solution1 {
        public ListNode reverseList(ListNode head) {
            ListNode current = head;
            ListNode newHead = null;
            ListNode prev = null;
            while (current != null) {
                ListNode next = current.next;
                if (next == null) {
                    newHead = current;
                }
                current.next = prev;
                prev = current;
                current = next;


            }
            return newHead;
        }
    }
    class Solution {
        public ListNode reverseList(ListNode head) {
            return recursive(head);
        }
        public ListNode recursive(ListNode head) {
            if (head == null || head.next == null) {
                return head;
            }
            ListNode newhead = recursive(head.next);
            head.next.next = head;
            head.next = null;
            return newhead;
        }
    }
}
