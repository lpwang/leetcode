package src.leetcode.datastructure;

// 删除链表的倒数第N个节点 - 中等


class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class n19_Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = head;
        
        while (null != first) {
            first = first.next;
            length++;
        }
        
        first = dummy;
        length -= n;
        while (length > 0) {
            first = first.next;
            length--;
        }
        first.next = first.next.next;
        return dummy.next;
    }
}