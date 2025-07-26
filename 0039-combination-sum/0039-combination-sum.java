class Solution {
    public void printF(int[] candidates,List<List<Integer>> res, List<Integer> cur,int ind,int sum,int target){
        int n=candidates.length;
        if(sum==target){
            res.add(new ArrayList<>(cur));
            return;
        }
        if(ind>=n || sum>target){
            return;
        }
         cur.add(candidates[ind]);
       
        
       
             

        
       
        
        printF(candidates,res,cur,ind,sum+candidates[ind],target);
       
        
            cur.remove(cur.size()-1);

        
        
        
        
        
       
        printF(candidates,res,cur,ind+1,sum,target);
       

        }

    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> cur=new ArrayList<>();
        printF(candidates,res,cur,0,0,target);
        return res;
        
    }
}