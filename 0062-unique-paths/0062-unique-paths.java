class Solution {
    public int f(int row,int col,int [][] dp){
        if(row==0 && col==0){
            return 1;
        }
        if(row<0 || col<0){
            return 0;
        }
        if(dp[row][col]!=-1){
            return dp[row][col];
        }
        int left=f(row,col-1,dp);
        int right=f(row-1,col,dp);
        return dp[row][col]=left+right;
    }
    public int uniquePaths(int m, int n) {
        int [][] dp=new int[m][n];
        for(int [] arr:dp){
            Arrays.fill(arr,-1);
        }
        int ans=f(m-1,n-1,dp);
        return ans;
        
    }
}