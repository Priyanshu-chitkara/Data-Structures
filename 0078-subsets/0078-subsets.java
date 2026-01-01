class Solution {
    public void f(int [] nums,List<List<Integer>> res,List<Integer> ls,int ind){
        if(ind==nums.length){
            res.add(new ArrayList<>(ls));
            return;
        }
        ls.add(nums[ind]);
        f(nums,res,ls,ind+1);
        ls.remove(ls.size()-1);
        
        f(nums,res,ls,ind+1);
        

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> ls=new ArrayList<>();
        f(nums,res,ls,0);
        return res;
        
    }
}