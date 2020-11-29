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
// 在每个树行中找最大值
class 515_Solution {
    public List<Integer> largestValues(TreeNode root) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        helper(0,map,root);
        return new ArrayList(map.values());
    }

    private void helper (int high,Map<Integer,Integer> map,TreeNode node) {
        if (node == null) {
            return;
        }
        if (map.containsKey(high)) {
            map.put(high,Math.max(map.get(high),node.val));
        } else {
            map.put(high,node.val);
        }
        helper(high+1,map,node.left);
        helper(high+1,map,node.right);
    }
}