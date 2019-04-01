package leetcode_101_150;

/**
 * leetcode_101_150
 *
 * @author xin
 * @date 2019-03-24
 */
public class SortList_148 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    class Solution {
        public ListNode sortList(ListNode head) {
            if (head == null || head.next == null) {
                return head;
            }
            ListNode slow, fast, pre = null;
            slow = fast = head;
            while(fast != null && fast.next != null){
                pre = slow; slow = slow.next; fast = fast.next.next;
            }
            pre.next = null;
            ListNode L = sortList(head), R = sortList(slow);
            return merge(L, R);
        }

        ListNode merge(ListNode L, ListNode R){
            if (L == null) return R;
            if (R == null) return L;
            if (L.val < R.val){
                L.next = merge(L.next, R);
                return L;
            }else {
                R.next = merge(L, R.next);
                return R;
            }
        }
    }
}
