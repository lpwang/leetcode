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
// 二叉搜索树中的插入操作
class 701_Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
        	return new TreeNode(val);
        }
        if (root.val > val) {
        	root.left = insertIntoBST(root.left,val);
        }
        if (root.val < val) {
        	root.right = insertIntoBST(root.right,val);
        }
        return root;
    }
}