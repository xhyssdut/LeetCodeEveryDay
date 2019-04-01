package leetcode_51_100;

import java.util.HashMap;
import java.util.Map;

/**
 * leetcode_51_100
 *
 * @author xin
 * @date 2019-03-24
 */
public class RemoveDuplicatesFromSortedListII_82 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            if(head==null){
                return null;
            }
            Map<Integer,Integer> map = new HashMap<>();
            ListNode current = head;
            while(current!=null){
                if(map.containsKey(current.val)){
                    map.put(current.val,map.get(current.val)+1);
                }else {
                    map.put(current.val,1);
                }
                current = current.next;
            }
            ListNode sen = new ListNode(-1);
            sen.next = head;
            current = sen;
            while(current.next!=null){
                if(map.get(current.next.val)>1){
                    current.next = current.next.next;
                }else {
                    current = current.next;
                }
            }
            return sen.next;
        }
    }
}
