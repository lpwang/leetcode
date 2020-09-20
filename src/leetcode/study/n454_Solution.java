// 四个数相加
// 由于四个数字相加，之前的四数相加不同的是，不需要判定重复，即重复的组合也算
// 所以使用map构建一个集合，把两两相加的结果当作key进行存储，value为出现的次数
// 在遍历第三第四组，然后使用 v = 0 - c - d 如果等于key将Key对应的value进行相加

class n454_Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {

        int count = 0;
    	Map<Integer,Integer> tempMap = new HashMap<Integer,Integer>();
    	for (int i=0;i<A.length ;i++ ) {
    		for (int j=0;j<B.length ;j++ ) {
    			int sum = A[i]+B[j];
    			if (tempMap.containsKey(sum)) {
    				tempMap.put( sum,tempMap.get(sum) + 1);
    			} else {
    				tempMap.put(sum,1);
    			}
    		}
    	}

    	// 对第三组和第四组进行相加
    	for (int i=0;i<C.length ;i++ ) {
    		for (int j=0;j<D.length ;j++ ) {
    			int sum = 0 - C[i] - D[j];
    			if (tempMap.containsKey(sum)) {
    				count += tempMap.get(sum);
    			}
    		}
    	}
    	return count;

    }
}