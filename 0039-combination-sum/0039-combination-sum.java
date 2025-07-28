class Solution {
    public void printF(int [] candidates,int target,List<List<Integer>> res,List<Integer> cur,int ind,int sum){
        int n=candidates.length;
        if(target==sum){
            res.add(new ArrayList<>(cur));
            return;
        }
        if(target<sum || ind>n-1){
            return;
        }
        cur.add(candidates[ind]);
        printF(candidates,target,res,cur,ind,sum+candidates[ind]);
        cur.remove(cur.size()-1);
        printF(candidates,target,res,cur,ind+1,sum);

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> cur=new ArrayList<>();
        printF(candidates,target,res,cur,0,0);
        return res;
    }
}