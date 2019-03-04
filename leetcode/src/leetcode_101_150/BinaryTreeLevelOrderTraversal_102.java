package leetcode_101_150;

import com.sun.org.apache.regexp.internal.RE;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 给定一个二叉树，返回其按层次遍历的节点值。 （即逐层地，从左到右访问所有节点）。
 * 例如:
 * 给定二叉树: [3,9,20,null,null,15,7],
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * 返回其层次遍历结果：
 * [
 * [3],
 * [9,20],
 * [15,7]
 * ]
 * <p>
 * 算法1：迭代广度优先遍历
 * 算法2：递归。
 *
 * @author xin
 * @date 2019-03-01
 */
public class BinaryTreeLevelOrderTraversal_102 {

    class Solution1 {
        public List<List<Integer>> levelOrder(TreeNode root) {
            if (root == null) {
                return new ArrayList<>();
            }
            List<List<Integer>> result = new ArrayList<>();
            LinkedList<TreeNode> queue = new LinkedList<>();
            queue.addLast(root);
            while (!queue.isEmpty()) {
                int size = queue.size();
                List<Integer> list = new ArrayList<>();
                while (size > 0) {
                    TreeNode node = queue.removeFirst();
                    list.add(node.val);
                    if (node.left != null) {
                        queue.addLast(node.left);
                    }
                    if (node.right != null) {
                        queue.addLast(node.right);
                    }
                    size--;
                }
                result.add(list);
            }
            return result;
        }
    }


    class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> result = new ArrayList<>();
            level(root, 0, result);
            return result;
        }

        public void level(TreeNode node, int level, List<List<Integer>> result) {
            if(node==null){
                return;
            }
            if(result.size()<level+1){
                result.add(new ArrayList<>());
            }
            result.get(level).add(node.val);
            level(node.left,level+1,result);
            level(node.right,level+1,result);
        }
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
