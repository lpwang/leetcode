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
// 给定一个二叉树，计算 整个树 的坡度 。
// 一个树的 节点的坡度 定义即为，该节点左子树的节点之和和右子树节点之和的 差的绝对值 。如果没有左子树的话，左子树的节点之和为 0 ；没有右子树的话也是一样。空结点的坡度是 0 。
// 计算一颗二叉树的坡度
class 563_Solution {
    public int findTilt(TreeNode root) {
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	helper(root,list);
        int rootVal = 0;
    	for (int i=0;i<list.size();i++) {
    		rootVal += list.get(i);
    	}
    	return rootVal;
    }

    private int helper (TreeNode root,List<Integer> list) {
    	if (null == root) {
            return 0;
        }
        int leftVal = helper(root.left,list);
        int rightVal = helper(root.right,list);
        list.add(Math.abs(leftVal - rightVal));
        return leftVal+rightVal+root.val;
    }
}