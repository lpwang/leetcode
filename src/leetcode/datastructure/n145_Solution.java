package src.leetcode.datastructure;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class n145_Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        if (null == root) {
            return res;
        }
        return traversal(res, root);
    }

    private List<Integer> traversal(List<Integer> res,TreeNode root) {
        if (root.left != null) {
            traversal(res, root.left);
        }
        if (root.right != null) {
            traversal(res, root.right);
        }
        res.add(root.val);
        return res;
    }
}