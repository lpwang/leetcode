package src.leetcode.datastructure;

import java.util.HashSet;
import java.util.Set;

class n217_Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> sets = new HashSet<Integer>(nums.length);
        for (Integer num:nums) {
            if (sets.contains(num)) {
                return true;
            }
            sets.add(num);
        }
        return false;
    }
}