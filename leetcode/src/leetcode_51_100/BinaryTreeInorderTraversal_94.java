package leetcode_51_100;

import java.util.ArrayList;

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
            return inorderTraversalIterate(root,result);
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

        public List<Integer> inorderTraversalIterate(TreeNode root,List<Integer> list) {
            LinkedList<TreeNode> stack = new LinkedList<>();
            stack.push(root);
            TreeNode head = root;
            while(!stack.isEmpty()||head!=null){
                if(head!=null){
                    stack.push(head);
                    head = head.left;
                }else {
                    head = stack.pop();
                    list.add(head.val);
                    head = head.right;
                }
            }
            return list;
        }
    }
}
