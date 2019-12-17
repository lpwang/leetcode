package leetcode.datastructure;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class n279_wan_quan_ping_fang_shu {
    public static void main(String[] args) {

    }
}

class Solution {
    public int numSquares(int n) {
        Queue<Node> queue = new LinkedList<Node>();
        HashSet<Integer> seen = new HashSet<Integer>();
        int step = 0;
        queue.offer(new Node(n,step));
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            for (int i=1;true;i++) {
                int remainNum = node.val - i*i;
                if (remainNum < 0) {
                    break;
                } else if (remainNum == 0) {
                    return node.step + 1;
                } else {
                    if (!seen.contains(remainNum)) {
                        seen.add(remainNum);
                        queue.offer(new Node(remainNum,node.step+1));
                    }
                }
            }
        }
        return -1;
    }
}

class Node {
    public int val;
    public int step;
    public Node (int val,int step) {
        this.val = val;
        this.step = step;
    }
}