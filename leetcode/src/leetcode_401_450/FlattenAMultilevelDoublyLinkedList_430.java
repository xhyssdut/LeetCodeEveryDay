package leetcode_401_450;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * leetcode_401_450
 *
 * @author xin
 * @date 2019-03-26
 */
public class FlattenAMultilevelDoublyLinkedList_430 {

    class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;

        public Node() {
        }

        public Node(int _val, Node _prev, Node _next, Node _child) {
            val = _val;
            prev = _prev;
            next = _next;
            child = _child;
        }
    }

    ;

    class Solution {
        public Node flatten(Node head) {
            if(head == null){
                return null;
            }
            Node cursor = head;
            LinkedList<Node> stack = new LinkedList<>();
            List<Integer> values = new ArrayList<>();
            while(cursor!=null||!stack.isEmpty()){
                if(cursor == null){
                    cursor = stack.pop();
                    cursor = cursor.next;
                }else {
                    values.add(cursor.val);
                    if(cursor.child!=null){
                        stack.push(cursor);
                        cursor = cursor.child;
                    }else {
                        cursor = cursor.next;
                    }
                }
            }
            Node newHead = new Node(values.get(0),null,null,null);
            cursor = newHead;
            for(int i =1;i<values.size();i++){
                Node node = new Node();
                node.prev = cursor;
                node.val = values.get(i);
                cursor.next = node;
                cursor = node;
            }
            return newHead;
        }
    }
}
