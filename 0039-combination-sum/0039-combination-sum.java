class Solution {
    public void printF(int[] candidates,int target,int ind,List<List<Integer>> res,List<Integer> cur){
        int n=candidates.length;
        if(ind==n){
            if(target==0){
                res.add(new ArrayList<>(cur));
            }
            return;
        }
        if(candidates[ind]<=target){
            cur.add(candidates[ind]);
            printF(candidates,target-candidates[ind],ind,res,cur);
            cur.remove(cur.size()-1);
        }
        printF(candidates,target,ind+1,res,cur);

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
       List<List<Integer>> res=new ArrayList<>();
       List<Integer> cur=new ArrayList<>();
       printF(candidates,target,0,res,cur);
       return res;

    }
}