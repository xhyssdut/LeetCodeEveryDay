package leetcode_101_150;

import java.util.*;

/**
 * 给定无向连通图中一个节点的引用，返回该图的深拷贝（克隆）。图中的每个节点都包含它的值 val（Int） 和其邻居的列表（list[Node]）。
 *
 * @author xin
 * @date 2019-03-05
 */
public class CloneGraph_133 {

    class Node {
        public int val;
        public List<Node> neighbors;

        public Node() {
        }

        public Node(int _val, List<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }

    class Solution {
        public Node cloneGraph(Node node) {
            if (node == null) return null;
            Map<Node, Node> map = new HashMap<>();
            int v = node.val;
            List<Node> list = new ArrayList<>();
            Node n = new Node(v, list);
            map.put(node, n);
            for (Node t : node.neighbors) {
                n.neighbors.add(cloneGraph(t, map));
            }
            return n;
        }

        private Node cloneGraph(Node node, Map<Node, Node> map) {
            if (map.containsKey(node)) return map.get(node);
            int v = node.val;
            List<Node> list = new ArrayList<>();
            Node n = new Node(v, list);
            map.put(node, n);
            for (Node t : node.neighbors) {
                n.neighbors.add(cloneGraph(t, map));
            }
            return n;
        }
    }

    public static void main(String[] args) {
        Node n1 = new CloneGraph_133().new Node(1, new ArrayList<>());
        Node n2 = new CloneGraph_133().new Node(2, new ArrayList<>());
        Node n3 = new CloneGraph_133().new Node(3, new ArrayList<>());
        Node n4 = new CloneGraph_133().new Node(4, new ArrayList<>());
        n1.neighbors.add(n2);
        n1.neighbors.add(n4);
        n2.neighbors.add(n1);
        n2.neighbors.add(n3);
        n3.neighbors.add(n2);
        n3.neighbors.add(n4);
        n4.neighbors.add(n1);
        n4.neighbors.add(n3);
        Solution solution = new CloneGraph_133().new Solution();
        solution.cloneGraph(n1);


    }
}
