/**
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * 
 * 输入: [-2,1,-3,4,-1,2,1,-5,4]
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 */

/**
 * 双指针方式，大数据集合超时了
 */

class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int start = 0;
        int end = -1;
        int size = 1;
        int max = -65535;
        while (size <= nums.length) {
            while (end + size < nums.length) {
                int tempMax = 0;
                for (int i = start;i<=end+size;i++) {
                    tempMax += nums[i];
                }
                max = Math.max(max,tempMax);
                start++;
                end++;
            }
            size++;
            start = 0;
            end = -1;
        }
        return max;
    }
}