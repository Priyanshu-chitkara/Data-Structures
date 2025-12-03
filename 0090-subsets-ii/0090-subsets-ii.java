class Solution {
 
    public void f(int [] nums,int n,List<List<Integer>> ls,List<Integer> rs,int i){
        if(i==n){
            if(ls.indexOf(rs)==-1) ls.add(new ArrayList<>(rs));
            return;

            
           
                

            
            
        }

       
        rs.add(nums[i]);
        f(nums,n,ls,rs,i+1);
        rs.remove(rs.size()-1);
        f(nums,n,ls,rs,i+1);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ls=new ArrayList<>();
        List<Integer> rs=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        f(nums,n,ls,rs,0);
        return ls;
        
    }
}