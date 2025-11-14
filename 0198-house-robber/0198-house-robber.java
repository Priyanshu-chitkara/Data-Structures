class Solution {
    public int ans(int [] nums,int ind,int [] dp){
        if(ind==0){
            return nums[0];
        }
        if(ind<0){
            return 0;
        }
        if(dp[ind]!=-1){
            return dp[ind];
        }
       int pick=nums[ind]+ans(nums,ind-2,dp);
       int npick=ans(nums,ind-1,dp);
      dp[ind]=Math.max(pick,npick);
      return dp[ind];
    }
    public int rob(int[] nums) {
        int n=nums.length;
        int [] dp=new int[n+1];
         Arrays.fill(dp, -1);
        return ans(nums,n-1,dp);
        
        
    }
}