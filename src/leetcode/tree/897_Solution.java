/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class 897_Solution {
    public TreeNode increasingBST(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        helper(res,root);
        TreeNode newTree = new TreeNode(res.get(0));
        TreeNode temp = newTree;
        for (int i=1;i<res.size();i++) {
            temp.right = new TreeNode(res.get(i));
            temp = temp.right;
        }
        return newTree;
    }

    private void helper(ArrayList<Integer> res,TreeNode root) {
            if (root == null) {
                return;
            }
            helper(res,root.left);
            res.add(root.val);
            helper(res,root.right);
    }
}