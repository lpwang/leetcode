// 存在重复元素 II

/*

输入: nums = [1,2,3,1], k = 3
输出: true

输入: nums = [1,0,1,1], k = 1
输出: true

输入: nums = [1,2,3,1,2,3], k = 2
输出: false

*/

class n219_Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
    	HashMap<Integer,Integer> judgeMap = new HashMap<Integer,Integer>(nums.length);
    	for (int i = 0;i<nums.length ;i++ ) {
    		int val = nums[i];
    		Integer sameValIndex = 0;
    		if ((sameValIndex = judgeMap.get(val)) != null &&  i - sameValIndex <= k) {
    			return true;
    		} else {
    			judgeMap.put(val,i);
    		}
    	}
    	return false;
    }
}