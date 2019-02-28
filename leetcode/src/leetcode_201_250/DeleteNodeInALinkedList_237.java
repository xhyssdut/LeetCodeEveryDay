package leetcode_201_250;

/**
 * leetcode_201_250
 * 请编写一个函数，使其可以删除某个链表中给定的（非末尾）节点，你将只被给定要求被删除的节点。
 * @author xin
 * @date 2019-02-28
 */
public class DeleteNodeInALinkedList_237 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    class Solution {
        public void deleteNode(ListNode node) {
            ListNode cursor =node;
            ListNode next = node.next;
            while (next.next!=null){
                cursor.val = next.val;
                cursor = cursor.next;
                next = next.next;
            }
            cursor.val = next.val;
            cursor.next = null;
        }
    }
}
