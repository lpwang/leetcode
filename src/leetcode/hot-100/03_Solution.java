// 使用双指针进行解答

class 03_Solution {
	public int lengthOfLongestSubstring(String s) {
        HashSet<Character> sets = new HashSet<Character>();
        int n = s.length();
        int res = 0;
        int rk = -1;
        for (int i = 0; i < n; i++) {
            if (i != 0) {
                sets.remove(s.charAt(i - 1));
            }
            while (rk+1 < n && !sets.contains(s.charAt(rk+1))) {
                sets.add(s.charAt(rk+1));
                rk++;
            }
            res = Math.max(res, rk - i + 1);
        }
        return res;
    }
}