class Solution {
    // public int f(int [][] arr,int i,int j,int m,int n,int [][] dp){
    //     if(i==m-1 && j==n-1){
    //         return 1;
    //     }
    //     if(i>m || j>n){
    //         return 0;
    //     }
    //     if(dp[i][j]!=-1){
    //         return dp[i][j];
    //     }
    //      int right=f(arr,i,j+1,m,n,dp);
    //     int bottom=f(arr,i+1,j,m,n,dp);
    //     return  dp[i][j]=right+bottom;
    // }
    public int uniquePaths(int m, int n) {

        int[][] dp = new int[m + 1][n + 1];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                    dp[i][j] = 1;
                    continue;
                } 
                int right=0;
                int bottom=0;
                if(i>0){
                    right=dp[i-1][j];

                }
                if(j>0){
                    bottom=dp[i][j-1];
                }
                dp[i][j]=right+bottom;

            }
            
        }

        return dp[m-1][n-1];

    }
}