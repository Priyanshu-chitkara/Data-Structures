class Solution {
    public int f(int i,int j,String st1,String st2,int [][] dp){
        if(i<0 || j<0) return 0;
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(st1.charAt(i)==st2.charAt(j)) return 1+f(i-1,j-1,st1,st2,dp);
        return dp[i][j]=Math.max(f(i-1,j,st1,st2,dp),f(i,j-1,st1,st2,dp));
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int n=text1.length();
        int m=text2.length();
        int[][] dp=new int[n][m];
        for(int [] arr:dp){
            Arrays.fill(arr,-1);
        }
       int ans=f(n-1,m-1,text1,text2,dp);
       return ans;
        
    }
}