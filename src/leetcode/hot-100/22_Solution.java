// 括号生成
// 该题目使用 回溯算法
// 重点的解题思路在于，open < max 然后 close < open

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        int open = 0;
        int close = 0;
        backTrace(open,close,n,new StringBuilder(),res);
        return res;
    }

    public void backTrace(int open,int close,int max,StringBuilder sb,List<String> res) {
        // 结束条件
        if (sb.length() == 2*max) {
            res.add(sb.toString());
            return;
        }
        // 先生成左括号
        if (open < max) {
            sb.append("(");
            backTrace(open + 1,close,max,sb,res);
            sb.deleteCharAt(sb.length() - 1);
        }
        // 然后生成右括号
        if (close < open) {
            sb.append(")");
            backTrace(open,close + 1,max,sb,res);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
