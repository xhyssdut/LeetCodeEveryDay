package leetcode_301_350;

/**
 * leetcode_301_350
 *
 * @author xin
 * @date 2019-03-26
 */
public class OddEvenLinkedList_328 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    class Solution {
        public ListNode oddEvenList(ListNode head) {
            ListNode evenDummy = new ListNode(-1);
            ListNode cursor = head;
            ListNode prev = null;
            ListNode even = evenDummy;
            while(cursor!=null&&cursor.next!=null){
                even.next = cursor.next;
                cursor.next = cursor.next.next;
                even.next.next = null;
                prev = cursor;
                cursor = cursor.next;
                even = even.next;
            }
            if(cursor == null){
                prev.next = evenDummy.next;
            }else {
                cursor.next = evenDummy.next;
            }
            return head;

        }
    }
}
