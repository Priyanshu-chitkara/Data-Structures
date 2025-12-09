class Solution {
    public int f(int[][] grid,int m,int n,int[][] dp){
        if(m<0 || n<0){
            return Integer.MAX_VALUE;
        }
        if(m==0 && n==0){
            return grid[0][0];
        }
        if(dp[m][n]!=-1){
            return dp[m][n];
        }
        int topleft=f(grid,m,n-1,dp);
        int bottomright=f(grid,m-1,n,dp);
        return dp[m][n]=grid[m][n] + Math.min(topleft,bottomright);
    }
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] dp=new int[m][n];
        for(int [] arr:dp){
            Arrays.fill(arr,-1);
        }
       int ans=f(grid,m-1,n-1,dp);
       return ans;
        
    }
}