package src.leetcode.datastructure;

// 打印杨辉三角
// 可以规划为 动态规划问题

class n118_Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();

        if (numRows == 0) {
            return triangle;
        }

        // 设置第一行
        triangle.add(new ArrayList(1));
        triangle.get(0).add(1);

        for (int i=1;i<numRows;i++) {
            List<Integer> row = new ArrayList<Integer>();
            List<Integer> prerow = triangle.get(i-1);
            // 每一行的第一个元素为1
            row.add(1);

            for (int j=1;j<i;j++) {
                // 核心计算
                int calVal = prerow.get(j-1) + prerow.get(j);
                row.add(calVal);
            }

            // 每一行的最后一列也为1
            row.add(1);

            triangle.add(row);
        }

        return triangle;
    }
}