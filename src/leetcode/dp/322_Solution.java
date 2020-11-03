
// 322.零钱兑换问题

// 方法一使用的是回溯+备忘录求解
class 322_Solution {
    public int coinChange(int[] coins, int amount) {
        HashMap<Integer,Integer> dict = new HashMap<Integer,Integer>();
        return backTrace(coins,amount,dict);
    }

    public int backTrace(int[] coins, int amount,HashMap<Integer,Integer> dict) {
        if (dict.containsKey(amount)) {
            return dict.get(amount);
        }
        if (amount == 0) {
            return 0;
        }
        if (amount < 0) {
            return -1;
        }
        int maxVal = 65535;
        for (int i =0;i<coins.length;i++) {
            int val = backTrace(coins,amount - coins[i],dict);
            if (val == -1) {
                continue;
            }
            maxVal = Math.min(maxVal, 1+ val);
        }

        int res = maxVal == 65535 ? -1:maxVal;
        dict.put(amount,res);
        return res;
    }
}

// 方法二：自底向上求解 动态规划问题