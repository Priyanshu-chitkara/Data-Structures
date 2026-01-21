class Solution {
    public int f(int [] nums,int target,int [] dp){
        if(target==0){
            return 1;
        }
        if(target<0){
            return 0;
        }
        if(dp[target]!=-1){
            return dp[target];
        }
        int pk=0;
        for(int num:nums){
            pk+=f(nums,target-num,dp);
        }
        return dp[target]=pk;
    }
    public int combinationSum4(int[] nums, int target) {
        int n=nums.length;
        int [] dp=new int[target+1];
        Arrays.fill(dp,-1);
        return f(nums,target,dp);
        
    }
}