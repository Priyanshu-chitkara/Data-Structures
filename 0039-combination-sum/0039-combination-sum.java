class Solution {
    public void f(int [] candidates,int target,List<List<Integer>> res,List<Integer> ls,int ind){
        if(target==0){
            res.add(new ArrayList<>(ls));
            return;
        }
        if(ind==candidates.length){
            return;
        }
        
        if(target>=0){
            ls.add(candidates[ind]);
            f(candidates,target-candidates[ind],res,ls,ind);
            ls.remove(ls.size()-1);
        }
        
        
      
            f(candidates,target,res,ls,ind+1);

        
        
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> ls=new ArrayList<>();
        f(candidates,target,res,ls,0);
        return res;
        
    }
}