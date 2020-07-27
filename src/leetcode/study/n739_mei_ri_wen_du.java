package leetcode.datastructure;

import java.util.Stack;

public class n739_mei_ri_wen_du {
    public static void main(String[] args) {

    }
}

class Solution739 {
    public int[] dailyTemperatures(int[] T) {
        int[] T1 = new int[T.length];
        for (int i=0;i<T.length;i++) {
            Stack<Integer> stack = new Stack<Integer>();
            stack.push(i);
            for (int j=i+1;j<T.length;j++) {
                if (T[j] > T[i]) {
                    stack.push(j);
                    break;
                }
            }
            T1[i] = stack.size() == 1 ? 0:stack.peek() - i;
        }
        return T1;
    }
}