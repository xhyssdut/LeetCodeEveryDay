package leetcode_0_50;

/**
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * <p>
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * <p>
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * @author xin
 * @date 2019-02-12
 */
public class AddTwoNumbers_2 {

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) { val = x; }
     * }
     */
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode head = new ListNode(-1);
            ListNode cursor = head;
            //临时位，为0
            int temp = 0;
            ListNode cursor1 = l1;
            ListNode cursor2 = l2;
            while(cursor1!=null||cursor2!=null){
                if(cursor2!=null&&cursor1!=null){
                    temp += cursor2.val + cursor1.val ;
                    cursor.next = new ListNode(temp%10);
                    temp = temp/10;
                    cursor = cursor.next;
                    cursor1 = cursor1.next;
                    cursor2 = cursor2.next;
                }else if(cursor1==null){
                    temp += cursor2.val ;
                    cursor.next = new ListNode(temp%10);
                    temp = temp/10;
                    cursor = cursor.next;
                    cursor2 = cursor2.next;
                }else {
                    cursor2 = cursor1;
                    cursor1 = null;
                }
            }
            if(temp!=0){
                cursor.next = new ListNode(temp%10);
            }
            return head.next;
        }
    }


}
