package leetcode.datastructure;

public class n28_Solution {
    public static void main(String[] args) {
        Solution28 solution28 = new Solution28();
        System.out.println(solution28.strStr("hello", "ll"));
    }
}

class Solution28 {
    public int strStr(String haystack, String needle) {
        if (needle.equals("")) {
            return 0;
        }
        if (haystack.equals("") && needle.equals("")) {
            return 0;
        }
        int needLength = needle.length();
        int haystackLength = haystack.length();
        int beginIndex = 0;
        while (haystackLength >= needLength) {
            String substring = haystack.substring(beginIndex, beginIndex+needLength);
            if (substring.equals(needle)) {
                return beginIndex;
            }
            beginIndex += 1;
            haystackLength -= 1;
        }
        return -1;
    }
}
