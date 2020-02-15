package src.leetcode.datastructure;

class n70_Solution {
    public int climbStairs(int n) {
        if (1 == n) {
            return 1;
        }
        int[] status = new int[n+1];
        status[0] = 0;
        status[1] = 1;
        status[2] = 2;
        for (int i=3;i<=n;++i) {
            status[i] = status[i-1]+status[i-2];
        }
        return status[n];
    }
}