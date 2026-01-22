class Solution {
    public void f(List<List<Integer>> res,List<Integer> ls,int[] nums,int n,int ind){
        if(ind==n){
            res.add(new ArrayList<>(ls));
            return;
        }
        for(int i=ind;i<n;i++){
            isperm(nums,i,ind);
            ls.add(nums[ind]);
            f(res,ls,nums,n,ind+1);
            ls.remove(ls.size()-1);
            isperm(nums,ind,i);
            

            
            
            
        }
    }
    public void isperm(int [] nums,int i,int ind){
        
        int temp=nums[i];
        nums[i]=nums[ind];
        nums[ind]=temp;
        
        
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> ls=new ArrayList<>();
        int n=nums.length;
        f(res,ls,nums,n,0);
        return res;
        
    }
}