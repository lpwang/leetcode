package leetcode.datastructure;

public class n14_Solution {
    public static void main(String[] args) {
        Solution14 solution14 = new Solution14();
        System.out.println(solution14.longestCommonPrefix(new String[]{"aa","a"}));
    }
}

class Solution14 {
    public String longestCommonPrefix(String[] strs) {
        String prefix = "";
        if (0 == strs.length) {
            return prefix;
        }
        prefix = strs[0];
        for (int i=0;i<strs.length;i++) {
            String str = strs[i];
            if (str.equals("") || prefix.equals("")) {
                return "";
            }
            if (str.equals(prefix)) {
                continue;
            } else {
                for (int j=0;j<str.length();j++) {
                    if (! str.substring(0,j+1).equals(prefix.substring(0,j+1)) ) {
                        prefix = str.substring(0,j);
                        return prefix;
                    }
                }
            }
        }
        return prefix;
    }
}