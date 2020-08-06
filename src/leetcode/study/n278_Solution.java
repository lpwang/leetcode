/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

// 使用二分查找的第二模板解答

public class n278_Solution extends VersionControl {
    public int firstBadVersion(int n) {
    	int left = 0;
    	int right = n;
    	while (left < right) {
    		int mid = left + (right - left) / 2;
    		if (isBadVersion(mid)) {
    			right = mid;
    		} else {
    			left = mid + 1;
    		}
    	}
    	if (isBadVersion(left)) return left;
    	return -1;
    }
}