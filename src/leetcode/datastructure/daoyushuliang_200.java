package leetcode.datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class daoyushuliang_200 {
    public static void main(String[] args) {

    }
}

class Solution_200 {
    public int numIslands(char[][] grid) {
        if (null == grid || 0 == grid.length) {
            return 0;
        }

        int islandNum = 0;
        Queue<Integer> queue = new LinkedList<Integer>();
        int nr = grid.length;
        int nc = grid[0].length;
        for (int r=0;r<nr;r++) {
            for (int c=0;c<nc;c++) {
                if ('1' == grid[r][c]) {
                    // 计算id,放入队列
                    int id = r*nc+c;
                    queue.add(id);
                    // 设置为0，表示不可见
                    grid[r][c] = '0';
                    // island+1
                    islandNum += 1;
                    while (!queue.isEmpty()) {
                        // 删除头节点
                        int queue_id = queue.remove();
                        int row = queue_id / nc;
                        int col = queue_id % nc;
                        // 上
                        if (row - 1 >= 0 && grid[row-1][col] == '1') {
                            queue.add(((row-1)*nc+col));
                            grid[row-1][col] = '0';
                        }
                        // 下
                        if (row + 1 < nr && grid[row+1][col] == '1') {
                            queue.add(((row+1)*nc+col));
                            grid[row+1][col] = '0';
                        }
                        // 左
                        if (col - 1 >= 0 && grid[row][col-1] == '1') {
                            queue.add((row*nc+(col-1)));
                            grid[row][col-1] = '0';
                        }
                        // 右
                        if (col + 1 < nc && grid[row][col+1] == '1') {
                            queue.add((row*nc+(col+1)));
                            grid[row][col+1] = '0';
                        }
                    }
                }
            }
        }
        return islandNum;
    }
}
