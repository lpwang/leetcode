// 合并区间

class n56_Solution {
    public int[][] merge(int[][] intervals) {
    	Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        ArrayList<int[]> mergedList = new ArrayList<int[]>();
        for (int i = 0; i < intervals.length; i++) {
            if (mergedList.size() == 0 || mergedList.get(mergedList.size()-1)[1] < intervals[i][0]) {
                mergedList.add(intervals[i]);
            } else {
                mergedList.get(mergedList.size() - 1)[1] = Math.max(mergedList.get(mergedList.size() - 1)[1], intervals[i][1]);
            }
        }
        return mergedList.toArray(new int[0][]);
    }
}