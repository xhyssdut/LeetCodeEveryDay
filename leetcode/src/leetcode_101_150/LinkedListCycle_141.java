package leetcode_101_150;


/**
 * leetcode_101_150
 * 给定一个链表，判断链表中是否有环。
 * 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。
 * 1.循环，把所有节点都加到Set中，一旦某次加失败了，就说明有环
 * 2.快慢指针，相遇就有环
 *
 * @author xin
 * @date 2019-02-28
 */
public class LinkedListCycle_141 {
    public class Solution {
        public boolean hasCycle(ListNode head) {
            boolean go = true;
            ListNode slow = head;
            ListNode fast = head;
            while(fast!=null){
                go = !go;
                if(go){
                    slow = slow.next;
                }
                fast = fast.next;
                if(slow == fast ){
                    return true;
                }
            }
            return false;
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
