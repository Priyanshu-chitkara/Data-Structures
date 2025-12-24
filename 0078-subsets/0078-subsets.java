class Solution {
    public void f(List<List<Integer>> res,List<Integer> ls,int n,int ind,int[] nums){
        if(ind==n){
            res.add(new ArrayList<>(ls));
            return;
        }
        ls.add(nums[ind]);
        f(res,ls,n,ind+1,nums);
        ls.remove(ls.size()-1);
        f(res,ls,n,ind+1,nums);
        

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> ls=new ArrayList<>();
        int n=nums.length;
        f(res,ls,n,0,nums);
        return res;
        
    }
}