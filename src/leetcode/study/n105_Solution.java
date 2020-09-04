// 从前序与中序遍历序列构造二叉树


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class n105_Solution {

	private int preorderIndex = 0;
	private HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
	private int[] preorder;
	private int[] inorder;

	public TreeNode helper(int left,int right) {
		if (left > right) {
			return null;
		}
		// 从前序队列的0位置开始遍历
		int preVal = preorder[preorderIndex];
		preorderIndex++;
		TreeNode node = new TreeNode(preVal);
		int inorderIndex = map.get(preVal);
		// 先构建左子树
		node.left = helper(left,inorderIndex - 1);
		// 再构建右子树
		node.right = helper(inorderIndex + 1,right);
		return node;
	}


    public TreeNode buildTree(int[] preorder, int[] inorder) {
    	this.preorderIndex = 0;
    	this.preorder = preorder;
    	this.inorder = inorder;
    	for (int i=0;i<inorder.length;i++ ) {
    		map.put(inorder[i],i);
    	}
    	return helper(0,inorder.length-1);
    }
}