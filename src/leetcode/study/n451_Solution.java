// 根据字符出现频率排序
// 给定一个字符串，请将字符串里的字符按照出现的频率降序排列。

class n451_Solution {
    public String frequencySort(String s) {
    	char[] chars = s.toCharArray();
        HashMap<Character, Integer> cMap = new HashMap<>(chars.length);
        for (int i = 0; i < chars.length; i++) {
            cMap.put(chars[i], cMap.getOrDefault(chars[i], 0) + 1);
        }
        // 构建大顶堆
        PriorityQueue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<Map.Entry<Character, Integer>>((e1, e2) ->
                e2.getValue() - e1.getValue());

        maxHeap.addAll(cMap.entrySet());

        // 最大堆拉取
        StringBuilder resString = new StringBuilder();
        Map.Entry<Character, Integer> entry;
        while ((entry = maxHeap.poll()) != null) {
            for (int i = 0; i < entry.getValue(); i++) {
                resString.append(entry.getKey());
            }
        }

        return resString.toString();
    }
}