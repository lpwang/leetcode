class n485_Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       	int count_main = 0;
       	int count_back = 0;
       	for (int i=0;i<nums.length;i++) {
       		if (nums[i] == 0) {
       			if (count_back > count_main) {
       				count_main = count_back;
       			}
                count_back = 0;
       		} else {
       			count_back++;
       		}
       	}
       	return count_main > count_back ? count_main : count_back;
    }
}