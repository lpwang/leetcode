package src.leetcode.datastructure;

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }

class n98_Solution {
    public boolean isValidBST(TreeNode root) {
        return help(root, null, null);
    }

    public boolean help(TreeNode node,Integer upper,Integer lower) {
        if (null == node) {
            return true;
        }
        int val = node.val;
        if (null != upper && val >= upper) return false;
        if (null != lower && val <= lower) return false;

        if (!help(node.left, val, lower)) return false;
        if (!help(node.right, upper, val)) return false;
        return true;
    }
}