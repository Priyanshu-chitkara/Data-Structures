
class Solution {
    public void subset(int nums[],int index,List<List<Integer>> result,List<Integer> current){
    int n=nums.length;
    if(index>=n){
        result.add(new ArrayList<>(current));
        return;
    }
    subset(nums,index+1,result,current);
    current.add(nums[index]);
    subset(nums,index+1,result,current);
    current.remove(current.size()-1);



}
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> result=new ArrayList<>();
        subset(nums,0,result,new ArrayList<>());
        return result;
        
    }
}