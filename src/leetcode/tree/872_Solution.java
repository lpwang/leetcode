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
class 872_Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        StringBuilder root1Builder = new StringBuilder();
        StringBuilder root2Builder = new StringBuilder();
        help(root1,root1Builder);
        help(root2,root2Builder);
        String root1LeafStr = root1Builder.toString();
        String root2LeafStr = root2Builder.toString();
        if ( root1LeafStr.equals(root2LeafStr) ) {
            return true;
        }
        return false;
    }

    public void help(TreeNode node,StringBuilder nodeBuilder) {
        if (null != node) {
            if (node.left == null && node.right == null) {
                nodeBuilder.append(",");
                nodeBuilder.append(node.val);
                return;
            }
            help(node.left,nodeBuilder);
            help(node.right,nodeBuilder);
        }
    }
}