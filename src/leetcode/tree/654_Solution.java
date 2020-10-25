/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
// 构建最大二叉树
// 使用树的先序遍历
// 最值得注意的是index边界的处理
class 654_Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return helper(nums,0,nums.length - 1);
    }

    public TreeNode helper(int[] nums,int low,int high) {
        if (low > high) {
            return null;
        }
        // 找到最大值
        int max = -65535;
        int maxIndex = -1;
        for (int i=low;i<=high;i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }
        }
        // 构建节点
        TreeNode root = new TreeNode(max);
        root.left = helper(nums,low,maxIndex - 1);
        root.right = helper(nums,maxIndex + 1,high);
        return root;
    }
}