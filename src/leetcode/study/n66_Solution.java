package leetcode.datastructure;

public class n66_Solution {
    public static void main(String[] args) {
        Solution66 solution66 = new Solution66();
        solution66.plusOne(new int[]{1,2,3});
    }
}

class Solution66 {
    public int[] plusOne(int[] digits) {
        for (int i=digits.length-1;i>=0;i--) {
            int plused_num = digits[i] + 1;
            if (plused_num < 10) {
                digits[i] = plused_num;
                break;
            } else {
                digits[i] = 0;
            }
        }
        return digits;
    }
}
