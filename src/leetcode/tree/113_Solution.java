/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
// 给定一个二叉树和一个目标和，找到所有从根节点到叶子节点路径总和等于给定目标和的路径。
class 113_Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        StringBuilder sb = new StringBuilder("0");
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        help(sb,root,sum,res);
        return res;
    }

    private void help(StringBuilder sb , TreeNode node, int sum,List<List<Integer>> res) {
        if (node != null) {
            if (node.left == null && node.right == null) {
                int tempVal = 0;
                sb.append(",");
                sb.append(node.val);
                String[] valList = sb.toString().split(",");
                ArrayList<Integer> list = new ArrayList<Integer>();
                for (int i=1;i<valList.length;i++) {
                    tempVal += Integer.valueOf(valList[i]);
                    list.add(Integer.valueOf(valList[i]));
                }
                if (tempVal == sum) {
                    res.add(list);
                }
                return;
            }

            // 前序遍历
            sb.append(",");
            sb.append(node.val);
            help(new StringBuilder(sb),node.left,sum,res);
            help(new StringBuilder(sb),node.right,sum,res);
        }
    }
}