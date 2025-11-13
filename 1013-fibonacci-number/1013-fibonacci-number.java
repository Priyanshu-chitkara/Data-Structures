class Solution {
    public int fib(int n) {
        // tabulation
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int [] dp=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        int sum=0;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
            sum=dp[i];
        }
        return sum;
       
        
    }
}