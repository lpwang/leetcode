package leetcode.datastructure;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 01矩阵
 */

class n542_Solution {
    public int[][] updateMatrix(int[][] matrix) {
        int nr = matrix.length;
        int nc = matrix[0].length;
        for (int i=0;i<nr;i++) {
        	for (int j=0;j<nc;j++ ) {
        		int m = matrix[i][j];
        		if (1 == m) {
        			int depths = 0;
        			Queue<Integer> queue = new LinkedList<Integer>();
        			queue.offer((i*nc+j));
        			while (!queue.isEmpty()) {
        				int id = queue.poll();
        				int row = id / nc;
        				int col = id % nc;
        				// up
        				if (row-1>=0&&matrix[row-1][col] == 0) {
        					depths += 1;
        					break;
        				}
        				// down
        				if (row+1<nr&&matrix[row+1][col] == 0) {
        					depths += 1;
        					break;
        				}
        				// left
        				if (col-1>=0&&matrix[row][col-1] == 0) {
        					depths += 1;
        					break;
        				}
        				// right
        				if (col+1<nc&&matrix[row][col+1] == 0) {
        					depths += 1;
        					break;
        				}
        				queue.offer((row-1)*nc+col);
        				queue.offer((row+1)*nc+col);
        				queue.offer(row*nc+(col-1));
        				queue.offer(row*nc+(col+1));
        				depths += 1;
        			}
        			matrix[i][j] = depths;
        		}
        	}
        }
        return matrix;
    }
}