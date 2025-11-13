class Solution {
    public int climbStairs(int n) {
        int count=0;
        if(n<=1){
            return 1;
        }
        //tabulation
        int [] dp=new int[n+1];
        dp[1]=1;
        dp[0]=1;
        int sum=0;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-2]+dp[i-1];
            sum=dp[i];

        }
        return sum;

        
    }
}