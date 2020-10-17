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
  /**
        对于任意一个节点, 如果最大和路径包含该节点, 那么只可能是两种情况:
        1. 其左右子树中所构成的和路径值较大的那个加上该节点的值后向父节点回溯构成最大路径
        2. 左右子树都在最大路径中, 加上该节点的值构成了最终的最大路径
  **/
class 124_Solution {
    int max = -65535;
    public int maxPathSum(TreeNode root) {
    	findMax(root);
    	return max;
    }

    public int findMax(TreeNode node) {
    	if (null == node) {
    		return 0;
    	}
    	int left = Math.max(findMax(node.left),0); // 如果子树路径和为负则应当置0表示最大路径不包含子树
    	int right = Math.max(findMax(node.right),0);
    	max = Math.max(max,left + right + node.val);
    	return Math.max(left,right) + node.val; // 返回较大的值进行比较
    }
}