package leetcode_101_150;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * leetcode_101_150
 *
 * @author xin
 * @date 2019-03-24
 */
public class BinaryTreePreorderTraversal_144 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {
        public List<Integer> preorderTraversal(TreeNode root) {
            LinkedList<TreeNode> stack = new LinkedList<>();
            List<Integer> list = new ArrayList<>();
            if(root!=null){
                stack.push(root);
                while(!stack.isEmpty()){
                    TreeNode node = stack.pop();
                    list.add(node.val);
                    if(node.right!=null){
                        stack.push(node.right);
                    }
                    if(node.left!=null){
                        stack.push(node.left);
                    }
                }
            }
            return list;
        }
    }
}
