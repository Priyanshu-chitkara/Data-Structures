class Solution {
    public int f(int [][] arr,int i,int j,int m,int n,int [][] dp){
        if(i==m-1 && j==n-1){
            return 1;
        }
        if(i>m || j>n){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int right=f(arr,i,j+1,m,n,dp);
        int bottom=f(arr,i+1,j,m,n,dp);
        return  dp[i][j]=right+bottom;
    }
    public int uniquePaths(int m, int n) {
        int [][] arr=new int [m][n];
        int [][] dp=new int[m+1][n+1];
        for(int [] row: dp){
            Arrays.fill(row,-1);
        }
       int res=f(arr,0,0,m,n,dp);
       return res;
        
    }
}