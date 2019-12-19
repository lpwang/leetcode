class n26_Solution {
    public int removeDuplicates(int[] nums) {
        if (0 == nums.length) {
            return 0;
        }
        int find_index = 0;
        int arr_index = 0;
        int same_ele = nums[0];
        for (int i=1;i<nums.length;i++) {
            if (same_ele != nums[i]) {
                arr_index++;
                nums[arr_index] = nums[i];
                same_ele = nums[i];
            }
        }
        return arr_index+1;
    }
}