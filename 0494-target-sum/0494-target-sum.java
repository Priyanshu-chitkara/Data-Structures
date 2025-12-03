class Solution {
     int count=0;
    public void f(int []nums,int target,int n,int i,int ans){
       if(i==n){

       if(ans==target){
        count++;
       }
        return;
       }

       f(nums,target,n,i+1,ans+nums[i]);
       f(nums,target,n,i+1,ans-nums[i]);


    }
    public int findTargetSumWays(int[] nums, int target) {
      int n=nums.length;
      

      f(nums,target,n,0,0);
      return count;


        
    }
}