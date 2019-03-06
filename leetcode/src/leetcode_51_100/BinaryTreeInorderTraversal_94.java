package leetcode_51_100;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * leetcode_51_100
 * 给定一个二叉树，返回它的中序 遍历。
 * @author xin
 * @date 2019-03-06
 */
public class BinaryTreeInorderTraversal_94 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {
        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> result = new ArrayList<>();
            if(root==null){
                return result;
            }
            return inorderTraversalIterate(root);
//            return inorderTraversalRecursive(root,result);
        }

        public List<Integer> inorderTraversalRecursive(TreeNode root,List<Integer> result) {
            if(root.left!=null){
                inorderTraversalRecursive(root.left,result);
            }
            result.add(root.val);
            if(root.right!=null){
                inorderTraversalRecursive(root.right,result);
            }
            return result;
        }

        public List<Integer> inorderTraversalIterate(TreeNode root) {
            List<Integer> result = new ArrayList<>();
            LinkedList<TreeNode> queue = new LinkedList<>();
            HashSet<TreeNode> visited = new HashSet<>();
            queue.push(root);
            while(!queue.isEmpty()){
                TreeNode node = queue.pop();
                if(visited.contains(node)){
                    result.add(node.val);
                }else if(node.right==null&&node.left==null){
                    result.add(node.val);
                }else {
                    visited.add(node);
                    if(node.right!=null){
                        queue.push(node.right);
                    }
                    queue.push(node);
                    if(node.left!=null){
                        queue.push(node.left);
                    }
                }
            }
            return result;
        }
    }
}
