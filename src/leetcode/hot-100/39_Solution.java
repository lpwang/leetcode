// 回溯+剪枝

class 39_Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> path = new ArrayList<Integer>();
        backTrace(res,path,candidates,target,0,0);
        return res;
    }

    public void backTrace(List<List<Integer>> res,List<Integer> path,int[] candidates, int target,int sum,int begin) {
        if (sum > target) {
            return;
        }
        if (sum == target) {
            res.add(new ArrayList<Integer>(path));
            return;
        }
        for (int i = begin;i<candidates.length;i++) {
            sum += candidates[i];
            path.add(candidates[i]);
            backTrace(res, path, candidates, target, sum,i);
            sum -= candidates[i];
            path.remove(path.size() - 1);
        }
    }
}