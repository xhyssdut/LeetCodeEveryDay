package leetcode_201_250;

/**
 * leetcode_201_250
 * 请判断一个链表是否为回文链表。
 *
 * 算法：双指针找到中点，然后后半部分逆序，然后递归比较。
 * @author xin
 * @date 2019-02-28
 */
public class PalindromeLinkedList_234 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    class Solution {
        public boolean isPalindrome(ListNode head) {
            if (head == null || head.next == null) {
                return true;
            }
            ListNode slow = head;
            ListNode fast = head;
            boolean go = false;
            while (fast != null) {
                go = !go;
                if (go) {
                    slow = slow.next;
                }
                fast = fast.next;
            }
            ListNode current = slow;
            ListNode prev = null;
            ListNode newHead = null;

            while (current != null) {
                ListNode next = current.next;
                if (next == null) {
                    newHead = current;
                }
                current.next = prev;
                prev = current;
                current = next;
            }
            ListNode first = head;
            while (first != null && newHead != null) {
                if (first.val != newHead.val) {
                    return false;
                }
                first = first.next;
                newHead = newHead.next;
            }
            return true;

        }
    }
}
