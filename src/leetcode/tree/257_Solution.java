/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
// 二叉树的所有路径
// 使用前序遍历进行路径字符串的操作，因为递归所以每次进行递归调用的时候都创建一个StringBuilder
// 之后可以使用回溯算法进行计算
class 257_Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> res = new ArrayList<String>();
        helper(root,"",res);
        return res;
    }

    private void helper(TreeNode node,String route,List<String> res) {
        if (node != null) {
            StringBuilder sb = new StringBuilder(route);
            // 终止递归条件
            if (node.left == null && node.right == null) {
                sb.append(node.val);
                res.add(sb.toString());
            }
            // 前序遍历操作
            sb.append(node.val);
            sb.append("->");
            helper(node.left,sb.toString(),res);
            helper(node.right,sb.toString(),res);
        }
    }
}