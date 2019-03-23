package leetcode_151_200;

/**
 * leetcode_151_200
 *
 * @author xin
 * @date 2019-03-19
 */
public class IntersectionOfTwoLinkedLists_160 {

      public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) {
              val = x;
              next = null;
          }
      }
    public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            int alength = getLength(headA);
            int blength = getLength(headB);
            if(alength>blength){
                int sub = alength-blength;
                while(sub>0&&headA!=null){
                    headA = headA.next;
                    sub--;
                }
            }else {
                int sub = blength-alength;
                while(sub>0&&headB!=null){
                    headB = headB.next;
                    sub--;
                }
            }
            while(headA!=null&&headB!=null&&headA!=headB){
                headA = headA.next;
                headB = headB.next;
            }
            return headA;
        }

        public int getLength(ListNode head){
            int count = 0;
            while(head!=null){
                count++;
                head = head.next;
            }
            return count;
        }
    }
}
