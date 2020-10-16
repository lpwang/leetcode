// 旋转图像
// 首先计算圈数，然后按照圈数逐一元素顺时针替换


class 48_Solution {
    public void rotate(int[][] matrix) {
        int times = 0;
        int mlen = matrix.length;
        // 圈数
        while (times < (mlen >> 1)) {
            // 计算四个边的边长
            int len = mlen - 2 * times;
            for (int i=0;i<len - 1;i++) {
                // 从左起点开始进行元素的顺时针旋转
                int temp = matrix[times][times+i];
                // 这里对于坐标的选择时最难理解的
                matrix[times][times+i] = matrix[times+len-i-1][times];
                matrix[times+len-i-1][times] = matrix[times+len-1][times + len - 1 -i];
                matrix[times+len-1][times + len - 1 -i] = matrix[times + i][times+len-1];
                matrix[times + i][times+len-1] = temp;
            }
            times++;
        }
    }
}