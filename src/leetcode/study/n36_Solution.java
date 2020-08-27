// 有效的数独

class n36_Solution {
    public boolean isValidSudoku(char[][] board) {
    	HashMap<Integer,HashSet<Integer>> rowMap = new HashMap<Integer, HashSet<Integer>>();
        HashMap<Integer,HashSet<Integer>> colMap = new HashMap<Integer,HashSet<Integer>>();
        HashMap<Integer,HashSet<Integer>> boxMap = new HashMap<Integer,HashSet<Integer>>();
        // 初始化
        for (int i=0;i<9;i++) {
            rowMap.put(i,new HashSet<Integer>());
            colMap.put(i,new HashSet<Integer>());
            boxMap.put(i,new HashSet<Integer>());
        }
        // 一次遍历
        for (int i=0;i<9 ;i++ ) {
            for (int j=0;j<9 ;j++ ) {
                char c = board[i][j];
                if (c != '.') {
                    // 计算出九宫格的核心公式
                    int boxIndex = (i / 3 ) * 3 + j / 3;
                    int cn = (int) c;
                    HashSet<Integer> rowSet = rowMap.get(i);
                    HashSet<Integer> colSet = colMap.get(j);
                    HashSet<Integer> boxSet = boxMap.get(boxIndex);

                    if ( rowSet.contains(cn) || colSet.contains(cn) || boxSet.contains(cn)) {
                        return false;
                    } else {
                        rowSet.add(cn);
                        colSet.add(cn);
                        boxSet.add(cn);
                    }
                }
            }
        }
        return true;
    }
}