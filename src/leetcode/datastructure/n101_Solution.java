package src.leetcode.datastructure;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
}

// 广度优先搜索算法
class n101_Solution {
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode t1 = queue.poll();
            TreeNode t2 = queue.poll();
            if (null == t1 && null == t2) {
                continue;
            }
            if (null == t1 || null == t2) {
                return false;
            }
            if (t1.val != t2.val) {
                return false;
            }
            queue.offer(t1.left);
            queue.offer(t2.right);
            queue.offer(t1.right);
            queue.offer(t2.left);
        }
        return true;
    }
}