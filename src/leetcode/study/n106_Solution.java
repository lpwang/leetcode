// 从中序与后序遍历序列构造二叉树

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class n106_Solution {
	int postOrderIndex = 0;
	int[] inorder = null;
	int[] postorder = null;
	HashMap<Integer,Integer> inorderMap = new HashMap<Integer,Integer>();

	private TreeNode helper(int left,int right) {
		if (left > right) {
			return null;
		}
		// 从后序遍历的数组中从后向前逐一元素遍历
		int postVal = this.postorder[postOrderIndex];
		this.postOrderIndex--;

		TreeNode root = new TreeNode(postVal);
		// 根据中序遍历的数组进行左右子树的范围界定，界定何时构建左右子树
		int idx = inorderMap.get(postVal);
		// 构建右子树
		root.right = helper(idx + 1 , right);
		// 构建左子树
		root.left = helper(left , idx - 1);
		return root;
	}

    public TreeNode buildTree(int[] inorder, int[] postorder) {
    	this.inorder = inorder;
    	this.postorder = postorder;
    	this.postOrderIndex = postorder.length - 1;
    	for (int i=0;i<inorder.length;i++) {
    		inorderMap.put(inorder[i],i);
    	}
    	return helper(0,inorder.length-1);
    }
}
