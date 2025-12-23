class Solution {
    // public int f(List<List<Integer>> triangle,int row,int col){
    //     if(row==0 && col==0){
    //         return triangle.get(row).get(col);
    //     }
    //     if(row<0 || col<0){
    //         return Integer.MAX_VALUE;
    //     }
    //     int up=f(triangle,row-1,col-1);
    //     int dig=f(triangle,row,col-1);
    //     return triangle.get(row).get(col)+Math.min(up,dig);
    // }
    public int minimumTotal(List<List<Integer>> triangle) {
        int m=triangle.size();
        int ans=0;
        int [][] dp=new int[m][m];
     for(int i=m-1;i>=0;i--){
        dp[m-1][i]=triangle.get(m-1).get(i);
        

     }
    for(int i=m-2;i>=0;i--){
        for(int j=i;j>=0;j--){
            int dwn=dp[i+1][j];
            int dig=dp[i+1][j+1];
            dp[i][j]=triangle.get(i).get(j)+Math.min(dwn,dig);
        }
        
    }
   
    return dp[0][0];

        
    }
}