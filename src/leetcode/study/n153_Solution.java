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