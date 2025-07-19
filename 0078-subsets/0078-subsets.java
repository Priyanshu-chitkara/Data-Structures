class Solution {
    public void printS(int nums[],int ind,List<Integer> current,List<List<Integer>> result){
        int n=nums.length;
        if(ind==n){
            result.add(new ArrayList<>(current));
            return;
        }
        current.add(nums[ind]);
        printS(nums,ind+1,current,result);
        current.remove(current.size()-1);
        
        printS(nums,ind+1,current,result);
        

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        printS(nums,0,new ArrayList<>(),result);
        return result;
        
    }
}