package leetcode_51_100;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * leetcode_51_100
 * 给定一个二叉树，判断其是否是一个有效的二叉搜索树。
 * 假设一个二叉搜索树具有如下特征：
 * 节点的左子树只包含小于当前节点的数。
 * 节点的右子树只包含大于当前节点的数。
 * 所有左子树和右子树自身必须也是二叉搜索树。
 *
 * 1.中序遍历递归
 * 2.中序遍历迭代
 * @author xin
 * @date 2019-02-28
 */
public class ValidateBinarySearchTree_98 {
    class Solution {
        List<Integer> treeList = new ArrayList<>();
        public boolean isValidBST(TreeNode root) {
            LinkedList<TreeNode> stack = new LinkedList<>();

            TreeNode cursor = root;
            while(cursor!=null||!stack.isEmpty()){
                while(cursor!=null){
                    stack.push(cursor);
                    cursor = cursor.left;
                }
                if(!stack.isEmpty()){
                    cursor = stack.pop();
                    System.out.println(cursor.val);
                    treeList.add(cursor.val);
                    cursor = cursor.right;
                }
            }
            for(int i =0;i<treeList.size()-1;i++){
                if(treeList.get(i)>=treeList.get(i+1)){
                    return false;
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
