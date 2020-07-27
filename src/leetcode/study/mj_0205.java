package src.leetcode.datastructure;


class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class mj_0205 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode ans = new ListNode(0);
        ListNode cur = ans;
        while (null != l1 || null != l2) {
            int l1Val = (null == l1 ? 0 : l1.val);
            int l2Val = (null == l2 ? 0 : l2.val);
            int sum = l1Val+l2Val+carry;
            carry = sum / 10;
            cur.next = new ListNode(sum % 10);
            cur = cur.next;
            l1 = null == l1 ? null:l1.next;
            l2 = null == l2 ? null:l2.next;
        }
        if (1 == carry) {
            cur.next = new ListNode(1);
        }
        return ans.next;
    }
}