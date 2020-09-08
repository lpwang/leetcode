/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class n236_Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }
        TreeNode leftNode = lowestCommonAncestor(root.left,p,q);
        TreeNode rightNode = lowestCommonAncestor(root.right,p,q);
        if (null == leftNode && null == rightNode) {
            return null;
        }
        if (leftNode != null && rightNode == null) {
            return leftNode;
        }
        if (rightNode != null && leftNode == null) {
            return rightNode;
        }
        return root;
    }
}