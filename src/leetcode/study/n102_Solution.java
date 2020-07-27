package src.leetcode.datastructure;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

// 二叉树的层次遍历

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
}

class QueueNode {
    int val;
    int level;
    TreeNode node;
    QueueNode (int val,int level,TreeNode node) {
        this.val = val;
        this.level = level;
        this.node = node;
    }
}

class n102_Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        ArrayList<List<Integer>> resList = new ArrayList<List<Integer>>();
        Queue<QueueNode> queue = new ArrayDeque<QueueNode>();
        QueueNode queueNode = new QueueNode(root.val,0,root);
        queue.offer(queueNode);
        while (!queue.isEmpty()) {
            QueueNode qn = queue.poll();
            if (null == resList.get(qn.level)) {
                ArrayList<Integer> nodeList = new ArrayList<Integer>();
                nodeList.add(qn.val);
                resList.add(qn.level, nodeList);
            } else {
                List<Integer> nodeList = resList.get(qn.level);
                nodeList.add(qn.val);
            }

            if (qn.node.left != null) {
                queue.offer(new QueueNode(qn.node.left.val, qn.level+1, qn.node.left));
            }
            
            if (qn.node.right != null) {
                queue.offer(new QueueNode(qn.node.right.val, qn.level+1, qn.node.right));
            }
        }
        return resList;
    }
}