// 最长回文子串
// 暴力求解方法

class n05_Solution {

    public String longestPalindrome(String s) {
    	if (s.length() < 2) {
    		return s;
    	}

    	int maxLen = 1;
    	int begin = 0;

    	char[] sc = s.toCharArray();

    	for (int i=0;i<sc.length;i++) {
    		for (int j=i+1;j<sc.length;j++) {
    			if (j-i+1>maxLen && judgePalindrome(sc,i,j)) {
    				maxLen = j-i+1;
    				begin = i;
    			}
    		}
    	}

    	return s.substring(begin,begin+maxLen);
    }

    public boolean judgePalindrome(char[] sc , int begin , int end) {
    	while (begin < end) {
    		if (sc[begin] != sc[end]) {
    			return false;
    		}
    		begin++;
    		end--;
    	}
    	return true;
    }


}

// 动态规划求解方法