package src.leetcode.datastructure;

// 两两交换链表中的节点  

public class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
}

class n24_Solution {
    public ListNode swapPairs(ListNode head) {
        if (null == head || null == head.next) {
            return head;
        }
        
        ListNode firstNode = head;
        ListNode secondNode = head.next;
        // 递下去        
        firstNode.next = swapPairs(secondNode.next);
        // 在归上来的时候进行和递下去的边界处进行节点的交换处理
        secondNode.next = firstNode;
        return secondNode;
    }
}