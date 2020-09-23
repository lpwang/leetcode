// 存在重复元素 III

// 刷题失败，之后再来吧

class n220_Solution {
    class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        List<Long> list = new ArrayList<Long>();
        for (int i=0;i<nums.length ;i++ ) {
            if (i > k) {
                list.remove(nums[i - k - 1]);
            }

            for (int j = 0; j < list.size(); j++) {
                if ( Math.abs( list.get(j) - (long) nums[i]) <= t) {
                    return true;
                }
            }

            list.add((long) nums[i]);
        }
        return false;
    }
}
}