public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
}

class n112_Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
     	if (null == root) {
     		return false;
     	}

     	sum -= root.val;
     	if (root.left == null && root.right == null) {
     		return 0 == sum;
     	}
     	return hasPathSum(root.left,sum) || hasPathSum(root.right,sum); 
    }
}