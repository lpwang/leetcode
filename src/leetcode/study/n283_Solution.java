package src.leetcode.datastructure;

class n283_Solution {
    public void moveZeroes(int[] nums) {
        int index = 0;
        for (Integer num : nums) {
            if (0 != num) {
                nums[index++] = num;
            }
        }
        while (0 != index && index < nums.length) {
            nums[index++] = 0;
        }
    }
}