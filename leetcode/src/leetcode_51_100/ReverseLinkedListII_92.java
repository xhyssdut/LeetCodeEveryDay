package leetcode_51_100;

/**
 * leetcode_51_100
 *
 * @author xin
 * @date 2019-03-24
 */
public class ReverseLinkedListII_92 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    class Solution {
        public ListNode reverseBetween(ListNode head, int m, int n) {
            int count = 1;
            ListNode preReverse = head;
            ListNode firstReverse = null;
            ListNode current = head;
            ListNode next = null;
            ListNode pre = null;
            while(current!=null){
                if(count<m){
                    preReverse = current;
                    current=current.next;
                }else if(count>=m&&count<=n){
                    if(firstReverse==null){
                        firstReverse = current;
                    }
                    next = current.next;
                    current.next = pre;
                    pre = current;
                    current = next;
                }else {
                    break;
                }
                count++;

            }
            if(m == 1){
                head.next = current;
                return pre;
            }else {
                firstReverse.next = current;
                preReverse.next = pre;
                return head;
            }
        }
    }

    public static void main(String[] args) {
        ListNode l1 = new ReverseLinkedListII_92().new ListNode(1);
        ListNode l2 = new ReverseLinkedListII_92().new ListNode(2);
        ListNode l3 = new ReverseLinkedListII_92().new ListNode(3);
        ListNode l4 = new ReverseLinkedListII_92().new ListNode(4);
        ListNode l5 = new ReverseLinkedListII_92().new ListNode(5);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        Solution solution = new ReverseLinkedListII_92().new Solution();
        solution.reverseBetween(l1,2,5);
    }
}
