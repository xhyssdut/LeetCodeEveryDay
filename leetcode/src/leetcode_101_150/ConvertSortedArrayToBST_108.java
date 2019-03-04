package leetcode_101_150;

/**
 * leetcode_101_150
 *  将一个按照升序排列的有序数组，转换为一棵高度平衡二叉搜索树。
 * 本题中，一个高度平衡二叉树是指一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1。
 *
 * 算法：二分构建二叉树
 *
 * @author xin
 * @date 2019-03-01
 */
public class ConvertSortedArrayToBST_108 {
    class Solution {
        public TreeNode sortedArrayToBST(int[] nums) {
            if(nums == null ||nums.length==0){
                return null;
            }
            return buildTree(nums,0,nums.length-1);
        }
        public TreeNode buildTree(int[]nums,int left,int right){
            int mid = (left+right)/2;
            if(left>right){
                return null;
            }
            TreeNode node = new TreeNode(nums[mid]);
            node.left = buildTree(nums,left,mid-1);
            node.right = buildTree(nums,mid+1,right);
            return node;
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
