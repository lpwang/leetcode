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
// 判断两个树是否相同
class 100_Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
    	// 结束条件
    	if (p == null && q == null) {
    		return true;
    	}
    	// 如果一个节点空 另一个节点不空 也返回false
    	if (p == null || q == null) {
    		return false;
    	}
    	// 值不同也返回false
    	if (p.val != q.val) {
    		return false;
    	}
    	return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}