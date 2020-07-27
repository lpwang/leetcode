/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class n142_Solution {
    public ListNode detectCycle(ListNode head) {
    	if (null == head || null == head.next) {
    		return null;
    	}
    	ListNode node = head;
        Set<ListNode> sets = new HashSet<ListNode>();
        while (null != node) {
        	if (sets.contains(node)) {
        		return node;
        	}
        	sets.add(node);
        	node = node.next;
        }
        return null;
    }
}