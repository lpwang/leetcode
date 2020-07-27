package src.leetcode.datastructure;

public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class n328_Solution {
    public ListNode oddEvenList(ListNode head) {
        if (null == head) return null;
        ListNode odd = head;
        ListNode even = odd.next;
        ListNode evenHead = even;
        while (null != even && null != even.next) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
}