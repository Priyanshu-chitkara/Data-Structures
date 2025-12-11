class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int[][] dp=new int[n][m];

        for(int i=0; i<n; i++){
            dp[0][i]=matrix[0][i];
        }

        for(int i=1; i<n; i++){
            for(int j=0; j<m; j++){
                int up=matrix[i][j]+dp[i-1][j];
                
                int left=matrix[i][j];
                if(j>0) left+=dp[i-1][j-1];
                else left+=(int)(1e8);
                
                int right=matrix[i][j];
                if(j<n-1) right+=dp[i-1][j+1];
                else right+=(int)(1e8);

                dp[i][j]=Math.min(up,Math.min(left,right));
            }
        }
        int mini=Integer.MAX_VALUE;
        for(int i=0; i<m; i++){
            mini=Math.min(mini,dp[n-1][i]);
        }
        return mini;
    }
}