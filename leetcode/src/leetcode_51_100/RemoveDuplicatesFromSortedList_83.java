package leetcode_51_100;

/**
 * leetcode.leetcode_51_100
 * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 *
 *
 * 别忘记边界测试
 * @author xin
 * @date 2019-02-18
 */
public class RemoveDuplicatesFromSortedList_83 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) { val = x; }
     * }
     */
    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            if(head == null || head.next == null){
                return head;
            }
            ListNode cursor = head;
            while (cursor.next!=null) {
                if(cursor.next.val==cursor.val){
                    cursor.next = cursor.next.next;
                }else {
                    cursor = cursor.next;
                }
            }
            return head;
        }
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
