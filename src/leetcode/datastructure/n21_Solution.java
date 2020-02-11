package src.leetcode.datastructure;

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
}

class n21_Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode rl = new ListNode(-1);
        ListNode dummyNode = rl;
        while (null != l1 && null != l2) {
            if (l1.val <= l2.val) {
                rl.next = l1;
                l1 = l1.next;
            } else {
                rl.next = l2;
                l2 = l2.next;
            }
            // 移动位置
            rl = rl.next;
        }
        rl.next = (null == l1) ? l2:l1;
        return dummyNode.next;
    }
}