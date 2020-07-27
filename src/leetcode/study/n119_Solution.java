package src.leetcode.datastructurel;

class n119_Solution {
    public List<Integer> getRow(int rowIndex) {
    	List<ArrayList<Integer>> triangle = new ArrayList<ArrayList<Integer>>();
    	if (0 == rowIndex) {
    		ArrayList<Integer> row = new ArrayList<Integer>();
    		row.add(1);
    		return row;
    	}
    	// 设置第一行的内容
    	triangle.add(new ArrayList<Integer>());
    	triangle.get(0).add(1);
    	// 根据规划循环处理

    	for (int i=0;i<rowIndex;i++) {
    		List<Integer> preRow = triangle.get(i);
    		ArrayList<Integer> row = new ArrayList<Integer>();	
    		// 设置第一个节点为1
    		row.add(1);
    		for (int j=0;j<i;j++) {
    			// 核心计算
    			row.add( preRow.get(j) + preRow.get(j+1) );
    		}
    		// 设置最后一个节点为1
    		row.add(1);
    		triangle.add(row);
    	}

    	return triangle.get(triangle.size()-1);
    }
}