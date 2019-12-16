package leetcode.datastructure;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class dakaizhuanpansuo_752 {
    public static void main(String[] args) {
        Solution_752 solution = new Solution_752();
        int depths = solution.openLock(new String[]{"1234"}, "2345");
        System.out.println(depths);
    }
}

class Solution_752 {
    public int openLock(String[] deadends, String target) {
        HashSet<String> dead = new HashSet<String>();
        for (int i=0;i<deadends.length;i++) {
            dead.add(deadends[i]);
        }

        int depths = 0;

        Queue<String> queue = new LinkedList<String>();
        queue.offer("0000");
        queue.offer(null);

        HashSet<String> seen = new HashSet<String>();
        seen.add("0000");

        while (!queue.isEmpty()) {
            String node = queue.poll();
            if (null == node) {
                depths += 1;
                if (!queue.isEmpty()) {
                    queue.offer(null);
                }
            } else if (target.equals(node)) {
                return depths;
            } else if (!dead.contains(node)) {
                // 进行
                for (int i=0;i<4;i++) {
                    //System.out.println(Integer.valueOf(node.substring(i,i+1))+1);
                    String addString = node.substring(0, i) + ((Integer.valueOf(node.substring(i,i+1))+1) % 10 + "") + node.substring(i+1);
                    String minString = node.substring(0, i) + (((Integer.valueOf(node.substring(i,i+1))-1) + 10 ) % 10 + "") + node.substring(i+1);
                    if (!seen.contains(addString)) {
                        seen.add(addString);
                        queue.offer(addString);
                    }
                    if (!seen.contains(minString)) {
                        seen.add(minString);
                        queue.offer(minString);
                    }
                }
            }
        }
        return -1;
    }
}