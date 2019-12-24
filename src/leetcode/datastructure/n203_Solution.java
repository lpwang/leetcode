package src.leetcode.datastructurel;

// 移除链表元素

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
}

class n203_Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode node = dummy;
        while (null != node.next) {
            if (node.next.val == val) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }
        return dummy.next;
    }
}