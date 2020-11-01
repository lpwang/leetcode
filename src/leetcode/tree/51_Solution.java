// N皇后问题
// 使用回溯方法求解

class 51_Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<List<String>>();
        char[][] chess = new char[n][n];
        for (int i = 0;i<n;i++) {
            for (int j=0;j<n;j++) {
                chess[i][j] = '.';
            }
        }
        backTrace(0,chess,res);
        return res;
    }

    private void backTrace(int row,char[][] chess,List<List<String>> res) {
        if ( row == chess.length) {
            res.add(convert(chess));
            return;
        }
        for (int i =0 ;i<chess.length;i++) {
            if (isVaild(row,i,chess)) {
                chess[row][i] = 'Q';
                backTrace(row + 1,chess,res);
                chess[row][i] = '.';
            }
        }
    }

    private boolean isVaild(int row,int col,char[][] chess) {
        // 判断当前纵轴是否有Q
        for (int i =0 ;i < chess.length ; i++ ) {
            if (chess[i][col] == 'Q') {
                return false;
            }
        }
        // 判断左上
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (chess[i][j] == 'Q') {
                return false;
            }
        }
        // 判断右上
        for (int i = row - 1, j = col + 1; i >= 0 && j < chess.length; i--, j++) {
            if (chess[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    private List<String> convert (char[][] chess) {
        List<String> rows = new ArrayList<String>();
        for (int i=0;i<chess.length;i++) {
            String row = new String(chess[i]);
            rows.add(row);
        }
        return rows;
    }
}
