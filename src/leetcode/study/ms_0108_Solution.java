class ms_0108_Solution {
    public void setZeroes(int[][] matrix) {

    	Set<Integer> rows = new HashSet<Integer>();
    	Set<Integer> cols = new HashSet<Integer>();

    	for (int i=0;i<matrix.length;i++) {
    		for (int j=0;j<matrix[i].length;j++) {
    			if (0 == matrix[i][j]) {
    				rows.add(i);
    				cols.add(j);
    			}
    		}
    	}

    	for (int i=0;i<matrix.length;i++) {
    		for (int j=0;j<matrix[i].length;j++) {
    			if (rows.contain(i) || cols.contain(j)) {
    				matrix[i][j] = 0;
    			}
    		}
    	}

    }
}