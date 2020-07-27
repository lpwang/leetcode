package src.leetcode.datastructure;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class n349_Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> resultSet = new HashSet<Integer>();
        for (int i=0;i<nums1.length;i++) {
            for (int j=0;j<nums2.length;j++) {
                if (nums1[i] == nums2[j]) {
                    resultSet.add(nums1[i]);
                }
            }
        }

        int[] resultArr = new int[resultSet.size()];
        int count = 0;
        Iterator<Integer> iterator = resultSet.iterator();
        while (iterator.hasNext()){
            Integer next = iterator.next();
            resultArr[count++] = next;
        }
        return resultArr;
    }
}