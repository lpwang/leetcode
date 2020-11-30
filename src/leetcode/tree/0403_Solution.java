/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

// 特定深度节点列表
// 使用广度优先搜索

class 0403_Solution {
    public ListNode[] listOfDepth(TreeNode tree) {
        ArrayList<ListNode> resList = new ArrayList<ListNode>();
    	Queue<TreeNode> queue = new LinkedList<TreeNode>();
    	queue.offer(tree);
    	while (queue.size() > 0) {
    		int len = queue.size();
    		ListNode dummyNode = new ListNode(0);
    		ListNode tempNode = dummyNode;
    		for (int i=0;i<len;i++) {
    			TreeNode node = queue.poll();
    			tempNode.next = new ListNode(node.val);
    			tempNode = tempNode.next;
	    		if (node.left != null) {
	    			queue.offer(node.left);
	    		}
	    		if (node.right != null) {
					queue.offer(node.right);
	    		}
    		}

    		resList.add(dummyNode.next);
    	}
    	return resList.toArray(new ListNode[resList.size()]);
    }
}