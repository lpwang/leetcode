package leetcode.datastructure;

import java.util.Stack;

public class n155_zui_xiao_zhan {
    public static void main(String[] args) {

    }
}

class MinStack {

    private Stack<Integer> stack = null;
    private Stack<Integer> helperStack = null;
    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack<Integer>();
        helperStack = new Stack<Integer>();
    }

    public void push(int x) {
        stack.add(x);
        if (helperStack.isEmpty()) {
            helperStack.add(x);
        } else if (x <= helperStack.peek()) {
            // 防止重复所以需要包括等号
            helperStack.add(x);
        } else {
            // do nothing
        }
    }

    public void pop() {
        int node = stack.peek();
        if (helperStack.peek() == node) {
            helperStack.pop();
        }
        stack.pop();

    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return helperStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */