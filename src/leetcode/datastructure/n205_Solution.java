package leetcode.datastructure;

class n205_Solution {
    public boolean isIsomorphic(String s, String t) {
        return jedgeIsomorphic(s,t) && jedgeIsomorphic(t,s);
    }

    public boolean jedgeIsomorphic(String s, String t) {
        int length = s.length();
        HashMap<Character,Character> map = new HashMap<Character,Character>();
        for (int i=0;i<length;i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if (map.containsKey(c1)) {
                if (map.get(c1) != c2) {
                    return false;
                }
            } else {
                map.put(c1, c2);
            }
        }
        return true;
    }
}
