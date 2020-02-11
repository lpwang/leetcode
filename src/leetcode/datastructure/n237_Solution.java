package src.leetcode.datastructure;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}


class n237_Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}