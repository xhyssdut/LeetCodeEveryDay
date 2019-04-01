package leetcode_651_700;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * leetcode_651_700
 *
 * @author xin
 * @date 2019-03-27
 */
public class FindDuplicateSubtrees_652 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {
        public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
            Map<String,Integer> map = new HashMap<>();
            List<TreeNode> result = new ArrayList<>();
            findDuplicateSubtrees(root,map,result);
            return result;
        }
        private String findDuplicateSubtrees(TreeNode node, Map<String, Integer> map, List<TreeNode> res) {
            if (node == null) {
                return "#";
            }
            String leftPath = findDuplicateSubtrees(node.left, map, res);
            String rightPath = findDuplicateSubtrees(node.right, map, res);
            String path = node.val + leftPath + rightPath;
            map.put(path, map.getOrDefault(path, 0) + 1);
            // 因 TreeNode 未重写 equals 和 hashCode 方法，
            // 故而需要根据 path 的出现次数，限制 res 中相同子树只添加一次
            if (map.get(path) == 2) {
                res.add(node);
            }
            return path;
        }
    }
}
