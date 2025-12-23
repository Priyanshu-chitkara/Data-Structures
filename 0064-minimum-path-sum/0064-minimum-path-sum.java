class Solution {
    public int f(int row,int col,int [][] grid,int [][] dp){
        if(row==0 && col==0){
            return grid[row][col];
        }
        if(row<0 || col<0){
            return Integer.MAX_VALUE;
        }
        if(dp[row][col]!=-1){
            return dp[row][col];
        }
        int up=f(row-1,col,grid,dp);
        int left=f(row,col-1,grid,dp);
        return dp[row][col]=grid[row][col]+Math.min(up,left);
    }
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int [][] dp=new int[m][n];
        for(int [] arr:dp){
            Arrays.fill(arr,-1);
        }
        int ans=f(m-1,n-1,grid,dp);
        return ans;
        
    }
}