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
public class BinaryTreePostorderTraversal_145 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {
        public List<Integer> postorderTraversal(TreeNode root) {
            List<Integer> result = new ArrayList<>();
            LinkedList<TreeNode> stack = new LinkedList<>();
            if(root!=null){
                stack.push(root);
                TreeNode c = null;
                TreeNode h = root;
                while(!stack.isEmpty()){
                    c = stack.peek();
                    if(c.left!=null&&h!=c.left&&h!=c.right){
                        stack.push(c.left);
                    }else if(c.right!=null&&h!=c.right){
                        stack.push(c.right);
                    }else{
                        result.add(c.val);
                        h = c;
                    }
                }
            }
            return result;
        }
    }
}
