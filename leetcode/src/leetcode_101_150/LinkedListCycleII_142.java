package leetcode_101_150;

/**
 * leetcode_101_150
 * 给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。
 * <p>
 * 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。
 * <p>
 * 说明：不允许修改给定的链表。
 * <p>
 * 解题思路：分两个步骤，首先通过快慢指针的方法判断链表是否有环；接下来如果有环，则寻找入环的第一个节点。
 * 具体的方法为，首先假定链表起点到入环的第一个节点A的长度为a【未知】，到快慢指针相遇的节点B的长度为（a + b）【这个长度是已知的】。
 * 现在我们想知道a的值，注意到快指针p2始终是慢指针p走过长度的2倍，所以慢指针p从B继续走（a + b）又能回到B点，如果只走a个长度就能回到节点A。但是a的值是不知道的，
 * 解决思路是曲线救国，注意到起点到A的长度是a，那么可以用一个从起点开始的新指针q和从节点B开始的慢指针p同步走，相遇的地方必然是入环的第一个节点A。
 *
 * @author xin
 * @date 2019-02-28
 */
public class LinkedListCycleII_142 {
    public class Solution {
        public ListNode detectCycle(ListNode head) {
            boolean go = true;
            ListNode slow = head;
            ListNode fast = head;
            while (fast != null&&fast.next!=null) {
                slow = slow.next;
                fast = fast.next.next;
                if (slow == fast) {
                    fast = head;
                    while (fast!=slow) {
                        slow = slow.next;
                        fast = fast.next;

                    }
                    return slow;
                }
            }

            return null;
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
