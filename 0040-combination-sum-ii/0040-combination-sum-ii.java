class Solution {
    public void f(int[] candidates, int target, List<List<Integer>> res, List<Integer> ls, int ind) {
        if (target == 0) {
            res.add(new ArrayList<>(ls));
            return;
        }
        for (int i = ind; i < candidates.length; i++) {
            if (i > ind && candidates[i] == candidates[i - 1])
                continue;
            if (candidates[i] > target)
                break;
            ls.add(candidates[i]);

            f(candidates, target - candidates[i], res, ls, i + 1);
            ls.remove(ls.size() - 1);

        }

    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ls = new ArrayList<>();
        f(candidates, target, res, ls, 0);
        return res;

    }
}