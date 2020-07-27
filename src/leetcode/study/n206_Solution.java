package src.leetcode.datastructure;

class ListNode {
  int val;
  ListNode next;
  ListNode(int x) { val = x; }
}

class n206_Solution {
    public ListNode reverseList(ListNode head) {
        ListNode cur = head;
        ListNode pre = null;
        ListNode temp = null;
        while (null != cur) {
            temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }
}