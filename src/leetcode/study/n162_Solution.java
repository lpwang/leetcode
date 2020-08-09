// 线性解法

class n162_Solution {
    public int findPeakElement(int[] nums) {
    	for (int i=0;i<nums.length-1;i++) {
    		if (nums[i] > nums[i+1]) {
    			return i;
    		}
    	}
    	return nums.length - 1;
    }
}

// 二分查找算法
class n162_Solution {

	public int findPeakElement(int[] nums) {
		if (nums.length == 1) {
            return 0;
        }
    	int l = 0;
		int r = nums.length - 1;
		while (l < r) {
			int mid = l + (r-l)/2;
			if (nums[mid] < nums[mid + 1]) {
				// 向右边寻找，一定可以找到峰值
				l = mid + 1;
			} else {
				// 向左边寻找，一定可以找到峰值
				r = mid;
			}
		}
		return l;
	}

}