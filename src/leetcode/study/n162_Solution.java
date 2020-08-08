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
