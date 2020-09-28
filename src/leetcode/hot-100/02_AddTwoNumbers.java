// 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
// 输出：7 -> 0 -> 8
// 原因：342 + 465 = 807


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class 02_AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	ListNode l1Temp = l1;
        ListNode l2Temp = l2;
        int enter = 0;
        ListNode resNode = new ListNode(0);
        ListNode assResNode = resNode;
        while (l1Temp != null || l2Temp != null) {
            int leftVal = null == l1Temp ? 0 : l1Temp.val;
            int rightVal = null == l2Temp ? 0 : l2Temp.val;
            int result = leftVal + rightVal + enter;
            enter = 0;
            if (result > 9) {
                result = result % 10;
                enter++;
            }
            assResNode.next = new ListNode(result);
            assResNode = assResNode.next;
            if (l1Temp != null) {
                l1Temp = l1Temp.next;
            }
            if (l2Temp != null) {
                l2Temp = l2Temp.next;
            }

        }
        if (enter > 0) {
            assResNode.next = new ListNode(1);
        }
        return resNode.next;
    }
}