package leetcode.datastructure;

public class n67_Solution {
    public static void main(String[] args) {
        Solution67 solution67 = new Solution67();
        System.out.println(solution67.addBinary("11","1"));
    }
}

class Solution67 {
    public String addBinary(String a, String b) {
        char[] charA = a.toCharArray();
        char[] charB = b.toCharArray();
        int maxLength = Math.max(charA.length,charB.length);
        int duration = 0;
        if (maxLength == charA.length) {
            duration = maxLength - charB.length;
            StringBuilder sbbd = new StringBuilder(b);
            for (int i = 0; i < duration; i++) {
                sbbd = sbbd.insert(0, "0");
            }
            charB = sbbd.toString().toCharArray();
        } else {
            duration = maxLength - charA.length;
            StringBuilder sbad = new StringBuilder(a);
            for (int i = 0; i < duration; i++) {
                sbad = sbad.insert(0, "0");
            }
            charA = sbad.toString().toCharArray();
        }

        StringBuilder res = new StringBuilder();
        boolean isEnter = false;
        for (int i= maxLength-1;i>=0;i--){
            char ca = charA[i];
            char cb = charB[i];
            if (ca == '0' && cb == '0') {
                res = isEnter ? res.insert(0, '1') : res.insert(0, '0');
                isEnter = false;
            } else if ((ca == '0' && cb == '1') || (ca == '1' && cb == '0')) {
                res = isEnter ? res.insert(0, '0') : res.insert(0, '1');
            } else if (ca == '1' && cb == '1') {
                res = isEnter ? res.insert(0, '1') : res.insert(0, '0');
                isEnter = true;
            }
        }
        res = isEnter ? res.insert(0, '1') : res;
        return res.toString();
    }
}
