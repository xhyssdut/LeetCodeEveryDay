package leetcode_51_100;

/**
 * leetcode_51_100
 *
 * @author xin
 * @date 2019-03-26
 */
public class RotateList_61 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    class Solution {
        public ListNode rotateRight(ListNode head, int k) {
            if(head == null){
                return null;
            }
            ListNode lastNode = null;
            ListNode cursor = head;
            int count = 1;
            while(cursor.next!=null){
                count++;
                cursor = cursor.next;
            }
            lastNode = cursor;
            k = count - k%count;
            ListNode dummy = new ListNode(0);
            dummy.next = head;
            cursor =dummy;
            count = 0;
            while(count<k){
                count++;
                cursor = cursor.next;
            }
            lastNode.next = head;
            head = cursor.next;
            cursor.next = null;
            return head;
        }
    }
}
