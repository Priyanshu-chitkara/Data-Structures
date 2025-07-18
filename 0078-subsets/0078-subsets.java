class Solution {
     public void subset(int []nums, List<List<Integer>>result,List<Integer> current,int index){
        if(index>=nums.length){
            result.add(new ArrayList<>(current));
            return;
        }
        subset(nums,result,current,index+1);
        current.add(nums[index]);
        subset(nums,result,current,index+1);
        current.remove(current.size()-1);
       
        

     }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        int n=nums.length;
        subset(nums,result,new ArrayList<>(),0);
        return result;
       
        
        
    }
}