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

// 把二叉搜索树转换为累加树
// 使用反转的中序遍历进行求解，然后对于每个节点进行累加，并赋值给当前节点
// 做了半天，日~

class 538_Solution {
    private int sum = 0;

    public TreeNode convertBST(TreeNode root) {
    	return helper(root);
    }

    private TreeNode helper (TreeNode node) {
    	if (null == node) {
    		return null;
    	}
    	helper(node.right);
        sum += node.val;
    	node.val = sum;
    	helper(node.left);
    	return node;
    }
}