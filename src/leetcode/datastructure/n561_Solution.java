class n561_Solution {
    public int arrayPairSum(int[] nums) {
    	int sum = 0;

		for (int i=0;i<nums.length;i++) {
			int select_index = i;
			for (int j=i+1;j<nums.length;j++) {
				if (nums[select_index] > nums[j]) {
					select_index = j;
				}
			}
            if (select_index != i) {
            	int temp = nums[i];
            	nums[i] = nums[select_index];
            	nums[select_index] = temp;
            }
		}

		for (int i=0;i<nums.length;i=i+2) {
			sum = sum + Math.min(nums[i],nums[i+1]);
		}

		return sum;
    }
}