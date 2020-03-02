package leetcode.daily;

/**
 * 设计栈数据结构的操作
 * leetcode 225
 */
class N01_MyStack {

    int[] queue = null;
    int topIndex = 0;
    int index = 0;

    /** Initialize your data structure here. */
    public N01_MyStack() {
        queue = new int[65535];
        topIndex = -1;
        index = -1;
    }

    /** Push element x onto stack. */
    public void push(int x) {
        queue[++index] = x;
        topIndex++;
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        topIndex--;
        return queue[index--];
    }

    /** Get the top element. */
    public int top() {
        return queue[topIndex];
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return topIndex == -1 ? true : false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */