class Solution {
    // public int f(List<List<Integer>> triangle,int row,int col,int[][] dp){
    //     int n=triangle.size();
    //     if(row==n-1){
    //         return triangle.get(row).get(col);
    //     }
    //     if(dp[row][col]!=-1){
    //         return dp[row][col];
    //     }
    //     int down=triangle.get(row).get(col)+f(triangle,row+1,col,dp);
    //     int dia=triangle.get(row).get(col)+f(triangle,row+1,col+1,dp);
    //     return dp[row][col]=Math.min(down,dia);
        

    // }
    public int minimumTotal(List<List<Integer>> triangle) {
       int n=triangle.size();
       int[][] dp=new int[n][n];
       for(int j=0;j<n;j++){
        dp[n-1][j]=triangle.get(n-1).get(j);
       }
       for(int i=n-2;i>=0;i--){
        for(int j=i;j>=0;j--){
            int d=triangle.get(i).get(j)+dp[i+1][j];
            int dg=triangle.get(i).get(j)+dp[i+1][j+1];
            dp[i][j]=Math.min(d,dg);
        }
       }
       return dp[0][0];
    //    for(int [] arr:dp){
    //     Arrays.fill(arr,-1);
    //    }
    //    int res=f(triangle,0,0,dp);
    //    return res;
        
    }
}