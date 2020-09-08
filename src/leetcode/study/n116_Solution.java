/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

//填充每个节点的下一个右侧节点指针，广度优先算法，害，题解都有点忘记了

class n116_Solution {
    public Node connect(Node root) {
        if (null == root) {
            return null;
        }
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while (queue.size() > 0) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                if (i < size-1) {
                    node.next = queue.peek();
                }
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }
        return root;
    }
}