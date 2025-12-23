class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int m=triangle.size();
        int [][] dp=new int[m][m];
        for(int j=m-1;j>=0;j--){
            dp[m-1][j]=triangle.get(m-1).get(j);
        }
        for(int i=m-2;i>=0;i--){
            for(int j=i;j>=0;j--){
                int up=dp[i+1][j];
                int dg=dp[i+1][j+1];
                dp[i][j]=triangle.get(i).get(j)+Math.min(up,dg);
            }


        }
        return dp[0][0];
        
    }
}