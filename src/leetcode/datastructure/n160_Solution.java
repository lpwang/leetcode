/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class n160_Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode la = headA;
        ListNode lb = headB;

        while (la != lb) {
        	if (la.next == null) {
        		la = headB;
        	}
        	if (lb.next == null) {
        		lb = headA;
        	}
        	la = la.next;
        	lb = lb.next;
        }
        
        return la;
    }
}