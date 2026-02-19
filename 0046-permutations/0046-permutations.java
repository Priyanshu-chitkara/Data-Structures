class Solution {
    public void swap(int [] nums,int first,int second){
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;


    }
    public void f(int[] nums,List<List<Integer>> ls,List<Integer> rs,int ind,int n){
       
        if(ind==n){
            ls.add(new ArrayList<>(rs));
            return;
        }
        for(int i=ind;i<n;i++){
            swap(nums,i,ind);
            rs.add(nums[ind]);
            
            
            f(nums,ls,rs,ind+1,n);
            
            
            
            rs.remove(rs.size()-1);
            swap(nums,ind,i);
            

        }
        
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ls=new ArrayList<>();
        List<Integer> rs=new ArrayList<>();
        int n=nums.length;
        f(nums,ls,rs,0,n);
        return ls;
        
    }
}