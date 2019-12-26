package src.leetcode.datastructure;

import java.util.ArrayList;
import java.util.HashSet;

// 回文链表

public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class n234_Solution {
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ListNode first = head;
        while (null != first) {
            list.add(first.val);
            first = first.next;
        }
        int i = 0;
        int j = list.size() - 1;
        while (i < j) {
            if (0 != list.get(i).compareTo(list.get(j))) {
                return false;
            }
            i++;
            j--;
        }
        
        return true;
    }
}