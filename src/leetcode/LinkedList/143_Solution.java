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
class 143_Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        int len = 0;
        // 遍历链表到list
        ArrayList<ListNode> list = new ArrayList<ListNode>();
        ListNode lenNode = head;
        while (lenNode != null) {
            list.add(lenNode);
            lenNode = lenNode.next;
        }
        // 多少尾部节点需要插入到前部节点中
        int loop = (list.size() - 1) / 2;
        ListNode p = head;
        for (int i=list.size() - 1; i>=list.size() - loop; i--) {
            ListNode temp = p.next;
            p.next = list.get(i);
            list.get(i).next = temp;
            p = temp;
        }
        // 对不同的len的尾部节点做不同的处理
        if (list.size() % 2 == 0) {
            p.next.next = null;
        } else {
            p.next = null;
        }
    }
}