// 直线上最多的点数
// 使用斜率的算法，但是计算斜率的话，根据公式 斜率 = (y2 - y1)/(x2 - x1) ,如果是一个平行于y轴的直线将会计算报错
// 所以使用最大公约数字进行 (y2 - y1) 与 (x2 - x1) 的同时相除后的字符串的拼接作为key进行map存储

class n149_Solution {
    public int maxPoints(int[][] points) {
        int res = 0;
        for (int i = 0;i<points.length ;i++ ) {
            int repeat = 0;
            int tempMax = 0;
            HashMap<String,Integer> map = new HashMap<String,Integer>();
            for (int j=i+1;j<points.length;j++) {
                int dy = points[j][1] - points[i][1];
                int dx = points[j][0] - points[i][0];
                if (dy == 0 && dx == 0) {
                    repeat++;
                    continue;
                }
                // 求最大公约数
                int g = gcd(dy , dx);
                if (g != 0) {
                    dy /= g;
                    dx /= g;
                }
                String key = String.valueOf(dy) + "/" + String.valueOf(dx);
                if (map.containsKey(key)) {
                    map.put(key,map.get(key) + 1);
                } else {
                    map.put(key,1);
                }
                tempMax = Math.max(tempMax, map.get(key));
            }
            // 这里的+1是外层循环的节点
            res = Math.max(res, repeat + tempMax + 1);
        }
        return res;
    }

    private int gcd(int dy,int dx){
        if (dx == 0) {
            return dy;
        } else {
            return gcd(dx , dy % dx);
        }
    }
}