/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/
// 图数据结构的深度优先搜索
class 133_Solution {
    // 用于判断是否已经创建过Node
    private HashMap<Integer, Node> map = new HashMap<Integer, Node>();

    public Node cloneGraph(Node node) {
        return dfs(node);
    }

    private Node dfs (Node node) {
        if (null == node) {
            return null;
        }
        if (map.containsKey(node.val)) {
            return map.get(node.val);
        }
        Node clone = new Node(node.val);
        map.put(node.val, clone);
        for (Node n : node.neighbors) {
            clone.neighbors.add(dfs(n));
        }
        return clone;
    }
}