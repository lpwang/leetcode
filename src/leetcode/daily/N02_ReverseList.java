package leetcode.daily;

/**
 *  反转链表
 */

/**
 * Definition for singly-linked list.
 */

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class N02_ReverseList {

    public ListNode reverseList(ListNode head) {
        ListNode dummy = new ListNode(-1);
        ListNode dummyNext = dummy.next;

        while (null != head) {
            
        }

        return dummy.next;
    }
}
