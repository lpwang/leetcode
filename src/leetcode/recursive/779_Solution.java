// 第K个语法符号

// 这种解法是暴力解法，超出了内存限制。
// 我看题解是在上下父子层找规律进行求解的
// 目前还没有仔细的看，等之后学习到这里的时候仔细研究下。
// 害
class 779_Solution {
    public int kthGrammar(int N, int K) {
        String resStr = helper(new StringBuilder("0"),N - 1);
        return Integer.parseInt(""+resStr.charAt(K - 1));
    }

    private String helper (StringBuilder res,int N) {
        if (N <= 0) {
            return res.toString();
        }
        String resStr = res.toString();
        StringBuilder newLine = new StringBuilder();
        for (Character character : resStr.toCharArray()) {
            newLine.append(character == '0' ? "01" : "10");
        }
        N--;
        res = null;
        return helper(newLine,N);
    }
}