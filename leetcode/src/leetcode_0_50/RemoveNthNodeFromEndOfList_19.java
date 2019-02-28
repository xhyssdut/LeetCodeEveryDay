package leetcode_0_50;

import java.util.LinkedList;
import java.util.List;

/**
 * leetcode_0_50
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 * 示例：
 * 给定一个链表: 1->2->3->4->5, 和 n = 2.
 * 当删除了倒数第二个节点后，链表变为 1->2->3->5.
 *
 * 注意边界问题
 *
 * @author xin
 * @date 2019-02-28
 */
public class RemoveNthNodeFromEndOfList_19 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            if(head.next==null){
                return null;
            }
            LinkedList<ListNode> list = new LinkedList<>();
            ListNode cursor = head;
            while (cursor!=null){
                list.addLast(cursor);
                if(list.size()>n+1){
                    list.removeFirst();
                }
                cursor = cursor.next;
            }
            ListNode beforeNth = list.getFirst();
            if(list.size()==n){
                ListNode newHead = beforeNth.next;
                beforeNth = null;
                return newHead;
            }else {
                beforeNth.next = beforeNth.next.next;
                return head;
            }
        }
    }
}
