//反转从位置 m 到 n 的链表。请使用一趟扫描完成反转。
// 说明:
// 1 ≤ m ≤ n ≤ 链表长度。


// 输入: 1->2->3->4->5->NULL, m = 2, n = 4
// 输出: 1->4->3->2->5->NULL

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

// 反转链表 II

class 92_Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
    	ListNode dummyNode = new ListNode(0);
    	dummyNode.next = head;

    	int step = 0;
    	ListNode g = dummyNode;
    	// 找到M的位置
    	while (step < m-1) {
    		g = g.next;
    		step++;
    	}
    	// 设置P的位置
    	ListNode p = g.next;
    	int gap = n - m;
    	while (gap > 0) {
    		// 进行链表的头插法进行链表的反转
    		ListNode removedNode = p.next;
    		p.next = p.next.next;

    		removedNode.next = g.next;
    		g.next = removedNode;
    		gap--;
    	}
    	return dummyNode.next;
    }
}