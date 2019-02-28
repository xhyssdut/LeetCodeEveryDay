package leetcode_0_50;

/**
 * leetcode
 *
 * @author xin
 * @date 2018-12-19
 */
public class MergeTwoSortedLists_21 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
    class Solution {
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            if(l1==null){
                return l2;
            }
            if(l2==null){
                return l1;
            }
            ListNode head = new ListNode(Integer.MIN_VALUE);
            ListNode cursor = head;
            ListNode l1Cursor = l1;
            ListNode l2Cursor = l2;
            while (l1Cursor!=null||l2Cursor!=null){
                if(l1Cursor==null){
                    cursor.next = l2Cursor;
                    //这里可以直接返回了
                    return head.next;
                }else if(l2Cursor==null){
                    cursor.next = l1Cursor;
                    return head.next;
                    //这里可以直接返回了
                }else if(l1Cursor.val<l2Cursor.val){
                    cursor.next = l1Cursor;
                    cursor = cursor.next;
                    l1Cursor = l1Cursor.next;
                }else {
                    cursor.next = l2Cursor;
                    cursor = cursor.next;
                    l2Cursor = l2Cursor.next;
                }

            }
            return head.next;
        }
    }
}
