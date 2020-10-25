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
// 二叉树展开为链表
class 114_Solution {
    public void flatten(TreeNode root) {
        LinkedList<TreeNode> list = new LinkedList<TreeNode>();
        preTra(root,list);
        for (int i=0;i<list.size();i++) {
            TreeNode preNode = list.get(i);
            preNode.left = null;
            if (i+1 < list.size() && list.get(i+1) != null ) {
                preNode.right = list.get(i+1);
            } else {
                preNode.right = null;
            }
        }
    }

    public void preTra(TreeNode node,LinkedList<TreeNode> list) {
        if (node == null) {
            return;
        }
        list.add(node);
        preTra(node.left,list);
        preTra(node.right,list);
    }
}