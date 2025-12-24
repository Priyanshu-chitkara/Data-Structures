class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        int [][] dp=new int[n][n];
        for(int j=n-1;j>=0;j--){
            dp[n-1][j]=triangle.get(n-1).get(j);
        }
        
        for(int i=n-2;i>=0;i--){
            for(int j=i;j>=0;j--){
                int down=dp[i+1][j+1];
                int diag=dp[i+1][j];
                dp[i][j]=triangle.get(i).get(j)+Math.min(down,diag);


            }
        }
        return dp[0][0];
    }
}