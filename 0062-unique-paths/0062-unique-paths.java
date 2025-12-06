class Solution {
    public int f(int i,int j,int m,int n,int [] [] dp){
        if(i==m-1 && j==n-1){
            return 1;
        }
        if(i>m || j>n){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int row= f(i,j+1,m,n,dp);
        int col=f(i+1,j,m,n,dp);
        return dp[i][j]=row+col;

    }
    public int uniquePaths(int m, int n) {
        int [][] dp=new int[m+1][n+1];
        for(int [] arr:dp){
            Arrays.fill(arr,-1);
        }

        dp[m][n]=f(0,0,m,n,dp);
        return dp[m][n];
    }
}