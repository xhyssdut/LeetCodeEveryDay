package leetcode_51_100;

import java.util.LinkedList;

/**
 * leetcode.leetcode_51_100
 * 给定两个二叉树，编写一个函数来检验它们是否相同。
 * 如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
 *
 * @author xin
 * @date 2019-02-20
 */
public class SameTree_100 {

    /**
     * 递归方法
     */
    class Solution1 {
        public boolean isSameTree(TreeNode p, TreeNode q) {
            return isTheSameTree(p,q);
        }
        public boolean isTheSameTree(TreeNode p,TreeNode q){
            if(p == null && q == null){
                return true;
            }else if(p!=null && q!=null){
                if(p.val == q.val){
                    return isTheSameTree(p.left,q.left)&&isTheSameTree(p.right,q.right);
                }
            }
            return false;
        }
    }

    /**
     * 同时前序遍历，如果前序遍历有问题就返回false
     */
    class Solution {
        public boolean isSameTree(TreeNode p, TreeNode q) {
            if(p==null&&q==null){
                return true;
            }else if(p!=null&&q!=null){
                LinkedList<TreeNode> listp = new LinkedList<>();
                LinkedList<TreeNode> listq = new LinkedList<>();
                listp.push(p);
                listq.push(q);
                while(!listp.isEmpty()&&!listq.isEmpty()){
                    TreeNode a = listp.pop();
                    TreeNode b = listq.pop();
                    if(a.val != b.val){
                        return false;
                    }else {
                        if(a.left!=null&&b.left!=null){
                            listp.push(a.left);
                            listq.push(b.left);
                        }else if(a.left==null&&b.left==null){

                        }else {
                            return false;
                        }
                        if(a.right!=null&&b.right!=null){
                            listp.push(a.right);
                            listq.push(b.right);
                        }else if(a.right==null&&b.right==null){

                        }else {
                            return false;
                        }
                    }
                }
                return true;
            }else {
                return false;
            }

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
