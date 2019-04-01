package leetcode_651_700;


/**
 * 给定一个不含重复元素的整数数组。一个以此数组构建的最大二叉树定义如下：
 *
 * 二叉树的根是数组中的最大元素。
 * 左子树是通过数组中最大值左边部分构造出的最大二叉树。
 * 右子树是通过数组中最大值右边部分构造出的最大二叉树。
 * 通过给定的数组构建最大二叉树，并且输出这个树的根节点。
 * @author xin
 * @date 2019-03-23
 */
public class MaximumBinaryTree_654 {
     public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }
    class Solution {
        public TreeNode constructMaximumBinaryTree(int[] nums) {
            TreeNode[] treeNodes = new TreeNode[nums.length];
            for(int i = 0;i<nums.length;i++){
                treeNodes[i] = new TreeNode(nums[i]);
            }
            return process(0,nums.length-1,treeNodes);
        }
        public TreeNode process(int left,int right,TreeNode[] nodes){
            if(left>=right){
                return nodes[left];
            }
            int max = left;
            //获取最大值
            for(int i = left;i<=right;i++){
                max = nodes[i].val>nodes[left].val?i:left;
            }
            TreeNode father = nodes[max];
            if(max != left){
                father.left = process(left,max-1,nodes);
            }
            if(max!=right){
                father.right = process(max+1,right,nodes);
            }
            return father;
        }
    }
}
