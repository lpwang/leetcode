package src.leetcode.datastructure;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class n108_Solution {
    int[] nums = null;

    public TreeNode sortedArrayToBST(int[] nums) {
        this.nums = nums;
        return helper(0, nums.length);
    }

    private TreeNode helper(int left,int right) {
        if (left > right) return null;
        int m = (left + right) / 2;
        TreeNode root = new TreeNode(nums[m]);
        root.left = helper(left, m-1);
        root.right = helper(m+1, right);
        return root;
    }
}