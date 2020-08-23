class n34_Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] resRange = new int[]{-1,-1};
    	if (nums.length == 0) {
    		return resRange;
    	}
    	int left = 0;
    	int right = nums.length;
    	// 找到leftIndex
    	while (left < right) {
    		int mid = left + (right - left) / 2;
    		if (nums[mid] >= target ) {
    			right = mid;
    		} else {
    			left = mid + 1;
    		}
    	}
    	if (left == nums.length ||nums[left] != target) {
    		return resRange;
    	}
    	resRange[0] = left;
    	// 找到rigthIndex
    	// 还原初始值
    	left = 0;
    	right = nums.length;
    	while (left < right) {
    		int mid = left + (right - left) / 2;
    		if (nums[mid] > target ) {
    			right = mid;
    		} else {
    			left = mid + 1;
    		}
    	}
    	resRange[1] = right - 1;
    	return resRange;
    }
}