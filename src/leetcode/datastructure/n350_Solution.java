package src.leetcode.datastructure;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int[] result = new int[nums1.length];
        for (Integer num:nums1) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num)+1);
            } else {
                map.put(num, 1);
            }
        }
        int k = 0;
        for (Integer num:nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                result[k++] = num;
                map.put(num, map.get(num) - 1);
            }
        }
        return Arrays.copyOfRange(result, 0, k);
    }
}