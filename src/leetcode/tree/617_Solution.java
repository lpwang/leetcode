/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
// 合并两个二叉树
// 一开始想复杂了
// 使用前序遍历计算都不为空的情况的值
// 使用后序遍历对节点的左节点和右节点进行设置
// 使用前序遍历+后序遍历进行求解
// 这道热题不错~值得好好的思考以后的解题思路
class 617_Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
    	if (t1 == null && t2 == null) {
    		return null;
    	} else if (t1 == null && t2 != null) {
    		return t2;
    	} else if (t1 != null && t2 == null) {
    		return t1;
    	}
    	t1.val = t1.val + t2.val;
    	t1.left = mergeTrees(t1.left,t2.left);
    	t1.right = mergeTrees(t1.right,t2.right);
    	return t1;
    }
}