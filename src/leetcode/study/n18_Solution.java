// 四数之和
// 与三数之和不同的是,这里的target是可以负数的，不能使用break跳过>target的循环

class n18_Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
    	// 先排序
    	Arrays.sort(nums);
    	for (int i=0;i<nums.length;i++) {
    		if (i > 0 && nums[i] == nums[i-1]) {
    			continue;
    		}
    		for (int j = i+1;j<nums.length;j++) {
	    		if (j > i+1 && nums[j] == nums[j-1]) {
	    			continue;
	    		}
	    		int l = j + 1;
	    		int r = nums.length - 1;
	    		while (l < r) {
	    			int sum = nums[i] + nums[j] + nums[r] + nums[l];
	    			if (sum > target) {
	    				while (l < r && nums[r] == nums[--r]);
	    			} else if (sum < target) {
	    				while (l < r && nums[l] == nums[++l]);
	    			} else {
	    				res.add(Arrays.asList(nums[i],nums[j],nums[l],nums[r]));
	    				while (l < r && nums[l] == nums[++l]);
	    				while (l < r && nums[r] == nums[--r]);
	    			}
	    		}
    		}
    	}
    	return res;
    }
}