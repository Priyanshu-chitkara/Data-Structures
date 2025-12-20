class Solution {
    public int f(int ind,int[] nums,int n,int [] dp){
        if(ind>n-1){
            return 0;
        }
        if(dp[ind]!=-1){
            return dp[ind];
        }
        int rs=nums[ind]+f(ind+2,nums,n,dp);
        
        int rrs=f(ind+1,nums,n,dp);
        // if(ind>0){
        //      rrs=nums[ind]+f(ind,nums,n);

        //  }
       
        int ansi=Math.max(rs,rrs);
        return dp[ind]=ansi;

    }
    public int rob(int[] nums) {
        int n=nums.length;
        int [] dp=new int[n];
        Arrays.fill(dp,-1);
        int ans=f(0,nums,n,dp);
        
        return ans;
        
    }
}