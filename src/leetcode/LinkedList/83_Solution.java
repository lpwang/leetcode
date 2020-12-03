/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

// 删除排序链表中的重复元素
// 操,就差了一个else

class 83_Solution {
    public ListNode deleteDuplicates(ListNode head) {
    	ListNode dummyNode = new ListNode(0);
    	dummyNode.next = head;

    	while (head != null && head.next != null) {
    		if (head.val == head.next.val) {
    			head.next = head.next.next;
    		} else {// 就是这里的else，这里处理了[1，1，1]的情况
    			head = head.next;
    		}
    	}

    	return dummyNode.next;
    }
}