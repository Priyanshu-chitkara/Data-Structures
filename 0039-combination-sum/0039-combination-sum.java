class Solution {
    public void printS(int[] candidates, int target, List<List<Integer>> result, List<Integer> cur, int ind, int s) {
        if (s == target) {
            result.add(new ArrayList<>(cur));
            return;
        }
        if (ind >= candidates.length || s > target) return;

        // Include current element
        cur.add(candidates[ind]);
        printS(candidates, target, result, cur, ind, s + candidates[ind]); // can use same element again
        cur.remove(cur.size() - 1); // backtrack

        // Skip current element
        printS(candidates, target, result, cur, ind + 1, s);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        printS(candidates, target, result, cur, 0, 0);
        return result;
    }
}
