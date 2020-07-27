package leetcode.datastructure;

public class n747_Solution {
    public static void main(String[] args) {
        Solution747 solution747 = new Solution747();
        solution747.dominantIndex(new int[]{0,0,0,1});
    }
}

class Solution747 {
    public int dominantIndex(int[] nums) {
        int largest_nums = 0;
        int[] largest_arr_index = new int[2];
        for (int i=0;i<nums.length;i++) {
            int num_index = i;
            for (int j=i+1;j<nums.length;j++) {
                if (nums[j] > nums[i]) {
                    num_index = j;
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
            largest_arr_index[largest_nums] = num_index;
            largest_nums += 1;
            if (largest_nums == 2) {
                break;
            }
        }
        if (nums[0] >= nums[1]*2) {
            return largest_arr_index[0];
        } else {
            return -1;
        }
    }
}
