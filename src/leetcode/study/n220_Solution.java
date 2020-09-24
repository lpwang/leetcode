// 存在重复元素 III

// 刷题失败，之后再来吧

// 二刷成功，利用treeset的floor和cell进行查询，然后对差值进行处理

class n220_Solution {
	public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        TreeSet<Long> set = new TreeSet<Long>();
        for (int i=0;i<nums.length ;i++ ) {
            if (i > k) {
                set.remove((long) nums[i - k - 1]);
            }

            Long floor = set.floor((long) t + (long) nums[i]);
            if (null != floor && Math.abs(floor - nums[i]) <= t) {
                return true;
            }

            set.add((long) nums[i]);
        }
        return false;
    }
}