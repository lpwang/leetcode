/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
// 二叉树的层次遍历 II
// 广度优先搜索
class 107_Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (null == root) {
            return new ArrayList();
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        LinkedList<List<Integer>> res = new LinkedList<List<Integer>>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int len = queue.size();
            ArrayList<Integer> list = new ArrayList<Integer>();
            for (int i=0;i<len;i++) {
                TreeNode node = queue.poll();
                list.add(node.val);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            res.addFirst(list);
        }
        return res;
    }
}