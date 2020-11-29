/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

// 589-N叉树的前序遍历

class 589_Solution {
    public List<Integer> preorder(Node root) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        helper(root,res);
        return res;
    }

    private void helper (Node node,List<Integer> res) {
        if (null == node) {
            return;
        }
        res.add(node.val);
        for (int i=0;i<node.children.size();i++) {
            helper(node.children.get(i),res);
        }
    }
}