package leetcode_101_150;

/**
 * leetcode_101_150
 *
 * @author xin
 * @date 2019-03-24
 */
public class CopyListWithRandomPointer_138 {

    class Node {
        public int val;
        public Node next;
        public Node random;

        public Node() {
        }

        public Node(int _val, Node _next, Node _random) {
            val = _val;
            next = _next;
            random = _random;
        }
    }
    ;

    class Solution {
        public Node copyRandomList(Node head) {
            Node current = head;
            while (current!=null){
                Node copy = new Node(current.val,current.next,null);
                current.next = copy;
                current = copy.next;

            }
            current = head;
            while(current!=null){
                Node copy = current.next;
                copy.random = current.random==null?null:current.random.next;
                current = copy.next;
            }
            current = head;
            Node copyHead = head.next;
            while(current!=null){
                Node copy = current.next;
                current.next = copy.next;
                current = copy.next;
                copy.next = current==null?null:current.next;
            }
            return copyHead;
        }
    }
}
