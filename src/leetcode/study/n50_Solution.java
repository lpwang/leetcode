// 使用递归快速幂方法求解
class n50_Solution {
	private double fastPow(double x, int n) {
		if (n == 0) {
			return 1.00;
		}
		double half = fastPow(x,n/2);
		if (n % 2 == 0) {
			return half * half;
		} else {
			return half * half * x;
		}
	}

    public double myPow(double x, int n) {
    	if (n<0) {
    		n = -n;
    		x = 1/x;
    	}
    	return fastPow(x, n);
    }
}