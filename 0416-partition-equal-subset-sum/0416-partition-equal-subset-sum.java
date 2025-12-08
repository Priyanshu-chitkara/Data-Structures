class Solution {
    public boolean f(int[] nums, int target, int ind, int n,Boolean[][] dp) {
        if(target==0) return true;
        if (ind == n) {
            if (target == 0) {
                return true;
            }
            else return false;

        }
        if(target < 0)return false;
        if(dp[ind][target]!=null){
            return dp[ind][target];
        }
        boolean pick=false;
        if(target>=nums[ind]){
             pick = f(nums, target - nums[ind], ind + 1, n,dp);
        }

       
        boolean npick=f(nums, target, ind + 1, n,dp);
        return  dp[ind][target]=pick|| npick;

    }

    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int s = 0;
        for (int k : nums) {
            s += k;
        }
        if (s % 2 != 0)
            return false;
        Boolean [][] dp=new Boolean[n][s/2+1];
        return f(nums, s / 2, 0, n,dp);
    }
}