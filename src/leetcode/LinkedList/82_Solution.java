/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

// 删除排序链表中的重复元素 II
// 这道题自己做出来了
// 差了一点else那部分，但是还可以
// 使用了三个指针进行求解。

class 82_Solution {
    public ListNode deleteDuplicates(ListNode head) {
    	if (null == head || null == head.next) {
    		return head;
    	}
        ListNode dummyNode = new ListNode(0);
    	dummyNode.next = head;
    	ListNode p = dummyNode;
    	while (p.next != null && p.next.next != null) {
    		if (p.next.val == p.next.next.val) {
    			ListNode x = p.next.next;
    			while (x.next != null && x.val == x.next.val) {
    				x = x.next;
    			}
    			p.next = x.next;
    		} else {
    			p = p.next;	
    		}
    	}
    	return dummyNode.next;
    }
}