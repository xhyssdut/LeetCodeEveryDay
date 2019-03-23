package leetcode_201_250;

/**
 * leetcode_201_250
 *
 * @author xin
 * @date 2019-03-19
 */
public class RemoveLinkedListElements_203 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    class Solution {
        public ListNode removeElements(ListNode head, int val) {
            ListNode header = new ListNode(-1);
            header.next = head;
            ListNode cur = header;
            while (cur.next != null) {
                if (cur.next.val == val) {
                    cur.next = cur.next.next;
                } else {
                    cur = cur.next;
                }
            }
            return header.next;
        }
    }
}
