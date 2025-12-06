class Solution {
    public void f(int [] nums,int target,int ans,int i,int n,int[] arr){
       if(i==n){
        if(ans==target){
            arr[0]++;

        }
        return;
        
       }
       
       
        f(nums,target,ans+nums[i],i+1,n,arr);
        f(nums,target,ans-nums[i],i+1,n,arr);

        

    }
    public int findTargetSumWays(int[] nums, int target) {
        int n=nums.length;
        int [] arr=new int[1];
        f(nums,target,0,0,n,arr);
        return arr[0];
        
    }
}