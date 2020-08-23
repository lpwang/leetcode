// 字母异位词分组 - 中等
// 键的设计

/*
思路

当且仅当它们的字符计数（每个字符的出现次数）相同时，两个字符串是字母异位词。

算法

我们可以将每个字符串 s\text{s}s 转换为字符数 count\text{count}count，由26个非负整数组成，表示 a\text{a}a，b\text{b}b，c\text{c}c 的数量等。我们使用这些计数作为哈希映射的基础。

在 Java 中，我们的字符数 count 的散列化表示将是一个用 **＃** 字符分隔的字符串。 例如，abbccc 将表示为 ＃1＃2＃3＃0＃0＃0 ...＃0，其中总共有26个条目。 在 python 中，表示将是一个计数的元组。 例如，abbccc 将表示为 (1,2,3,0,0，...，0)，其中总共有 26 个条目。
*/

class n49_Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    	HashMap<String,ArrayList<String>> res = new HashMap<String,ArrayList<String>>();
    	int[] count = new int[26];
    	for (String str : strs) {
    		Arrays.fill(count,0);
    		char[] ca = str.toCharArray();
    		for (int i=0;i<ca.length;i++) {
    			count[(ca[i] - 'a')]++;
    		}
    		// 设计key
    		StringBuilder keyBuilder = new StringBuilder("");
    		for (int i=0;i<26;i++) {
    			keyBuilder.append('#');
    			keyBuilder.append(count[i]);
    		}
            String key = keyBuilder.toString();
    		if (!res.containsKey(key)) {
    			res.put(key,new ArrayList());	
    		}
    		res.get(key).add(str);
    	}
    	return new ArrayList(res.values());
    }
}