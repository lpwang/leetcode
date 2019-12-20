class n27_Solution {
    public int removeElement(int[] nums, int val) {
        int slow_index = 0;
       	for (int i=0;i<nums.length ;i++ ) {
       		if (nums[i] != val) {
       			nums[slow_index] = nums[i];
       			slow_index++;
       		}
       	}
       	return slow_index;
    }
}