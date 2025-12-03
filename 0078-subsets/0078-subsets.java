class Solution {
    public void f(int [] nums,int i,List<Integer> res,List<List<Integer>> ls,int n){
        if(i==n){
            ls.add(new ArrayList<>(res));
            return;
        }
          res.add(nums[i]);
        
        f(nums,i+1,res,ls,n);
        res.remove(res.size()-1);
        
        
        
        f(nums,i+1,res,ls,n);
        
        
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ls=new ArrayList<>();
        List<Integer> res=new ArrayList<>();
        int n=nums.length;
        f(nums,0,res,ls,n);
        return ls;


        
    }
}