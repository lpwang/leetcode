class n242_Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] sChars = s.toCharArray();
        // 初始化
        HashMap<Character, Integer> sMap = new HashMap<>(s.length());
        for (int i=0;i<sChars.length;i++) {
            Integer count = null;
            if (( count = sMap.get(sChars[i]) ) == null) {
                sMap.put(sChars[i], 1);
            } else {
                sMap.put(sChars[i], ++count);
            }
        }
        // 使用t进行判断
        char[] tchars = t.toCharArray();
        for (char c : tchars) {
            Integer count = sMap.get(c);
            if (null == count) {
                return false;
            }
            if (--count == 0) {
                sMap.remove(c);
            } else {
                sMap.put(c, count);
            }
        }
        return sMap.keySet().size() == 0 ? true : false;
    }
}