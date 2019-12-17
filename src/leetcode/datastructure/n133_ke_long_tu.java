package leetcode.datastructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class n133_ke_long_tu {
    public static void main(String[] args) {

    }
}

class Solution133 {

    class Node {
        public int val;
        public List<Node> neighbors;

        public Node() {}

        public Node(int _val,List<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }

    public Node cloneGraph(Node node) {
        if (null == node) {
            return null;
        }
        HashMap<Integer,Node> map = new HashMap<Integer,Node>();
        return lookUp(map,node);
    }

    public Node lookUp (HashMap<Integer,Node> map,Node node) {
        Node node_clone = map.get(node.val);
        if (node_clone != null) {
            return node_clone;
        }
        node_clone = new Node(node.val,new ArrayList<Node>());
        map.put(node.val,node_clone);
        for (Node node_nei : node.neighbors) {
            node_clone.neighbors.add(lookUp(map,node_nei));
        }
        return node_clone;
    }
}
