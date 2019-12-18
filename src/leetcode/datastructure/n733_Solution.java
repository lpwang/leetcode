package leetcode.datastructure;

import java.util.LinkedList;
import java.util.Queue;

class n733_Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
    	Queue<Integer> queue = new LinkedList<Integer>();
    	int rl = image.length;
    	int cl = image[0].length;
    	int id = sr*cl+sc;
    	int oldColor = image[sr][sc];
    	image[sr][sc] = newColor;
    	queue.offer(id);   
    	while (!queue.isEmpty()) {
    		int queue_id = queue.poll();
    		int row = queue_id / cl;
    		int col = queue_id % cl;
    		// up
    		if (row-1 >= 0 && image[row-1][col] == oldColor) {
    			queue.offer((row-1)*cl+col);
    			image[row-1][col] = newColor;
    		}
    		// down
    		if (row+1 < rl && image[row+1][col] == oldColor) {
    			queue.offer((row+1)*cl+col);
    			image[row+1][col] = newColor;
    		}
    		// left
    		if (col-1 >= 0 && image[row][col-1] == oldColor) {
    			queue.offer((row)*cl+(col-1));
    			image[row][col-1] = newColor;
    		}
    		// right
    		if (col+1 < cl && image[row][col+1] == oldColor) {
    			queue.offer((row)*cl+(col+1));
    			image[row][col+1] = newColor;
    		}
    	}
    	return image;
    }
}