class n167_Solution {
    public int[] twoSum(int[] numbers, int target) {
    	int[] indexArr = new int[2];
        for (int i=0;i<numbers.length;i++) {
        	for (int j=i+1;j<numbers.length;j++) {
        		if (target == numbers[i] + numbers[j]) {
        			indexArr[0] = i+1;
        			indexArr[1] = j+1;
        		}
        	}
        }
        return indexArr;
    }
}