class Solution {
    public void f(List<List<Integer>> res,List<Integer> ls,int n,int [] nums,int ind){
        if(ind==n){
            if(res.indexOf(ls)==-1){
                res.add(new ArrayList<>(ls));
            

            

            }
           
            

            return;
            
        }
        ls.add(nums[ind]);
        f(res,ls,n,nums,ind+1);
        ls.remove(ls.size()-1);
        f(res,ls,n,nums,ind+1);

    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
       
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> ls=new ArrayList<>();
        int n=nums.length;
        f(res,ls,n,nums,0);

        return res;
        
        
    }
}