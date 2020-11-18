/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

// 求根到叶子节点数字之和
// 先序遍历 + 每层新建一个StringBuilder对象

class 129_Solution {
    public int sumNumbers(TreeNode root) {
        int sum = 0;
        ArrayList<Integer> resList = new ArrayList<Integer>();
        StringBuilder traceBuilder = new StringBuilder();
        // ArrayList<Integer> traceList = new ArrayList<Integer>();
        helper(root,traceBuilder,resList);
        for (Integer e : resList) {
            sum += e;
        }
        return sum;
    }

    private static void helper (TreeNode root,StringBuilder traceBuilder,ArrayList<Integer> resList) {
        if (root != null) {
            if (root.left == null && root.right == null) {
                traceBuilder.append(root.val);
                // 处理路径
                resList.add(Integer.valueOf(traceBuilder.toString()));
                return;
            }
            traceBuilder.append(root.val);
            helper(root.left,new StringBuilder(traceBuilder.toString()),resList);
            helper(root.right,new StringBuilder(traceBuilder.toString()),resList);
        }
    }
}