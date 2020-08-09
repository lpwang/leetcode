// 找到最小值
// 暴力解法

class n153_Solution {
    public int findMin(int[] nums) {
    	int minVal = 65535;
    	for (int i=0;i<nums.length;i++) {
    		if (nums[i] < minVal) {
    			minVal = nums[i];
    		}
    	}
    	return minVal;
    }
}

// 二分查找求解

class Solution {
    public int findMin(int[] nums) {
    	int l =0;
    	int r = nums.length - 1;
    	while (l < r) {
    		int mid = l + (r-l)/2;
    		if (nums[mid] > nums[r]) {
    			l = mid + 1;
    		} else {
    			r = mid;
    		}
    	}
    	return nums[l];
    }
}