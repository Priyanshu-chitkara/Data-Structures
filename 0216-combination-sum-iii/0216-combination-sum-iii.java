class Solution {
    public void f(List<List<Integer>> res, List<Integer> ls, int k, int n, int val) {
        if (n == 0) {
            if (ls.size() == k)
                res.add(new ArrayList<>(ls));
            return;
        }
        if (ls.size() > k) {
            return;
        }
        if(val>9){
            return;
        }
        if (n >= val) {
            ls.add(val);
            f(res, ls, k, n - val, val + 1);
            ls.remove(ls.size() - 1);

        }

        f(res, ls, k, n, val+1);

    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ls = new ArrayList<>();
        if (k > n) {
            return res;
        }
        f(res, ls, k, n, 1);
        return res;

    }
}