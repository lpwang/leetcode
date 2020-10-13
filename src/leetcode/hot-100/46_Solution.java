// 回溯算法
// 可以考虑去除调LinkedHashSet的使用
// 因为单链表的关系，导致运行速度降低

class 46_Solution {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        LinkedHashSet<Integer> trace = new LinkedHashSet<Integer>();
        backTrace(trace,res,0,nums);
        return res;
    }

    public static void backTrace(LinkedHashSet<Integer> trace,List<List<Integer>> res,int index,int[] nums) {
        if (index == nums.length) {
            res.add(new ArrayList<Integer>(trace));
            return;
        }
        for (int num : nums) {
            if (trace.contains(num)) {
                continue;
            }
            trace.add(num);
            backTrace(trace, res, index + 1, nums);
            trace.remove(num);
        }
    }
}