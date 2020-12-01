/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
// 二叉树直径
// 使用后序遍历对树的高度进行计算
// 返回的是树的高度
class 543_Solution {
    private int res = -1;

    public int diameterOfBinaryTree(TreeNode root) {
        if (null == root) {
            return 0;
        }
    	helper(root);
    	return res - 1;
    }

    private int helper (TreeNode node) {
    	if (null == node) {
    		return 0;
    	}
    	int L = helper(node.left);
    	int R = helper(node.right);
    	res = Math.max(res,L+R+1);
    	return Math.max(L + 1, R + 1);
    }
}