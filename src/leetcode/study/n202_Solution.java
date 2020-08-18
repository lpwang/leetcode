class n202_Solution {
    public boolean isHappy(int n) {
        if (n == 0) {
            return false;
        }
        int maxValue = 10000;
        HashMap<Integer, Integer> valMap = new HashMap<>();
        Integer targetNum = new Integer(n);
        while (maxValue-- > 0) {
            String targetNumStr = targetNum.toString();
            char[] chars = targetNumStr.toCharArray();
            int alterNum = 0;
            for (char c : chars) {
                int cn = Character.getNumericValue(c);
                if (!valMap.containsKey(cn)) {
                    valMap.put(cn, cn * cn);
                }
                Integer cv = valMap.get(cn);
                alterNum += cv;
            }
            targetNum = alterNum;
            if (targetNum == 1) {
                return true;
            }
        }
        return false;
    }
}   