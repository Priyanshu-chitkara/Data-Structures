class Solution {
    public void f(List<List<Integer>> res,List<Integer> ls,int [] nums,int ind){
        if(ind==nums.length){
            res.add(new ArrayList<>(ls));
            return;
        }
        for(int i=ind;i<nums.length;i++){
            iswap(nums,i,ind);
            ls.add(nums[ind]);
            f(res,ls,nums,ind+1);
            ls.remove(ls.size()-1);
            iswap(nums,ind,i);
        }
    }
    public void iswap(int [] nums,int i,int ind){
        int temp=nums[i];
        nums[i]=nums[ind];
        nums[ind]=temp;

    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<List<Integer>> res1=new ArrayList<>();
        List<Integer> ls=new ArrayList<>();
        Set<List<Integer>> ans=new HashSet<>();
        f(res,ls,nums,0);
        for(List<Integer> temp:res){
            ans.add(temp);
        }
        for(List<Integer> temp1:ans){
            res1.add(temp1);
        }
        return res1;
        
    }
}