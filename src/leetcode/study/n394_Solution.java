package leetcode.datastructure;
import java.util.Stack;

/**
  * 解题思路：
  * 将decodeStr拆解后会有四种可能：数字、字母、[、]
  * 使用栈保存遍历的结果，numStack保存数字，stringStack保存字母
  * 例:3[a2[c]]
  * 1、遇到数字：计算数字的大小，注意连续数字的情况
  * 2、遇到左括号：将之前得到的数字入栈，之前得到的字母也入栈，情况数字和字母
  * 3、遇到字母：累加连续字母
  * 4、遇到右括号：将数字出栈，将累加字母根据数字翻倍，将字母也出栈，和翻倍字母拼接
  * 5、循环1-4
*/
class n394_Solution {
    public String decodeString(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Integer> num_stack = new Stack<Integer>();
        Stack<String> string_stack = new Stack<String>();
        int num = 0;
        for (int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                num = num * 10 + c -'0';
            } else if (c == '[') {
                num_stack.push(num);
                string_stack.push(sb.toString());
                num = 0;
                sb.delete(0, sb.length());
            } else if (c == ']') {
                String item = sb.toString();
                int repet = num_stack.pop();
                for (int j=1;j<repet;j++) {
                    sb.append(item);
                }
                sb.insert(0,string_stack.pop());
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}