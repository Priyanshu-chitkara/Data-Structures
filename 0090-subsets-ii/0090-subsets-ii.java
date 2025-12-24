class Solution {
    public void f(int [] nums,int ind,List<List<Integer>> res,List<Integer> ls,int n){
        res.add(new ArrayList<>(ls));

        for(int i=ind;i<n;i++){
            if(i>ind && nums[i]==nums[i-1]) continue;
            ls.add(nums[i]);
            f(nums,i+1,res,ls,n);
            ls.remove(ls.size()-1);
            

        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> ls=new ArrayList<>();
        int n=nums.length;
        f(nums,0,res,ls,n);
        return res;

        
    }
}