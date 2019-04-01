package leetcode_101_150;

/**
 * leetcode_101_150
 *
 * @author xin
 * @date 2019-03-24
 */
public class InsertionSortList_147 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    class Solution {
        public ListNode insertionSortList(ListNode head) {
            ListNode dummyHead = new ListNode(-1);
            while(head != null){
                ListNode next = head.next;
                ListNode p = dummyHead;
                while(p.next != null && head.val > p.next.val)
                    p = p.next;

                head.next = p.next;
                p.next = head;
                head = next;
            }
            return dummyHead.next;
        }
    }
}
