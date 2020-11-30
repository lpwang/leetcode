/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
// 剑指 Offer 54. 二叉搜索树的第k大节点
// 中序遍历来解题

class Offer54_Solution {

	private int res;
	private int k;

    public int kthLargest(TreeNode root, int k) {
    	this.k = k;
    	helper(root);
    	return this.res;
    }

    private void helper (TreeNode root) {
    	if (root == null) {
    		return;
    	}
    	// 二叉搜索树，判断最大，从右子树开始
    	helper(root.right);
    	if (this.k <= 0) {
    		return;
    	}
    	this.k = this.k - 1;
    	this.res = root.val;
    	helper(root.left);
    }
}