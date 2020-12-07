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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class 109_Solution {

    private ListNode ghead;

    public TreeNode sortedListToBST(ListNode head) {
        ghead = head;
        // 声明dummy节点
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        // 计算链表长度
        int len = 0;
        while (dummy.next != null) {
            dummy = dummy.next;
            len++;
        }
        // 构建二叉搜索树
        return buildTree(0, len-1);
    }

    public TreeNode buildTree(int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = (left + right + 1) / 2 ;
        TreeNode rootNode = new TreeNode();
        // 树的中序遍历，应用于index中
        TreeNode leftNode = buildTree(left, mid - 1);
        rootNode.val = ghead.val;
        rootNode.left = leftNode;
        ghead = ghead.next;
        TreeNode rightNode = buildTree(mid + 1, right);
        rootNode.right = rightNode;
        return rootNode;
    }
}