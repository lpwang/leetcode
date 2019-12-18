package leetcode.datastructure;
class n724_Solution {
    public int pivotIndex(int[] nums) {
   		int sum = 0;
   		int min_sum = 0;
   		int index = -1;
   		for (int i=0;i<nums.length;i++) {
   			sum += nums[i];
   		}
   		for (int i=nums.length-1;i>=0;i--) {
   			sum = sum - nums[i];
   			if (sum == min_sum) {
   				index = i;
   			}
   			min_sum += nums[i];
   		}
   		return index;
    }
}