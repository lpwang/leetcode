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
// 二叉树的最小深度
// 试用BFS解决
class 111_Solution {
    public int minDepth(TreeNode root) {
    	int depth = 1;
    	if (root == null) {
    		return 0;
    	}
    	if (root.left == null && root.right == null) {
    		return depth;
    	}
    	Queue<TreeNode> queue = new LinkedList<TreeNode>();
    	queue.offer(root);
    	while (!queue.isEmpty()) {
    		int len = queue.size();
    		for (int i=0;i< len;i++ ) {
	    		TreeNode node = queue.poll();
	    		if (node.left == null && node.right == null) {
	    			return depth;
	    		}
	    		if (node.left != null) {
	    			queue.offer(node.left);
	    		}
	    		if (node.right != null) {
					queue.offer(node.right);
	    		}
    		}
    		depth++;
    	}
    	return depth;
    }
}