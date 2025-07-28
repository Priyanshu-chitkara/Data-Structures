class Solution {
    public void printF(int [] dp,int n){
        dp[0]=1;
        dp[1]=2;
        for(int i=2;i<n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
    }
    public int climbStairs(int n) {
        int [] dp=new int [n+1];
        printF(dp,n);
        return dp[n-1];
        
    }
}