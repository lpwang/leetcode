package src.leetcode.datastructure;

import java.util.HashMap;

class n387_Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for (int i=0;i<s.length();i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        
        for (int j=0;j<s.length();j++) {
            if (1 == map.get(s.charAt(j))) {
                return j;
            }
        }

        return -1;
    }
}