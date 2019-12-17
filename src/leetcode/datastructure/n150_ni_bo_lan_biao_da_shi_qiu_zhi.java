package leetcode.datastructure;

import java.util.Stack;

public class n150_ni_bo_lan_biao_da_shi_qiu_zhi {
    public static void main(String[] args) {

    }
}

class Solution150 {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<String>();
        for (int i=0;i<tokens.length;i++) {
            String t = tokens[i];
            if (t.equals("+")) {
                int f = Integer.valueOf(stack.peek());
                stack.pop();
                int s = Integer.valueOf(stack.peek());
                stack.pop();
                stack.push(String.valueOf(s+f));
            } else if (t.equals("-")) {
                int f = Integer.valueOf(stack.peek());
                stack.pop();
                int s = Integer.valueOf(stack.peek());
                stack.pop();
                stack.push(String.valueOf(s-f));
            } else if (t.equals("*")) {
                int f = Integer.valueOf(stack.peek());
                stack.pop();
                int s = Integer.valueOf(stack.peek());
                stack.pop();
                stack.push(String.valueOf(s*f));
            } else if (t.equals("/")) {
                int f = Integer.valueOf(stack.peek());
                stack.pop();
                int s = Integer.valueOf(stack.peek());
                stack.pop();
                stack.push(String.valueOf(s/f));
            } else {
                stack.push(t);
            }
        }
        return Integer.valueOf(stack.peek());
    }
}