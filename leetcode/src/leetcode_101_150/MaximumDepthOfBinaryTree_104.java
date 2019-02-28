package leetcode_101_150;

import javafx.util.Pair;

import java.util.LinkedList;

/**
 * leetcode.leetcode_101_150
 * 给定一个二叉树，找出其最大深度。
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 * 说明: 叶子节点是指没有子节点的节点。
 * @author xin
 * @date 2019-02-20
 */
public class MaximumDepthOfBinaryTree_104 {


    /**
     * 递归
     */
    class Solution1 {
        public int maxDepth(TreeNode root) {
           return maxDepthNode(root);
        }
        public int maxDepthNode(TreeNode node){
            if(node == null){
                return 0;
            }else if(node.left==null&&node.right==null){
                return 1;
            }else {
                return 1+Math.max(maxDepthNode(node.left),maxDepthNode(node.right));
            }
        }
    }

    /**
     * 非递归
     */
    class Solution {
        public int maxDepth(TreeNode root) {
            int depth = 0;
            if(root == null){
                return depth;
            }
            LinkedList<Pair<TreeNode,Integer>> list = new LinkedList<>();
            list.push(new Pair<>(root,1));
            while(!list.isEmpty()){
                Pair<TreeNode,Integer> pair = list.pop();
                TreeNode node = pair.getKey();
                if(node!=null){
                    depth = Math.max(depth,pair.getValue());
                    list.push(new Pair<>(node.left,pair.getValue()+1));
                    list.push(new Pair<>(node.right,pair.getValue()+1));
                }
            }
            return depth;
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
