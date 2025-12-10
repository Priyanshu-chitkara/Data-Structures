class Solution {
    public void f(int[] candidates, List<List<Integer>> list, List<Integer> ls, int target, int ind) {
        int n=candidates.length;
        if (target == 0) {
            list.add(new ArrayList<>(ls));
            return;
        }
        if(ind==n){
            return;
        }
        
        if (target >= 0) {
            ls.add(candidates[ind]);
            f(candidates, list, ls, target - candidates[ind], ind);
            ls.remove(ls.size() - 1);

        }

        

        f(candidates, list, ls, target, ind + 1);

    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> ls = new ArrayList<>();
        int n = candidates.length;
        f(candidates, list, ls, target, 0);
        return list;

    }
}