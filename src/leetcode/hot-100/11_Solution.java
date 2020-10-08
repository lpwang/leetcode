// 盛最多水的容器
// 使用双指针的方式进行解答
// 算法描述：
// 在数组的头尾设置头尾指针，两个头尾指针不断的向内进行收缩，
// 比较头尾指针对应的值，谁小就向内缩进谁，因为容器的高度是以
// 最短的板的高度来进行面积计算的。所以应该使用，向内缩减短板的
// 缩减规则

class 11_Solution {
    public int maxArea(int[] height) {
    	int head = 0;
    	int tail = height.length - 1;
    	int res = 0;
    	while (head <= tail) {
    		res = Math.max(res,Math.min(height[head],height[tail]) * (tail - head));
    		if (height[head] <= height[tail]) {
    			// 收缩
    			head++;
    		} else {
    			// 收缩
    			tail--;
    		}
    	}
    	return res;
    }
}