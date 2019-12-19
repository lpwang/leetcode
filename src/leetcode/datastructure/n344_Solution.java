package leetcode.datastructure;

class n344_Solution {
    public void reverseString(char[] s) {
        int beginIndex = 0;
        int endIndex = s.length-1;
        while (beginIndex < endIndex) {
        	swap(s,beginIndex,endIndex);
        	beginIndex++;
        	endIndex--;
        }
    }

    public void swap(char[] s,int beginIndex,int endIndex) {
    	char temp = s[beginIndex];
    	s[beginIndex] = s[endIndex];
    	s[endIndex] = temp;
    }
}