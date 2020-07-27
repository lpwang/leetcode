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
public class n141_Solution {
    public boolean hasCycle(ListNode head) {
    	if (null == head || null == head.next) {
    		return false;
    	}
    	ListNode slow = head;
    	ListNode fast = head.next;
    	while (slow != fast) {
    		if (null == fast || null == fast.next) {
    			return false;
    		}
    		slow = slow.next;
    		fast = fast.next.next;
    	}
    	return true;
    }
}