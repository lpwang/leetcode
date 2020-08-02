package leetcode.study;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @program: leetcode
 * @ClassName n151_Solution
 * @description:
 * @author: lambertWang
 * @create: 2020-08-02 15:39
 * @Version 1.0
 **/
public class n151_Solution {
    public static void main(String[] args) {
        String restr = reverseWords("   my  name is   wangliping ");
        System.out.println(restr);
    }

    public static String reverseWords(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;
        // 删除左边的空格
        while (left < right && chars[left] == ' ') {
            left++;
        }
        // 删除右边的空格
        while (right > left && chars[right] == ' ') {
            right--;
        }

        StringBuilder sb = new StringBuilder();
        Stack<String> sk = new Stack<String>();

        while (left <= right) {
            if (chars[left] == ' ' && sb.length() > 0) {
                sk.push(sb.toString());
                sb.setLength(0);
            } else if (chars[left] != ' ')  {
                sb.append(chars[left]);
            }
            left++;
        }
        // 最后的sb判断
        if (sb.length() > 0) {
            sk.push(sb.toString());
            sb.setLength(0);
        }

        int resultIndex = 0;
        String[] results = new String[sk.size()];
        while (sk.size() > 0) {
            results[resultIndex++] = sk.pop();
        }
        return String.join(" ", results);
    }
}
