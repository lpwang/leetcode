class n498_Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
    	if (matrix.length == 0) {
    		return new int[0];
    	}
    	int size = matrix.length * matrix[0].length;
    	int index = 0;
    	int[] result = new int[size];
    	int maxLoop = matrix.length + matrix[0].length - 1;
    	for (int i=0;i<maxLoop;i++) {
    		int m,n = 0;
    		if (i%2 == 0) {
    			if (i < matrix.length) {
    				m = i;
    				n = 0;
    			} else {
    				m = matrix.length - 1;
    				n = i - m;
    			}
    			while (m >= 0 && n < matrix[0].length) {
    				result[index++] = matrix[m][n];
    				m--;
    				n++;
    			}
    		} else {
    			if (i < matrix[0].length) {
    				m = 0;
    				n = i;
    			} else {
    				n = matrix[0].length - 1;
    				m = i - n;
    			}
    			while (n >= 0 && m < matrix.length) {
    				result[index++] = matrix[m][n];
    				m++;
    				n--;
    			}
    		}
    	}
    	return result;
    }
}