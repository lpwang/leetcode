/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

// 61旋转链表

class 61_Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head==null||k==0) {
        	return head;
    	}
        ListNode dummyNode = new ListNode(0,head);
    	ListNode p = dummyNode;
    	int len = 0;
    	while (dummyNode.next != null) {
    		dummyNode = dummyNode.next;
    		len++;
    	}
        // 重点是这里，计算循环链表断开位置
    	int loop = len - (k%len);
    	// 头尾相连变成循环链表
    	dummyNode.next = head;
    	while (loop > 0) {
    		dummyNode = dummyNode.next;
    		loop--;
    	}
    	// 断开链接，变回单链表
    	p = dummyNode.next;
    	dummyNode.next = null;
    	return p;
    }
}