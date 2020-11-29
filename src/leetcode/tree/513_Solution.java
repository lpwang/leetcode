/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class 513_Solution {
    private int depthMax = 0;
	private int depthVal = 0;

    public int findBottomLeftValue(TreeNode root) {
        helper(root,0);
        return this.depthVal;
    }

    private int helper (TreeNode node , int depth) {
    	if (node == null) {
    		return depth;
    	}
    	int depthLeft = helper(node.left,depth + 1);
    	// 中序处理
    	if (this.depthMax < depthLeft) {
    		this.depthMax = depthLeft;
    		this.depthVal = node.val;
    	}
    	helper(node.right,depth + 1);
        return depth;
    }
}