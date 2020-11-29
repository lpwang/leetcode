/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

// 二叉树剪枝，使用后序遍历，注意审题。
// 返回移除了所有不包含 1 的子树的原二叉树。

class 814_Solution {
    public TreeNode pruneTree(TreeNode root) {
        boolean tr = helper(root);
        if (tr) {
            return null;
        }
        return root;
    }

    private boolean helper (TreeNode node) {
        if (null == node) {
            return true;
        }
        boolean lr = helper(node.left);
        boolean rr = helper(node.right);
        if (lr) {
            node.left = null;
        }
        if (rr) {
            node.right = null;
        }
        return node.val == 0 && lr && rr;
    }
}