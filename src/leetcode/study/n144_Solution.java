package src.leetcode.datastructure;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

// 树的前序遍历
class n144_Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        if (null == root) {
            return res;
        }
        return traversal(res, root);
    }

    public List<Integer> traversal(List<Integer> res,TreeNode root) {
        res.add(root.val);
        if (root.left != null) {
            traversal(res, root.left);
        }
        if (root.right != null) {
            traversal(res, root.right);
        }
        return res;
    }
}