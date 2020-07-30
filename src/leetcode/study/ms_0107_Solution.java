class ms_0107_Solution {
    public void rotate(int[][] matrix) {
        int[][] matrixNew = new int[matrix.length][matrix[0].length];
    	for (int i=0;i<matrix.length;i++) {
    		for (int j=0;j<matrix[i].length;j++) {
    			matrixNew[j][matrix.length - i - 1] = matrix[i][j];
    		}
    	}
        
        for (int i = 0; i < matrixNew.length; i++) {
            matrix[i] = matrixNew[i];
        }
    }
}