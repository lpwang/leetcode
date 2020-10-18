/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
// 验证二叉搜索树
// 框架还是依旧，但是协助参数的代入，需要好好的研究
class 98_Solution {
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root,null,null);
    }

    public boolean isValidBST(TreeNode root,Integer min,Integer max) {
        if (null ==  root) {
            return true;
        }
        if (min != null && root.val <= min) {
            return false;
        }
        if (max != null && root.val >= max) {
            return false;
        }
        return isValidBST(root.left,min,root.val) && isValidBST(root.right,root.val,max);
    }
}