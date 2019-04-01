package leetcode_101_150;

import java.util.List;

/**
 * leetcode_101_150
 *
 * @author xin
 * @date 2019-03-27
 */
public class PathSumII_113 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {
        public boolean hasPathSum(TreeNode root, int sum) {
            return wander(root, sum);
        }

        public boolean wander(TreeNode node, int remain) {
            if(node == null){
                return false;
            }
            if(node.left==null&&node.right==null){
                if(node.val==remain){
                    return true;
                }else {
                    return false;
                }
            }else {
                return wander(node.left,remain-node.val)||wander(node.right,remain-node.val);
            }
        }
    }
}


