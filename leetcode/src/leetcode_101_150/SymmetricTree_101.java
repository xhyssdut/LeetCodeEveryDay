package leetcode_101_150;


import java.util.LinkedList;

/**
 * leetcode.leetcode_101_150
 * 给定一个二叉树，检查它是否是镜像对称的。
 * @author xin
 * @date 2019-02-20
 */
public class SymmetricTree_101 {

    /**
     * 递归做法
     */
    class Solution1 {
        public boolean isSymmetric(TreeNode root) {
            if (root == null) {
                return true;
            }
            return isSymmetricSubTree(root.left, root.right);
        }

        public boolean isSymmetricSubTree(TreeNode p, TreeNode q) {
            if (p == null && q == null) {
                return true;
            } else if (p != null && q != null) {
                if (p.val == q.val) {
                    return isSymmetricSubTree(p.left, q.right) && isSymmetricSubTree(p.right, q.left);
                }
            }
            return false;
        }
    }

    /**
     * 非递归做法
     */
    class Solution {
        public boolean isSymmetric(TreeNode root) {
            if (root == null) {
                return true;
            }
            if (root.left == null && root.right == null) {
                return true;
            } else if (root.left == null || root.right == null) {
                return false;
            }

            LinkedList<TreeNode> deque = new LinkedList<>();

            deque.offerFirst(root.left);
            deque.offerLast(root.right);
            while (!deque.isEmpty()) {
                TreeNode head = deque.pollFirst();
                TreeNode tail = deque.pollLast();
                if (head.val != tail.val) {
                    return false;
                }
                if ((head.left == null && tail.right != null) || (head.left != null && tail.right == null)) {
                    return false;
                }
                if (head.left != null) {
                    deque.offerFirst(head.left);
                    deque.offerLast(tail.right);
                }
                if ((head.right == null && tail.left != null) || (head.right != null && tail.left == null)) {
                    return false;
                }
                if (head.right != null) {
                    deque.offerFirst(head.right);
                    deque.offerLast(tail.left);
                }
            }
            return true;
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
