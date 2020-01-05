package src.leetcode.datastructure;

import java.util.ArrayDeque;
import java.util.Queue;

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
}

class n104_Solution {
    public int maxDepth(TreeNode root) {
        if (null == root) {
            return 0;
        }
        int depth = 0;
        Queue<TreeNode> queue = new ArrayDeque<TreeNode>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i=0;i<size;i++) {
                TreeNode treeNode = queue.poll();
                if (null != treeNode.left) {
                    queue.offer(treeNode.left);
                }
                if (null != treeNode.right) {
                    queue.offer(treeNode.right);
                }
            }
            depth++;
        }
        return depth;
    }
}