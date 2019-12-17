package leetcode.datastructure;

import java.util.Stack;

public class n20_you_xiao_de_kuo_hao {
    public static void main(String[] args) {

    }
}

class Solution155 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        int sl = s.length();
        for (int i=0;i<sl;i++) {
            char c = s.charAt(i);
            if (stack.isEmpty()) {
                stack.add(c);
            } else if (((int) stack.peek()) + 1 == (int) c ||
                    ((int) stack.peek()) + 2 == (int) c
            ) {
                stack.pop();
            } else {
                stack.add(c);
            }
        }
        return 0 == stack.size();
    }
}