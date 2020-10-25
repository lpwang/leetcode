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
// 寻找重复的子树
// 后续遍历框架
class 652_Solution {
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        List<TreeNode> res = new ArrayList<TreeNode>();
        helper(map,res,root);
        return res;
    }

    public String helper(Map<String,Integer> map,List<TreeNode> res,TreeNode node) {
        if (null == node) {
            return "*";
        }
        String leftStr = helper(map,res,node.left);
        String rightStr = helper(map,res,node.right);
        // 后序遍历
        String key = leftStr +"#"+ rightStr +"#"+ String.valueOf(node.val);
        if (map.containsKey(key) && map.get(key) + 1 == 2) {
            map.put(key,map.get(key) + 1);
            res.add(node);
        } else {
            map.put(key,(map.get(key) == null ? 0:map.get(key)) + 1);
        }
        return key;
    }
}