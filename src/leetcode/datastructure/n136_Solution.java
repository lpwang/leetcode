package src.leetcode.datastructure;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class n136_Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (Integer num:nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num)+1);
            } else {
                map.put(num, 1);
            }
        }
        for (Iterator<Integer> it = map.keySet().iterator();it.hasNext();) {
            Integer key = it.next();
            if (1 == map.get(key)) {
                return key;
            }
        }
        return 0;
    }
}