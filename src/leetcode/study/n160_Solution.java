package src.leetcode.datastructure;

import java.util.HashSet;
import java.util.Set;

class ListNode {
    int val;
	ListNode next;
	ListNode(int x) {
		val = x;
		next = null;
	}
}

public class n160_Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		Set<ListNode> sets = new HashSet<ListNode>();
		ListNode nodeA = headA;
		ListNode nodeB = headB;
		while (null != nodeA) {
			sets.add(nodeA);
			nodeA = nodeA.next;
		}

		while (null != nodeB) {
			if (sets.contains(nodeB)) {
				return nodeB;
			}
			nodeB = nodeB.next;
		}
		return null;
    }
}