class Solution {
    public boolean f(int [] nums,int n,int sum,int ind,Boolean [][] dp){
        
            if(sum==0){
                return true;
            }
            if(ind==n || sum<0) return false;
        
        boolean pk=false;
        if(dp[ind][sum]!=null){
            return dp[ind][sum];
        }
        
if(sum>0){
    pk=f(nums,n,sum-nums[ind],ind+1,dp);

}
        
        boolean npk=f(nums,n,sum,ind+1,dp);
        return dp[ind][sum]=pk || npk;
    }
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int s:nums){
            sum+=s;

        }
        if(sum%2!=0){
            return false;
        }
        
        
        int n=nums.length;
        Boolean[][] dp=new Boolean[n][sum/2+1];
       
        boolean ans=f(nums,n,sum/2,0,dp);
       return ans;
        
    }
}