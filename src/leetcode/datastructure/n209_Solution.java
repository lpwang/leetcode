// 双指针，滑动窗口
class n209_Solution {
    public int minSubArrayLen(int s, int[] nums) {
    	if (nums.length == 0) {
    		return 0;
    	}
    	int res = Integer.MAX_VALUE;
    	int left = 0;
    	int right = 0;
    	int sum = 0;
    	while (right < nums.length) {
    		sum += nums[right];
    		while (left <= right && sum >= s) {
    			if (res > right - left + 1) {
    				res = right - left + 1;
    			}
    			sum -= nums[left];
    			left++;
    		}
    		right++;
        }
        if (res == Integer.MAX_VALUE) {
            return 0;
        }
    	return res;
    }
}