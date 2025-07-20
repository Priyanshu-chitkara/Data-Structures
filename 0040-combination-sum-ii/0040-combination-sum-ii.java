import java.util.*;

class Solution {
    public void backtrack(int[] candidates, int target, List<List<Integer>> res, List<Integer> cur, int start) {
        if (target == 0) {
            res.add(new ArrayList<>(cur));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            // Skip duplicates at the same recursive level
            if (i > start && candidates[i] == candidates[i - 1]) continue;

            // If the current number is greater than target, no point in continuing
            if (candidates[i] > target) break;

            // Choose the current number
            cur.add(candidates[i]);

            // Recurse to the next index (i + 1 because each number can be used only once)
            backtrack(candidates, target - candidates[i], res, cur, i + 1);

            // Backtrack
            cur.remove(cur.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates); // ✅ Sort to handle duplicates
        List<List<Integer>> res = new ArrayList<>();
        backtrack(candidates, target, res, new ArrayList<>(), 0);
        return res;
    }
}
