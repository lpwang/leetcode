// 三数之和


class n15_Solution {
    public List<List<Integer>> threeSum(int[] nums) {
    	List<List<Integer>> res = new ArrayList<List<Integer>>();
    	Arrays.sort(nums);
    	for (int i=0;i<nums.length ;i++ ) {
    		if (nums[i] > 0) {
    			break;
    		}
    		if (i>0 && nums[i] == nums[i-1]) {
    			continue;
    		}
    		int l = i + 1;
    		int r = nums.length - 1;
    		while (l < r) {
    			int sum = nums[l] + nums[r] + nums[i];
    			if (sum < 0) {
    				while (l < r && nums[l] == nums[l+1]) {
    					l++;
    				}
                    l++;
    			} else if (sum > 0) {
    				while (l < r && nums[r] == nums[r-1]) {
    					r--;
    				}
                    r--;
    			} else {
    				res.add(Arrays.asList(nums[i],nums[l],nums[r]));
    				while (l < r && nums[l] == nums[l+1]) {
    					l++;
    				}
    				while (l < r && nums[r] == nums[r-1]) {
    					r--;
    				}
    				l++;
    				r--;
    			}
    		}
    	}
    	return res;
    }
}