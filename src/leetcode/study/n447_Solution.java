// 回旋镖的数量

class n447_Solution {
    public int numberOfBoomerangs(int[][] points) {
    	int count = 0;
    	for (int i=0;i<points.length ;i++ ) {
    		int[] x = points[i];
    		HashMap<Integer,Integer> res = new HashMap<Integer,Integer>();
    		for (int j=0;j<points.length;j++) {
    			if (i == j) {
    				continue;
    			}
    			int[] y = points[j];
    			int distance = distance(x,y);
    			if (res.containsKey(distance)) {
    				res.put(distance , res.get(distance) + 1);
    			} else {
    				res.put(distance , 1);
    			}
    		}

    		for (int n : res.values()) {
    			if (n >= 2) {
    				count += n * (n-1);
    			}
    		}

    	}
    	return count;
    }

    private int distance(int[] x , int[] y) {
    	// 欧几里得距离公式
    	return (x[0] - y[0]) * (x[0] - y[0]) + (x[1] - y[1]) * (x[1] - y[1]);
    }
}